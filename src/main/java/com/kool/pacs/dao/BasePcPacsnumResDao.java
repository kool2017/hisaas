package com.kool.pacs.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kool.pacs.bean.PcPacsnumResBean;


@Repository(value="BasePcPacsnumResDao")
public interface BasePcPacsnumResDao {

	public PcPacsnumResBean selectByPK(PcPacsnumResBean pcPacsnumRes);

	public List<PcPacsnumResBean> select(PcPacsnumResBean pcPacsnumRes);

	public void delete(PcPacsnumResBean pcPacsnumRes);

	public void deletes(PcPacsnumResBean pcPacsnumRes);

	public void update(PcPacsnumResBean pcPacsnumRes);

	public void updates(@Param("value") PcPacsnumResBean value,
			@Param("condition") PcPacsnumResBean condition);

	public void insert(PcPacsnumResBean pcPacsnumRes);
	
	public List<PcPacsnumResBean> selectPage(@Param("pcPacsnumRes") PcPacsnumResBean pcPacsnumRes, @Param("offset") int offset, @Param("pageSize") int pageSize);
	
	public int selectTotal(PcPacsnumResBean pcPacsnumRes);
	
	public void insertBatch(List<PcPacsnumResBean> pcPacsnumRes);
	
	public List<Map<String,Object>> selectBySql(String sql);
	
	public int selectTotalBySql(String sql);
}
