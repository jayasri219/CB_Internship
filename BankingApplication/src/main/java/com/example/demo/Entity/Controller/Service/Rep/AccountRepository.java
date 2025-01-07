package com.example.demo.Entity.Controller.Service.Rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.AccountDetails;

public interface AccountRepository extends JpaRepository<AccountDetails,Long>{
	

}
