/**
 * @PROJECT 
 * @DATE 2018年6月15日 下午3:58:11
 * @AUTHOR LUYU
 */
package com.kool.system.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kool.core.exception.AppException;
import com.kool.system.bean.SyMenuBean;
import com.kool.system.bean.vo.MenuVo;
import com.kool.system.dao.SyMenuDao;

/**
 * @DESCRIBE
 * @AUTHOR LUYU
 * @DATE 2018年6月15日 下午3:58:11
 *
 */
@Service("MenuServicce")
public class MenuServicce {
	@Autowired
	private SyMenuDao menuDao;
	
	public List<MenuVo> getAuthMenu(String userId){
		return null;
	}

	/**
	 * 
	 * @DESCRIBE 获取所有菜单
	 * @DATE 2018年6月15日 下午4:27:40
	 *
	 * @return
	 * @throws AppException
	 */
	public List<MenuVo> getAllMenu() throws AppException{
		List<SyMenuBean> listMenu = menuDao.selectAllAndOrder();
		
		List<MenuVo> listMenuVo = new ArrayList<>();
		for (SyMenuBean menuBean : listMenu) {
			MenuVo menuVo = new MenuVo();
			menuVo.setIcon(menuBean.getSmeIcon());
			menuVo.setIndex(menuBean.getSmeIndex());
			menuVo.setTitle(menuBean.getSmeTitle());
			menuVo.setSubMenus(getSubMenus(menuBean,listMenu));
			if (menuBean.getSmeDeep() == 0) {
				listMenuVo.add(menuVo);
			}
		}
		return listMenuVo;
	}

	/**
	 * @DESCRIBE 
	 * @DATE 2018年6月15日 下午4:21:47
	 *
	 * @param menuBean
	 * @param listMenu
	 * @return
	 * @throws AppException 
	 */
	private List<MenuVo> getSubMenus(SyMenuBean menu, List<SyMenuBean> listMenu) throws AppException {
		if (null == menu) {
			throw new AppException("加载菜单异常");
		}
		List<MenuVo> listSub = null;
		for (SyMenuBean item : listMenu) {
			if (menu.getSmeMenuCode()!=null && menu.getSmeMenuCode().equals(item.getSmeFatMenu())) {
				if (null == listSub) {
					listSub = new ArrayList<>();
				}
				MenuVo subMenu = new MenuVo();
				subMenu.setIcon(item.getSmeIcon());
				subMenu.setIndex(item.getSmeIndex());
				subMenu.setTitle(item.getSmeTitle());
				subMenu.setSubMenus(getSubMenus(item,listMenu));
				listSub.add(subMenu);
			}
		}
		return listSub;
	}
}
