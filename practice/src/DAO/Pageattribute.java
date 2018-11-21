package DAO;

import java.util.List;

public class Pageattribute<T> {

	private int pageIndex;//页索引
	private int pageCount;//每页条数
	private int count;//数据总量
	private int totalPage;//总页数
	 List<T> list;//数据对象
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotalPage() {
		return count%pageCount==0?count/pageCount:count/pageCount+1;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	
	
}
