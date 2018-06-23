package com.kool.pacs.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class PcPacsnumResBean extends BaseBean {
	protected String numberId;
	protected boolean isInitNumberId;
	protected String apptId;
	protected boolean isInitApptId;
	protected String deviceId;
	protected boolean isInitDeviceId;
	protected String scheduId;
	protected boolean isInitScheduId;
	protected String scheduDt;
	protected boolean isInitScheduDt;
	protected String scheduAmpm;
	protected boolean isInitScheduAmpm;
	protected String scheduSection;
	protected boolean isInitScheduSection;
	protected String scheduPoint;
	protected boolean isInitScheduPoint;
	protected String numberType;
	protected boolean isInitNumberType;
	protected String locktype;
	protected boolean isInitLocktype;
	protected String locksource;
	protected boolean isInitLocksource;
	protected String unlockdeptid;
	protected boolean isInitUnlockdeptid;
	protected String lockId;
	protected boolean isInitLockId;
	protected String addId;
	protected boolean isInitAddId;
	protected String createdt;
	protected boolean isInitCreatedt;
	protected int ordercode;
	protected boolean isInitOrdercode;

	public boolean getIsInitNumberId() {
		return this.isInitNumberId;
	}

	public boolean getIsInitApptId() {
		return this.isInitApptId;
	}

	public boolean getIsInitDeviceId() {
		return this.isInitDeviceId;
	}

	public boolean getIsInitScheduId() {
		return this.isInitScheduId;
	}

	public boolean getIsInitScheduDt() {
		return this.isInitScheduDt;
	}

	public boolean getIsInitScheduAmpm() {
		return this.isInitScheduAmpm;
	}

	public boolean getIsInitScheduSection() {
		return this.isInitScheduSection;
	}

	public boolean getIsInitScheduPoint() {
		return this.isInitScheduPoint;
	}

	public boolean getIsInitNumberType() {
		return this.isInitNumberType;
	}

	public boolean getIsInitLocktype() {
		return this.isInitLocktype;
	}

	public boolean getIsInitLocksource() {
		return this.isInitLocksource;
	}

	public boolean getIsInitUnlockdeptid() {
		return this.isInitUnlockdeptid;
	}

	public boolean getIsInitLockId() {
		return this.isInitLockId;
	}

	public boolean getIsInitAddId() {
		return this.isInitAddId;
	}

	public boolean getIsInitCreatedt() {
		return this.isInitCreatedt;
	}

	public boolean getIsInitOrdercode() {
		return this.isInitOrdercode;
	}

	public String getNumberId() {
		return numberId;
	}

	public void setNumberId(String numberId) {
		this.numberId = numberId;
		this.isInitNumberId = true;
	}

	public String getApptId() {
		return apptId;
	}

	public void setApptId(String apptId) {
		this.apptId = apptId;
		this.isInitApptId = true;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
		this.isInitDeviceId = true;
	}

	public String getScheduId() {
		return scheduId;
	}

	public void setScheduId(String scheduId) {
		this.scheduId = scheduId;
		this.isInitScheduId = true;
	}

	public String getScheduDt() {
		return scheduDt;
	}

	public void setScheduDt(String scheduDt) {
		this.scheduDt = scheduDt;
		this.isInitScheduDt = true;
	}

	public String getScheduAmpm() {
		return scheduAmpm;
	}

	public void setScheduAmpm(String scheduAmpm) {
		this.scheduAmpm = scheduAmpm;
		this.isInitScheduAmpm = true;
	}

	public String getScheduSection() {
		return scheduSection;
	}

	public void setScheduSection(String scheduSection) {
		this.scheduSection = scheduSection;
		this.isInitScheduSection = true;
	}

	public String getScheduPoint() {
		return scheduPoint;
	}

	public void setScheduPoint(String scheduPoint) {
		this.scheduPoint = scheduPoint;
		this.isInitScheduPoint = true;
	}

	public String getNumberType() {
		return numberType;
	}

	public void setNumberType(String numberType) {
		this.numberType = numberType;
		this.isInitNumberType = true;
	}

	public String getLocktype() {
		return locktype;
	}

	public void setLocktype(String locktype) {
		this.locktype = locktype;
		this.isInitLocktype = true;
	}

	public String getLocksource() {
		return locksource;
	}

	public void setLocksource(String locksource) {
		this.locksource = locksource;
		this.isInitLocksource = true;
	}

	public String getUnlockdeptid() {
		return unlockdeptid;
	}

	public void setUnlockdeptid(String unlockdeptid) {
		this.unlockdeptid = unlockdeptid;
		this.isInitUnlockdeptid = true;
	}

	public String getLockId() {
		return lockId;
	}

	public void setLockId(String lockId) {
		this.lockId = lockId;
		this.isInitLockId = true;
	}

	public String getAddId() {
		return addId;
	}

	public void setAddId(String addId) {
		this.addId = addId;
		this.isInitAddId = true;
	}

	public String getCreatedt() {
		return createdt;
	}

	public void setCreatedt(String createdt) {
		this.createdt = createdt;
		this.isInitCreatedt = true;
	}

	public int getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(int ordercode) {
		this.ordercode = ordercode;
		this.isInitOrdercode = true;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		if (isInitNumberId) {
			map.put("numberId", formatString(numberId));
		}
		if (isInitApptId) {
			map.put("apptId", formatString(apptId));
		}
		if (isInitDeviceId) {
			map.put("deviceId", formatString(deviceId));
		}
		if (isInitScheduId) {
			map.put("scheduId", formatString(scheduId));
		}
		if (isInitScheduDt) {
			map.put("scheduDt", formatString(scheduDt));
		}
		if (isInitScheduAmpm) {
			map.put("scheduAmpm", formatString(scheduAmpm));
		}
		if (isInitScheduSection) {
			map.put("scheduSection", formatString(scheduSection));
		}
		if (isInitScheduPoint) {
			map.put("scheduPoint", formatString(scheduPoint));
		}
		if (isInitNumberType) {
			map.put("numberType", formatString(numberType));
		}
		if (isInitLocktype) {
			map.put("locktype", formatString(locktype));
		}
		if (isInitLocksource) {
			map.put("locksource", formatString(locksource));
		}
		if (isInitUnlockdeptid) {
			map.put("unlockdeptid", formatString(unlockdeptid));
		}
		if (isInitLockId) {
			map.put("lockId", formatString(lockId));
		}
		if (isInitAddId) {
			map.put("addId", formatString(addId));
		}
		if (isInitCreatedt) {
			map.put("createdt", formatString(createdt));
		}
		if (isInitOrdercode) {
			map.put("ordercode", formatString(ordercode));
		}

		return map;
	}
}
