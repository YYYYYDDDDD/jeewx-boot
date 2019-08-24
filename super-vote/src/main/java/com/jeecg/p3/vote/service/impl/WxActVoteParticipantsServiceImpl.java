package com.jeecg.p3.vote.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import org.jeecgframework.p3.core.utils.common.PageList;
import org.jeecgframework.p3.core.utils.common.PageQuery;
import org.jeecgframework.p3.core.utils.common.Pagenation;
import com.jeecg.p3.vote.service.WxActVoteParticipantsService;
import com.jeecg.p3.vote.entity.WxActVoteParticipants;
import com.jeecg.p3.vote.dao.WxActVoteParticipantsDao;

/**
 * 描述：</b>投票参与人<br>
 * @author：junfeng.zhou
 * @since：2019年08月22日 14时32分29秒 星期四 
 * @version:1.0
 */
@Service("wxActVoteParticipantsService")
public class WxActVoteParticipantsServiceImpl implements WxActVoteParticipantsService {
	@Resource
	private WxActVoteParticipantsDao wxActVoteParticipantsDao;

	@Override
	public void doAdd(WxActVoteParticipants wxActVoteParticipants) {
		wxActVoteParticipantsDao.insert(wxActVoteParticipants);
	}

	@Override
	public void doEdit(WxActVoteParticipants wxActVoteParticipants) {
		wxActVoteParticipantsDao.update(wxActVoteParticipants);
	}

	@Override
	public void doDelete(String id) {
		wxActVoteParticipantsDao.delete(id);
	}

	@Override
	public WxActVoteParticipants queryById(String id) {
		WxActVoteParticipants wxActVoteParticipants  = wxActVoteParticipantsDao.get(id);
		return wxActVoteParticipants;
	}

	@Override
	public PageList<WxActVoteParticipants> queryPageList(
		PageQuery<WxActVoteParticipants> pageQuery) {
		PageList<WxActVoteParticipants> result = new PageList<WxActVoteParticipants>();
		Integer itemCount = wxActVoteParticipantsDao.count(pageQuery);
		List<WxActVoteParticipants> list = wxActVoteParticipantsDao.queryPageList(pageQuery,itemCount);
		Pagenation pagenation = new Pagenation(pageQuery.getPageNo(), itemCount, pageQuery.getPageSize());
		result.setPagenation(pagenation);
		result.setValues(list);
		return result;
	}

	@Override
	public List<WxActVoteParticipants> selectAllSignUpUsers() {
		return wxActVoteParticipantsDao.selectAllSignUpUsers();
	}

    @Override
    public Long countByOpenId(String openId) {
        return wxActVoteParticipantsDao.countByOpenId(openId);
    }

}
