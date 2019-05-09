package cn.kgc.amp.beans.vo;

import java.io.Serializable;
import java.util.List;

import cn.kgc.amp.utile.ConstantUtile;

public class Page<E>  implements Serializable{

	private Integer pageNum;
	private Integer pageSize;
	private List<E> list;
	private Integer totalPage;
	private Integer totalSize;
	
	
	
	
	
	public Page(Integer pageNum, Integer pageSize) {
	if(pageNum!=null&&pageNum>0)
	{
		this.pageNum = pageNum;
	}else {
		this.pageNum=ConstantUtile.PAGE_NUM;
	}
	if(pageSize!=null&&pageSize>0) {
		this.pageSize = pageSize;}
	else {
		this.pageSize = ConstantUtile.PAGE_SIZE;
	}
	}
	
	
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}
	
	
	
	
	
}
