
class Editor {
    private String content = "";

    public void write(String text) {
        this.content += text + "\n";
    }

    public void display() {
        System.out.println(content);
    }

    public Memento saveToMemento() {
        return new Memento(content);
    }

    public void restoreFromMemento(Memento memento) {
        this.content = memento.getSavedContent();
    }
}