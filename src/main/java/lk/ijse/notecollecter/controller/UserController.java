package lk.ijse.notecollecter.controller;

import lk.ijse.notecollecter.dto.impl.NoteDto;
import lk.ijse.notecollecter.dto.impl.UserDTO;
import lk.ijse.notecollecter.service.NoteService;
import lk.ijse.notecollecter.service.UserServise;
import lk.ijse.notecollecter.util.AppUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserServise user;
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserDTO saveUser( @RequestPart("userFirstName") String userFirstName,
                             @RequestPart("userLastName") String userLastName,
                             @RequestPart("userEmail")String userEmail,
                             @RequestPart("userPassword")String userPassword,
                             @RequestPart("profilePicture")String profilePicture) {


        //profile picture convert to base64
        String base64ProPic = AppUtil.convertProfilePictureToBase64(profilePicture);
        //UserId generate
        String userId = AppUtil.generateUserID();
        // Todo: Build the object

        var buildUserDTO = new UserDTO();

        buildUserDTO.setUserId(userId);
        buildUserDTO.setFirstName(userFirstName);
        buildUserDTO.setLastName(userLastName);
        buildUserDTO.setEmail(userEmail);
        buildUserDTO.setPassword(userPassword);
        buildUserDTO.setProfilePic(base64ProPic);


        //user.saveUser(buildUserDTO);
        return buildUserDTO;
    }
}
