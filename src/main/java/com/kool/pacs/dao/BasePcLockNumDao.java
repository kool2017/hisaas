package com.kool.pacs.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kool.pacs.bean.PcLockNumBean;


@Repository(value="BasePcLockNumDao")
public interface BasePcLockNumDao {

	public PcLockNumBean selectByPK(PcLockNumBean pcLockNum);

	public List<PcLockNumBean> select(PcLockNumBean pcLockNum);

	public void delete(PcLockNumBean pcLockNum);

	public void deletes(PcLockNumBean pcLockNum);

	public void update(PcLockNumBean pcLockNum);

	public void updates(@Param("value") PcLockNumBean value,
			@Param("condition") PcLockNumBean condition);

	public void insert(PcLockNumBean pcLockNum);
	
	public List<PcLockNumBean> selectPage(@Param("pcLockNum") PcLockNumBean pcLockNum, @Param("offset") int offset, @Param("pageSize") int pageSize);
	
	public int selectTotal(PcLockNumBean pcLockNum);
	
	public void insertBatch(List<PcLockNumBean> pcLockNum);
	
	public List<Map<String,Object>> selectBySql(String sql);
	
	public int selectTotalBySql(String sql);
}
