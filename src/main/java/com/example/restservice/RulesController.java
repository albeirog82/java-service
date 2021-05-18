package com.example.restservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RulesController {
	
	@PostMapping("/rules")
	public void RulesAnalysis(@RequestBody Perfil perfil) {
		System.out.println("hello " + perfil.getNombreCompania());
		RulesService rules = new RulesService();
		rules.applyRules(perfil);
	}
	
}
