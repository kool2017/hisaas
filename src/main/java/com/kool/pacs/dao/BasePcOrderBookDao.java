package com.kool.pacs.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kool.pacs.bean.PcOrderBookBean;


@Repository(value="BasePcOrderBookDao")
public interface BasePcOrderBookDao {

	public PcOrderBookBean selectByPK(PcOrderBookBean pcOrderBook);

	public List<PcOrderBookBean> select(PcOrderBookBean pcOrderBook);

	public void delete(PcOrderBookBean pcOrderBook);

	public void deletes(PcOrderBookBean pcOrderBook);

	public void update(PcOrderBookBean pcOrderBook);

	public void updates(@Param("value") PcOrderBookBean value,
			@Param("condition") PcOrderBookBean condition);

	public void insert(PcOrderBookBean pcOrderBook);
	
	public List<PcOrderBookBean> selectPage(@Param("pcOrderBook") PcOrderBookBean pcOrderBook, @Param("offset") int offset, @Param("pageSize") int pageSize);
	
	public int selectTotal(PcOrderBookBean pcOrderBook);
	
	public void insertBatch(List<PcOrderBookBean> pcOrderBook);
	
	public List<Map<String,Object>> selectBySql(String sql);
	
	public int selectTotalBySql(String sql);
}
