//package com.jeecg.p3.vote.dao.impl;
//
//import java.util.List;
//
//import org.jeecgframework.p3.core.utils.common.PageQuery;
//import org.jeecgframework.p3.core.utils.common.PageQueryWrapper;
//import org.jeecgframework.p3.core.utils.persistence.mybatis.GenericDaoDefault;
//import org.springframework.stereotype.Repository;
//import com.jeecg.p3.vote.dao.WxActVoteDao;
//import com.jeecg.p3.vote.entity.WxActVote;
//
///**
// * 描述：</b>投票管理<br>
// * @author：junfeng.zhou
// * @since：2019年07月20日 09时06分08秒 星期六
// * @version:1.0
// */
//@Repository("wxActVoteDao")
//public class WxActVoteDaoImpl extends GenericDaoDefault<WxActVote> implements WxActVoteDao{
//
//	@Override
//	public Integer count(PageQuery<WxActVote> pageQuery) {
//		return (Integer) super.queryOne("count",pageQuery);
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<WxActVote> queryPageList(
//			PageQuery<WxActVote> pageQuery,Integer itemCount) {
//		PageQueryWrapper<WxActVote> wrapper = new PageQueryWrapper<WxActVote>(pageQuery.getPageNo(), pageQuery.getPageSize(),itemCount, pageQuery.getQuery());
//		return (List<WxActVote>)super.query("queryPageList",wrapper);
//	}
//
//
//}
//
