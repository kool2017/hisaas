package com.kool.system.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class SyRoleBean extends BaseBean {
	protected String sroRoleCode;
	protected boolean isInitSroRoleCode;
	protected String sroName;
	protected boolean isInitSroName;
	protected String sroState;
	protected boolean isInitSroState;

	public boolean getIsInitSroRoleCode() {
		return this.isInitSroRoleCode;
	}

	public boolean getIsInitSroName() {
		return this.isInitSroName;
	}

	public boolean getIsInitSroState() {
		return this.isInitSroState;
	}

	public String getSroRoleCode() {
		return sroRoleCode;
	}

	public void setSroRoleCode(String sroRoleCode) {
		this.sroRoleCode = sroRoleCode;
		this.isInitSroRoleCode = true;
	}

	public String getSroName() {
		return sroName;
	}

	public void setSroName(String sroName) {
		this.sroName = sroName;
		this.isInitSroName = true;
	}

	public String getSroState() {
		return sroState;
	}

	public void setSroState(String sroState) {
		this.sroState = sroState;
		this.isInitSroState = true;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		if (isInitSroRoleCode) {
			map.put("sroRoleCode", formatString(sroRoleCode));
		}
		if (isInitSroName) {
			map.put("sroName", formatString(sroName));
		}
		if (isInitSroState) {
			map.put("sroState", formatString(sroState));
		}

		return map;
	}
}
