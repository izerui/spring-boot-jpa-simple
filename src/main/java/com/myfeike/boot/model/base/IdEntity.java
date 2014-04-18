package com.myfeike.boot.model.base;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * UUID主键父类
 * 
 * @author izerui.com
 *
 */
@MappedSuperclass
public abstract class IdEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//主键Id
	protected String id = UUID.random();
	
	/**
	 * 获取主键ID
	 * 
	 * @return String
	 */
	@Id
//    @GeneratedValue(generator="system-uuid")
	@Column(name="PK_ID",length = 32, nullable = false,unique=true)  
//    @GenericGenerator(name="system-uuid", strategy = "uuid")
	public String getId() {
		if (null==id||"".equals(id)) {
			return null;
		}
		return this.id;
	}

	/**
	 * 设置主键ID，
	 * @param id
	 */
	public void setId(String id) {
		if (null==id||"".equals(id)) {
			this.id = null;
		} else {
			this.id = id;
		}
		
	}

}
