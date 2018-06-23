package com.kool.pacs.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kool.pacs.bean.PcStateRecordBean;


@Repository(value="BasePcStateRecordDao")
public interface BasePcStateRecordDao {

	public PcStateRecordBean selectByPK(PcStateRecordBean pcStateRecord);

	public List<PcStateRecordBean> select(PcStateRecordBean pcStateRecord);

	public void delete(PcStateRecordBean pcStateRecord);

	public void deletes(PcStateRecordBean pcStateRecord);

	public void update(PcStateRecordBean pcStateRecord);

	public void updates(@Param("value") PcStateRecordBean value,
			@Param("condition") PcStateRecordBean condition);

	public void insert(PcStateRecordBean pcStateRecord);
	
	public List<PcStateRecordBean> selectPage(@Param("pcStateRecord") PcStateRecordBean pcStateRecord, @Param("offset") int offset, @Param("pageSize") int pageSize);
	
	public int selectTotal(PcStateRecordBean pcStateRecord);
	
	public void insertBatch(List<PcStateRecordBean> pcStateRecord);
	
	public List<Map<String,Object>> selectBySql(String sql);
	
	public int selectTotalBySql(String sql);
}
