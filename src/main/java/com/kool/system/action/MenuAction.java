package com.kool.system.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.kool.core.base.IBaseAction;
import com.kool.core.exception.AppException;
import com.kool.core.exception.BusException;
import com.kool.system.bean.vo.MenuVo;
import com.kool.system.service.MenuServicce;

@Controller
public class MenuAction implements IBaseAction {

	@Autowired
	private MenuServicce menuService;
	
	/**
	 * 
	 * @DESCRIBE
	 * @DATE 2018年6月15日 下午4:43:31
	 *
	 * @param sInput
	 * @return
	 * @throws BusException
	 * @throws AppException
	 */
	@Override
	@ResponseBody
	@RequestMapping(value = "/sys/getMenu", method = RequestMethod.POST)
	public JSONObject doAction(@RequestBody String sInput) throws BusException, AppException {
		JSONObject pkgIn = JSONObject.parseObject(sInput);
		JSONArray sectionIn = pkgIn.getJSONArray("SYGETMENUX");
		JSONObject propIn = sectionIn.getJSONObject(0);
		String sUserId = propIn.getString("userId");
		List<MenuVo> listMenu = menuService.getAllMenu();
//		List<MenuVo> listMenu = menuService.getAuthMenu(sUserId);

		JSONObject pkgOut = new JSONObject();
		JSONArray secOut = new JSONArray();
		for (MenuVo menuVo : listMenu) {
			JSONObject joItm = JSONObject.parseObject(JSON.toJSONString(menuVo));
			secOut.add(joItm);
		}
		pkgOut.put("SYGETMENUZ", secOut);
		return pkgOut;
	}

}
