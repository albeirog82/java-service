package com.example.restservice;

import java.time.LocalDate;

public class Perfil {
	
	private Integer companyId; 
	private String nombreCompania;
	private LocalDate fechaCreacion;
	private String E_1_experienciaLaboral;//ya
	private String E_2_Experienciacomoemprendedores; //ya
	private String E_3_Experienciaeneltema; //ya
	private String E_4_TipodeExperienciaeneltema; //ya
	private String E_5_TrayectoriaEquipo;//ya
	private String E_6_ExperienciadelEmprendimientoenelEcosistema; //ya
	private String E_7_TIpodeExperienciadelEmprendimientoenelEcosistema; //ya QUEMADA
	private String C_1_Existenciadeunequipogestor; //ya
	private String FI_2_Compromisodelequipomínimorequerido; //ya
	private String PF_2_Númerodemiembrosconpaquetesaccionarios; //ya
	private String IF_1_MontoInvertidoporlosfundadores; //ya QUEMADA
	private String VD_1_Losdatossonveraces; //ya QUEMADA
	private String PV_1_ImportanciaparaelCliente; //ya QUEMADA
	private String PV_3_Tieneundesempeñosobresaliente; //ya QUEMADA
	private String PV_5_AlineadoconlasmétricasdeÉxitodelCliente; //ya QUEMADA
	private String PV_8_DesempeñoSobresaliente; //ya QUEMADA
	private String PV_9_DifícildeCopiar; //ya QUEMADA
	private String MN_2_IngresosRecurrentes; //ya QUEMADA
	private String MN_4_Laestructuradecostosesdiferencial; //ya QUEMADA
	private String MN_7_Proteccióndelacompetencia; //ya QUEMADA
	private String PMF_1_PruebasyValidaciónconClientesreales; //ya QUEMADA
	private String DPP_1_Experienciassimilaresenelmercado; //ya QUEMADA
	private String TD_1_TecnologíaExponencial; //ya QUEMADA
	private String TD_3_Referentesdeusodeestatecnología; //ya QUEMADA
	private String BER_1_ExistenciadeBarrerasdeEntradaenelMercado; //ya QUEMADA
	private String BER_2_FavorabilidaddelaRegulaciónenestemercado; //ya QUEMADA
	private String PEXP_1_PlandeExpansiónRegional; //ya QUEMADA
	private String PEXP_2_TiempoparainiciarelPlandeExpansión; //ya QUEMADA
	private String COMP_1_ExistenciadeCompetidoresLocales; //ya QUEMADA
	private String COMP_2_ExistenciadeCompetidoresRegionales; //ya QUEMADA
	private String UE_1_TiquetePromedioHoy; //ya QUEMADA
	private String UE_5_EBITDA; //ya QUEMADA
	private String UE_6_VENTAS; //ya QUEMADA
	private String UE_8_Rentabilidad; //ya QUEMADA
	private String PE_3_Puntodeequilibrio; //ya QUEMADA
	private String RI_1_RondadeInversiónalaqueaccedería; //ya QUEMADA
	private String VC_1_ValoracióndelaCompañía; //ya QUEMADA
	private String CN_2_ValoraciónJustificadasegúnelequipoemprendedor; //ya QUEMADA
	private String CN_3_ValoraciónJustificadasegúnPotencialdeMercado; //ya QUEMADA
	private String CN_4_NotaConvertibleoAcciones; //ya QUEMADA
	private String CN_5_OtorgaríaParticipación; //ya QUEMADA
	private String CN_7_DisposiciónaNegociar; //ya QUEMADA
	private String PAV_1_ReddeMentoría; //ya QUEMADA
	
