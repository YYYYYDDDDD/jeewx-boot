package com.jeecg.p3.vote.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>投票管理<br>
 * @author junfeng.zhou
 * @since：2019年07月20日 09时06分08秒 星期六 
 * @version:1.0
 */
public class WxActVote implements Entity<String> {
	private static final long serialVersionUID = 1L;
		/**	 *ID	 */	private String id;	/**	 *活动名称	 */	private String title;	/**	 *活动描述	 */	private String description;	/**	 *开始时间	 */	private Date starttime;	/**	 *结束时间	 */	private Date endtime;	/**	 *背景图	 */	private String banner;	/**	 *入口地址	 */	private String hdurl;	/**	 *短链接	 */	private String shortUrl;	/**	 *是否关注可参加(0：否，1：是)	 */	private String foucsUserCanJoin;	/**	 *是否绑定手机可参加（0：否，1：是）	 */	private String bindingMobileCanJoin;	/**	 *每日投票次数	 */	private Integer numDay;	/**	 *公众号原始id	 */	private String jwid;	/**	 *活动编码	 */	private String projectCode;	/**	 *创建人	 */	private String createBy;	/**	 *创建时间	 */	private Date createTime;	public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getTitle() {	    return this.title;	}	public void setTitle(String title) {	    this.title=title;	}	public String getDescription() {	    return this.description;	}	public void setDescription(String description) {	    this.description=description;	}	public Date getStarttime() {	    return this.starttime;	}	public void setStarttime(Date starttime) {	    this.starttime=starttime;	}	public Date getEndtime() {	    return this.endtime;	}	public void setEndtime(Date endtime) {	    this.endtime=endtime;	}	public String getBanner() {	    return this.banner;	}	public void setBanner(String banner) {	    this.banner=banner;	}	public String getHdurl() {	    return this.hdurl;	}	public void setHdurl(String hdurl) {	    this.hdurl=hdurl;	}	public String getShortUrl() {	    return this.shortUrl;	}	public void setShortUrl(String shortUrl) {	    this.shortUrl=shortUrl;	}	public String getFoucsUserCanJoin() {	    return this.foucsUserCanJoin;	}	public void setFoucsUserCanJoin(String foucsUserCanJoin) {	    this.foucsUserCanJoin=foucsUserCanJoin;	}	public String getBindingMobileCanJoin() {	    return this.bindingMobileCanJoin;	}	public void setBindingMobileCanJoin(String bindingMobileCanJoin) {	    this.bindingMobileCanJoin=bindingMobileCanJoin;	}	public Integer getNumDay() {	    return this.numDay;	}	public void setNumDay(Integer numDay) {	    this.numDay=numDay;	}	public String getJwid() {	    return this.jwid;	}	public void setJwid(String jwid) {	    this.jwid=jwid;	}	public String getProjectCode() {	    return this.projectCode;	}	public void setProjectCode(String projectCode) {	    this.projectCode=projectCode;	}	public String getCreateBy() {	    return this.createBy;	}	public void setCreateBy(String createBy) {	    this.createBy=createBy;	}	public Date getCreateTime() {	    return this.createTime;	}	public void setCreateTime(Date createTime) {	    this.createTime=createTime;	}
}

