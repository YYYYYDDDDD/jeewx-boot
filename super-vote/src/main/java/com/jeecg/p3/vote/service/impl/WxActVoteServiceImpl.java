package com.jeecg.p3.vote.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.jeecgframework.p3.core.utils.common.PageQueryWrapper;
import org.springframework.stereotype.Service;

import org.jeecgframework.p3.core.utils.common.PageList;
import org.jeecgframework.p3.core.utils.common.PageQuery;
import org.jeecgframework.p3.core.utils.common.Pagenation;
import com.jeecg.p3.vote.service.WxActVoteService;
import com.jeecg.p3.vote.entity.WxActVote;
import com.jeecg.p3.vote.dao.WxActVoteDao;

/**
 * 描述：</b>投票活动<br>
 * @author：junfeng.zhou
 * @since：2019年08月20日 08时16分26秒 星期二 
 * @version:1.0
 */
@Service("wxActVoteService")
public class WxActVoteServiceImpl implements WxActVoteService {
	@Resource
	private WxActVoteDao wxActVoteDao;

	@Override
	public void doAdd(WxActVote wxActVote) {
		wxActVoteDao.insert(wxActVote);
	}

	@Override
	public void doEdit(WxActVote wxActVote) {
		wxActVoteDao.update(wxActVote);
	}

	@Override
	public void doDelete(String id) {
		wxActVoteDao.delete(id);
	}

	@Override
	public WxActVote queryById(String id) {
		WxActVote wxActVote  = wxActVoteDao.get(id);
		return wxActVote;
	}

	@Override
	public PageList<WxActVote> queryPageList(
		PageQuery<WxActVote> pageQuery) {
		PageList<WxActVote> result = new PageList<WxActVote>();
		Integer itemCount = wxActVoteDao.count(pageQuery);
		PageQueryWrapper<WxActVote> wrapper = new PageQueryWrapper<WxActVote>(pageQuery.getPageNo(), pageQuery.getPageSize(),itemCount, pageQuery.getQuery());
		List<WxActVote> list = wxActVoteDao.queryPageList(wrapper);
		Pagenation pagenation = new Pagenation(pageQuery.getPageNo(), itemCount, pageQuery.getPageSize());
		result.setPagenation(pagenation);
		result.setValues(list);
		return result;
	}
	
}
