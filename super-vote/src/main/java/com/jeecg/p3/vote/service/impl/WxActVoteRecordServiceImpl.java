package com.jeecg.p3.vote.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import org.jeecgframework.p3.core.utils.common.PageList;
import org.jeecgframework.p3.core.utils.common.PageQuery;
import org.jeecgframework.p3.core.utils.common.Pagenation;
import com.jeecg.p3.vote.service.WxActVoteRecordService;
import com.jeecg.p3.vote.entity.WxActVoteRecord;
import com.jeecg.p3.vote.dao.WxActVoteRecordDao;

/**
 * 描述：</b>投票记录表<br>
 * @author：junfeng.zhou
 * @since：2019年08月24日 13时48分10秒 星期六 
 * @version:1.0
 */
@Service("wxActVoteRecordService")
public class WxActVoteRecordServiceImpl implements WxActVoteRecordService {
	@Resource
	private WxActVoteRecordDao wxActVoteRecordDao;

	@Override
	public void doAdd(WxActVoteRecord wxActVoteRecord) {
		wxActVoteRecordDao.insert(wxActVoteRecord);
	}

	@Override
	public void doEdit(WxActVoteRecord wxActVoteRecord) {
		wxActVoteRecordDao.update(wxActVoteRecord);
	}

	@Override
	public void doDelete(String id) {
		wxActVoteRecordDao.delete(id);
	}

	@Override
	public WxActVoteRecord queryById(String id) {
		WxActVoteRecord wxActVoteRecord  = wxActVoteRecordDao.get(id);
		return wxActVoteRecord;
	}

	@Override
	public PageList<WxActVoteRecord> queryPageList(
		PageQuery<WxActVoteRecord> pageQuery) {
		PageList<WxActVoteRecord> result = new PageList<WxActVoteRecord>();
		Integer itemCount = wxActVoteRecordDao.count(pageQuery);
		List<WxActVoteRecord> list = wxActVoteRecordDao.queryPageList(pageQuery,itemCount);
		Pagenation pagenation = new Pagenation(pageQuery.getPageNo(), itemCount, pageQuery.getPageSize());
		result.setPagenation(pagenation);
		result.setValues(list);
		return result;
	}
	
}
