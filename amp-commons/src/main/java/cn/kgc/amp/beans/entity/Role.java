package cn.kgc.amp.beans.entity;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
	
	private Long roleId;						// 角色主键
	private String roleName;					// 角色名称
	private Date createDate;					// 创建时间
	private Date updateDate;					// 修改时间
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	

}
