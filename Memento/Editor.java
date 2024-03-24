package Memento;

import java.util.Stack;

public class Editor {
    private StringBuilder content = new StringBuilder();
    private Stack<EditorMemento> history = new Stack<>();

    public void type(String text) {
        content.append(text);
    }

    public String getContent() {
        return content.toString();
    }

    public void save() {
        history.push(new EditorMemento(content.toString()));
    }

    public void undo() {
        if (!history.isEmpty()) {
            EditorMemento memento = history.pop();
            content = new StringBuilder(memento.getContent());
        }
    }
}
