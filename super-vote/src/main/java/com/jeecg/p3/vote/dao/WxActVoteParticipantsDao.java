package com.jeecg.p3.vote.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.jeecgframework.p3.core.utils.common.PageQuery;
import org.jeecgframework.p3.core.utils.persistence.GenericDao;

import com.jeecg.p3.vote.entity.WxActVoteParticipants;

/**
 * 描述：</b>投票参与人<br>
 * @author：junfeng.zhou
 * @since：2019年08月22日 14时32分29秒 星期四 
 * @version:1.0
 */
public interface WxActVoteParticipantsDao extends GenericDao<WxActVoteParticipants>{
	
	public Integer count(PageQuery<WxActVoteParticipants> pageQuery);
	
	public List<WxActVoteParticipants> queryPageList(PageQuery<WxActVoteParticipants> pageQuery, Integer itemCount);

    List<WxActVoteParticipants> selectAllSignUpUsers();

    Long countByOpenId(@Param("openId") String openId);
}

