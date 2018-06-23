package com.kool.pacs.bean;

import java.util.HashMap;
import java.util.Map;
import com.kool.core.base.BaseBean;

public class PcExamBookBean extends BaseBean {
	protected String examId;
	protected boolean isInitExamId;
	protected int yjxh;
	protected boolean isInitYjxh;
	protected String examSerial;
	protected boolean isInitExamSerial;
	protected String doctorId;
	protected boolean isInitDoctorId;
	protected String deptId;
	protected boolean isInitDeptId;
	protected String createdt;
	protected boolean isInitCreatedt;
	protected String examType;
	protected boolean isInitExamType;
	protected String isemergency;
	protected boolean isInitIsemergency;
	protected String iscure;
	protected boolean isInitIscure;
	protected String owncharge;
	protected boolean isInitOwncharge;
	protected String diseId;
	protected boolean isInitDiseId;
	protected String patientId;
	protected boolean isInitPatientId;
	protected String patientCode;
	protected boolean isInitPatientCode;
	protected String patientName;
	protected boolean isInitPatientName;
	protected String outId;
	protected boolean isInitOutId;
	protected String examPurpose;
	protected boolean isInitExamPurpose;
	protected String examZd;
	protected boolean isInitExamZd;
	protected String examZs;
	protected boolean isInitExamZs;
	protected String examBs;
	protected boolean isInitExamBs;
	protected String examCt;
	protected boolean isInitExamCt;
	protected String bedNo;
	protected boolean isInitBedNo;
	protected String examtypeId;
	protected boolean isInitExamtypeId;
	protected String examitemId;
	protected boolean isInitExamitemId;
	protected String chargeStatus;
	protected boolean isInitChargeStatus;
	protected String chargeDt;
	protected boolean isInitChargeDt;
	protected String formStatus;
	protected boolean isInitFormStatus;
	protected String signStatus;
	protected boolean isInitSignStatus;
	protected String isprint;
	protected boolean isInitIsprint;
	protected String apptId;
	protected boolean isInitApptId;
	protected int ordercode;
	protected boolean isInitOrdercode;
	protected String sysupdatedt;
	protected boolean isInitSysupdatedt;
	protected String remark;
	protected boolean isInitRemark;
	protected String illnessLevel;
	protected boolean isInitIllnessLevel;
	protected String convoyType;
	protected boolean isInitConvoyType;
	protected String isBacteria;
	protected boolean isInitIsBacteria;

	public boolean getIsInitExamId() {
		return this.isInitExamId;
	}

	public boolean getIsInitYjxh() {
		return this.isInitYjxh;
	}

	public boolean getIsInitExamSerial() {
		return this.isInitExamSerial;
	}

	public boolean getIsInitDoctorId() {
		return this.isInitDoctorId;
	}

	public boolean getIsInitDeptId() {
		return this.isInitDeptId;
	}

	public boolean getIsInitCreatedt() {
		return this.isInitCreatedt;
	}

	public boolean getIsInitExamType() {
		return this.isInitExamType;
	}

	public boolean getIsInitIsemergency() {
		return this.isInitIsemergency;
	}

	public boolean getIsInitIscure() {
		return this.isInitIscure;
	}

	public boolean getIsInitOwncharge() {
		return this.isInitOwncharge;
	}

	public boolean getIsInitDiseId() {
		return this.isInitDiseId;
	}

	public boolean getIsInitPatientId() {
		return this.isInitPatientId;
	}

	public boolean getIsInitPatientCode() {
		return this.isInitPatientCode;
	}

	public boolean getIsInitPatientName() {
		return this.isInitPatientName;
	}

	public boolean getIsInitOutId() {
		return this.isInitOutId;
	}

	public boolean getIsInitExamPurpose() {
		return this.isInitExamPurpose;
	}

	public boolean getIsInitExamZd() {
		return this.isInitExamZd;
	}

	public boolean getIsInitExamZs() {
		return this.isInitExamZs;
	}

	public boolean getIsInitExamBs() {
		return this.isInitExamBs;
	}

	public boolean getIsInitExamCt() {
		return this.isInitExamCt;
	}

	public boolean getIsInitBedNo() {
		return this.isInitBedNo;
	}

	public boolean getIsInitExamtypeId() {
		return this.isInitExamtypeId;
	}

	public boolean getIsInitExamitemId() {
		return this.isInitExamitemId;
	}

	public boolean getIsInitChargeStatus() {
		return this.isInitChargeStatus;
	}

	public boolean getIsInitChargeDt() {
		return this.isInitChargeDt;
	}

	public boolean getIsInitFormStatus() {
		return this.isInitFormStatus;
	}

