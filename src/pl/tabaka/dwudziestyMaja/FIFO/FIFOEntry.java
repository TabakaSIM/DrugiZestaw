package pl.tabaka.dwudziestyMaja.FIFO;

public class FIFOEntry {
    private String string;
    private int priority;

    public FIFOEntry(String string, int priority) {
        this.string = string;
        this.priority= priority;
    }

    public String getString() {
        return string;
    }

    public int getPriority() {
        return priority;
    }
}
