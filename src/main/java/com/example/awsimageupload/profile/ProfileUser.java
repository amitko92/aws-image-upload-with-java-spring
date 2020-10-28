package com.example.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class ProfileUser {

    private UUID userProfile;
    private  String name;
    private String urlImage; // S3 key

    public ProfileUser(UUID userProfile, String name, String urlImage) {
        this.userProfile = userProfile;
        this.name = name;
        this.urlImage = urlImage;
    }

    public UUID getUserProfile() {
        return userProfile;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getUrlImage() {
        return Optional.ofNullable(urlImage);
    }

    public void setUserProfile(UUID userProfile) {
        this.userProfile = userProfile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfileUser that = (ProfileUser) o;
        return Objects.equals(userProfile, that.userProfile) &&
                Objects.equals(name, that.name) &&
                Objects.equals(urlImage, that.urlImage);

    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfile, name, urlImage);
    }
}
