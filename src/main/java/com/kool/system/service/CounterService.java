/**
 * @PROJECT 
 * @DATE 2018年6月23日 下午12:27:41
 * @AUTHOR 
 */
package com.kool.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kool.core.exception.AppException;
import com.kool.core.util.StringUtils;
import com.kool.system.bean.SyCounterBean;
import com.kool.system.dao.SyCounterDao;

/**
 * @DESCRIBE
 * @AUTHOR
 * @DATE 2018年6月23日 下午12:27:41
 *
 */
@Service
public class CounterService {

	@Autowired
	public SyCounterDao counterDao;

	public String getNextNumber(String code) throws AppException {
		// 查询并行锁
		SyCounterBean cntInfo = new SyCounterBean();
		cntInfo.setScoCounterCode(code);

		SyCounterBean cnt = counterDao.selectByPK(cntInfo);
		if (null == cnt) {
			throw new AppException("计数器不存在");
		}
		counterDao.update(cnt);
		// 判断状态

		// 新值=当前值+步长
		String step = cnt.getScoStep();
		String number = cnt.getScoCurValue();
		String newNumber = StringUtils.add(number, step);
		// 如果新值>最大值，溢出
		if (isOver(number, newNumber)) {
			over(cnt);
		} else {
			// 更新计数器
			cnt.setScoCurValue(newNumber);
			counterDao.update(cnt);
		}
		// 解锁
		return newNumber;
	}

	/**
	 * @DESCRIBE
	 * @DATE 2018年6月23日 下午10:37:08
	 *
	 * @param cnt
	 */
	private void over(SyCounterBean cnt) {
		// TODO Auto-generated method stub

	}

	/**
	 * @DESCRIBE
	 * @DATE 2018年6月23日 下午10:36:37
	 *
	 * @param number
	 * @param newNumber
	 * @return
	 */
	private boolean isOver(String number, String newNumber) {
		return false;
	}
}
