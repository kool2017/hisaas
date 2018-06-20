/**
 * @PROJECT 
 * @DATE 2018年6月15日 下午3:10:35
 * @AUTHOR LUYU
 */
package com.kool.system.bean.vo;

import java.util.List;

import com.kool.core.exception.AppException;
import com.kool.system.bean.SyMenuBean;

/**
 * @DESCRIBE
 * @AUTHOR LUYU
 * @DATE 2018年6月15日 下午3:10:35
 *
 */
public class MenuVo {
	private String icon;
	private String index;
	private String title;
	private List<MenuVo> subMenus;

	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * @return the index
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * @param index
	 *            the index to set
	 */
	public void setIndex(String index) {
		this.index = index;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the subMenus
	 */
	public List<MenuVo> getSubMenus() {
		return subMenus;
	}

	/**
	 * @param subMenus
	 *            the subMenus to set
	 */
	public void setSubMenus(List<MenuVo> subMenus) {
		this.subMenus = subMenus;
	}

}
