package com.example.restservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;


public class RulesService {
	
	private StatelessKieSession kSession;
	private Connection connection;
	
	RulesService(){
		System.out.println("Rules created");
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		kSession = kContainer.newStatelessKieSession();
		connection = DatabaseService.getConnection();
	}
	
	public void applyRules(Perfil perfil) {
		System.out.println("Apply Rules");
		kSession.execute(perfil);
		System.out.println("Rules applied");
	}
	
	public void db(String companyId) {
		
		PerfilAnalizado perfil = new PerfilAnalizado();
		try{
			//connection = DBUtility.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from kms.registrations WHERE id = "+ companyId);
			rs.next();
			perfil.setCompanyId(Integer.valueOf(companyId));
			perfil.setNombreCompania(rs.getString("company_name"));

		} catch (SQLException e){
				e.printStackTrace();
		}
		System.out.println(perfil.getNombreCompania());
		
		kSession.execute(perfil);

		System.out.println(perfil.getScore());
		
		insertarPerfil(perfil);
		
	}
	
	
	private void insertarPerfil(PerfilAnalizado perfil){
		try {
			//connection = DBUtility.getConnection();
			 PreparedStatement preparedStatement = 
		            connection.prepareStatement("INSERT INTO kms.registrations_results(company_id, score) VALUES (?,?)");
			 preparedStatement.setInt(1, perfil.getCompanyId());
			 preparedStatement.setInt(2, perfil.getScore());
			 
             preparedStatement.executeUpdate();
             preparedStatement.close();
   			 //connection.close();

		}catch (SQLException e){
			e.printStackTrace();
		}
	}	
	
}
