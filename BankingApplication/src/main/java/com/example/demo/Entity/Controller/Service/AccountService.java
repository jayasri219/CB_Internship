package com.example.demo.Entity.Controller.Service;

import java.util.List;

import com.example.demo.Entity.AccountDetails;

public interface AccountService {
  
	//method to create account
	public AccountDetails createAccountDetails(AccountDetails accountdetails);
	
	//this method give details of that particular account
	public AccountDetails  getAccountDetailsByAccountNumber(Long acountNumber);
	
	//list of account
	public List<AccountDetails>getAllAccountDetails();
	
	//deposit money
	
	public AccountDetails depositMoney(Long accountNumber, Double amount);
	
	//withdraw amount
	
	public AccountDetails withdrawAmount(Long accpountNumber,Double amount);
	
	public void CloseAccount(Long accountNumber);
}
