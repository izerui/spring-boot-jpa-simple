package com.myfeike.boot.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the SYS_ORG_PERSON database table.
 * 
 */
@Entity
@Table(name="SYS_ORG_PERSON")
public class SysOrgPerson implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FD_ID")
	private String fdId;

	@Column(name="FD_ATTENDANCE_CARD_NUMBER")
	private String fdAttendanceCardNumber;

	@Column(name="FD_BIRTH_DATE")
	private Date fdBirthDate;

	@Column(name="FD_CARD_NO")
	private String fdCardNo;

	@Column(name="FD_DEFAULT_LANG")
	private String fdDefaultLang;

	@Column(name="FD_EMAIL")
	private String fdEmail;

	@Column(name="FD_ENTRY_DATE")
	private Date fdEntryDate;

	@Column(name="FD_FAX")
	private String fdFax;

	@Column(name="FD_GENDER")
	private String fdGender;

	@Column(name="FD_INIT_PASSWORD")
	private String fdInitPassword;

	@Column(name="FD_LEVEL")
	private String fdLevel;

	@Column(name="FD_LOGIN_NAME")
	private String fdLoginName;

	@Column(name="FD_MOBILE_NO")
	private String fdMobileNo;

	@Column(name="FD_PASSWORD")
	private String fdPassword;

	@Column(name="FD_RTX_NO")
	private String fdRtxNo;

	@Column(name="FD_TRIAL_DATE")
	private Date fdTrialDate;

	@Column(name="FD_WORK_ADDR")
	private String fdWorkAddr;

	@Column(name="FD_WORK_PHONE")
	private String fdWorkPhone;

	//bi-directional one-to-one association to SysOrgElement
	@OneToOne
	@JoinColumn(name="FD_ID")
	private SysOrgElement sysOrgElement;

	public SysOrgPerson() {
	}

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    public String getFdAttendanceCardNumber() {
        return fdAttendanceCardNumber;
    }

    public void setFdAttendanceCardNumber(String fdAttendanceCardNumber) {
        this.fdAttendanceCardNumber = fdAttendanceCardNumber;
    }

    public Date getFdBirthDate() {
        return fdBirthDate;
    }

    public void setFdBirthDate(Date fdBirthDate) {
        this.fdBirthDate = fdBirthDate;
    }

    public String getFdCardNo() {
        return fdCardNo;
    }

    public void setFdCardNo(String fdCardNo) {
        this.fdCardNo = fdCardNo;
    }

    public String getFdDefaultLang() {
        return fdDefaultLang;
    }

    public void setFdDefaultLang(String fdDefaultLang) {
        this.fdDefaultLang = fdDefaultLang;
    }

    public String getFdEmail() {
        return fdEmail;
    }

    public void setFdEmail(String fdEmail) {
        this.fdEmail = fdEmail;
    }

    public Date getFdEntryDate() {
        return fdEntryDate;
    }

    public void setFdEntryDate(Date fdEntryDate) {
        this.fdEntryDate = fdEntryDate;
    }

    public String getFdFax() {
        return fdFax;
    }

    public void setFdFax(String fdFax) {
        this.fdFax = fdFax;
    }

    public String getFdGender() {
        return fdGender;
    }

    public void setFdGender(String fdGender) {
        this.fdGender = fdGender;
    }

    public String getFdInitPassword() {
        return fdInitPassword;
    }

    public void setFdInitPassword(String fdInitPassword) {
        this.fdInitPassword = fdInitPassword;
    }

    public String getFdLevel() {
        return fdLevel;
    }

    public void setFdLevel(String fdLevel) {
        this.fdLevel = fdLevel;
    }

    public String getFdLoginName() {
        return fdLoginName;
    }

    public void setFdLoginName(String fdLoginName) {
        this.fdLoginName = fdLoginName;
    }

    public String getFdMobileNo() {
        return fdMobileNo;
    }

    public void setFdMobileNo(String fdMobileNo) {
        this.fdMobileNo = fdMobileNo;
    }

    public String getFdPassword() {
        return fdPassword;
    }

    public void setFdPassword(String fdPassword) {
        this.fdPassword = fdPassword;
    }

    public String getFdRtxNo() {
        return fdRtxNo;
    }

    public void setFdRtxNo(String fdRtxNo) {
        this.fdRtxNo = fdRtxNo;
    }

    public Date getFdTrialDate() {
        return fdTrialDate;
    }

    public void setFdTrialDate(Date fdTrialDate) {
        this.fdTrialDate = fdTrialDate;
    }

    public String getFdWorkAddr() {
        return fdWorkAddr;
    }

    public void setFdWorkAddr(String fdWorkAddr) {
        this.fdWorkAddr = fdWorkAddr;
    }

    public String getFdWorkPhone() {
        return fdWorkPhone;
    }

    public void setFdWorkPhone(String fdWorkPhone) {
        this.fdWorkPhone = fdWorkPhone;
    }

    public SysOrgElement getSysOrgElement() {
        return sysOrgElement;
    }

    public void setSysOrgElement(SysOrgElement sysOrgElement) {
        this.sysOrgElement = sysOrgElement;
    }
}