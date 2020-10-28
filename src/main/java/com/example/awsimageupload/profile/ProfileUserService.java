package com.example.awsimageupload.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
public class ProfileUserService {
    private final ProfileUserDataAccessService profileUserDataAccessService;

    @Autowired
    public ProfileUserService(ProfileUserDataAccessService profileUserDataAccessService){
        this.profileUserDataAccessService = profileUserDataAccessService;
    }

    List<ProfileUser> getProfileUsers(){
        return profileUserDataAccessService.getProfileUsers();
    }

    public void uploadProfileUserImage(UUID userProfileId, MultipartFile file) {
    }
}
