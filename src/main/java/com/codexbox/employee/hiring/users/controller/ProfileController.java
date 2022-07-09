package com.codexbox.employee.hiring.users.controller;

import com.codexbox.employee.hiring.users.entities.ProfileEntity;
import com.codexbox.employee.hiring.users.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class  ProfileController {
    @Autowired
    ProfileService profileService;

    @GetMapping("/profiles")
    public ResponseEntity<List<ProfileEntity>> getProfilesStatus() {
        return new ResponseEntity<>(profileService.getProfileDetails(),HttpStatus.OK);
    }
}
