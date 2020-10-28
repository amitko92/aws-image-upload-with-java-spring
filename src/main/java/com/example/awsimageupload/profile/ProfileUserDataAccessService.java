package com.example.awsimageupload.profile;

import com.example.awsimageupload.datastore.FakeUserDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class ProfileUserDataAccessService {

    private final FakeUserDataStore fakeUserDataStore;

    @Autowired
    public ProfileUserDataAccessService(FakeUserDataStore fuds){
        this.fakeUserDataStore = fuds;
    }

    public List<ProfileUser> getProfileUsers(){
        return fakeUserDataStore.getUserProfile();
    }
}
