package com.genesisresources.genesisregistrationsystem.service;

import com.genesisresources.genesisregistrationsystem.model.User;
import com.genesisresources.genesisregistrationsystem.repository.UserRepository;
import com.genesisresources.genesisregistrationsystem.request.UserRequest;
import com.genesisresources.genesisregistrationsystem.response.UserResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(UserRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setSurname(request.getSurname());
        user.setPersonId(request.getPersonId());
        user.setUuid(UUID.randomUUID().toString());

        User saved = userRepository.save(user);

        return new UserResponse(
                saved.getId(),
                saved.getName(),
                saved.getSurname(),
                saved.getPersonId(),
                saved.getUuid()
        );
    }
}


