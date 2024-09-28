package lk.ijse.notecollecter.dto.impl;

import jakarta.persistence.Table;
import lk.ijse.notecollecter.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class NoteDto implements SuperDTO {
    private String noteId;
    private String noteTitle;
    private String noteDescription;
    private String createDate;
    private  String priorityLevel;
}
