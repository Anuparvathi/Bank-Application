package com.example.bank.controller;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/bank")
public class BankController {
	
//	@Autowired
//	private UserService userService;
	
	@RequestMapping(value = "createUser", method = RequestMethod.POST)
	public ResponseEntity<String> createUser() {
//		List<User> users = userService.getAllUsers();
		System.out.println("Inside getAllUsers");
		return new ResponseEntity<>("user created", HttpStatus.OK);
		
	}
	@RequestMapping(value = "depositAmount ", method = RequestMethod.PUT)
	public ResponseEntity<String> depositAmount() {
		System.out.println("Inside getAllUsers");
		return new ResponseEntity<>("Amount is deposited", HttpStatus.OK);
	}
	@RequestMapping(value="addRecieverAccount", method=RequestMethod.POST)
	public ResponseEntity<String> addRecieverAccount(){
		return new ResponseEntity<>("Amount added to reciever account",HttpStatus.OK);
	}
	@RequestMapping(value="transferAmount", method=RequestMethod.POST)
	public ResponseEntity<String> transferAmount(){
		return new ResponseEntity<>("Amount transfered",HttpStatus.OK);
	}
	@RequestMapping(value="balanceCheck", method=RequestMethod.GET)
	public ResponseEntity<String> balanceCheck(){
		return new ResponseEntity<>("balanceCheck",HttpStatus.OK);
	}

	
	
}
