package com.jeecg.p3.vote.service;

import org.jeecgframework.p3.core.utils.common.PageList;
import org.jeecgframework.p3.core.utils.common.PageQuery;
import com.jeecg.p3.vote.entity.WxActVoteRecord;

/**
 * 描述：</b>投票记录表<br>
 * @author：junfeng.zhou
 * @since：2019年08月24日 13时48分10秒 星期六 
 * @version:1.0
 */
public interface WxActVoteRecordService {
	
	
	public void doAdd(WxActVoteRecord wxActVoteRecord);
	
	public void doEdit(WxActVoteRecord wxActVoteRecord);
	
	public void doDelete(String id);
	
	public WxActVoteRecord queryById(String id);
	
	public PageList<WxActVoteRecord> queryPageList(PageQuery<WxActVoteRecord> pageQuery);
}

