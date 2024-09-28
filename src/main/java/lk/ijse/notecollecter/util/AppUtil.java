package lk.ijse.notecollecter.util;

import java.util.Base64;
import java.util.UUID;

public class AppUtil {
    public static String generateID(){
        return "NOTEID"+ UUID.randomUUID();
    }
    public static String generateUserID(){
        return "UID"+ UUID.randomUUID();
    }
    public static String convertProfilePictureToBase64(String profilePicture){
        return Base64.getEncoder().encodeToString(profilePicture.getBytes());
    }

}
