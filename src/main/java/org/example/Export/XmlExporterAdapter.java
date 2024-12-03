package org.example.Export;

import org.example.Model.Note;
import org.example.Model.Task;

import java.util.List;

public class XmlExporterAdapter implements Adapter {


    @Override
    public void export(List<Task> tasks, List<Note> notes) {
        System.out.println("Exporting to XML");
    }
}
