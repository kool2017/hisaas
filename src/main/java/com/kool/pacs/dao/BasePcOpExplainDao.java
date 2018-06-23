package com.kool.pacs.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kool.pacs.bean.PcOpExplainBean;


@Repository(value="BasePcOpExplainDao")
public interface BasePcOpExplainDao {

	public PcOpExplainBean selectByPK(PcOpExplainBean pcOpExplain);

	public List<PcOpExplainBean> select(PcOpExplainBean pcOpExplain);

	public void delete(PcOpExplainBean pcOpExplain);

	public void deletes(PcOpExplainBean pcOpExplain);

	public void update(PcOpExplainBean pcOpExplain);

	public void updates(@Param("value") PcOpExplainBean value,
			@Param("condition") PcOpExplainBean condition);

	public void insert(PcOpExplainBean pcOpExplain);
	
	public List<PcOpExplainBean> selectPage(@Param("pcOpExplain") PcOpExplainBean pcOpExplain, @Param("offset") int offset, @Param("pageSize") int pageSize);
	
	public int selectTotal(PcOpExplainBean pcOpExplain);
	
	public void insertBatch(List<PcOpExplainBean> pcOpExplain);
	
	public List<Map<String,Object>> selectBySql(String sql);
	
	public int selectTotalBySql(String sql);
}
