package com.jeecg.p3.vote.dao;

import java.util.List;

import org.jeecgframework.p3.core.utils.common.PageQuery;
import org.jeecgframework.p3.core.utils.persistence.GenericDao;

import com.jeecg.p3.vote.entity.WxActVote;

/**
 * 描述：</b>投票管理<br>
 * @author：junfeng.zhou
 * @since：2019年07月20日 09时06分08秒 星期六 
 * @version:1.0
 */
public interface WxActVoteDao extends GenericDao<WxActVote>{
	
	public Integer count(PageQuery<WxActVote> pageQuery);
	
	public List<WxActVote> queryPageList(PageQuery<WxActVote> pageQuery,Integer itemCount);
	
}

