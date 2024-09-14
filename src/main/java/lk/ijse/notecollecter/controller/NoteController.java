package lk.ijse.notecollecter.controller;

import lk.ijse.notecollecter.dto.impl.NoteDto;
import lk.ijse.notecollecter.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractList;
import java.util.ArrayList;

@RestController()
@RequestMapping("api/v1/notes")//v1-version ek
public class NoteController {
    //@PostMapping
    //public String saveNote() {
    @Autowired
    NoteService note;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public NoteDto saveNote(@RequestBody NoteDto noteDto) {
        noteDto.setNoteId("N001");
        NoteDto noteDto1 = note.saveNote(noteDto);
        return noteDto1;
    }

    public NoteDto getSelectedNote() {
        return new NoteDto();
    }

    public String updateAllNotes() {
        return null;
    }

    public String deleteAllNotes() {
        return null;
    }

    public AbstractList<NoteDto> getAllNotes() {
        return new ArrayList<NoteDto>();
    }
}
