package lk.ijse.notecollecter.entity.impl;

import jakarta.persistence.*;
import lk.ijse.notecollecter.entity.SuperEntity;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name="user")
public class UserEntity implements SuperEntity {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    private String profilePic;
    @OneToMany(mappedBy ="user")
    private List<NoteEntity> notes;
}
