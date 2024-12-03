package org.example.Export;

import org.example.Model.Note;
import org.example.Model.Task;

import java.util.List;

public interface Adapter {
    void export(List<Task> tasks, List<Note> notes);
}