	public boolean getIsInitSignStatus() {
		return this.isInitSignStatus;
	}

	public boolean getIsInitIsprint() {
		return this.isInitIsprint;
	}

	public boolean getIsInitApptId() {
		return this.isInitApptId;
	}

	public boolean getIsInitOrdercode() {
		return this.isInitOrdercode;
	}

	public boolean getIsInitSysupdatedt() {
		return this.isInitSysupdatedt;
	}

	public boolean getIsInitRemark() {
		return this.isInitRemark;
	}

	public boolean getIsInitIllnessLevel() {
		return this.isInitIllnessLevel;
	}

	public boolean getIsInitConvoyType() {
		return this.isInitConvoyType;
	}

	public boolean getIsInitIsBacteria() {
		return this.isInitIsBacteria;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
		this.isInitExamId = true;
	}

	public int getYjxh() {
		return yjxh;
	}

	public void setYjxh(int yjxh) {
		this.yjxh = yjxh;
		this.isInitYjxh = true;
	}

	public String getExamSerial() {
		return examSerial;
	}

	public void setExamSerial(String examSerial) {
		this.examSerial = examSerial;
		this.isInitExamSerial = true;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
		this.isInitDoctorId = true;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
		this.isInitDeptId = true;
	}

	public String getCreatedt() {
		return createdt;
	}

	public void setCreatedt(String createdt) {
		this.createdt = createdt;
		this.isInitCreatedt = true;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
		this.isInitExamType = true;
	}

	public String getIsemergency() {
		return isemergency;
	}

	public void setIsemergency(String isemergency) {
		this.isemergency = isemergency;
		this.isInitIsemergency = true;
	}

	public String getIscure() {
		return iscure;
	}

	public void setIscure(String iscure) {
		this.iscure = iscure;
		this.isInitIscure = true;
	}

	public String getOwncharge() {
		return owncharge;
	}

	public void setOwncharge(String owncharge) {
		this.owncharge = owncharge;
		this.isInitOwncharge = true;
	}

	public String getDiseId() {
		return diseId;
	}

	public void setDiseId(String diseId) {
		this.diseId = diseId;
		this.isInitDiseId = true;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
		this.isInitPatientId = true;
	}

	public String getPatientCode() {
		return patientCode;
	}

	public void setPatientCode(String patientCode) {
		this.patientCode = patientCode;
		this.isInitPatientCode = true;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
		this.isInitPatientName = true;
	}

	public String getOutId() {
		return outId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
		this.isInitOutId = true;
	}

	public String getExamPurpose() {
		return examPurpose;
	}

	public void setExamPurpose(String examPurpose) {
		this.examPurpose = examPurpose;
		this.isInitExamPurpose = true;
	}

	public String getExamZd() {
		return examZd;
	}

	public void setExamZd(String examZd) {
		this.examZd = examZd;
		this.isInitExamZd = true;
	}

	public String getExamZs() {
		return examZs;
	}

	public void setExamZs(String examZs) {
		this.examZs = examZs;
		this.isInitExamZs = true;
	}

	public String getExamBs() {
		return examBs;
	}

	public void setExamBs(String examBs) {
		this.examBs = examBs;
		this.isInitExamBs = true;
	}

	public String getExamCt() {
		return examCt;
	}

	public void setExamCt(String examCt) {
		this.examCt = examCt;
		this.isInitExamCt = true;
	}

	public String getBedNo() {
		return bedNo;
	}

	public void setBedNo(String bedNo) {
		this.bedNo = bedNo;
		this.isInitBedNo = true;
	}

	public String getExamtypeId() {
		return examtypeId;
	}

	public void setExamtypeId(String examtypeId) {
		this.examtypeId = examtypeId;
		this.isInitExamtypeId = true;
	}

	public String getExamitemId() {
		return examitemId;
	}

	public void setExamitemId(String examitemId) {
		this.examitemId = examitemId;
		this.isInitExamitemId = true;
	}

	public String getChargeStatus() {
		return chargeStatus;
	}

	public void setChargeStatus(String chargeStatus) {
		this.chargeStatus = chargeStatus;
		this.isInitChargeStatus = true;
	}

	public String getChargeDt() {
		return chargeDt;
	}

	public void setChargeDt(String chargeDt) {
		this.chargeDt = chargeDt;
		this.isInitChargeDt = true;
	}

	public String getFormStatus() {
		return formStatus;
	}

	public void setFormStatus(String formStatus) {
		this.formStatus = formStatus;
		this.isInitFormStatus = true;
	}

	public String getSignStatus() {
		return signStatus;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
		this.isInitSignStatus = true;
	}

