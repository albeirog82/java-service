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
			perfil.setE_1_experienciaLaboral(rs.getString("work_experience"));
			perfil.setE_2_Experienciacomoemprendedores(rs.getString("entrepreneurs_experience"));
			perfil.setE_3_Experienciaeneltema(rs.getString("subject_experience"));
			perfil.setE_4_TipodeExperienciaeneltema(rs.getString("experience_type"));
			perfil.setE_5_TrayectoriaEquipo(rs.getString("experience_team"));
			perfil.setE_6_ExperienciadelEmprendimientoenelEcosistema(rs.getString("ecosystem_experience"));
			perfil.setE_7_TIpodeExperienciadelEmprendimientoenelEcosistema(rs.getString("E_7")); // QUEMADA
			perfil.setC_1_Existenciadeunequipogestor(rs.getString("is_there_management_team"));
			perfil.setFI_2_CompromisodelequipomÃ­nimorequerido(rs.getString("members_number"));
			perfil.setPF_2_NÃºmerodemiembrosconpaquetesaccionarios(rs.getString("number_of_members_with_packages"));
			perfil.setIF_1_MontoInvertidoporlosfundadores(rs.getString("IF_1")); // QUEMADA
			perfil.setVD_1_Losdatossonveraces(rs.getString("VD_1"));// QUEMADA
			perfil.setPV_1_ImportanciaparaelCliente(rs.getString("PV_1"));// QUEMADA
			perfil.setPV_3_TieneundesempeÃ±osobresaliente(rs.getString("PV_3")); // QUEMADA
			perfil.setPV_5_AlineadoconlasmÃ©tricasdeÃxitodelCliente(rs.getString("PV_5")); // QUEMADA
			perfil.setPV_8_DesempeÃ±oSobresaliente(rs.getString("PV_8")); // QUEMADA
			perfil.setPV_9_DifÃ­cildeCopiar(rs.getString("PV_9")); // QUEMADA
			perfil.setMN_2_IngresosRecurrentes(rs.getString("MN_2")); // QUEMADA
			perfil.setMN_4_Laestructuradecostosesdiferencial(rs.getString("MN_4")); // QUEMADA
			perfil.setMN_7_ProtecciÃ³ndelacompetencia(rs.getString("MN_7")); // QUEMADA
			perfil.setPMF_1_PruebasyValidaciÃ³nconClientesreales(rs.getString("PMF_1")); // QUEMADA
			perfil.setDPP_1_Experienciassimilaresenelmercado(rs.getString("DPP_1")); // QUEMADA
			perfil.setTD_1_TecnologÃ­aExponencial(rs.getString("TD_1")); // QUEMADA
			perfil.setTD_3_ReferentesdeusodeestatecnologÃ­a(rs.getString("TD_3")); // QUEMADA
			perfil.setBER_1_ExistenciadeBarrerasdeEntradaenelMercado(rs.getString("BER_1")); // QUEMADA
			perfil.setBER_2_FavorabilidaddelaRegulaciÃ³nenestemercado(rs.getString("BER_2")); // QUEMADA
			perfil.setPEXP_1_PlandeExpansiÃ³nRegional(rs.getString("PEXP_1")); // QUEMADA
			perfil.setPEXP_2_TiempoparainiciarelPlandeExpansiÃ³n(rs.getString("PEXP_2")); // QUEMADA
			perfil.setCOMP_1_ExistenciadeCompetidoresLocales(rs.getString("COMP_1")); // QUEMADA
			perfil.setCOMP_2_ExistenciadeCompetidoresRegionales(rs.getString("COMP_2")); // QUEMADA
			perfil.setUE_1_TiquetePromedioHoy(rs.getString("UE_1")); // QUEMADA
			perfil.setUE_5_EBITDA(rs.getString("UE_5")); // QUEMADA
			perfil.setUE_6_VENTAS(rs.getString("UE_6")); // QUEMADA
			perfil.setUE_8_Rentabilidad(rs.getString("UE_8")); // QUEMADA
			perfil.setPE_3_Puntodeequilibrio(rs.getString("PE_3")); // QUEMADA
			perfil.setRI_1_RondadeInversiÃ³nalaqueaccederÃ­a(rs.getString("RI_1")); // QUEMADA
			perfil.setVC_1_ValoraciÃ³ndelaCompaÃ±Ã­a(rs.getString("VC_1")); // QUEMADA
			perfil.setCN_2_ValoraciÃ³nJustificadasegÃºnelequipoemprendedor(rs.getString("CN_2")); // QUEMADA
			perfil.setCN_3_ValoraciÃ³nJustificadasegÃºnPotencialdeMercado(rs.getString("CN_3")); // QUEMADA
			perfil.setCN_4_NotaConvertibleoAcciones(rs.getString("CN_4")); // QUEMADA
			perfil.setCN_5_OtorgarÃ­aParticipaciÃ³n(rs.getString("CN_5")); // QUEMADA
			perfil.setCN_7_DisposiciÃ³naNegociar(rs.getString("CN_7")); // QUEMADA
			perfil.setPAV_1_ReddeMentorÃ­a(rs.getString("PAV_1")); // QUEMADA
			
			
			
		

		} catch (SQLException e){
				e.printStackTrace();
		}
		System.out.println(perfil.getNombreCompania());
		
		kSession.execute(perfil);
		
		insertarPerfil(perfil);
		
	}
	
	
	private void insertarPerfil(PerfilAnalizado perfil){
		try {
			//connection = DBUtility.getConnection();
			
			PreparedStatement preparedStatementDel = 
                    connection.prepareStatement("DELETE FROM kms.radar WHERE compania = ?");
                    preparedStatementDel.setString(1, perfil.getNombreCompania());
             preparedStatementDel.executeUpdate();
             preparedStatementDel.close();
			
			/*************************************
   			 ******* Insert parte de Team
   			 **************************************/
			 PreparedStatement preparedStatement = 
		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
			 preparedStatement.setString(1, "T1");
			 preparedStatement.setDouble(2, perfil.getT1()*5/0.1);
			 preparedStatement.setString(3, "Team");
			 preparedStatement.setString(4, perfil.getNombreCompania());
             preparedStatement.executeUpdate();
             preparedStatement.close();
             
             PreparedStatement preparedStatement2 = 
  		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
  			 preparedStatement2.setString(1, "T2");
  			 preparedStatement2.setDouble(2, perfil.getT2()*5/0.1);
  			 preparedStatement2.setString(3, "Team");
  			 preparedStatement2.setString(4, perfil.getNombreCompania());
             preparedStatement2.executeUpdate();
             preparedStatement2.close();
             
             PreparedStatement preparedStatement3 = 
   		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
   			 preparedStatement3.setString(1, "T3");
   			 preparedStatement3.setDouble(2, perfil.getT3()*5/0.1);
   			 preparedStatement3.setString(3, "Team");
   			 preparedStatement3.setString(4, perfil.getNombreCompania());
             preparedStatement3.executeUpdate();
             preparedStatement3.close();
             
             PreparedStatement preparedStatement4 = 
    		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
    			 preparedStatement4.setString(1, "T4");
    			 preparedStatement4.setDouble(2, perfil.getT4()*5/0.1);
    			 preparedStatement4.setString(3, "Team");
    			 preparedStatement4.setString(4, perfil.getNombreCompania());
               preparedStatement4.executeUpdate();
               preparedStatement4.close();
               
             /*************************************
   			 ******* Insert parte de Context
   			 **************************************/
               
               PreparedStatement preparedStatementC1 = 
   		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
   			 	preparedStatementC1.setString(1, "C1");
   			 	preparedStatementC1.setDouble(2, perfil.getC1()*5/0.05);
   			 	preparedStatementC1.setString(3, "Context");
   			 	preparedStatementC1.setString(4, perfil.getNombreCompania());
                preparedStatementC1.executeUpdate();
                preparedStatementC1.close();

                PreparedStatement preparedStatementC2 = 
   		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
   			 	preparedStatementC2.setString(1, "C2");
   			 	preparedStatementC2.setDouble(2, perfil.getC2()*5/0.05);
   			 	preparedStatementC2.setString(3, "Context");
   			 	preparedStatementC2.setString(4, perfil.getNombreCompania());
                preparedStatementC2.executeUpdate();
                preparedStatementC2.close();

                PreparedStatement preparedStatementC3 = 
   		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
   			 	preparedStatementC3.setString(1, "C3");
   			 	preparedStatementC3.setDouble(2, perfil.getC3()*5/0.05);
   			 	preparedStatementC3.setString(3, "Context");
   			 	preparedStatementC3.setString(4, perfil.getNombreCompania());
                preparedStatementC3.executeUpdate();
                preparedStatementC3.close();

                PreparedStatement preparedStatementC4 = 
   		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
   			 	preparedStatementC4.setString(1, "C4");
   			 	preparedStatementC4.setDouble(2, perfil.getC4()*5/0.05);
   			 	preparedStatementC4.setString(3, "Context");
   			 	preparedStatementC4.setString(4, perfil.getNombreCompania());
                preparedStatementC4.executeUpdate();
                preparedStatementC4.close();
                
                /*************************************
       			 ******* Insert parte de Opportunity
       			 **************************************/
                
                PreparedStatement preparedStatementO1 = 
    		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
    			 preparedStatementO1.setString(1, "O1");
    			 preparedStatementO1.setDouble(2, perfil.getO1()*5/0.05);
    			 preparedStatementO1.setString(3, "Opportunity");
    			 preparedStatementO1.setString(4, perfil.getNombreCompania());
                 preparedStatementO1.executeUpdate();
                 preparedStatementO1.close();

                 PreparedStatement preparedStatementO2 = 
    		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
    			 preparedStatementO2.setString(1, "O2");
    			 preparedStatementO2.setDouble(2, perfil.getO2()*5/0.05);
    			 preparedStatementO2.setString(3, "Opportunity");
    			 preparedStatementO2.setString(4, perfil.getNombreCompania());
                 preparedStatementO2.executeUpdate();
                 preparedStatementO2.close();

                 PreparedStatement preparedStatementO3 = 
    		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
    			 preparedStatementO3.setString(1, "O3");
    			 preparedStatementO3.setDouble(2, perfil.getO3()*5/0.05);
    			 preparedStatementO3.setString(3, "Opportunity");
    			 preparedStatementO3.setString(4, perfil.getNombreCompania());
                 preparedStatementO3.executeUpdate();
                 preparedStatementO3.close();

                 PreparedStatement preparedStatementO4 = 
    		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
    			 preparedStatementO4.setString(1, "O4");
    			 preparedStatementO4.setDouble(2, perfil.getO4()*5/0.05);
    			 preparedStatementO4.setString(3, "Opportunity");
    			 preparedStatementO4.setString(4, perfil.getNombreCompania());
                 preparedStatementO4.executeUpdate();
                 preparedStatementO4.close();
             
                 /*************************************
                  ******* Insert parte de Deal
                  **************************************/
                 
                 PreparedStatement preparedStatementD1 = 
     		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
     			 preparedStatementD1.setString(1, "D1");
     			 preparedStatementD1.setDouble(2, perfil.getD1()*5/0.05);
     			 preparedStatementD1.setString(3, "Deal");
     			 preparedStatementD1.setString(4, perfil.getNombreCompania());
                  preparedStatementD1.executeUpdate();
                  preparedStatementD1.close();

                  PreparedStatement preparedStatementD2 = 
     		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
     			 preparedStatementD2.setString(1, "D2");
     			 preparedStatementD2.setDouble(2, perfil.getD2()*5/0.05);
     			 preparedStatementD2.setString(3, "Deal");
     			 preparedStatementD2.setString(4, perfil.getNombreCompania());
                  preparedStatementD2.executeUpdate();
                  preparedStatementD2.close();

                  PreparedStatement preparedStatementD3 = 
     		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
     			 preparedStatementD3.setString(1, "D3");
     			 preparedStatementD3.setDouble(2, perfil.getD3()*5/0.05);
     			 preparedStatementD3.setString(3, "Deal");
     			 preparedStatementD3.setString(4, perfil.getNombreCompania());
                  preparedStatementD3.executeUpdate();
                  preparedStatementD3.close();

                  PreparedStatement preparedStatementD4 = 
     		            connection.prepareStatement("INSERT INTO kms.radar(q, rating, Categoria, compania) VALUES (?,?,?,?)");
     			 preparedStatementD4.setString(1, "D4");
     			 preparedStatementD4.setDouble(2, perfil.getD4()*5/0.05);
     			 preparedStatementD4.setString(3, "Deal");
     			 preparedStatementD4.setString(4, perfil.getNombreCompania());
                  preparedStatementD4.executeUpdate();
                  preparedStatementD4.close();
             
   			 //connection.close();
             


		}catch (SQLException e){
			e.printStackTrace();
		}
	}	
	
}
