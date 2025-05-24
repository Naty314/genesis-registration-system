package com.genesisresources.genesisregistrationsystem.repository;

import com.genesisresources.genesisregistrationsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}