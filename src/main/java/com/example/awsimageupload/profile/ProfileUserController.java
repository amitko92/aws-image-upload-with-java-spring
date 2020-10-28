package com.example.awsimageupload.profile;

import com.amazonaws.services.transcribe.model.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/user-profile")
public class ProfileUserController {

    private final ProfileUserService profileUserService;

    @Autowired
    public ProfileUserController(ProfileUserService profileUserService) {
        this.profileUserService = profileUserService;
    }

    @GetMapping
    public List<ProfileUser> getUserProfile(){
        return this.profileUserService.getProfileUsers();
    }


    @PostMapping(
            path = "{userProfileId}/image/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void uploadUserProfileImage(@PathVariable("userProfileId") UUID userProfileId,
                                       @RequestParam("file") MultipartFile file){
        profileUserService.uploadProfileUserImage(userProfileId, file);
    }

}
