package com.example.EmpManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Payroll;
import com.example.EmpManage.repo.PayrollRepository;

@RestController

@RequestMapping("/api/payroll")
public class PayrollController {
	
	
	 @Autowired
	PayrollRepository payrollRepository;
	
	

@PostMapping("/addpayroll")
Payroll newPayroll(@RequestBody Payroll payroll) {  	
	return payrollRepository.save(payroll);
}

	
	@GetMapping ("/getpayroll")
	//@RequestMapping(method=RequestMethod.GET,value "/users")
	List<Payroll>all(){
		return payrollRepository.findAll();
	}
	 

}
