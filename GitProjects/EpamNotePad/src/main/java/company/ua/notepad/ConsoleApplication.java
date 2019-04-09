package company.ua.notepad;

import java.time.LocalDate;

public class ConsoleApplication {
    public static void main(String[] args) {
        NotePad notePad = new NotePad();
        notePad.addNote("Make homework #6", LocalDate.of(2019, 4, 22));
        notePad.addNote("Make homework #7", LocalDate.of(2019, 4, 23));
        show(notePad);
        notePad.addNote("Edit homework #6", LocalDate.of(2019, 4, 22));
        notePad.addNote("Edit homework #7", LocalDate.of(2019, 4, 23));
        show(notePad);
    }

    private static void show(NotePad notePad) {
        notePad.getNotes().forEach(note -> {
            note.getTexts().forEach(System.out::println);
            System.out.println(note.getNoteDate() + "\n");
        });
    }
}
