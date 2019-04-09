package company.ua.notepad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NotePad {

    private List<Note> notes;

    NotePad(List<Note> notes) {
        this.notes = notes;
    }

    NotePad() {
        this.notes = new ArrayList<>();
    }

    void addNote(String noteText, LocalDate noteDate) {
        if (notes.isEmpty() || !isContainDate(noteDate)) {
            notes.add(new Note(noteText, noteDate));
            return;
        }
        notes.stream().filter(note -> note.getNoteDate().equals(noteDate)).findFirst().get().addText(noteText);
    }


    private boolean isContainDate(LocalDate date) {
        return notes.stream().anyMatch(note -> note.getNoteDate().equals(date));
    }

    List<Note> getNotes() {
        return notes;
    }

    public class Note {
        private List<String> texts;
        private LocalDate noteDate;

        public Note(List<String> texts, LocalDate noteDate) {
            this.texts = texts;
            this.noteDate = noteDate;
        }

        public Note(LocalDate noteDate) {
            this.texts = new ArrayList<>();
            this.noteDate = noteDate;
        }

        Note(String text, LocalDate noteDate) {
            this.texts = new ArrayList<>();
            this.texts.add(text);
            this.noteDate = noteDate;
        }


        List<String> getTexts() {
            return texts;
        }

        LocalDate getNoteDate() {
            return noteDate;
        }

        void addText(String text) {
            texts.add(text);
        }

    }
}
