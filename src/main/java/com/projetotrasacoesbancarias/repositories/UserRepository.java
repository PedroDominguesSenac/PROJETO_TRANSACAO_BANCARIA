package com.projetotrasacoesbancarias.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projetotrasacoesbancarias.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findUserByDocument(String document);
	
	
	
}
