package com.example.demo.Entity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.AccountDetails;
import com.example.demo.Entity.Controller.Service.AccountService;

@RestController
@RequestMapping("/accountdetails")
public class AccountController {
    
	@Autowired
	AccountService service;
	
	//create account
	@PostMapping("/create")
	public ResponseEntity<AccountDetails> createAccount(@RequestBody AccountDetails accountdetails) {
		AccountDetails createAccountDetails =  service.createAccountDetails(accountdetails);
		 return ResponseEntity.status(HttpStatus.CREATED).body(createAccountDetails);	
	}
	
	//getting accountNumber by id
	@GetMapping("/{accountNumber}")
	public AccountDetails getAccountByAccountNumber(Long accountNumber) {
		AccountDetails accountdetails = service.getAccountDetailsByAccountNumber(accountNumber);
		return accountdetails;	
	}
	@GetMapping("/getallaccounts")
	public List<AccountDetails>getAllAccountDetails(){
		List<AccountDetails>allAccountDetails = service.getAllAccountDetails();
		return allAccountDetails;	
	}
	
	//updating account
	@PutMapping("/deposit/{accountNumber}/{accountdetails}")
	public AccountDetails depositAccount(@PathVariable Long accountNumber,@PathVariable Double amount) {
		AccountDetails account = service.depositMoney(accountNumber, amount);
		return account;	
	}
	
	//withdraw money
	@PutMapping("/withdraw/{accountNumber}/{amount}")
	public AccountDetails withdrawAccount(@PathVariable Long accountNumber,@PathVariable Double amount) {
		AccountDetails account = service.withdrawAmount(accountNumber, amount);
		return account;	
	}
	
	//delete account
	@DeleteMapping("/delete/{accountNumber}")
	public ResponseEntity<String> deleteAccount(@PathVariable Long accountNumber) {
		service.CloseAccount(accountNumber);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Account closed");
	}
}
