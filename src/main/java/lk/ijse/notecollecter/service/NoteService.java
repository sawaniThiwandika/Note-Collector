package lk.ijse.notecollecter.service;

import lk.ijse.notecollecter.dto.impl.NoteDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface NoteService {
    public NoteDto saveNote(NoteDto dto);
    public String updateNote(NoteDto dto);
    public String deleteNote(String id);
    public NoteDto getNote(String id);
    public List<NoteDto> getNoteList(List<String>idList);

}
