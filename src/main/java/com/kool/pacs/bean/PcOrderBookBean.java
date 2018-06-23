package com.kool.pacs.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class PcOrderBookBean extends BaseBean {
	protected String apptId;
	protected boolean isInitApptId;
	protected String examId;
	protected boolean isInitExamId;
	protected String personId;
	protected boolean isInitPersonId;
	protected String personType;
	protected boolean isInitPersonType;
	protected int ordercode;
	protected boolean isInitOrdercode;
	protected String deviceId;
	protected boolean isInitDeviceId;
	protected String apptDt;
	protected boolean isInitApptDt;
	protected String apptAmpm;
	protected boolean isInitApptAmpm;
	protected String startSection;
	protected boolean isInitStartSection;
	protected String startPoint;
	protected boolean isInitStartPoint;
	protected String createdt;
	protected boolean isInitCreatedt;
	protected String signdt;
	protected boolean isInitSigndt;
	protected String deviceIdChecked;
	protected boolean isInitDeviceIdChecked;
	protected String closedt;
	protected boolean isInitClosedt;
	protected String status;
	protected boolean isInitStatus;
	protected String remark;
	protected boolean isInitRemark;

	public boolean getIsInitApptId() {
		return this.isInitApptId;
	}

	public boolean getIsInitExamId() {
		return this.isInitExamId;
	}

	public boolean getIsInitPersonId() {
		return this.isInitPersonId;
	}

	public boolean getIsInitPersonType() {
		return this.isInitPersonType;
	}

	public boolean getIsInitOrdercode() {
		return this.isInitOrdercode;
	}

	public boolean getIsInitDeviceId() {
		return this.isInitDeviceId;
	}

	public boolean getIsInitApptDt() {
		return this.isInitApptDt;
	}

	public boolean getIsInitApptAmpm() {
		return this.isInitApptAmpm;
	}

	public boolean getIsInitStartSection() {
		return this.isInitStartSection;
	}

	public boolean getIsInitStartPoint() {
		return this.isInitStartPoint;
	}

	public boolean getIsInitCreatedt() {
		return this.isInitCreatedt;
	}

	public boolean getIsInitSigndt() {
		return this.isInitSigndt;
	}

	public boolean getIsInitDeviceIdChecked() {
		return this.isInitDeviceIdChecked;
	}

	public boolean getIsInitClosedt() {
		return this.isInitClosedt;
	}

	public boolean getIsInitStatus() {
		return this.isInitStatus;
	}

	public boolean getIsInitRemark() {
		return this.isInitRemark;
	}

	public String getApptId() {
		return apptId;
	}

	public void setApptId(String apptId) {
		this.apptId = apptId;
		this.isInitApptId = true;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
		this.isInitExamId = true;
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

	public int getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(int ordercode) {
		this.ordercode = ordercode;
		this.isInitOrdercode = true;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		this.isInitDeviceId = true;
	}

	public String getApptDt() {
		return apptDt;
	}

	public void setApptDt(String apptDt) {
		this.apptDt = apptDt;
		this.isInitApptDt = true;
	}

	public String getApptAmpm() {
		return apptAmpm;
	}

	public void setApptAmpm(String apptAmpm) {
		this.apptAmpm = apptAmpm;
		this.isInitApptAmpm = true;
	}

	public String getStartSection() {
		return startSection;
	}

	public void setStartSection(String startSection) {
		this.startSection = startSection;
		this.isInitStartSection = true;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
		this.isInitStartPoint = true;
	}

	public String getCreatedt() {
		return createdt;
	}

	public void setCreatedt(String createdt) {
		this.createdt = createdt;
		this.isInitCreatedt = true;
	}

	public String getSigndt() {
		return signdt;
	}

	public void setSigndt(String signdt) {
		this.signdt = signdt;
		this.isInitSigndt = true;
	}

	public String getDeviceIdChecked() {
		return deviceIdChecked;
	}

	public void setDeviceIdChecked(String deviceIdChecked) {
		this.deviceIdChecked = deviceIdChecked;
		this.isInitDeviceIdChecked = true;
	}

	public String getClosedt() {
		return closedt;
	}

	public void setClosedt(String closedt) {
		this.closedt = closedt;
		this.isInitClosedt = true;
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
		if (isInitApptId) {
			map.put("apptId", formatString(apptId));
		}
		if (isInitExamId) {
			map.put("examId", formatString(examId));
		}
		if (isInitPersonId) {
			map.put("personId", formatString(personId));
		}
		if (isInitPersonType) {
			map.put("personType", formatString(personType));
		}
		if (isInitOrdercode) {
			map.put("ordercode", formatString(ordercode));
		}
		if (isInitDeviceId) {
			map.put("deviceId", formatString(deviceId));
		}
		if (isInitApptDt) {
			map.put("apptDt", formatString(apptDt));
		}
		if (isInitApptAmpm) {
			map.put("apptAmpm", formatString(apptAmpm));
		}
		if (isInitStartSection) {
			map.put("startSection", formatString(startSection));
		}
		if (isInitStartPoint) {
			map.put("startPoint", formatString(startPoint));
		}
		if (isInitCreatedt) {
			map.put("createdt", formatString(createdt));
		}
		if (isInitSigndt) {
			map.put("signdt", formatString(signdt));
		}
		if (isInitDeviceIdChecked) {
			map.put("deviceIdChecked", formatString(deviceIdChecked));
		}
		if (isInitClosedt) {
			map.put("closedt", formatString(closedt));
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
