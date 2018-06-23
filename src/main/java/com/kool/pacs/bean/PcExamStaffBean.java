package com.kool.pacs.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class PcExamStaffBean extends BaseBean {
	protected String personId;
	protected boolean isInitPersonId;
	protected String examtypeId;
	protected boolean isInitExamtypeId;
	protected int ordercode;
	protected boolean isInitOrdercode;
	protected String createdt;
	protected boolean isInitCreatedt;
	protected String status;
	protected boolean isInitStatus;
	protected String remark;
	protected boolean isInitRemark;

	public boolean getIsInitPersonId() {
		return this.isInitPersonId;
	}

	public boolean getIsInitExamtypeId() {
		return this.isInitExamtypeId;
	}

	public boolean getIsInitOrdercode() {
		return this.isInitOrdercode;
	}

	public boolean getIsInitCreatedt() {
		return this.isInitCreatedt;
	}

	public boolean getIsInitStatus() {
		return this.isInitStatus;
	}

	public boolean getIsInitRemark() {
		return this.isInitRemark;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
		this.isInitPersonId = true;
	}

	public String getExamtypeId() {
		return examtypeId;
	}

	public void setExamtypeId(String examtypeId) {
		this.examtypeId = examtypeId;
		this.isInitExamtypeId = true;
	}

	public int getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(int ordercode) {
		this.ordercode = ordercode;
		this.isInitOrdercode = true;
	}

	public String getCreatedt() {
		return createdt;
	}

	public void setCreatedt(String createdt) {
		this.createdt = createdt;
		this.isInitCreatedt = true;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		this.isInitStatus = true;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		this.isInitRemark = true;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		if (isInitPersonId) {
			map.put("personId", formatString(personId));
		}
		if (isInitExamtypeId) {
			map.put("examtypeId", formatString(examtypeId));
		}
		if (isInitOrdercode) {
			map.put("ordercode", formatString(ordercode));
		}
		if (isInitCreatedt) {
			map.put("createdt", formatString(createdt));
		}
		if (isInitStatus) {
			map.put("status", formatString(status));
		}
		if (isInitRemark) {
			map.put("remark", formatString(remark));
		}

		return map;
	}
}
