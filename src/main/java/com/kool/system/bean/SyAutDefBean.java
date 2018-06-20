package com.kool.system.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class SyAutDefBean extends BaseBean {
	protected String sadAutCode;
	protected boolean isInitSadAutCode;
	protected String sadName;
	protected boolean isInitSadName;
	protected String sadState;
	protected boolean isInitSadState;

	public boolean getIsInitSadAutCode() {
		return this.isInitSadAutCode;
	}

	public boolean getIsInitSadName() {
		return this.isInitSadName;
	}

	public boolean getIsInitSadState() {
		return this.isInitSadState;
	}

	public String getSadAutCode() {
		return sadAutCode;
	}

	public void setSadAutCode(String sadAutCode) {
		this.sadAutCode = sadAutCode;
		this.isInitSadAutCode = true;
	}

	public String getSadName() {
		return sadName;
	}

	public void setSadName(String sadName) {
		this.sadName = sadName;
		this.isInitSadName = true;
	}

	public String getSadState() {
		return sadState;
	}

	public void setSadState(String sadState) {
		this.sadState = sadState;
		this.isInitSadState = true;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		if (isInitSadAutCode) {
			map.put("sadAutCode", formatString(sadAutCode));
		}
		if (isInitSadName) {
			map.put("sadName", formatString(sadName));
		}
		if (isInitSadState) {
			map.put("sadState", formatString(sadState));
		}

		return map;
	}
}
