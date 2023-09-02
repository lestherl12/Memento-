class Memento {
    private final String savedContent;

    public Memento(String content) {
        this.savedContent = content;
    }

    public String getSavedContent() {
        return savedContent;
    }
}