	public String getIsprint() {
		return isprint;
	}

	public void setIsprint(String isprint) {
		this.isprint = isprint;
		this.isInitIsprint = true;
	}

	public String getApptId() {
		return apptId;
	}

	public void setApptId(String apptId) {
		this.apptId = apptId;
		this.isInitApptId = true;
	}

	public int getOrdercode() {
		return ordercode;
	}

	public void setOrdercode(int ordercode) {
		this.ordercode = ordercode;
		this.isInitOrdercode = true;
	}

	public String getSysupdatedt() {
		return sysupdatedt;
	}

	public void setSysupdatedt(String sysupdatedt) {
		this.sysupdatedt = sysupdatedt;
		this.isInitSysupdatedt = true;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		this.isInitRemark = true;
	}

	public String getIllnessLevel() {
		return illnessLevel;
	}

	public void setIllnessLevel(String illnessLevel) {
		this.illnessLevel = illnessLevel;
		this.isInitIllnessLevel = true;
	}

	public String getConvoyType() {
		return convoyType;
	}

	public void setConvoyType(String convoyType) {
		this.convoyType = convoyType;
		this.isInitConvoyType = true;
	}

	public String getIsBacteria() {
		return isBacteria;
	}

	public void setIsBacteria(String isBacteria) {
		this.isBacteria = isBacteria;
		this.isInitIsBacteria = true;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		if (isInitExamId) {
			map.put("examId", formatString(examId));
		}
		if (isInitYjxh) {
			map.put("yjxh", formatString(yjxh));
		}
		if (isInitExamSerial) {
			map.put("examSerial", formatString(examSerial));
		}
		if (isInitDoctorId) {
			map.put("doctorId", formatString(doctorId));
		}
		if (isInitDeptId) {
			map.put("deptId", formatString(deptId));
		}
		if (isInitCreatedt) {
			map.put("createdt", formatString(createdt));
		}
		if (isInitExamType) {
			map.put("examType", formatString(examType));
		}
		if (isInitIsemergency) {
			map.put("isemergency", formatString(isemergency));
		}
		if (isInitIscure) {
			map.put("iscure", formatString(iscure));
		}
		if (isInitOwncharge) {
			map.put("owncharge", formatString(owncharge));
		}
		if (isInitDiseId) {
			map.put("diseId", formatString(diseId));
		}
		if (isInitPatientId) {
			map.put("patientId", formatString(patientId));
		}
		if (isInitPatientCode) {
			map.put("patientCode", formatString(patientCode));
		}
		if (isInitPatientName) {
			map.put("patientName", formatString(patientName));
		}
		if (isInitOutId) {
			map.put("outId", formatString(outId));
		}
		if (isInitExamPurpose) {
			map.put("examPurpose", formatString(examPurpose));
		}
		if (isInitExamZd) {
			map.put("examZd", formatString(examZd));
		}
		if (isInitExamZs) {
			map.put("examZs", formatString(examZs));
		}
		if (isInitExamBs) {
			map.put("examBs", formatString(examBs));
		}
		if (isInitExamCt) {
			map.put("examCt", formatString(examCt));
		}
		if (isInitBedNo) {
			map.put("bedNo", formatString(bedNo));
		}
		if (isInitExamtypeId) {
			map.put("examtypeId", formatString(examtypeId));
		}
		if (isInitExamitemId) {
			map.put("examitemId", formatString(examitemId));
		}
		if (isInitChargeStatus) {
			map.put("chargeStatus", formatString(chargeStatus));
		}
		if (isInitChargeDt) {
			map.put("chargeDt", formatString(chargeDt));
		}
		if (isInitFormStatus) {
			map.put("formStatus", formatString(formStatus));
		}
		if (isInitSignStatus) {
			map.put("signStatus", formatString(signStatus));
		}
		if (isInitIsprint) {
			map.put("isprint", formatString(isprint));
		}
		if (isInitApptId) {
			map.put("apptId", formatString(apptId));
		}
		if (isInitOrdercode) {
			map.put("ordercode", formatString(ordercode));
		}
		if (isInitSysupdatedt) {
			map.put("sysupdatedt", formatString(sysupdatedt));
		}
		if (isInitRemark) {
			map.put("remark", formatString(remark));
		}
		if (isInitIllnessLevel) {
			map.put("illnessLevel", formatString(illnessLevel));
		}
		if (isInitConvoyType) {
			map.put("convoyType", formatString(convoyType));
		}
		if (isInitIsBacteria) {
			map.put("isBacteria", formatString(isBacteria));
		}

		return map;
	}
}
