package lk.ijse.notecollecter.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {

    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profilePic;

}
