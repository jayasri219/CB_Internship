package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Account")
public class AccountDetails {
	
	//private fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long account_number;
	private String account_holer_name;
	private Double account_balance;
	
	// default constructor
	public  AccountDetails() {
		
	}

	//perameterised constructor
	public AccountDetails(String account_holer_name, Double account_balance) {
		super();
		this.account_holer_name = account_holer_name;
		this.account_balance = account_balance;
	}
    // getters and setters
	public Long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(Long account_number) {
		this.account_number = account_number;
	}

	public String getAccount_holer_name() {
		return account_holer_name;
	}

	public void setAccount_holer_name(String account_holer_name) {
		this.account_holer_name = account_holer_name;
	}

	public Double getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(Double account_balance) {
		this.account_balance = account_balance;
	}
   //toString method
	@Override
	public String toString() {
		return "AccountDetails [account_number=" + account_number + ", account_holer_name=" + account_holer_name
				+ ", account_balance=" + account_balance + "]";
	}
    
	
}
