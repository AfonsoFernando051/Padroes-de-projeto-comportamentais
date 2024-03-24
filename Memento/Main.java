package Memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        // Digitar e salvar texto
        editor.type("Primeira linha\n");
        editor.save();
        System.out.println(editor.getContent());

        // Digitar e salvar mais texto
        editor.type("Segunda linha\n");
        editor.save();
        System.out.println(editor.getContent());

        // Desfazer última ação
        editor.undo();
        System.out.println(editor.getContent());

        // Desfazer novamente
        editor.undo();
        System.out.println(editor.getContent());
    }
}

