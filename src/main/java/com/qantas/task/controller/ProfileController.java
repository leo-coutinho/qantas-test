package com.qantas.task.controller;

import com.qantas.task.profile.v1.api.UserApi;
import com.qantas.task.profile.v1.model.UserRequest;
import com.qantas.task.profile.v1.model.UserResponse;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

@RestController
public class ProfileController implements UserApi {

    @Override
    public ResponseEntity<UserResponse> addUserProfile(@Valid UserRequest body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUserProfile(String userId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUserProfile(String userId, @Valid UserRequest body) {
        return null;
    }
}
