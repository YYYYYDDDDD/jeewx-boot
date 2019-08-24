package com.jeecg.p3.vote.dao;

import java.util.List;

import org.jeecgframework.p3.core.utils.common.PageQuery;
import org.jeecgframework.p3.core.utils.persistence.GenericDao;

import com.jeecg.p3.vote.entity.WxActVoteRecord;

/**
 * 描述：</b>投票记录表<br>
 * @author：junfeng.zhou
 * @since：2019年08月24日 13时48分10秒 星期六 
 * @version:1.0
 */
public interface WxActVoteRecordDao extends GenericDao<WxActVoteRecord>{
	
	public Integer count(PageQuery<WxActVoteRecord> pageQuery);
	
	public List<WxActVoteRecord> queryPageList(PageQuery<WxActVoteRecord> pageQuery, Integer itemCount);
	
}

