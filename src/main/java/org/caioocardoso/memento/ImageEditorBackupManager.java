package org.caioocardoso.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImageEditorBackupManager {
    private ImageEditor originator;
    private Deque<Memento> mementos = new ArrayDeque<>();

    public ImageEditorBackupManager(ImageEditor originator) {
        this.originator = originator;
    }

    public void backup() {
        System.out.println("Backup: saving imageEditor state");
        this.mementos.add(this.originator.save());
    }

    public void undo() {
        System.out.println("Undo: saving imageEditor state");

        if (mementos.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        Memento memento = this.mementos.pop();
        this.originator.restore(memento);
        System.out.println("Undo: " + memento.getName() + " was restored successfully");
    }
}
