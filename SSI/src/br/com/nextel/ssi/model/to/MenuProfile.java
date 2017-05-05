package br.com.nextel.ssi.model.to;

public class MenuProfile {

	private String descriptionGroup;
	private String profileFunctionality;
	private int sequence;
	
	public String getDescriptionGroup() {
		return descriptionGroup;
	}
	public void setDescriptionGroup(String descriptionGroup) {
		this.descriptionGroup = descriptionGroup;
	}
	public String getProfileFunctionality() {
		return profileFunctionality;
	}
	public void setProfileFunctionality(String profileFunctionality) {
		this.profileFunctionality = profileFunctionality;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	@Override
	public String toString() {
		return "MenuProfile [descriptionGroup=" + descriptionGroup
				+ ", profileFunctionality=" + profileFunctionality
				+ ", sequence=" + sequence + "]";
	}
}
