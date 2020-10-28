package com.example.awsimageupload.datastore;

import com.amazonaws.services.opsworks.model.UserProfile;
import com.example.awsimageupload.profile.ProfileUser;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserDataStore {

    private static final List<ProfileUser> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new ProfileUser(UUID.randomUUID(),"Amit",null));
        USER_PROFILES.add(new ProfileUser(UUID.randomUUID(),"Or",null));
    }

    public List<ProfileUser> getUserProfile(){
        return USER_PROFILES;
    }
}
