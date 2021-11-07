import java.util.Stack;

  class FileTester {

    public static void main(String[] args) {
        File file = new File();
        file.setTitle("Python");
        file.setContent(" Python is an interpreted high-level general-purpose programming language");
        file.save();
        file.setContent(" Its design philosophy emphasizes code readability with its use of significant indentation. Its language constructs as well as its object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.");
        file.save();
        file.setTitle("Introduction to pyt---");
        file.save();

        file.undo();
        System.out.println("Title-: " + file.getTitle());
        System.out.println(file.getContent());
        System.out.println("");
        file.undo();
        System.out.println("Title-: " + file.getTitle());
        System.out.println(file.getContent());
        System.out.println("");
        file.undo();
        System.out.println("Title: " + file.getTitle());
        System.out.println(file.getContent());
        System.out.println("");

    }

}

class File {

    private String title;
    private String content;
    private final File_Caretaker caretaker = new File_Caretaker();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void save() {
        caretaker.addMemento(new File_Memento(title, content));
    }

    public void undo() {
        File_Memento memento = caretaker.getMemento();
        title = memento.getTitle();
        content = memento.getContent();
    }

}

class File_Memento {

    private final String title;
    private final String content;

    public File_Memento(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

}

class File_Caretaker {

    private final Stack<File_Memento> mementoStack = new Stack<>();

    public void addMemento(File_Memento memento) {
        mementoStack.push(memento);
    }

    public File_Memento getMemento() {
        return mementoStack.pop();
    }

}