package com.example.demo.Entity.Controller.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.AccountDetails;
import com.example.demo.Entity.Controller.Service.Rep.AccountRepository;
@Service
public class AccountServiceImp implements AccountService{
    @Autowired
    AccountRepository Repo;
	@Override
	public AccountDetails createAccountDetails(AccountDetails accountdetails) {
		AccountDetails Account_Saved = Repo.save(accountdetails);
		return Account_Saved;
	}

	@Override
	public AccountDetails getAccountDetailsByAccountNumber(Long acountNumber) {
		Optional<AccountDetails>accountdetails = Repo.findById(acountNumber);
		if(accountdetails.isEmpty()) {
			 throw new RuntimeException("Account does not present");
		}
		AccountDetails account_found = accountdetails.get();
		return account_found;
	}

	@Override
	public List<AccountDetails> getAllAccountDetails() {
		List<AccountDetails> ListOfAccounts = Repo.findAll();
		return ListOfAccounts;
	}

	@Override
	public AccountDetails depositMoney(Long accountNumber, Double amount) {
		Optional<AccountDetails> account = Repo.findById(accountNumber);
		if(account.isEmpty()) {
			throw new RuntimeException("Account is not present");
		}
		AccountDetails accountPresent = account.get();
		Double totalBalance = accountPresent.getAccount_balance()+amount;
		accountPresent.setAccount_balance(totalBalance);
		Repo.save(accountPresent);
		return accountPresent;
	}

	@Override
	public AccountDetails withdrawAmount(Long accpountNumber, Double amount) {
		Optional<AccountDetails> account = Repo.findById(accpountNumber);
		if(account.isEmpty()) {
			throw new RuntimeException("Account is not present");
		}
		AccountDetails accountPresent = account.get();
		Double accountBalance = accountPresent.getAccount_balance() - amount ;
		accountPresent.setAccount_balance(accountBalance);
		Repo.save(accountPresent);
		return accountPresent;
	}

	@Override
	public void CloseAccount(Long accountNumber) {
	 getAccountDetailsByAccountNumber(accountNumber);
		Repo.deleteById(accountNumber);
	}
   
}
