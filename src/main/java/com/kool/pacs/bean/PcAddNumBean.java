package com.kool.pacs.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class PcAddNumBean extends BaseBean {
	protected String addId;
	protected boolean isInitAddId;
	protected String deviceId;
	protected boolean isInitDeviceId;
	protected String addDt;
	protected boolean isInitAddDt;
	protected String addAmpm;
	protected boolean isInitAddAmpm;
	protected String addSection;
	protected boolean isInitAddSection;
	protected String addPoint;
	protected boolean isInitAddPoint;
	protected String addPersonid;
	protected boolean isInitAddPersonid;
	protected int ordercode;
	protected boolean isInitOrdercode;
	protected String createdt;
	protected boolean isInitCreatedt;
	protected String addReason;
	protected boolean isInitAddReason;
	protected String status;
	protected boolean isInitStatus;
	protected String remark;
	protected boolean isInitRemark;

	public boolean getIsInitAddId() {
		return this.isInitAddId;
	}

	public boolean getIsInitDeviceId() {
		return this.isInitDeviceId;
	}

	public boolean getIsInitAddDt() {
		return this.isInitAddDt;
	}

	public boolean getIsInitAddAmpm() {
		return this.isInitAddAmpm;
	}

	public boolean getIsInitAddSection() {
		return this.isInitAddSection;
	}

	public boolean getIsInitAddPoint() {
		return this.isInitAddPoint;
	}

	public boolean getIsInitAddPersonid() {
		return this.isInitAddPersonid;
	}

	public boolean getIsInitOrdercode() {
		return this.isInitOrdercode;
	}

	public boolean getIsInitCreatedt() {
		return this.isInitCreatedt;
	}

	public boolean getIsInitAddReason() {
		return this.isInitAddReason;
	}

	public boolean getIsInitStatus() {
		return this.isInitStatus;
	}

	public boolean getIsInitRemark() {
		return this.isInitRemark;
	}

	public String getAddId() {
		return addId;
	}

	public void setAddId(String addId) {
		this.addId = addId;
		this.isInitAddId = true;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		this.isInitDeviceId = true;
	}

	public String getAddDt() {
		return addDt;
	}

	public void setAddDt(String addDt) {
		this.addDt = addDt;
		this.isInitAddDt = true;
	}

	public String getAddAmpm() {
		return addAmpm;
	}

	public void setAddAmpm(String addAmpm) {
		this.addAmpm = addAmpm;
		this.isInitAddAmpm = true;
	}

	public String getAddSection() {
		return addSection;
	}

	public void setAddSection(String addSection) {
		this.addSection = addSection;
		this.isInitAddSection = true;
	}

	public String getAddPoint() {
		return addPoint;
	}

	public void setAddPoint(String addPoint) {
		this.addPoint = addPoint;
		this.isInitAddPoint = true;
	}

	public String getAddPersonid() {
		return addPersonid;
	}

	public void setAddPersonid(String addPersonid) {
		this.addPersonid = addPersonid;
		this.isInitAddPersonid = true;
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

	public String getAddReason() {
		return addReason;
	}

	public void setAddReason(String addReason) {
		this.addReason = addReason;
		this.isInitAddReason = true;
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
		if (isInitAddId) {
			map.put("addId", formatString(addId));
		}
		if (isInitDeviceId) {
			map.put("deviceId", formatString(deviceId));
		}
		if (isInitAddDt) {
			map.put("addDt", formatString(addDt));
		}
		if (isInitAddAmpm) {
			map.put("addAmpm", formatString(addAmpm));
		}
		if (isInitAddSection) {
			map.put("addSection", formatString(addSection));
		}
		if (isInitAddPoint) {
			map.put("addPoint", formatString(addPoint));
		}
		if (isInitAddPersonid) {
			map.put("addPersonid", formatString(addPersonid));
		}
		if (isInitOrdercode) {
			map.put("ordercode", formatString(ordercode));
		}
		if (isInitCreatedt) {
			map.put("createdt", formatString(createdt));
		}
		if (isInitAddReason) {
			map.put("addReason", formatString(addReason));
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
