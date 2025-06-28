import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GerenciadorArquivosGUI {
    private static File currentDirectory = new File(System.getProperty("user.home"));
    private static final String[] MAIN_OPTIONS = {"Listar", "Entrar", "Voltar", "Criar", "Renomear", "Excluir", "Ler", "Sair"};

    public static void main(String[] args) {
        while (true) {
            int choice = JOptionPane.showOptionDialog(null,
                    "Gerenciador de Arquivos\nDiretório atual: " + currentDirectory.getAbsolutePath(),
                    "Menu Principal",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    MAIN_OPTIONS,
                    MAIN_OPTIONS[0]);

            switch (choice) {
                case 0: listFiles(); break;
                case 1: enterDirectory(); break;
                case 2: goToParent(); break;
                case 3: createItem(); break;
                case 4: renameItem(); break;
                case 5: deleteItem(); break;
                case 6: readFile(); break;
                case 7: 
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    System.exit(0);
                default: break;
            }
        }
    }

    private static void listFiles() {
        File[] files = currentDirectory.listFiles();
        if (files == null || files.length == 0) {
            JOptionPane.showMessageDialog(null, "Diretório vazio.");
            return;
        }

        StringBuilder sb = new StringBuilder("Conteúdo de: " + currentDirectory.getAbsolutePath() + "\n\n");
        for (File f : files) {
            sb.append(f.getName())
              .append(f.isDirectory() ? " [DIR]" : " (" + formatSize(f.length()) + ")")
              .append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Arquivos", JOptionPane.PLAIN_MESSAGE);
    }

    private static String formatSize(long bytes) {
        if (bytes < 1024) return bytes + " B";
        if (bytes < 1024 * 1024) return String.format("%.1f KB", bytes / 1024.0);
        if (bytes < 1024 * 1024 * 1024) return String.format("%.1f MB", bytes / (1024.0 * 1024));
        return String.format("%.1f GB", bytes / (1024.0 * 1024 * 1024));
    }

    private static void enterDirectory() {
        File[] dirs = currentDirectory.listFiles(File::isDirectory);
        if (dirs == null || dirs.length == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum subdiretório disponível.");
            return;
        }

        String[] dirNames = new String[dirs.length];
        for (int i = 0; i < dirs.length; i++) {
            dirNames[i] = dirs[i].getName();
        }

        String selected = (String) JOptionPane.showInputDialog(null,
                "Selecione o diretório:",
                "Navegar para",
                JOptionPane.PLAIN_MESSAGE,
                null,
                dirNames,
                dirNames[0]);

        if (selected != null) {
            currentDirectory = new File(currentDirectory, selected);
        }
    }

    private static void goToParent() {
        if (currentDirectory.getParentFile() != null) {
            currentDirectory = currentDirectory.getParentFile();
        } else {
            JOptionPane.showMessageDialog(null, "Você está no diretório raiz.");
        }
    }

    private static void createItem() {
        String[] options = {"Arquivo", "Diretório"};
        int type = JOptionPane.showOptionDialog(null,
                "O que deseja criar?",
                "Criar Item",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (type == -1) return; // Usuário cancelou

        String name = JOptionPane.showInputDialog("Digite o nome:");
        if (name == null || name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido.");
            return;
        }

        try {
            if (type == 0) {
                if (new File(currentDirectory, name).createNewFile()) {
                    JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso.");
                } else {
                    JOptionPane.showMessageDialog(null, "Arquivo já existe ou nome inválido.");
                }
            } else {
                if (new File(currentDirectory, name).mkdir()) {
                    JOptionPane.showMessageDialog(null, "Diretório criado com sucesso.");
                } else {
                    JOptionPane.showMessageDialog(null, "Diretório já existe ou nome inválido.");
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar: " + e.getMessage());
        }
    }

    private static void renameItem() {
        File[] items = currentDirectory.listFiles();
        if (items == null || items.length == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum item para renomear.");
            return;
        }

        String[] itemNames = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            itemNames[i] = items[i].getName();
        }

        String selected = (String) JOptionPane.showInputDialog(null,
                "Selecione o item para renomear:",
                "Renomear",
                JOptionPane.PLAIN_MESSAGE,
                null,
                itemNames,
                itemNames[0]);

        if (selected == null) return;

        String newName = JOptionPane.showInputDialog("Digite o novo nome:");
        if (newName == null || newName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido.");
            return;
        }

        File oldFile = new File(currentDirectory, selected);
        File newFile = new File(currentDirectory, newName);

        if (oldFile.renameTo(newFile)) {
            JOptionPane.showMessageDialog(null, "Item renomeado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao renomear. Verifique se o nome já existe.");
        }
    }

    private static void deleteItem() {
        File[] items = currentDirectory.listFiles();
        if (items == null || items.length == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum item para excluir.");
            return;
        }

        String[] itemNames = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            itemNames[i] = items[i].getName();
        }

        String selected = (String) JOptionPane.showInputDialog(null,
                "Selecione o item para excluir:",
                "Excluir",
                JOptionPane.PLAIN_MESSAGE,
                null,
                itemNames,
                itemNames[0]);

        if (selected == null) return;

        int confirm = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja excluir '" + selected + "'?",
                "Confirmar Exclusão",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            File toDelete = new File(currentDirectory, selected);
            if (deleteRecursive(toDelete)) {
                JOptionPane.showMessageDialog(null, "Item excluído com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Falha ao excluir o item.");
            }
        }
    }

    private static boolean deleteRecursive(File file) {
        if (file.isDirectory()) {
            File[] contents = file.listFiles();
            if (contents != null) {
                for (File f : contents) {
                    if (!deleteRecursive(f)) {
                        return false;
                    }
                }
            }
        }
        return file.delete();
    }

    private static void readFile() {
        File[] files = currentDirectory.listFiles(File::isFile);
        if (files == null || files.length == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum arquivo para ler.");
            return;
        }

        String[] fileNames = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            fileNames[i] = files[i].getName();
        }

        String selected = (String) JOptionPane.showInputDialog(null,
                "Selecione o arquivo para ler:",
                "Ler Arquivo",
                JOptionPane.PLAIN_MESSAGE,
                null,
                fileNames,
                fileNames[0]);

        if (selected == null) return;

        try {
            Path path = Paths.get(currentDirectory.getAbsolutePath(), selected);
            String content = new String(Files.readAllBytes(path));
            JOptionPane.showMessageDialog(null, 
                "Conteúdo de " + selected + ":\n\n" + content,
                "Conteúdo do Arquivo",
                JOptionPane.PLAIN_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
