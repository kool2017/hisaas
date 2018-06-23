package com.kool.pacs.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class PcLockNumBean extends BaseBean {
	protected String lockId;
	protected boolean isInitLockId;
	protected String deviceId;
	protected boolean isInitDeviceId;
	protected String lockDt;
	protected boolean isInitLockDt;
	protected String lockAmpm;
	protected boolean isInitLockAmpm;
	protected String lockSection;
	protected boolean isInitLockSection;
	protected String lockPoint;
	protected boolean isInitLockPoint;
	protected String lockType;
	protected boolean isInitLockType;
	protected String unlockdeptid;
	protected boolean isInitUnlockdeptid;
	protected String lockPersonid;
	protected boolean isInitLockPersonid;
	protected int ordercode;
	protected boolean isInitOrdercode;
	protected String createdt;
	protected boolean isInitCreatedt;
	protected String lockReason;
	protected boolean isInitLockReason;
	protected String status;
	protected boolean isInitStatus;
	protected String remark;
	protected boolean isInitRemark;

	public boolean getIsInitLockId() {
		return this.isInitLockId;
	}

	public boolean getIsInitDeviceId() {
		return this.isInitDeviceId;
	}

	public boolean getIsInitLockDt() {
		return this.isInitLockDt;
	}

	public boolean getIsInitLockAmpm() {
		return this.isInitLockAmpm;
	}

	public boolean getIsInitLockSection() {
		return this.isInitLockSection;
	}

	public boolean getIsInitLockPoint() {
		return this.isInitLockPoint;
	}

	public boolean getIsInitLockType() {
		return this.isInitLockType;
	}

	public boolean getIsInitUnlockdeptid() {
		return this.isInitUnlockdeptid;
	}

	public boolean getIsInitLockPersonid() {
		return this.isInitLockPersonid;
	}

	public boolean getIsInitOrdercode() {
		return this.isInitOrdercode;
	}

	public boolean getIsInitCreatedt() {
		return this.isInitCreatedt;
	}

	public boolean getIsInitLockReason() {
		return this.isInitLockReason;
	}

	public boolean getIsInitStatus() {
		return this.isInitStatus;
	}

	public boolean getIsInitRemark() {
		return this.isInitRemark;
	}

	public String getLockId() {
		return lockId;
	}

	public void setLockId(String lockId) {
		this.lockId = lockId;
		this.isInitLockId = true;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		this.isInitDeviceId = true;
	}

	public String getLockDt() {
		return lockDt;
	}

	public void setLockDt(String lockDt) {
		this.lockDt = lockDt;
		this.isInitLockDt = true;
	}

	public String getLockAmpm() {
		return lockAmpm;
	}

	public void setLockAmpm(String lockAmpm) {
		this.lockAmpm = lockAmpm;
		this.isInitLockAmpm = true;
	}

	public String getLockSection() {
		return lockSection;
	}

	public void setLockSection(String lockSection) {
		this.lockSection = lockSection;
		this.isInitLockSection = true;
	}

	public String getLockPoint() {
		return lockPoint;
	}

	public void setLockPoint(String lockPoint) {
		this.lockPoint = lockPoint;
		this.isInitLockPoint = true;
	}

	public String getLockType() {
		return lockType;
	}

	public void setLockType(String lockType) {
		this.lockType = lockType;
		this.isInitLockType = true;
	}

	public String getUnlockdeptid() {
		return unlockdeptid;
	}

	public void setUnlockdeptid(String unlockdeptid) {
		this.unlockdeptid = unlockdeptid;
		this.isInitUnlockdeptid = true;
	}

	public String getLockPersonid() {
		return lockPersonid;
	}

	public void setLockPersonid(String lockPersonid) {
		this.lockPersonid = lockPersonid;
		this.isInitLockPersonid = true;
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

	public String getLockReason() {
		return lockReason;
	}

	public void setLockReason(String lockReason) {
		this.lockReason = lockReason;
		this.isInitLockReason = true;
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
		if (isInitLockId) {
			map.put("lockId", formatString(lockId));
		}
		if (isInitDeviceId) {
			map.put("deviceId", formatString(deviceId));
		}
		if (isInitLockDt) {
			map.put("lockDt", formatString(lockDt));
		}
		if (isInitLockAmpm) {
			map.put("lockAmpm", formatString(lockAmpm));
		}
		if (isInitLockSection) {
			map.put("lockSection", formatString(lockSection));
		}
		if (isInitLockPoint) {
			map.put("lockPoint", formatString(lockPoint));
		}
		if (isInitLockType) {
			map.put("lockType", formatString(lockType));
		}
		if (isInitUnlockdeptid) {
			map.put("unlockdeptid", formatString(unlockdeptid));
		}
		if (isInitLockPersonid) {
			map.put("lockPersonid", formatString(lockPersonid));
		}
		if (isInitOrdercode) {
			map.put("ordercode", formatString(ordercode));
		}
		if (isInitCreatedt) {
			map.put("createdt", formatString(createdt));
		}
		if (isInitLockReason) {
			map.put("lockReason", formatString(lockReason));
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
