package com.application.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.registration.modal.User;

public interface RegistrationRepository extends JpaRepository<User, Integer> {

	public User findByEmailId(String emailId);
	public User findByEmailIdAndPassword(String emailId, String password);
}
