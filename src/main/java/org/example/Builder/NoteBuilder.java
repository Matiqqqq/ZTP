package org.example.Builder;
import org.example.Model.Note;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class NoteBuilder {
    private UUID id = UUID.randomUUID();
    private String title = "Untitled Note";
    private String content = "No content";
    private List<String> tags = new ArrayList<>();
    private String category = "OTHER";

    public NoteBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public NoteBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public NoteBuilder setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public NoteBuilder setCategory(String category) {
        this.category = category;
        return this;
    }

    public Note build() {
        return new Note(id, title, content, category);
    }
}

}
