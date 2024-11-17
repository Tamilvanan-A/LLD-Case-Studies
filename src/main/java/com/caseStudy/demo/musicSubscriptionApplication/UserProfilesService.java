package com.caseStudy.demo.musicSubscriptionApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserProfilesService {

    private final UserProfilesRepository userProfilesRepository;

    public UserProfilesService(UserProfilesRepository userProfilesRepository) {
        this.userProfilesRepository=userProfilesRepository;
    }

    public UserProfiles getUserProfile(UserProfiles userProfiles) {
        return userProfilesRepository.save(userProfiles);
    }
    public Optional<UserProfiles> getUserById(Long id) {
         return userProfilesRepository.findById(id);
    }
    public List<UserProfiles> getAllUser() {
        return userProfilesRepository.findAll();
    }
}
