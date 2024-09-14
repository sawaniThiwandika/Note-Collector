package lk.ijse.notecollecter.service.impl;

import lk.ijse.notecollecter.dto.impl.NoteDto;
import lk.ijse.notecollecter.service.NoteService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //meta annotation ekk emeka nisa api aya componenet kyn annotation ek use krnn oni ne, application context ekt wetenw, bean ekk wenw
public class NoteServiceImpl implements NoteService {
    @Override
    public NoteDto saveNote(NoteDto dto) {
        System.out.println("NoteService :"+ dto);
        return dto;
    }

    @Override
    public String updateNote(NoteDto dto) {
        return null;
    }

    @Override
    public String deleteNote(String id) {
        return null;
    }

    @Override
    public NoteDto getNote(String id) {
        return null;
    }

    @Override
    public List<NoteDto> getNoteList(List<String> idList) {
        return null;
    }
}
