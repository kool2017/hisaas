package com.kool.pacs.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class PcOpExplainBean extends BaseBean {
	protected String explainId;
	protected boolean isInitExplainId;
	protected String explainTitle;
	protected boolean isInitExplainTitle;
	protected String explainContent;
	protected boolean isInitExplainContent;
	protected String explainCode;
	protected boolean isInitExplainCode;
	protected String explainType;
	protected boolean isInitExplainType;
	protected String parentUuid;
	protected boolean isInitParentUuid;
	protected String personId;
	protected boolean isInitPersonId;
	protected int ordercode;
	protected boolean isInitOrdercode;
	protected String createdt;
	protected boolean isInitCreatedt;
	protected String status;
	protected boolean isInitStatus;
	protected String remark;
	protected boolean isInitRemark;

	public boolean getIsInitExplainId() {
		return this.isInitExplainId;
	}

	public boolean getIsInitExplainTitle() {
		return this.isInitExplainTitle;
	}

	public boolean getIsInitExplainContent() {
		return this.isInitExplainContent;
	}

	public boolean getIsInitExplainCode() {
		return this.isInitExplainCode;
	}

	public boolean getIsInitExplainType() {
		return this.isInitExplainType;
	}

	public boolean getIsInitParentUuid() {
		return this.isInitParentUuid;
	}

	public boolean getIsInitPersonId() {
		return this.isInitPersonId;
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

	public String getExplainId() {
		return explainId;
	}

	public void setExplainId(String explainId) {
		this.explainId = explainId;
		this.isInitExplainId = true;
	}

	public String getExplainTitle() {
		return explainTitle;
	}

	public void setExplainTitle(String explainTitle) {
		this.explainTitle = explainTitle;
		this.isInitExplainTitle = true;
	}

	public String getExplainContent() {
		return explainContent;
	}

	public void setExplainContent(String explainContent) {
		this.explainContent = explainContent;
		this.isInitExplainContent = true;
	}

	public String getExplainCode() {
		return explainCode;
	}

	public void setExplainCode(String explainCode) {
		this.explainCode = explainCode;
		this.isInitExplainCode = true;
	}

	public String getExplainType() {
		return explainType;
	}

	public void setExplainType(String explainType) {
		this.explainType = explainType;
		this.isInitExplainType = true;
	}

	public String getParentUuid() {
		return parentUuid;
	}

	public void setParentUuid(String parentUuid) {
		this.parentUuid = parentUuid;
		this.isInitParentUuid = true;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
		this.isInitPersonId = true;
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
		if (isInitExplainId) {
			map.put("explainId", formatString(explainId));
		}
		if (isInitExplainTitle) {
			map.put("explainTitle", formatString(explainTitle));
		}
		if (isInitExplainContent) {
			map.put("explainContent", formatString(explainContent));
		}
		if (isInitExplainCode) {
			map.put("explainCode", formatString(explainCode));
		}
		if (isInitExplainType) {
			map.put("explainType", formatString(explainType));
		}
		if (isInitParentUuid) {
			map.put("parentUuid", formatString(parentUuid));
		}
		if (isInitPersonId) {
			map.put("personId", formatString(personId));
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
