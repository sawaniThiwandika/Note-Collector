package lk.ijse.notecollecter.service;

import lk.ijse.notecollecter.dto.impl.NoteDto;
import lk.ijse.notecollecter.dto.impl.UserDTO;

import java.util.List;

public interface UserServise {
    public NoteDto saveUser(UserDTO dto);

}
