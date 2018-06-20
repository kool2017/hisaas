package com.kool.system.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class SyReqDefBean extends BaseBean {
	protected String srdReqCode;
	protected boolean isInitSrdReqCode;
	protected String srdName;
	protected boolean isInitSrdName;
	protected String srdClazz;
	protected boolean isInitSrdClazz;
	protected String srdMethod;
	protected boolean isInitSrdMethod;
	protected String srdType;
	protected boolean isInitSrdType;
	protected String srdDbpoolType;
	protected boolean isInitSrdDbpoolType;
	protected String srdDbpoolCode;
	protected boolean isInitSrdDbpoolCode;
	protected String srdMsgType;
	protected boolean isInitSrdMsgType;
	protected String srdEncrypt;
	protected boolean isInitSrdEncrypt;
	protected String srdState;
	protected boolean isInitSrdState;

	public boolean getIsInitSrdReqCode() {
		return this.isInitSrdReqCode;
	}

	public boolean getIsInitSrdName() {
		return this.isInitSrdName;
	}

	public boolean getIsInitSrdClazz() {
		return this.isInitSrdClazz;
	}

	public boolean getIsInitSrdMethod() {
		return this.isInitSrdMethod;
	}

	public boolean getIsInitSrdType() {
		return this.isInitSrdType;
	}

	public boolean getIsInitSrdDbpoolType() {
		return this.isInitSrdDbpoolType;
	}

	public boolean getIsInitSrdDbpoolCode() {
		return this.isInitSrdDbpoolCode;
	}

	public boolean getIsInitSrdMsgType() {
		return this.isInitSrdMsgType;
	}

	public boolean getIsInitSrdEncrypt() {
		return this.isInitSrdEncrypt;
	}

	public boolean getIsInitSrdState() {
		return this.isInitSrdState;
	}

	public String getSrdReqCode() {
		return srdReqCode;
	}

	public void setSrdReqCode(String srdReqCode) {
		this.srdReqCode = srdReqCode;
		this.isInitSrdReqCode = true;
	}

	public String getSrdName() {
		return srdName;
	}

	public void setSrdName(String srdName) {
		this.srdName = srdName;
		this.isInitSrdName = true;
	}

	public String getSrdClazz() {
		return srdClazz;
	}

	public void setSrdClazz(String srdClazz) {
		this.srdClazz = srdClazz;
		this.isInitSrdClazz = true;
	}

	public String getSrdMethod() {
		return srdMethod;
	}

	public void setSrdMethod(String srdMethod) {
		this.srdMethod = srdMethod;
		this.isInitSrdMethod = true;
	}

	public String getSrdType() {
		return srdType;
	}

	public void setSrdType(String srdType) {
		this.srdType = srdType;
		this.isInitSrdType = true;
	}

	public String getSrdDbpoolType() {
		return srdDbpoolType;
	}

	public void setSrdDbpoolType(String srdDbpoolType) {
		this.srdDbpoolType = srdDbpoolType;
		this.isInitSrdDbpoolType = true;
	}

	public String getSrdDbpoolCode() {
		return srdDbpoolCode;
	}

	public void setSrdDbpoolCode(String srdDbpoolCode) {
		this.srdDbpoolCode = srdDbpoolCode;
		this.isInitSrdDbpoolCode = true;
	}

	public String getSrdMsgType() {
		return srdMsgType;
	}

	public void setSrdMsgType(String srdMsgType) {
		this.srdMsgType = srdMsgType;
		this.isInitSrdMsgType = true;
	}

	public String getSrdEncrypt() {
		return srdEncrypt;
	}

	public void setSrdEncrypt(String srdEncrypt) {
		this.srdEncrypt = srdEncrypt;
		this.isInitSrdEncrypt = true;
	}

	public String getSrdState() {
		return srdState;
	}

	public void setSrdState(String srdState) {
		this.srdState = srdState;
		this.isInitSrdState = true;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		if (isInitSrdReqCode) {
			map.put("srdReqCode", formatString(srdReqCode));
		}
		if (isInitSrdName) {
			map.put("srdName", formatString(srdName));
		}
		if (isInitSrdClazz) {
			map.put("srdClazz", formatString(srdClazz));
		}
		if (isInitSrdMethod) {
			map.put("srdMethod", formatString(srdMethod));
		}
		if (isInitSrdType) {
			map.put("srdType", formatString(srdType));
		}
		if (isInitSrdDbpoolType) {
			map.put("srdDbpoolType", formatString(srdDbpoolType));
		}
		if (isInitSrdDbpoolCode) {
			map.put("srdDbpoolCode", formatString(srdDbpoolCode));
		}
		if (isInitSrdMsgType) {
			map.put("srdMsgType", formatString(srdMsgType));
		}
		if (isInitSrdEncrypt) {
			map.put("srdEncrypt", formatString(srdEncrypt));
		}
		if (isInitSrdState) {
			map.put("srdState", formatString(srdState));
		}

		return map;
	}
}
