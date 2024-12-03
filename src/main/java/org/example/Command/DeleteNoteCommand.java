package org.example.Command;

import org.example.Model.Note;

import java.util.List;

public class DeleteNoteCommand implements Command {
    private Note note;
    private List<Note> notes;

    public DeleteNoteCommand(Note note, List<Note> notes) {
        this.note = note;
        this.notes = notes;
    }

    @Override
    public void execute() {
        notes.remove(note);
        System.out.println("Notatka usunięta: " + note.getTitle());
    }

    @Override
    public void undo() {
        notes.add(note);
        System.out.println("Cofnięto usunięcie notatki: " + note.getTitle());
    }
}

