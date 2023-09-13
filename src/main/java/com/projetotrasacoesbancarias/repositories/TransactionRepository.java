package com.projetotrasacoesbancarias.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetotrasacoesbancarias.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> { 
	

}
