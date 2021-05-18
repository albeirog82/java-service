package com.example.restservice;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

public class RulesService {
	
	private StatelessKieSession kSession;
	
	RulesService(){
		System.out.println("Rules created");
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		kSession = kContainer.newStatelessKieSession();
	}
	
	public void applyRules(Perfil perfil) {
		System.out.println("Apply Rules");
		kSession.execute(perfil);
		System.out.println("Rules applied");
	}
	
}
