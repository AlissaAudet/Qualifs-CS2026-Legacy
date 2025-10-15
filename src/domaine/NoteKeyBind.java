package domaine;

public class NoteKeyBind {
    Note note;
    String keyBind;

    public NoteKeyBind(Note note, String keyBind) {
        this.note = note;
        this.keyBind = keyBind;
    }

    public Note getNote() {
        return note;
    }
    public String getKeyBind() {
        return keyBind;
    }

}
