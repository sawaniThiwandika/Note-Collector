package lk.ijse.notecollecter.dto.impl;

import jakarta.persistence.Table;
import lk.ijse.notecollecter.dto.NoteStatus;
import lk.ijse.notecollecter.dto.SuperDTO;
import lk.ijse.notecollecter.dto.UserStatus;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class NoteDto implements NoteStatus {
    private String noteId;
    private String noteTitle;
    private String noteDescription;
    private String createDate;
    private  String priorityLevel;
    private String userId;
}
