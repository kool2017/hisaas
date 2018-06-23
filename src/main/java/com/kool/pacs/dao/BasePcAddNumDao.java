package com.kool.pacs.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kool.pacs.bean.PcAddNumBean;


@Repository(value="BasePcAddNumDao")
public interface BasePcAddNumDao {

	public PcAddNumBean selectByPK(PcAddNumBean pcAddNum);

	public List<PcAddNumBean> select(PcAddNumBean pcAddNum);

	public void delete(PcAddNumBean pcAddNum);

	public void deletes(PcAddNumBean pcAddNum);

	public void update(PcAddNumBean pcAddNum);

	public void updates(@Param("value") PcAddNumBean value,
			@Param("condition") PcAddNumBean condition);

	public void insert(PcAddNumBean pcAddNum);
	
	public List<PcAddNumBean> selectPage(@Param("pcAddNum") PcAddNumBean pcAddNum, @Param("offset") int offset, @Param("pageSize") int pageSize);
	
	public int selectTotal(PcAddNumBean pcAddNum);
	
	public void insertBatch(List<PcAddNumBean> pcAddNum);
	
	public List<Map<String,Object>> selectBySql(String sql);
	
	public int selectTotalBySql(String sql);
}
