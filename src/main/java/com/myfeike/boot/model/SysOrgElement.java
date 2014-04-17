package com.myfeike.boot.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SYS_ORG_ELEMENT database table.
 * 
 */
@Entity
@Table(name="SYS_ORG_ELEMENT")
public class SysOrgElement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FD_ID")
	private String fdId;

	@Column(name="FD_ALTER_TIME")
	private Date fdAlterTime;

	@Column(name="FD_CATEID")
	private String fdCateid;

	@Column(name="FD_CREATE_TIME")
	private Date fdCreateTime;

	@Column(name="FD_HIERARCHY_ID")
	private String fdHierarchyId;

	@Column(name="FD_IDENTIFY_NAME")
	private String fdIdentifyName;

	@Column(name="FD_IMPORT_INFO")
	private String fdImportInfo;

	@Column(name="FD_IS_ABANDON")
	private Integer fdIsAbandon;

	@Column(name="FD_IS_AVAILABLE")
	private Integer fdIsAvailable;

	@Column(name="FD_IS_BUSINESS")
	private Integer fdIsBusiness;

	@Column(name="FD_KEYWORD")
	private String fdKeyword;

	@Column(name="FD_MEMO")
	private String fdMemo;

	@Column(name="FD_NAME")
	private String fdName;

	@Column(name="FD_NO")
	private String fdNo;

	@Column(name="FD_ORDER")
	private Integer fdOrder;

	@Column(name="FD_ORG_TYPE")
	private Integer fdOrgType;

	@Column(name="FD_PARENTID")
	private String fdParentid;

	@Column(name="FD_PARENTORGID")
	private String fdParentorgid;

	@Column(name="FD_PORTAL_LINK")
	private String fdPortalLink;

	@Column(name="FD_PORTAL_NAME")
	private String fdPortalName;

	@Column(name="FD_SHORT_NAME")
	private String fdShortName;

	@Column(name="FD_SHORT_SPELL")
	private String fdShortSpell;

	@Column(name="FD_SPELL")
	private String fdSpell;

	@Column(name="FD_SUPER_LEADERID")
	private String fdSuperLeaderid;

	@Column(name="FD_THIS_LEADERID")
	private String fdThisLeaderid;

	//bi-directional one-to-one association to SysOrgPerson
	@OneToOne(mappedBy="sysOrgElement")
	private SysOrgPerson sysOrgPerson;

	public SysOrgElement() {
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

    public Date getFdAlterTime() {
        return fdAlterTime;
    }

    public void setFdAlterTime(Date fdAlterTime) {
        this.fdAlterTime = fdAlterTime;
    }

    public String getFdCateid() {
        return fdCateid;
    }

    public void setFdCateid(String fdCateid) {
        this.fdCateid = fdCateid;
    }

    public Date getFdCreateTime() {
        return fdCreateTime;
    }

    public void setFdCreateTime(Date fdCreateTime) {
        this.fdCreateTime = fdCreateTime;
    }

    public String getFdHierarchyId() {
        return fdHierarchyId;
    }

    public void setFdHierarchyId(String fdHierarchyId) {
        this.fdHierarchyId = fdHierarchyId;
    }

    public String getFdIdentifyName() {
        return fdIdentifyName;
    }

    public void setFdIdentifyName(String fdIdentifyName) {
        this.fdIdentifyName = fdIdentifyName;
    }

    public String getFdImportInfo() {
        return fdImportInfo;
    }

    public void setFdImportInfo(String fdImportInfo) {
        this.fdImportInfo = fdImportInfo;
    }

    public Integer getFdIsAbandon() {
        return fdIsAbandon;
    }

    public void setFdIsAbandon(Integer fdIsAbandon) {
        this.fdIsAbandon = fdIsAbandon;
    }

    public Integer getFdIsAvailable() {
        return fdIsAvailable;
    }

    public void setFdIsAvailable(Integer fdIsAvailable) {
        this.fdIsAvailable = fdIsAvailable;
    }

    public Integer getFdIsBusiness() {
        return fdIsBusiness;
    }

    public void setFdIsBusiness(Integer fdIsBusiness) {
        this.fdIsBusiness = fdIsBusiness;
    }

    public String getFdKeyword() {
        return fdKeyword;
    }

    public void setFdKeyword(String fdKeyword) {
        this.fdKeyword = fdKeyword;
    }

    public String getFdMemo() {
        return fdMemo;
    }

    public void setFdMemo(String fdMemo) {
        this.fdMemo = fdMemo;
    }

    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public String getFdNo() {
        return fdNo;
    }

    public void setFdNo(String fdNo) {
        this.fdNo = fdNo;
    }

    public Integer getFdOrder() {
        return fdOrder;
    }

    public void setFdOrder(Integer fdOrder) {
        this.fdOrder = fdOrder;
    }

    public Integer getFdOrgType() {
        return fdOrgType;
    }

    public void setFdOrgType(Integer fdOrgType) {
        this.fdOrgType = fdOrgType;
    }

    public String getFdParentid() {
        return fdParentid;
    }

    public void setFdParentid(String fdParentid) {
        this.fdParentid = fdParentid;
    }

    public String getFdParentorgid() {
        return fdParentorgid;
    }

    public void setFdParentorgid(String fdParentorgid) {
        this.fdParentorgid = fdParentorgid;
    }

    public String getFdPortalLink() {
        return fdPortalLink;
    }

    public void setFdPortalLink(String fdPortalLink) {
        this.fdPortalLink = fdPortalLink;
    }

    public String getFdPortalName() {
        return fdPortalName;
    }

    public void setFdPortalName(String fdPortalName) {
        this.fdPortalName = fdPortalName;
    }

    public String getFdShortName() {
        return fdShortName;
    }

    public void setFdShortName(String fdShortName) {
        this.fdShortName = fdShortName;
    }

    public String getFdShortSpell() {
        return fdShortSpell;
    }

    public void setFdShortSpell(String fdShortSpell) {
        this.fdShortSpell = fdShortSpell;
    }

    public String getFdSpell() {
        return fdSpell;
    }

    public void setFdSpell(String fdSpell) {
        this.fdSpell = fdSpell;
    }

    public String getFdSuperLeaderid() {
        return fdSuperLeaderid;
    }

    public void setFdSuperLeaderid(String fdSuperLeaderid) {
        this.fdSuperLeaderid = fdSuperLeaderid;
    }

    public String getFdThisLeaderid() {
        return fdThisLeaderid;
    }

    public void setFdThisLeaderid(String fdThisLeaderid) {
        this.fdThisLeaderid = fdThisLeaderid;
    }

    public SysOrgPerson getSysOrgPerson() {
        return sysOrgPerson;
    }

    public void setSysOrgPerson(SysOrgPerson sysOrgPerson) {
        this.sysOrgPerson = sysOrgPerson;
    }
}