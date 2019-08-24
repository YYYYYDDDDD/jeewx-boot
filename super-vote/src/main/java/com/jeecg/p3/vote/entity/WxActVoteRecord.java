package com.jeecg.p3.vote.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>投票记录表<br>
 * @author junfeng.zhou
 * @since：2019年08月24日 13时48分10秒 星期六 
 * @version:1.0
 */
public class WxActVoteRecord implements Entity<String> {
	private static final long serialVersionUID = 1L;
		/**	 *	 */	private String id;	/**	 *活动id	 */	private String actid;	/**	 *参与人openid	 */	private String openid;	/**	 *投票人openid	 */	private String voterOpenid;	/**	 *投票人微信昵称	 */	private String voterNickname;	/**	 *是否有效(0：否，1：是)	 */	private String isEffective;	/**	 *投票时间	 */	private Date content;	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getActid() {	    return this.actid;	}	public void setActid(String actid) {	    this.actid=actid;	}	public String getOpenid() {	    return this.openid;	}	public void setOpenid(String openid) {	    this.openid=openid;	}	public String getVoterOpenid() {	    return this.voterOpenid;	}	public void setVoterOpenid(String voterOpenid) {	    this.voterOpenid=voterOpenid;	}	public String getVoterNickname() {	    return this.voterNickname;	}	public void setVoterNickname(String voterNickname) {	    this.voterNickname=voterNickname;	}	public String getIsEffective() {	    return this.isEffective;	}	public void setIsEffective(String isEffective) {	    this.isEffective=isEffective;	}	public Date getContent() {	    return this.content;	}	public void setContent(Date content) {	    this.content=content;	}
}

