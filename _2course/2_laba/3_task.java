import java.util.ArrayList;
import java.util.List;

// Интерфейс FileSystemComponent, представляющий общий элемент файловой системы
interface FileSystemComponent {
    String getName();
    int getSize();
    void add(FileSystemComponent component);
    void remove(FileSystemComponent component);
    void display(String indent);
}

// Класс File, представляющий файл в файловой системе
class File implements FileSystemComponent {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Невозможно добавить элемент в файл.");
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Невозможно удалить элемент из файла.");
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name + " (" + size + " bytes)");
    }
}

// Класс Folder, представляющий папку в файловой системе
class Folder implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name);
        for (FileSystemComponent component : components) {
            component.display(indent + "  ");
        }
    }
}

// Главный класс для тестирования структуры файловой системы
public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);
        FileSystemComponent file3 = new File("file3.txt", 300);

        FileSystemComponent folder1 = new Folder("Folder1");
        FileSystemComponent folder2 = new Folder("Folder2");

        folder1.add(file1);
        folder1.add(file2);

        folder2.add(file3);
        folder2.add(folder1);

        folder2.display("");

        System.out.println("Total size of Folder2: " + folder2.getSize() + " bytes");
    }
}
