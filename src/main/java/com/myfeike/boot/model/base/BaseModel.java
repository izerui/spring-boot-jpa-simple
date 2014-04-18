package com.myfeike.boot.model.base;


import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;


/**
 * 
 * 模型基类
 * @author tengda
 *
 */
@MappedSuperclass
public abstract class BaseModel extends IdEntity{
 
	
	/**
	 * 单位机构
	 */
	protected String orgId ;
 
	
	/**
	 * 删除状态
	 */
	protected boolean deleteStatus = Boolean.FALSE;


	/**
	 * 默认排序值
	 */
	protected Long sort  = 0L;
	
	
	
	/**
	 * @return the unit
	 */
	@Column(name="FK_ORG_ID")
	public String getOrgId() {
        String[] strs = StringUtils.split(orgId,"x");
        if(ArrayUtils.isNotEmpty(strs)){
            return strs[0];
        }
		return null;
	}


	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}


	/**
	 * @return the deleteStatus
	 */
	@Column(name="FD_DELETE_STATUS",nullable=false)
	public boolean isDeleteStatus() {
		return deleteStatus;
	}


	/**
	 * @param deleteStatus the deleteStatus to set
	 */
	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	
	
 	
	/**
	 * @return the sort
	 */
	@Column(name="FD_SORT",nullable=false)
	public Long getSort() {
		return sort;
	}


	/**
	 * @param sort the sort to set
	 */
	public void setSort(Long sort) {
		this.sort = sort;
	}
	
	
	@Transient
	public String getName() {
		return null;
	}
	
	
	
}
