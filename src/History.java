import java.util.ArrayList;
import java.util.List;

class History {
    private final List<Memento> states = new ArrayList<>();

    public void push(Memento memento) {
        states.add(memento);
    }

    public Memento pop() {
        if (states.isEmpty()) {
            return null;
        }
        Memento lastMemento = states.get(states.size() - 1);
        states.remove(states.size() - 1);
        return lastMemento;
    }
}
