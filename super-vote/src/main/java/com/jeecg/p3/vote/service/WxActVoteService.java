package com.jeecg.p3.vote.service;

import org.jeecgframework.p3.core.utils.common.PageList;
import org.jeecgframework.p3.core.utils.common.PageQuery;
import com.jeecg.p3.vote.entity.WxActVote;

/**
 * 描述：</b>投票管理<br>
 * @author：junfeng.zhou
 * @since：2019年07月20日 09时06分08秒 星期六 
 * @version:1.0
 */
public interface WxActVoteService {
	
	
	public void doAdd(WxActVote wxActVote);
	
	public void doEdit(WxActVote wxActVote);
	
	public void doDelete(String id);
	
	public WxActVote queryById(String id);
	
	public PageList<WxActVote> queryPageList(PageQuery<WxActVote> pageQuery);
}

