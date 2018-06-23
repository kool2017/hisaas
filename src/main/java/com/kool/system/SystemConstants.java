/**
 * @PROJECT 
 * @DATE 2017年12月27日 下午10:36:02
 * @AUTHOR LUYU
 */
package com.kool.system;

/**
 * @DESCRIBE
 * @AUTHOR LUYU
 * @DATE 2017年12月27日 下午10:36:02
 *
 */
public class SystemConstants {
	/*
	 * 用户类型 SA-超级管理员AD-管理员UR-一般用户
	 */
	public static final String SUI_TYPE_SUPERADMIN = "SA";
	public static final String SUI_TYPE_ADMIN = "AD";
	public static final String SUI_TYPE_USER = "UR";
	/*
	 * 用户状态 A-正常 E-异常 P-非工作 C-关闭
	 */
	public static final String SUI_STATUS_ACTIVE = "A";
	public static final String SUI_STATUS_ERROR = "E";
	public static final String SUI_STATUS_PENDING = "P";
	public static final String SUI_STATUS_CLOSE = "C";

	/*
	 * 是否证书卡用户 Y-是N-否
	 */
	public static final String SUI_HAS_KEY_YES = "Y";
	public static final String SUI_HAS_KEY_NO = "N";
	
	/*
	 * 计数器
	 */
	public static final String CNT_USER_CID = "99USRCID";//用户ID
}
