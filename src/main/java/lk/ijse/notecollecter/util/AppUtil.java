package lk.ijse.notecollecter.util;

import java.util.UUID;

public class AppUtil {
    public String generateNoteId(){
        return String.valueOf(UUID.randomUUID());

    }

}
