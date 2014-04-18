package com.myfeike.boot.model;

import com.myfeike.boot.model.base.BaseModel;
import javax.persistence.*;
import java.util.List;

/**
 * 
 * 部门与机构
 * 
 * 
 * @author tengda
 *
 */
@Entity
@Table(name="SYS_ORG_DEPT")
public class Dept extends BaseModel{
	
	/**
	 * 名称
	 */
	protected String  name ;
	
	/**
	 * 简称
	 */
	protected String shortName ;

	/**
	 * 拼音
	 */
	protected String spell  ;
	
	/**
	 * 简拼
	 */
	protected String shortSpell ;
 
	/**
	 * 是否无效
	 */
	protected boolean disable = false ;
 
	/**
	 * 机构领导 指向岗位
	 */
	protected String leader ;
	
	/**
	 * 上级领导 （分管领导）
	 */
	protected String superLeader ;
 
	/**
	 * 子机构
	 */
	protected List<Dept> children ;
	
	/**
	 * 上级机构
	 */
	protected String parent ;
	
	
	/**
	 * 是否为父部门
	 */
	protected Boolean isParent = false;
	
	
	
	/**
	 * 机构类型
	 */
	protected Integer orgType = 0;
	
	
	/**
	 * 编号、机构代码
	 */
	protected String deptNo ;

	/**
	 * @return the name
	 */
	@Column(name="FD_NAME",length=64)
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the spell
	 */
	@Column(name="FD_SPELL",length=64)
	public String getSpell() {
		return spell;
	}

	/**
	 * @param spell the spell to set
	 */
	public void setSpell(String spell) {
		this.spell = spell;
	}

	/**
	 * @return the shortSpell 
	 */
	@Column(name="FD_SHOT_SPELL",length=32)
	public String getShortSpell() {
		return shortSpell;
	}

	/**
	 * @param shortSpell the shortSpell to set
	 */
	public void setShortSpell(String shortSpell) {
		this.shortSpell = shortSpell;
	}




	/**
	 * @return the disable
	 */
	@Column(name="FD_DISABLE",length=32,nullable=false)
	public boolean isDisable() {
		return disable;
	}

	/**
	 * @param disable the disable to set
	 */
	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	/**
	 * @return the leader
	 */
    @Column(name="FK_LEADER_ID",length=32)
	public String getLeader() {
		return leader;
	}

	/**
	 * @param leader the leader to set
	 */
	public void setLeader(String leader) {
		this.leader = leader;
	}

	/**
	 * @return the superLeader
	 */
	@Column(name = "FK_SUPER_LEADER_ID",length=32)
	public String getSuperLeader() {
		return superLeader;
	}

	/**
	 * @param superLeader the superLeader to set
	 */
	public void setSuperLeader(String superLeader) {
		this.superLeader = superLeader;
	}

 

 

	/**
	 * @return the orgType
	 */
	@Column(name="FD_ORG_TYPE")
	public Integer getOrgType() {
		return orgType;
	}

	/**
	 * @param orgType the orgType to set
	 */
	public void setOrgType(Integer orgType) {
		this.orgType = orgType;
	}

	/**
	 * @return the deptNo
	 */
	@Column(name="FD_DEPT_NO",length=32)
	public String getDeptNo() {
		return deptNo;
	}

	/**
	 * @param deptNo the deptNo to set
	 */
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	/**
	 * @return the isParent
	 */
	@Column(name="FD_IS_PARENT")
	public Boolean getIsParent() {
		return isParent;
	}

	/**
	 * @param isParent the isParent to set
	 */
	public void setIsParent(Boolean isParent) {
		this.isParent = isParent;
	}

	/**
	 * @return the shortName
	 */
	@Column(name="FD_SHORT_NAME",nullable=true,length=32)
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return the parent
	 */
	@Column(name="FK_PARENT_ID",length = 64)
	public String getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public  void setParent(String parent) {
		this.parent =  parent;
	}

	

	
	
}
