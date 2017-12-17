package com.will.webshop.common.pojo;

import java.util.List;

/**
 * ClassName:EesyUiDataGridResult
 * Description:EasyUI需要返回的数据
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2017-12-16
 */
public class EesyUiDataGridResult {
	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
