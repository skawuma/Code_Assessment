package com.example.EmpManage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmpManage.entity.Complain;
import com.example.EmpManage.repo.ComplainRepository;

@RestController
@RequestMapping("/api/complain")
public class ComplainController {
	
	
	@Autowired
	ComplainRepository complainrepository;
	
	@PostMapping("/addcomplain")
	Complain newComplain(@RequestBody Complain complain) {
		return complainrepository.save(complain);
	}
		@GetMapping("/getcomplain")
		List<Complain>all(){
			return complainrepository.findAll();
		}
	}


