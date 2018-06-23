package com.kool.pacs.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kool.pacs.bean.PcExamStaffBean;


@Repository(value="BasePcExamStaffDao")
public interface BasePcExamStaffDao {

	public PcExamStaffBean selectByPK(PcExamStaffBean pcExamStaff);

	public List<PcExamStaffBean> select(PcExamStaffBean pcExamStaff);

	public void delete(PcExamStaffBean pcExamStaff);

	public void deletes(PcExamStaffBean pcExamStaff);

	public void update(PcExamStaffBean pcExamStaff);

	public void updates(@Param("value") PcExamStaffBean value,
			@Param("condition") PcExamStaffBean condition);

	public void insert(PcExamStaffBean pcExamStaff);
	
	public List<PcExamStaffBean> selectPage(@Param("pcExamStaff") PcExamStaffBean pcExamStaff, @Param("offset") int offset, @Param("pageSize") int pageSize);
	
	public int selectTotal(PcExamStaffBean pcExamStaff);
	
	public void insertBatch(List<PcExamStaffBean> pcExamStaff);
	
	public List<Map<String,Object>> selectBySql(String sql);
	
	public int selectTotalBySql(String sql);
}
