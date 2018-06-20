package com.kool.system.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class SyParamBean extends BaseBean {
	protected String spaParamCode;
	protected boolean isInitSpaParamCode;
	protected String spaValue;
	protected boolean isInitSpaValue;
	protected String spaName;
	protected boolean isInitSpaName;
	protected String spaIsLeaf;
	protected boolean isInitSpaIsLeaf;
	protected String spaRootCode;
	protected boolean isInitSpaRootCode;
	protected String spaFatCode;
	protected boolean isInitSpaFatCode;
	protected int spaDeep;
	protected boolean isInitSpaDeep;
	protected int spaSeq;
	protected boolean isInitSpaSeq;
	protected String spaCmt;
	protected boolean isInitSpaCmt;

	public boolean getIsInitSpaParamCode() {
		return this.isInitSpaParamCode;
	}

	public boolean getIsInitSpaValue() {
		return this.isInitSpaValue;
	}

	public boolean getIsInitSpaName() {
		return this.isInitSpaName;
	}

	public boolean getIsInitSpaIsLeaf() {
		return this.isInitSpaIsLeaf;
	}

	public boolean getIsInitSpaRootCode() {
		return this.isInitSpaRootCode;
	}

	public boolean getIsInitSpaFatCode() {
		return this.isInitSpaFatCode;
	}

	public boolean getIsInitSpaDeep() {
		return this.isInitSpaDeep;
	}

	public boolean getIsInitSpaSeq() {
		return this.isInitSpaSeq;
	}

	public boolean getIsInitSpaCmt() {
		return this.isInitSpaCmt;
	}

	public String getSpaParamCode() {
		return spaParamCode;
	}

	public void setSpaParamCode(String spaParamCode) {
		this.spaParamCode = spaParamCode;
		this.isInitSpaParamCode = true;
	}

	public String getSpaValue() {
		return spaValue;
	}

	public void setSpaValue(String spaValue) {
		this.spaValue = spaValue;
		this.isInitSpaValue = true;
	}

	public String getSpaName() {
		return spaName;
	}

	public void setSpaName(String spaName) {
		this.spaName = spaName;
		this.isInitSpaName = true;
	}

	public String getSpaIsLeaf() {
		return spaIsLeaf;
	}

	public void setSpaIsLeaf(String spaIsLeaf) {
		this.spaIsLeaf = spaIsLeaf;
		this.isInitSpaIsLeaf = true;
	}

	public String getSpaRootCode() {
		return spaRootCode;
	}

	public void setSpaRootCode(String spaRootCode) {
		this.spaRootCode = spaRootCode;
		this.isInitSpaRootCode = true;
	}

	public String getSpaFatCode() {
		return spaFatCode;
	}

	public void setSpaFatCode(String spaFatCode) {
		this.spaFatCode = spaFatCode;
		this.isInitSpaFatCode = true;
	}

	public int getSpaDeep() {
		return spaDeep;
	}

	public void setSpaDeep(int spaDeep) {
		this.spaDeep = spaDeep;
		this.isInitSpaDeep = true;
	}

	public int getSpaSeq() {
		return spaSeq;
	}

	public void setSpaSeq(int spaSeq) {
		this.spaSeq = spaSeq;
		this.isInitSpaSeq = true;
	}

	public String getSpaCmt() {
		return spaCmt;
	}

	public void setSpaCmt(String spaCmt) {
		this.spaCmt = spaCmt;
		this.isInitSpaCmt = true;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		if (isInitSpaParamCode) {
			map.put("spaParamCode", formatString(spaParamCode));
		}
		if (isInitSpaValue) {
			map.put("spaValue", formatString(spaValue));
		}
		if (isInitSpaName) {
			map.put("spaName", formatString(spaName));
		}
		if (isInitSpaIsLeaf) {
			map.put("spaIsLeaf", formatString(spaIsLeaf));
		}
		if (isInitSpaRootCode) {
			map.put("spaRootCode", formatString(spaRootCode));
		}
		if (isInitSpaFatCode) {
			map.put("spaFatCode", formatString(spaFatCode));
		}
		if (isInitSpaDeep) {
			map.put("spaDeep", formatString(spaDeep));
		}
		if (isInitSpaSeq) {
			map.put("spaSeq", formatString(spaSeq));
		}
		if (isInitSpaCmt) {
			map.put("spaCmt", formatString(spaCmt));
		}

		return map;
	}
}
