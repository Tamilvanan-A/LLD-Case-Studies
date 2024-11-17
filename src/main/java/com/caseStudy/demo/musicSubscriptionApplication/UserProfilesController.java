package com.caseStudy.demo.musicSubscriptionApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/UserProfiles")
public class UserProfilesController {
    private final UserProfilesService userProfilesService;

    @Autowired
    public UserProfilesController(UserProfilesService userProfilesService) {
        this.userProfilesService = userProfilesService;
    }
   @PostMapping("/register")
   public ResponseEntity createUserProfile(@RequestBody UserProfiles userProfiles) {
       return ResponseEntity.ok(userProfilesService.getUserProfile(userProfiles));
   }
   @GetMapping("/{id}")
   public ResponseEntity getbyId(@PathVariable Long id) {
       return ResponseEntity.ok(userProfilesService.getUserById(id));
   }
   @GetMapping("/details")
    public ResponseEntity getAllUser() {
       return ResponseEntity.ok(userProfilesService.getAllUser());
   }
}
