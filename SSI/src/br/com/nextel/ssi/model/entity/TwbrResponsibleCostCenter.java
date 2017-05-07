package br.com.nextel.ssi.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TWBR_RESPONSIBLE_COSTCENTER")
public class TwbrResponsibleCostCenter {
	
	@Id
	@Column(name="CD_FEDERAL_TAX")
	private String cdFederalTax;
	
	@Column(name="CD_COSTCENTER")
	private String cdCostCenter;
	
	@Column(name="DT_LOADING_PROCESSS")
	private Date dtLoadingProcess; 
	
	@Column(name="FG_SERVICE_REQ_APPROVAL_RESP")
	private String fgServiceReqApprovalResp;

	public String getCdFederalTax() {
		return cdFederalTax;
	}

	public void setCdFederalTax(String cdFederalTax) {
		this.cdFederalTax = cdFederalTax;
	}

	public String getCdCostCenter() {
		return cdCostCenter;
	}

	public void setCdCostCenter(String cdCostCenter) {
		this.cdCostCenter = cdCostCenter;
	}

	public Date getDtLoadingProcess() {
		return dtLoadingProcess;
	}

	public void setDtLoadingProcess(Date dtLoadingProcess) {
		this.dtLoadingProcess = dtLoadingProcess;
	}

	public String getFgServiceReqApprovalResp() {
		return fgServiceReqApprovalResp;
	}

	public void setFgServiceReqApprovalResp(String fgServiceReqApprovalResp) {
		this.fgServiceReqApprovalResp = fgServiceReqApprovalResp;
	}

	
	
}
