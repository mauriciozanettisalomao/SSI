package br.com.nextel.ssi.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TWBR_NEXTEL_LOCALITY")
public class TwbrNextelLocality {

	@Id
	@Column(name="CD_NEXTEL_LOCALITY")
	private	int	cdLocality;

	@Column(name="NM_NEXTEL_LOCALITY")
	private	String nmLocality;
	
	@Column(name="DEFAULT_EMAIL_SERVER")
	private	String defaultEmailServer;
	
	@Column(name="DEFAULT_EMAIL_DATA_BASE")
	private	String	defaultEmailDataBase;
	
	@Column(name="DEFAULT_LOGIN_SCRIPT")
	private	String	defaultLoginScript;
	
	@Column(name="DEFAULT_HOME_DRIVE")
	private	String	defaultHomeDrive;
	
	@Column(name="DEFAULT_HOME_DIRECTORY")
	private	String	DefaultHomeDirectory;
	
	@Column(name="DE_ADDRESS_LOCALITY")
	private	String	deAddressLocality;
	
	@Column(name="DE_CITY_LOCALITY")
	private	String	deCityLocality;
	
	@Column(name="DE_STATE_LOCALITY")
	private	String	deStateLocality;
	
	@Column(name="NR_ZIP_CODE_LOCALITY")
	private	String	nrZipCodeLocality;
	
	@Column(name="DE_COUNTRY_LOCALITY")
	private	String	deCountryLocality;
	
	@Column(name="DE_ADMINISTRATION_GROUP")
	private	String	deAdministrationGroup;
	
	@Column(name="DE_EXCHANGE_ORGANIZATION")
	private	String	deExchangeOrganization	;
	
	@Column(name="DE_UNITY_LOCALITY")
	private	String	deUnityLocality;
	
	@Column(name="DE_ORGANIZATIONAL_CONTAINER")
	private	String	deOrganizationContainer;
	
	@Column(name="DE_DEFAULT_EMAIL_STORE")
	private	String	deDefaultEmailStore;
	
	@Column(name="CD_BRANCH_RH")
	private	int	cdBranchRH;
	
	@Column(name="DE_DISTRIBUTION_LIST")
	private	String	deDistributionList;

	public int getCdLocality() {
		return cdLocality;
	}

	public void setCdLocality(int cdLocality) {
		this.cdLocality = cdLocality;
	}

	public String getNmLocality() {
		return nmLocality;
	}

	public void setNmLocality(String nmLocality) {
		this.nmLocality = nmLocality;
	}

	public String getDefaultEmailServer() {
		return defaultEmailServer;
	}

	public void setDefaultEmailServer(String defaultEmailServer) {
		this.defaultEmailServer = defaultEmailServer;
	}

	public String getDefaultEmailDataBase() {
		return defaultEmailDataBase;
	}

	public void setDefaultEmailDataBase(String defaultEmailDataBase) {
		this.defaultEmailDataBase = defaultEmailDataBase;
	}

	public String getDefaultLoginScript() {
		return defaultLoginScript;
	}

	public void setDefaultLoginScript(String defaultLoginScript) {
		this.defaultLoginScript = defaultLoginScript;
	}

	public String getDefaultHomeDrive() {
		return defaultHomeDrive;
	}

	public void setDefaultHomeDrive(String defaultHomeDrive) {
		this.defaultHomeDrive = defaultHomeDrive;
	}

	public String getDefaultHomeDirectory() {
		return DefaultHomeDirectory;
	}

	public void setDefaultHomeDirectory(String defaultHomeDirectory) {
		DefaultHomeDirectory = defaultHomeDirectory;
	}

	public String getDeAddressLocality() {
		return deAddressLocality;
	}

	public void setDeAddressLocality(String deAddressLocality) {
		this.deAddressLocality = deAddressLocality;
	}

	public String getDeCityLocality() {
		return deCityLocality;
	}

	public void setDeCityLocality(String deCityLocality) {
		this.deCityLocality = deCityLocality;
	}

	public String getDeStateLocality() {
		return deStateLocality;
	}

	public void setDeStateLocality(String deStateLocality) {
		this.deStateLocality = deStateLocality;
	}

	public String getNrZipCodeLocality() {
		return nrZipCodeLocality;
	}

	public void setNrZipCodeLocality(String nrZipCodeLocality) {
		this.nrZipCodeLocality = nrZipCodeLocality;
	}

	public String getDeCountryLocality() {
		return deCountryLocality;
	}

	public void setDeCountryLocality(String deCountryLocality) {
		this.deCountryLocality = deCountryLocality;
	}

	public String getDeAdministrationGroup() {
		return deAdministrationGroup;
	}

	public void setDeAdministrationGroup(String deAdministrationGroup) {
		this.deAdministrationGroup = deAdministrationGroup;
	}

	public String getDeExchangeOrganization() {
		return deExchangeOrganization;
	}

	public void setDeExchangeOrganization(String deExchangeOrganization) {
		this.deExchangeOrganization = deExchangeOrganization;
	}

	public String getDeUnityLocality() {
		return deUnityLocality;
	}

	public void setDeUnityLocality(String deUnityLocality) {
		this.deUnityLocality = deUnityLocality;
	}

	public String getDeOrganizationContainer() {
		return deOrganizationContainer;
	}

	public void setDeOrganizationContainer(String deOrganizationContainer) {
		this.deOrganizationContainer = deOrganizationContainer;
	}

	public String getDeDefaultEmailStore() {
		return deDefaultEmailStore;
	}

	public void setDeDefaultEmailStore(String deDefaultEmailStore) {
		this.deDefaultEmailStore = deDefaultEmailStore;
	}

	public int getCdBranchRH() {
		return cdBranchRH;
	}

	public void setCdBranchRH(int cdBranchRH) {
		this.cdBranchRH = cdBranchRH;
	}

	public String getDeDistributionList() {
		return deDistributionList;
	}

	public void setDeDistributionList(String deDistributionList) {
		this.deDistributionList = deDistributionList;
	}

	@Override
	public String toString() {
		return "Locality [cdLocality=" + cdLocality + ", nmLocality="
				+ nmLocality + ", defaultEmailServer=" + defaultEmailServer
				+ ", defaultEmailDataBase=" + defaultEmailDataBase
				+ ", defaultLoginScript=" + defaultLoginScript
				+ ", defaultHomeDrive=" + defaultHomeDrive
				+ ", DefaultHomeDirectory=" + DefaultHomeDirectory
				+ ", deAddressLocality=" + deAddressLocality
				+ ", deCityLocality=" + deCityLocality + ", deStateLocality="
				+ deStateLocality + ", nrZipCodeLocality=" + nrZipCodeLocality
				+ ", deCountryLocality=" + deCountryLocality
				+ ", deAdministrationGroup=" + deAdministrationGroup
				+ ", deExchangeOrganization=" + deExchangeOrganization
				+ ", deUnityLocality=" + deUnityLocality
				+ ", deOrganizationContainer=" + deOrganizationContainer
				+ ", deDefaultEmailStore=" + deDefaultEmailStore
				+ ", cdBranchRH=" + cdBranchRH + ", deDistributionList="
				+ deDistributionList + "]";
	}


}
