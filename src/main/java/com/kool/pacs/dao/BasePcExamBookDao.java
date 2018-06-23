package com.kool.pacs.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kool.pacs.bean.PcExamBookBean;


@Repository(value="BasePcExamBookDao")
public interface BasePcExamBookDao {

	public PcExamBookBean selectByPK(PcExamBookBean pcExamBook);

	public List<PcExamBookBean> select(PcExamBookBean pcExamBook);

	public void delete(PcExamBookBean pcExamBook);

	public void deletes(PcExamBookBean pcExamBook);

	public void update(PcExamBookBean pcExamBook);

	public void updates(@Param("value") PcExamBookBean value,
			@Param("condition") PcExamBookBean condition);

	public void insert(PcExamBookBean pcExamBook);
	
	public List<PcExamBookBean> selectPage(@Param("pcExamBook") PcExamBookBean pcExamBook, @Param("offset") int offset, @Param("pageSize") int pageSize);
	
	public int selectTotal(PcExamBookBean pcExamBook);
	
	public void insertBatch(List<PcExamBookBean> pcExamBook);
	
	public List<Map<String,Object>> selectBySql(String sql);
	
	public int selectTotalBySql(String sql);
}
