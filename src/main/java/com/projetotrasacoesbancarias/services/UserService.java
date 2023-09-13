package com.projetotrasacoesbancarias.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetotrasacoesbancarias.domain.user.User;
import com.projetotrasacoesbancarias.domain.user.UserType;
import com.projetotrasacoesbancarias.repositories.UserRepository;
import java.math.BigDecimal;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public void validateTransaction(User sender, UserType amount) throws Exception {
		if(sender.getUserType() == UserType.MERCHANT) {
			throw new Exception("Comerciante nao pode realizar transacao!");
		}
		
		if(sender.getBalance().compareTo(amount) < 0) {
			throw new Exception("Saldo Insuficiente");
		}
	}
	
	public User findUserById(Long id) throws Exception {
		return this.repository.findById(id).orElseThrow(() -> new Exception("User nao encontrado"));
	}
	
	public void saveUser(User user) {
		this.repository.save(user);
	}
}
