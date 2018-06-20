package com.kool.system.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class SyReqAutBean extends BaseBean {
	protected String sraReqCode;
	protected boolean isInitSraReqCode;
	protected String sraAutCode;
	protected boolean isInitSraAutCode;
	protected String sraCmt;
	protected boolean isInitSraCmt;

	public boolean getIsInitSraReqCode() {
		return this.isInitSraReqCode;
	}

	public boolean getIsInitSraAutCode() {
		return this.isInitSraAutCode;
	}

	public boolean getIsInitSraCmt() {
		return this.isInitSraCmt;
	}

	public String getSraReqCode() {
		return sraReqCode;
	}

	public void setSraReqCode(String sraReqCode) {
		this.sraReqCode = sraReqCode;
		this.isInitSraReqCode = true;
	}

	public String getSraAutCode() {
		return sraAutCode;
	}

	public void setSraAutCode(String sraAutCode) {
		this.sraAutCode = sraAutCode;
		this.isInitSraAutCode = true;
	}

	public String getSraCmt() {
		return sraCmt;
	}

	public void setSraCmt(String sraCmt) {
		this.sraCmt = sraCmt;
		this.isInitSraCmt = true;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		if (isInitSraReqCode) {
			map.put("sraReqCode", formatString(sraReqCode));
		}
		if (isInitSraAutCode) {
			map.put("sraAutCode", formatString(sraAutCode));
		}
		if (isInitSraCmt) {
			map.put("sraCmt", formatString(sraCmt));
		}

		return map;
	}
}
