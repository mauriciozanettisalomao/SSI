package br.com.nextel.ssi.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TWBR_USER_SYSTEM")
public class TwbrUserSystem {

	@Id
	@Column(name="ID_USER")
	private long idUser;

	@Column(name="CD_LOGIN_USER")
	private String cdLoginUser;
	
	@Column(name="DT_LOGIN_START_VALID")
	private Date dtLoginStartValid;
	
	@Column(name="DT_LOGIN_END_VALID")
	private Date dtLoginEndValid;
	
	@Column(name="NR_NEXTEL_PHONE")
	private String nrNextelPhone;
	
	@Column(name="NR_FLEET_ID")
	private String nrFleetId;
	
	@Column(name="FG_USER_ORIGIN")
	private String fgUserOrigin;
	
	@Column(name="NR_PHONE_RAMAL")
	private String nrPhoneRamal;	
	
	@ManyToOne
	@JoinColumn(name="ID_USER_MANAGER")
	private TwbrUserSystem manager;
	
	@ManyToOne
	@JoinColumn(name="CD_NEXTEL_LOCALITY")
	private TwbrNextelLocality locality;
	
	@Column(name="DT_END_ACTIVITY")
	private Date dtEndActivity;
	
	@ManyToOne
	@JoinColumn(name="CD_DEFAULT_NEXTEL_LOCALITY")	
	private TwbrNextelLocality defaulLocality;

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getCdLoginUser() {
		return cdLoginUser;
	}

	public void setCdLoginUser(String cdLoginUser) {
		this.cdLoginUser = cdLoginUser;
	}

	public Date getDtLoginStartValid() {
		return dtLoginStartValid;
	}

	public void setDtLoginStartValid(Date dtLoginStartValid) {
		this.dtLoginStartValid = dtLoginStartValid;
	}

	public Date getDtLoginEndValid() {
		return dtLoginEndValid;
	}

	public void setDtLoginEndValid(Date dtLoginEndValid) {
		this.dtLoginEndValid = dtLoginEndValid;
	}

	public String getNrNextelPhone() {
		return nrNextelPhone;
	}

	public void setNrNextelPhone(String nrNextelPhone) {
		this.nrNextelPhone = nrNextelPhone;
	}

	public String getNrFleetId() {
		return nrFleetId;
	}

	public void setNrFleetId(String nrFleetId) {
		this.nrFleetId = nrFleetId;
	}

	public String getFgUserOrigin() {
		return fgUserOrigin;
	}

	public void setFgUserOrigin(String fgUserOrigin) {
		this.fgUserOrigin = fgUserOrigin;
	}

	public String getNrPhoneRamal() {
		return nrPhoneRamal;
	}

	public void setNrPhoneRamal(String nrPhoneRamal) {
		this.nrPhoneRamal = nrPhoneRamal;
	}

	public TwbrUserSystem getManager() {
		return manager;
	}

	public void setManager(TwbrUserSystem manager) {
		this.manager = manager;
	}

	public TwbrNextelLocality getLocality() {
		return locality;
	}

	public void setLocality(TwbrNextelLocality locality) {
		this.locality = locality;
	}

	public Date getDtEndActivity() {
		return dtEndActivity;
	}

	public void setDtEndActivity(Date dtEndActivity) {
		this.dtEndActivity = dtEndActivity;
	}

	public TwbrNextelLocality getDefaulLocality() {
		return defaulLocality;
	}

	public void setDefaulLocality(TwbrNextelLocality defaulLocality) {
		this.defaulLocality = defaulLocality;
	}

	@Override
	public String toString() {
		return "UserSystem [idUser=" + idUser + ", cdLoginUser=" + cdLoginUser
				+ ", dtLoginStartValid=" + dtLoginStartValid
				+ ", dtLoginEndValid=" + dtLoginEndValid + ", nrNextelPhone="
				+ nrNextelPhone + ", nrFleetId=" + nrFleetId
				+ ", fgUserOrigin=" + fgUserOrigin + ", nrPhoneRamal="
				+ nrPhoneRamal + ", manager=" + manager + ", locality="
				+ locality + ", dtEndActivity=" + dtEndActivity
				+ ", defaulLocality=" + defaulLocality + "]";
	}	
	
	
	
}
