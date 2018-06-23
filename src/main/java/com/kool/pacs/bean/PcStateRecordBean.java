package com.kool.pacs.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class PcStateRecordBean extends BaseBean {
	protected String markId;
	protected boolean isInitMarkId;
	protected String formId;
	protected boolean isInitFormId;
	protected String formType;
	protected boolean isInitFormType;
	protected String personId;
	protected boolean isInitPersonId;
	protected String personType;
	protected boolean isInitPersonType;
	protected String operCode;
	protected boolean isInitOperCode;
	protected String operDesc;
	protected boolean isInitOperDesc;
	protected String operResult;
	protected boolean isInitOperResult;
	protected String operIp;
	protected boolean isInitOperIp;
	protected String createdt;
	protected boolean isInitCreatedt;

	public boolean getIsInitMarkId() {
		return this.isInitMarkId;
	}

	public boolean getIsInitFormId() {
		return this.isInitFormId;
	}

	public boolean getIsInitFormType() {
		return this.isInitFormType;
	}

	public boolean getIsInitPersonId() {
		return this.isInitPersonId;
	}

	public boolean getIsInitPersonType() {
		return this.isInitPersonType;
	}

	public boolean getIsInitOperCode() {
		return this.isInitOperCode;
	}

	public boolean getIsInitOperDesc() {
		return this.isInitOperDesc;
	}

	public boolean getIsInitOperResult() {
		return this.isInitOperResult;
	}

	public boolean getIsInitOperIp() {
		return this.isInitOperIp;
	}

	public boolean getIsInitCreatedt() {
		return this.isInitCreatedt;
	}

	public String getMarkId() {
		return markId;
	}

	public void setMarkId(String markId) {
		this.markId = markId;
		this.isInitMarkId = true;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
		this.isInitFormId = true;
	}

	public String getFormType() {
		return formType;
	}

	public void setFormType(String formType) {
		this.formType = formType;
		this.isInitFormType = true;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
		this.isInitPersonId = true;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
		this.isInitPersonType = true;
	}

	public String getOperCode() {
		return operCode;
	}

	public void setOperCode(String operCode) {
		this.operCode = operCode;
		this.isInitOperCode = true;
	}

	public String getOperDesc() {
		return operDesc;
	}

	public void setOperDesc(String operDesc) {
		this.operDesc = operDesc;
		this.isInitOperDesc = true;
	}

	public String getOperResult() {
		return operResult;
	}

	public void setOperResult(String operResult) {
		this.operResult = operResult;
		this.isInitOperResult = true;
	}

	public String getOperIp() {
		return operIp;
	}

	public void setOperIp(String operIp) {
		this.operIp = operIp;
		this.isInitOperIp = true;
	}

	public String getCreatedt() {
		return createdt;
	}

	public void setCreatedt(String createdt) {
		this.createdt = createdt;
		this.isInitCreatedt = true;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		if (isInitMarkId) {
			map.put("markId", formatString(markId));
		}
		if (isInitFormId) {
			map.put("formId", formatString(formId));
		}
		if (isInitFormType) {
			map.put("formType", formatString(formType));
		}
		if (isInitPersonId) {
			map.put("personId", formatString(personId));
		}
		if (isInitPersonType) {
			map.put("personType", formatString(personType));
		}
		if (isInitOperCode) {
			map.put("operCode", formatString(operCode));
		}
		if (isInitOperDesc) {
			map.put("operDesc", formatString(operDesc));
		}
		if (isInitOperResult) {
			map.put("operResult", formatString(operResult));
		}
		if (isInitOperIp) {
			map.put("operIp", formatString(operIp));
		}
		if (isInitCreatedt) {
			map.put("createdt", formatString(createdt));
		}

		return map;
	}
}
