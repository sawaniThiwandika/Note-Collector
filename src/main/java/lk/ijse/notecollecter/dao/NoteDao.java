package lk.ijse.notecollecter.dao;

import lk.ijse.notecollecter.entity.impl.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao extends JpaRepository<NoteEntity,String> {
}
