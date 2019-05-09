package cn.kgc.amp.beans.entity;

import java.io.Serializable;
import java.util.Date;
/*数据字典实体类
 * 
 * 
 * */
public class Dictionary implements Serializable{
	
	private Long dictiondaryId;  //主键
	private Dictionary parent;   //上级字典
	private String dictionaryName; //字典名称
	private Admin createAdmin;    //创建人
	private Date createDate;      //创建时间
	private Admin updateAdmin;    //修改人
	private Date updateDate;      //修改时间
}
