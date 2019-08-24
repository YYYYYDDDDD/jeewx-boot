package com.jeecg.p3.vote.service;

import org.jeecgframework.p3.core.utils.common.PageList;
import org.jeecgframework.p3.core.utils.common.PageQuery;
import com.jeecg.p3.vote.entity.WxActVoteParticipants;

import java.util.ArrayList;
import java.util.List;


/**
 * 描述：</b>投票参与人<br>
 * @author：junfeng.zhou
 * @since：2019年08月22日 14时32分29秒 星期四 
 * @version:1.0
 */
public interface WxActVoteParticipantsService {
	
	
	public void doAdd(WxActVoteParticipants wxActVoteParticipants);
	
	public void doEdit(WxActVoteParticipants wxActVoteParticipants);
	
	public void doDelete(String id);
	
	public WxActVoteParticipants queryById(String id);
	
	public PageList<WxActVoteParticipants> queryPageList(PageQuery<WxActVoteParticipants> pageQuery);

	List<WxActVoteParticipants> selectAllSignUpUsers();

	Long countByOpenId(String openId);
}

