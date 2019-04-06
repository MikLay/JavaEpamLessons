package company.ua.notepad;

import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertEquals;

public class NotePadTest {

    private static LocalDate testDate = LocalDate.of(2019, 4, 22);

    @Test
    public void ShouldCreateNotePad() {
        NotePad notePad = new NotePad();
        boolean actual = notePad.getNotes().isEmpty();
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldAddNote() {
        NotePad notePad = new NotePad();
        notePad.addNote("Test adding", testDate);
        boolean actual = notePad.getNotes().isEmpty();
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldEditNote() {
        NotePad notePad = new NotePad();

        notePad.addNote("Test adding #1", testDate);
        notePad.addNote("Test adding #2", testDate.minusDays(5));

        notePad.addNote("Test edit_1 #1", testDate);
        notePad.addNote("Test edit_2 #1", testDate);
        long actual = notePad.getNotes().stream().filter(note -> note.getNoteDate().equals(testDate))
                .flatMap(note -> note.getTexts().stream()).count();
        long expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnNotes() {
        NotePad notePad = new NotePad();
        notePad.addNote("Test adding #1", testDate);
        notePad.addNote("Test adding #2", testDate.minusDays(5));

        List<NotePad.Note> expected = asList(notePad.new Note("Test adding #1", testDate), notePad.new Note("Test adding #1", testDate.minusDays(5)));

        NotePad tempNotePad = new NotePad(expected);
        List<NotePad.Note> actual = tempNotePad.getNotes();
        assertEquals(expected, actual);
    }

    @Test
    public void ShouldReturnDate() {
        NotePad notePad = new NotePad();
        notePad.addNote("Test adding #1", testDate);
        LocalDate actual = notePad.getNotes().get(0).getNoteDate();
        LocalDate expected = testDate;
        assertEquals(actual, expected);
    }
}