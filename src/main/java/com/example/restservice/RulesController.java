package com.example.restservice;

import java.sql.Connection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RulesController {
	
	@PostMapping("/rules")
	public void RulesAnalysis(@RequestBody Perfil perfil) {
		System.out.println("hello " + perfil.getNombreCompania());
		System.out.println("date " + perfil.getFechaCreacion());
		RulesService rules = new RulesService();
		rules.applyRules(perfil);
	}
	
	@GetMapping("/rules")
	public void RuleAnalysisById(@RequestParam(value = "id") String companyId) {
		System.out.println(companyId);
		RulesService rules = new RulesService();
		rules.db(companyId);
		
	}
	
}
