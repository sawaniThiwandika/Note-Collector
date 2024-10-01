package lk.ijse.notecollecter.util;

import lk.ijse.notecollecter.dto.impl.NoteDto;
import lk.ijse.notecollecter.dto.impl.UserDTO;
import lk.ijse.notecollecter.entity.impl.NoteEntity;
import lk.ijse.notecollecter.entity.impl.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapping {
    @Autowired
    private ModelMapper modelMapper;
    public UserEntity toUserEntity (UserDTO userDTO){
        return modelMapper.map(userDTO,UserEntity.class);
    }
    public UserDTO toUserDto (UserEntity userEntity){
        return modelMapper.map(userEntity,UserDTO.class);
    }
    public NoteEntity toNoteEntity (NoteDto noteDTO){
        return modelMapper.map(noteDTO,NoteEntity.class);
    }
    public NoteDto toNoteDto (NoteEntity noteEntity){
        return modelMapper.map(noteEntity,NoteDto.class);
    }
}
