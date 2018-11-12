package cn.hc.ssm.utils;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
	
	private int pageNo;//当前页
	private int pageSize = 10;//每页显示数量
	private int totalCount;//总条数
	private int totalPageCount;//总页数
	private List<T> list = new ArrayList<T>();//当前页显示集合
	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		if(pageNo <= 0 ){
			pageNo = 1;
		}
		this.pageNo = pageNo;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalCount) {
		this.totalPageCount = (int) Math.ceil((double)totalCount / pageSize);
	}
	
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "PageBean [pageNo=" + pageNo + ", pageSize=" + pageSize
				+ ", totalCount=" + totalCount + ", totalPageCount="
				+ totalPageCount ;
	}
	
}