	public Perfil() {
		this.PEXP_2_TiempoparainiciarelPlandeExpansión = "0";
		this.FI_2_Compromisodelequipomínimorequerido = "0";
		this.BER_1_ExistenciadeBarrerasdeEntradaenelMercado  = "0";
	}
	
	
	

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}	
	
	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getE_1_experienciaLaboral() {
		return E_1_experienciaLaboral;
	}

	public void setE_1_experienciaLaboral(String e_1_experienciaLaboral) {
		E_1_experienciaLaboral = e_1_experienciaLaboral;
	}

	public String getE_2_Experienciacomoemprendedores() {
		return E_2_Experienciacomoemprendedores;
	}

	public void setE_2_Experienciacomoemprendedores(String e_2_Experienciacomoemprendedores) {
		E_2_Experienciacomoemprendedores = e_2_Experienciacomoemprendedores;
	}

	public String getE_3_Experienciaeneltema() {
		return E_3_Experienciaeneltema;
	}

	public void setE_3_Experienciaeneltema(String e_3_Experienciaeneltema) {
		E_3_Experienciaeneltema = e_3_Experienciaeneltema;
	}

	public String getE_4_TipodeExperienciaeneltema() {
		return E_4_TipodeExperienciaeneltema;
	}

	public void setE_4_TipodeExperienciaeneltema(String e_4_TipodeExperienciaeneltema) {
		E_4_TipodeExperienciaeneltema = e_4_TipodeExperienciaeneltema;
	}

	public String getE_5_TrayectoriaEquipo() {
		return E_5_TrayectoriaEquipo;
	}

	public void setE_5_TrayectoriaEquipo(String e_5_TrayectoriaEquipo) {
		E_5_TrayectoriaEquipo = e_5_TrayectoriaEquipo;
	}

	public String getE_6_ExperienciadelEmprendimientoenelEcosistema() {
		return E_6_ExperienciadelEmprendimientoenelEcosistema;
	}

	public void setE_6_ExperienciadelEmprendimientoenelEcosistema(String e_6_ExperienciadelEmprendimientoenelEcosistema) {
		E_6_ExperienciadelEmprendimientoenelEcosistema = e_6_ExperienciadelEmprendimientoenelEcosistema;
	}

	public String getE_7_TIpodeExperienciadelEmprendimientoenelEcosistema() {
		return E_7_TIpodeExperienciadelEmprendimientoenelEcosistema;
	}

	public void setE_7_TIpodeExperienciadelEmprendimientoenelEcosistema(
			String e_7_TIpodeExperienciadelEmprendimientoenelEcosistema) {
		E_7_TIpodeExperienciadelEmprendimientoenelEcosistema = e_7_TIpodeExperienciadelEmprendimientoenelEcosistema;
	}

	public String getC_1_Existenciadeunequipogestor() {
		return C_1_Existenciadeunequipogestor;
	}

	public void setC_1_Existenciadeunequipogestor(String c_1_Existenciadeunequipogestor) {
		C_1_Existenciadeunequipogestor = c_1_Existenciadeunequipogestor;
	}

	public String getFI_2_Compromisodelequipomínimorequerido() {
		return FI_2_Compromisodelequipomínimorequerido;
	}

	public void setFI_2_Compromisodelequipomínimorequerido(String fI_2_Compromisodelequipomínimorequerido) {
		//if fI_2_Compromisodelequipomínimorequerido.equals("")
		FI_2_Compromisodelequipomínimorequerido = fI_2_Compromisodelequipomínimorequerido;
	}

	public String getPF_2_Númerodemiembrosconpaquetesaccionarios() {
		return PF_2_Númerodemiembrosconpaquetesaccionarios;
	}

	public void setPF_2_Númerodemiembrosconpaquetesaccionarios(String pF_2_Númerodemiembrosconpaquetesaccionarios) {
		PF_2_Númerodemiembrosconpaquetesaccionarios = pF_2_Númerodemiembrosconpaquetesaccionarios;
	}

	public String getIF_1_MontoInvertidoporlosfundadores() {
		return IF_1_MontoInvertidoporlosfundadores;
	}

	public void setIF_1_MontoInvertidoporlosfundadores(String iF_1_MontoInvertidoporlosfundadores) {
		IF_1_MontoInvertidoporlosfundadores = iF_1_MontoInvertidoporlosfundadores;
	}

	public String getVD_1_Losdatossonveraces() {
		return VD_1_Losdatossonveraces;
	}

	public void setVD_1_Losdatossonveraces(String vD_1_Losdatossonveraces) {
		VD_1_Losdatossonveraces = vD_1_Losdatossonveraces;
	}

	public String getPV_1_ImportanciaparaelCliente() {
		return PV_1_ImportanciaparaelCliente;
	}

	public void setPV_1_ImportanciaparaelCliente(String pV_1_ImportanciaparaelCliente) {
		PV_1_ImportanciaparaelCliente = pV_1_ImportanciaparaelCliente;
	}

	public String getPV_3_Tieneundesempeñosobresaliente() {
		return PV_3_Tieneundesempeñosobresaliente;
	}

	public void setPV_3_Tieneundesempeñosobresaliente(String pV_3_Tieneundesempeñosobresaliente) {
		PV_3_Tieneundesempeñosobresaliente = pV_3_Tieneundesempeñosobresaliente;
	}

	public String getPV_5_AlineadoconlasmétricasdeÉxitodelCliente() {
		return PV_5_AlineadoconlasmétricasdeÉxitodelCliente;
	}

	public void setPV_5_AlineadoconlasmétricasdeÉxitodelCliente(String pV_5_AlineadoconlasmétricasdeÉxitodelCliente) {
		PV_5_AlineadoconlasmétricasdeÉxitodelCliente = pV_5_AlineadoconlasmétricasdeÉxitodelCliente;
	}

	public String getPV_8_DesempeñoSobresaliente() {
		return PV_8_DesempeñoSobresaliente;
	}

	public void setPV_8_DesempeñoSobresaliente(String pV_8_DesempeñoSobresaliente) {
		PV_8_DesempeñoSobresaliente = pV_8_DesempeñoSobresaliente;
	}

	public String getPV_9_DifícildeCopiar() {
		return PV_9_DifícildeCopiar;
	}

	public void setPV_9_DifícildeCopiar(String pV_9_DifícildeCopiar) {
		PV_9_DifícildeCopiar = pV_9_DifícildeCopiar;
	}

	public String getMN_2_IngresosRecurrentes() {
		return MN_2_IngresosRecurrentes;
	}

	public void setMN_2_IngresosRecurrentes(String mN_2_IngresosRecurrentes) {
		MN_2_IngresosRecurrentes = mN_2_IngresosRecurrentes;
	}

	public String getMN_4_Laestructuradecostosesdiferencial() {
		return MN_4_Laestructuradecostosesdiferencial;
	}

	public void setMN_4_Laestructuradecostosesdiferencial(String mN_4_Laestructuradecostosesdiferencial) {
		MN_4_Laestructuradecostosesdiferencial = mN_4_Laestructuradecostosesdiferencial;
	}

	public String getMN_7_Proteccióndelacompetencia() {
		return MN_7_Proteccióndelacompetencia;
	}

	public void setMN_7_Proteccióndelacompetencia(String mN_7_Proteccióndelacompetencia) {
		MN_7_Proteccióndelacompetencia = mN_7_Proteccióndelacompetencia;
	}

	public String getPMF_1_PruebasyValidaciónconClientesreales() {
		return PMF_1_PruebasyValidaciónconClientesreales;
	}

	public void setPMF_1_PruebasyValidaciónconClientesreales(String pMF_1_PruebasyValidaciónconClientesreales) {
		PMF_1_PruebasyValidaciónconClientesreales = pMF_1_PruebasyValidaciónconClientesreales;
	}

	public String getDPP_1_Experienciassimilaresenelmercado() {
		return DPP_1_Experienciassimilaresenelmercado;
	}

	public void setDPP_1_Experienciassimilaresenelmercado(String dPP_1_Experienciassimilaresenelmercado) {
		DPP_1_Experienciassimilaresenelmercado = dPP_1_Experienciassimilaresenelmercado;
	}

	public String getTD_1_TecnologíaExponencial() {
		return TD_1_TecnologíaExponencial;
	}

	public void setTD_1_TecnologíaExponencial(String tD_1_TecnologíaExponencial) {
		TD_1_TecnologíaExponencial = tD_1_TecnologíaExponencial;
	}

	public String getTD_3_Referentesdeusodeestatecnología() {
		return TD_3_Referentesdeusodeestatecnología;
	}

	public void setTD_3_Referentesdeusodeestatecnología(String tD_3_Referentesdeusodeestatecnología) {
		TD_3_Referentesdeusodeestatecnología = tD_3_Referentesdeusodeestatecnología;
	}

	public String getBER_1_ExistenciadeBarrerasdeEntradaenelMercado() {
		return BER_1_ExistenciadeBarrerasdeEntradaenelMercado;
	}

	public void setBER_1_ExistenciadeBarrerasdeEntradaenelMercado(String bER_1_ExistenciadeBarrerasdeEntradaenelMercado) {
		BER_1_ExistenciadeBarrerasdeEntradaenelMercado = bER_1_ExistenciadeBarrerasdeEntradaenelMercado;
	}

	public String getBER_2_FavorabilidaddelaRegulaciónenestemercado() {
		return BER_2_FavorabilidaddelaRegulaciónenestemercado;
	}

	public void setBER_2_FavorabilidaddelaRegulaciónenestemercado(String bER_2_FavorabilidaddelaRegulaciónenestemercado) {
		BER_2_FavorabilidaddelaRegulaciónenestemercado = bER_2_FavorabilidaddelaRegulaciónenestemercado;
	}

	public String getPEXP_1_PlandeExpansiónRegional() {
		return PEXP_1_PlandeExpansiónRegional;
	}

	public void setPEXP_1_PlandeExpansiónRegional(String pEXP_1_PlandeExpansiónRegional) {
		PEXP_1_PlandeExpansiónRegional = pEXP_1_PlandeExpansiónRegional;
	}

	public String getPEXP_2_TiempoparainiciarelPlandeExpansión() {
		return PEXP_2_TiempoparainiciarelPlandeExpansión;
	}

	public void setPEXP_2_TiempoparainiciarelPlandeExpansión(String pEXP_2_TiempoparainiciarelPlandeExpansión) {
		PEXP_2_TiempoparainiciarelPlandeExpansión = pEXP_2_TiempoparainiciarelPlandeExpansión;
	}

	public String getCOMP_1_ExistenciadeCompetidoresLocales() {
		return COMP_1_ExistenciadeCompetidoresLocales;
	}

	public void setCOMP_1_ExistenciadeCompetidoresLocales(String cOMP_1_ExistenciadeCompetidoresLocales) {
		COMP_1_ExistenciadeCompetidoresLocales = cOMP_1_ExistenciadeCompetidoresLocales;
	}

	public String getCOMP_2_ExistenciadeCompetidoresRegionales() {
		return COMP_2_ExistenciadeCompetidoresRegionales;
	}

	public void setCOMP_2_ExistenciadeCompetidoresRegionales(String cOMP_2_ExistenciadeCompetidoresRegionales) {
		COMP_2_ExistenciadeCompetidoresRegionales = cOMP_2_ExistenciadeCompetidoresRegionales;
	}

	public String getUE_1_TiquetePromedioHoy() {
		return UE_1_TiquetePromedioHoy;
	}

	public void setUE_1_TiquetePromedioHoy(String uE_1_TiquetePromedioHoy) {
		UE_1_TiquetePromedioHoy = uE_1_TiquetePromedioHoy;
	}

	public String getUE_5_EBITDA() {
		return UE_5_EBITDA;
	}

	public void setUE_5_EBITDA(String uE_5_EBITDA) {
		UE_5_EBITDA = uE_5_EBITDA;
	}

	public String getUE_6_VENTAS() {
		return UE_6_VENTAS;
	}

	public void setUE_6_VENTAS(String uE_6_VENTAS) {
		UE_6_VENTAS = uE_6_VENTAS;
	}

	public String getUE_8_Rentabilidad() {
		return UE_8_Rentabilidad;
	}

	public void setUE_8_Rentabilidad(String uE_8_Rentabilidad) {
		UE_8_Rentabilidad = uE_8_Rentabilidad;
	}

	public String getPE_3_Puntodeequilibrio() {
		return PE_3_Puntodeequilibrio;
	}

	public void setPE_3_Puntodeequilibrio(String pE_3_Puntodeequilibrio) {
		PE_3_Puntodeequilibrio = pE_3_Puntodeequilibrio;
	}

	public String getRI_1_RondadeInversiónalaqueaccedería() {
		return RI_1_RondadeInversiónalaqueaccedería;
	}

	public void setRI_1_RondadeInversiónalaqueaccedería(String rI_1_RondadeInversiónalaqueaccedería) {
		RI_1_RondadeInversiónalaqueaccedería = rI_1_RondadeInversiónalaqueaccedería;
	}

	public String getVC_1_ValoracióndelaCompañía() {
		return VC_1_ValoracióndelaCompañía;
	}

	public void setVC_1_ValoracióndelaCompañía(String vC_1_ValoracióndelaCompañía) {
		VC_1_ValoracióndelaCompañía = vC_1_ValoracióndelaCompañía;
	}

	public String getCN_2_ValoraciónJustificadasegúnelequipoemprendedor() {
		return CN_2_ValoraciónJustificadasegúnelequipoemprendedor;
	}

	public void setCN_2_ValoraciónJustificadasegúnelequipoemprendedor(
			String cN_2_ValoraciónJustificadasegúnelequipoemprendedor) {
		CN_2_ValoraciónJustificadasegúnelequipoemprendedor = cN_2_ValoraciónJustificadasegúnelequipoemprendedor;
	}

	public String getCN_3_ValoraciónJustificadasegúnPotencialdeMercado() {
		return CN_3_ValoraciónJustificadasegúnPotencialdeMercado;
	}

	public void setCN_3_ValoraciónJustificadasegúnPotencialdeMercado(
			String cN_3_ValoraciónJustificadasegúnPotencialdeMercado) {
		CN_3_ValoraciónJustificadasegúnPotencialdeMercado = cN_3_ValoraciónJustificadasegúnPotencialdeMercado;
	}

	public String getCN_4_NotaConvertibleoAcciones() {
		return CN_4_NotaConvertibleoAcciones;
	}

	public void setCN_4_NotaConvertibleoAcciones(String cN_4_NotaConvertibleoAcciones) {
		CN_4_NotaConvertibleoAcciones = cN_4_NotaConvertibleoAcciones;
	}

	public String getCN_5_OtorgaríaParticipación() {
		return CN_5_OtorgaríaParticipación;
	}

	public void setCN_5_OtorgaríaParticipación(String cN_5_OtorgaríaParticipación) {
		CN_5_OtorgaríaParticipación = cN_5_OtorgaríaParticipación;
	}

	public String getCN_7_DisposiciónaNegociar() {
		return CN_7_DisposiciónaNegociar;
	}

	public void setCN_7_DisposiciónaNegociar(String cN_7_DisposiciónaNegociar) {
		CN_7_DisposiciónaNegociar = cN_7_DisposiciónaNegociar;
	}

	public String getPAV_1_ReddeMentoría() {
		return PAV_1_ReddeMentoría;
	}

	public void setPAV_1_ReddeMentoría(String pAV_1_ReddeMentoría) {
		PAV_1_ReddeMentoría = pAV_1_ReddeMentoría;
	}

	
	

}
