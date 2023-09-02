import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese un nombre o escriba 'borrar' para deshacer:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("borrar")) {
                Memento memento = history.pop();
                if (memento != null) {
                    editor.restoreFromMemento(memento);
                    editor.display();
                } else {
                    System.out.println("No hay estados para deshacer.");
                }
            } else {
                editor.write(input);
                history.push(editor.saveToMemento());
                editor.display();
            }
        }
    }
}