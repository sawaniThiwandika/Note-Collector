package lk.ijse.notecollecter.customStatusCodes;
import lk.ijse.notecollecter.dto.NoteStatus;
import lk.ijse.notecollecter.dto.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SelectedUserErrorStatus implements UserStatus, NoteStatus {
    private int statusCode;
    private String statusMessage;
}
