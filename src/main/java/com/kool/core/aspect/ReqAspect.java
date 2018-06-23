/**
 * @PROJECT 
 * @DATE 2018年6月20日 下午1:37:30
 * @AUTHOR 
 */
package com.kool.core.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kool.core.exception.AppException;
import com.kool.core.exception.BusException;
import com.kool.core.util.SpringContextUtil;
import com.kool.core.util.StringUtils;

/**
 * @DESCRIBE 请求切面，处理事务和异常
 * @AUTHOR
 * @DATE 2018年6月20日 下午1:37:31
 *
 */
public class ReqAspect {
	private static Logger logger = Logger.getLogger(ReqAspect.class);

	public void beforeAction() {
//		System.out.println("beforeAction");
	}

	public void afterAction() {
//		System.out.println("afterAction");
	}

	public JSONObject aroundAction(ProceedingJoinPoint joinPoint) {
		JSONObject pkgOut = new JSONObject();
		JSONArray jaInfo = new JSONArray();
		JSONObject joInfo = new JSONObject();
		
		//手工处理事务
		DataSourceTransactionManager txManager = (DataSourceTransactionManager) SpringContextUtil
				.getBean("transactionManager");
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus status = txManager.getTransaction(def);
		try {
			Object ret = joinPoint.proceed(); // 执行目标方法
			Object[] args = joinPoint.getArgs(); // 获取目标方法参数
			//取用户id TODO
			//验证请求权限 TODO
			pkgOut.putAll((JSONObject) ret);
			txManager.commit(status);//提交
			joInfo.put("ERROR_CODE", "0000000");
		} catch (AppException appEx) {
			joInfo.put("ERROR_CODE", appEx.getErrorCode());
			joInfo.put("ERROR_MSG", appEx.getMessage());
			logger.error(appEx.getMessage(), appEx);
			txManager.rollback(status);//回滚
		} catch (BusException busEx) {
			joInfo.put("ERROR_CODE", busEx.getErrorCode());
			joInfo.put("ERROR_MSG", busEx.getMessage());
			logger.error(busEx.getMessage(), busEx);
			txManager.rollback(status);//回滚
		} catch (Exception ex) {
			String errId = StringUtils.getUUID();
			logger.error("系统异常，异常码："+errId+ex.getMessage(), ex);
			joInfo.put("ERROR_CODE", "SYERROR");
			joInfo.put("ERROR_MSG", "系统异常，请联系管理员！异常码："+errId);
			txManager.rollback(status);//回滚
		} catch (Throwable e) {
			String errId = StringUtils.getUUID();
			logger.error("系统异常，异常码："+errId+e.getMessage(), e);
			joInfo.put("ERROR_CODE", "SYERROR");
			joInfo.put("ERROR_MSG", "系统异常，请联系管理员！异常码："+errId);
			txManager.rollback(status);//回滚
		}
		jaInfo.add(joInfo);
		pkgOut.put("SYCOMMUNZ", jaInfo);
		return pkgOut;
	}
}
