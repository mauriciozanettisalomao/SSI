package br.com.nextel.ssi.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="REPL_VWBR_USER_NEXTEL")
public class ReplVwbrUserNextel {
	
	@Id
	@Column(name="ID_USER")
	private String idUser;
	
	@Column(name="NO_USUARIO")
	private String nmUser;
	
	@Column(name="CD_LOGIN_USER")
	private String cdLoginUser;

	@Column(name="DE_EMAIL")
	private String deEmail;
	
	@Column(name="DE_CARGO")
	private String deJobTitle;
	
	@Column(name="ID_CEN_CUSTO")
	private String idCostCenter;
	
	@Column(name="ID_CELULA")
	private String idArea;
	
	@Column(name="DE_CELULA")
	private String deArea;
	
	@Column(name="ID_USER_GESTOR")
	private long idUserGestor;
	
	@Column(name="ID_FILIAL")
	private String idBranch;
	
	@Column(name="NM_FILIAL")
	private String nmBranch;
	
	@Column(name="ID_LOCALIDADE")
	private int idLocality;
	
	@Column(name="NM_LOCALIDADE")
	private String nmLocality;
	
	@Column(name="DT_INICIO_ATIVIDADE")
	private Date dtStartValid;
	
	@Column(name="DT_FIM_ATIVIDADE")
	private Date dtEndValid;
	
	@ManyToOne
	@JoinColumn(name="ID_EMPRESA")
	private TwbrCollaboratorCompany collaboratorCompany;
	
	@Column(name="NR_CONTRATO")
	private String nrContract;
	
	@Column(name="TP_RELACAO_TRABALHO")
	private String tpWorkRelation;
	
	@Column(name="ID_CARGO")
	private String idJobTitle;

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getNmUser() {
		return nmUser;
	}

	public void setNmUser(String nmUser) {
		this.nmUser = nmUser;
	}

	public String getCdLoginUser() {
		return cdLoginUser;
	}

	public void setCdLoginUser(String cdLoginUser) {
		this.cdLoginUser = cdLoginUser;
	}

	public String getDeEmail() {
		return deEmail;
	}

	public void setDeEmail(String deEmail) {
		this.deEmail = deEmail;
	}

	public String getDeJobTitle() {
		return deJobTitle;
	}

	public void setDeJobTitle(String deJobTitle) {
		this.deJobTitle = deJobTitle;
	}

	public String getIdCostCenter() {
		return idCostCenter;
	}

	public void setIdCostCenter(String idCostCenter) {
		this.idCostCenter = idCostCenter;
	}

	public String getIdArea() {
		return idArea;
	}

	public void setIdArea(String idArea) {
		this.idArea = idArea;
	}

	public String getDeArea() {
		return deArea;
	}

	public void setDeArea(String deArea) {
		this.deArea = deArea;
	}

	public long getIdUserGestor() {
		return idUserGestor;
	}

	public void setIdUserGestor(long idUserGestor) {
		this.idUserGestor = idUserGestor;
	}

	public String getIdBranch() {
		return idBranch;
	}

	public void setIdBranch(String idBranch) {
		this.idBranch = idBranch;
	}

	public String getNmBranch() {
		return nmBranch;
	}

	public void setNmBranch(String nmBranch) {
		this.nmBranch = nmBranch;
	}

	public int getIdLocality() {
		return idLocality;
	}

	public void setIdLocality(int idLocality) {
		this.idLocality = idLocality;
	}

	public String getNmLocality() {
		return nmLocality;
	}

	public void setNmLocality(String nmLocality) {
		this.nmLocality = nmLocality;
	}

	public Date getDtStartValid() {
		return dtStartValid;
	}

	public void setDtStartValid(Date dtStartValid) {
		this.dtStartValid = dtStartValid;
	}

	public Date getDtEndValid() {
		return dtEndValid;
	}

	public void setDtEndValid(Date dtEndValid) {
		this.dtEndValid = dtEndValid;
	}

	public TwbrCollaboratorCompany getCollaboratorCompany() {
		return collaboratorCompany;
	}

	public void setCollaboratorCompany(TwbrCollaboratorCompany collaboratorCompany) {
		this.collaboratorCompany = collaboratorCompany;
	}

	public String getNrContract() {
		return nrContract;
	}

	public void setNrContract(String nrContract) {
		this.nrContract = nrContract;
	}

	public String getTpWorkRelation() {
		return tpWorkRelation;
	}

	public void setTpWorkRelation(String tpWorkRelation) {
		this.tpWorkRelation = tpWorkRelation;
	}

	public String getIdJobTitle() {
		return idJobTitle;
	}

	public void setIdJobTitle(String idJobTitle) {
		this.idJobTitle = idJobTitle;
	}

	@Override
	public String toString() {
		return "UserRepl [idUser=" + idUser + ", nmUser=" + nmUser
				+ ", cdLoginUser=" + cdLoginUser + ", deEmail=" + deEmail
				+ ", deJobTitle=" + deJobTitle + ", idCostCenter="
				+ idCostCenter + ", idArea=" + idArea + ", deArea=" + deArea
				+ ", idUserGestor=" + idUserGestor + ", idBranch=" + idBranch
				+ ", nmBranch=" + nmBranch + ", idLocality=" + idLocality
				+ ", nmLocality=" + nmLocality + ", dtStartValid="
				+ dtStartValid + ", dtEndValid=" + dtEndValid
				+ ", collaboratorCompany=" + collaboratorCompany
				+ ", nrContract=" + nrContract + ", tpWorkRelation="
				+ tpWorkRelation + ", idJobTitle=" + idJobTitle + "]";
	}

	

}
