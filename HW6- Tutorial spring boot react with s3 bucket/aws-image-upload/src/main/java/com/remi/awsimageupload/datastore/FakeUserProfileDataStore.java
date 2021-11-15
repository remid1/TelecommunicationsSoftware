package com.remi.awsimageupload.datastore;

import org.springframework.stereotype.Repository;

import com.remi.awsimageupload.profile.UserProfile;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Asterix", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Obelix", null));
    }


	public List<UserProfile> getUserProfiles() {
		return USER_PROFILES;
	}
}