package DAO;

import java.util.List;

public class Pageattribute<T> {

	private int pageIndex;//ҳ����
	private int pageCount;//ÿҳ����
	private int count;//��������
	private int totalPage;//��ҳ��
	 List<T> list;//���ݶ���
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
