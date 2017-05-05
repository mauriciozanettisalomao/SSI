package br.com.nextel.ssi.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TWBR_COLLABORATOR_COMPANY")
public class TwbrCollaboratorCompany {

	@Id
	@Column(name="CD_COLLABORATOR_COMPANY")
	private int cdCollaboratorCompany;
	
	@Column(name="NM_COLLABORATOR_COMPANY")
	private String nmCollaboratorComany;

	public int getCdCollaboratorCompany() {
		return cdCollaboratorCompany;
	}

	public void setCdCollaboratorCompany(int cdCollaboratorCompany) {
		this.cdCollaboratorCompany = cdCollaboratorCompany;
	}

	public String getNmCollaboratorComany() {
		return nmCollaboratorComany;
	}

	public void setNmCollaboratorComany(String nmCollaboratorComany) {
		this.nmCollaboratorComany = nmCollaboratorComany;
	}
	
	
}
