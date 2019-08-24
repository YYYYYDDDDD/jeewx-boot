package com.jeecg.p3.vote;

import com.jeecg.p3.core.annotation.SkipAuth;
import com.jeecg.p3.vote.entity.WxActVoteParticipants;
import com.jeecg.p3.vote.entity.WxActVoteRecord;
import com.jeecg.p3.vote.service.WxActVoteParticipantsService;
import com.jeecg.p3.vote.service.WxActVoteRecordService;
import com.jeecg.p3.vote.service.WxActVoteService;
import org.apache.velocity.VelocityContext;
import org.jeecgframework.p3.base.vo.WeixinDto;
import org.jeecgframework.p3.core.common.utils.AjaxJson;
import org.jeecgframework.p3.core.util.plugin.ViewVelocity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/vote")
public class VoteActController {
	public final static Logger LOG = LoggerFactory
			.getLogger(VoteActController.class);
	@Autowired
	private static String VerificationUrl="";
//	static {
//	PropertiesUtil p=new PropertiesUtil("goldeneggs.properties");
//		VerificationUrl=p.readProperty("VerificationUrl");
//	}

	/**
	 * 投票活动
	 */
	@Autowired
	private WxActVoteService wxActVoteService;
	@Autowired
	private WxActVoteParticipantsService wxActVoteParticipantsService;
	@Autowired
	private WxActVoteRecordService wxActVoteRecordService;
	/**
	 * 投票首页
	 * 
	 * @return
	 * @throws Exception
	 */
	@SkipAuth
	@RequestMapping(value = "/toVote", method = { RequestMethod.GET,RequestMethod.POST })
	public void toGoldenegg(@ModelAttribute WeixinDto weixinDto,HttpServletRequest request, HttpServletResponse response)throws Exception {
			LOG.info("toVote parameter WeixinDto={}.",new Object[] { weixinDto });
			String viewName = "vote/back/index.vm";
			VelocityContext velocityContext = new VelocityContext();
			try {
				String actId = weixinDto.getActId();
				String openid = weixinDto.getOpenid();
				String jwid = weixinDto.getJwid();
				String appid = weixinDto.getAppid();
				weixinDto.setActId("4028829e6cb33e7a016cb33e7a560000");
				weixinDto.setOpenid("1231");
				weixinDto.setJwid("gh_0851429112ed");
				List<WxActVoteParticipants> wxActVoteParticipants = wxActVoteParticipantsService.selectAllSignUpUsers();
				velocityContext.put("weixinDto", weixinDto);
				velocityContext.put("signUpUsers", wxActVoteParticipants);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				ViewVelocity.view(request, response, viewName, velocityContext);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	/**
	 * 报名
	 * @param weixinDto
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@SkipAuth
	@RequestMapping(value = "/toSignUp")
	@ResponseBody
	public AjaxJson toSignUp(@ModelAttribute WeixinDto weixinDto, HttpServletRequest request, HttpServletResponse response)throws Exception {
		AjaxJson j = new AjaxJson();
		try {
			String actId = request.getParameter("actId");
			String openid = request.getParameter("openid");
            WxActVoteParticipants wxActVoteParticipants = new WxActVoteParticipants();
			if(wxActVoteParticipantsService.countByOpenId(openid)>0){
                j.setObj(0);
			    return j;
            }
			wxActVoteParticipants.setActid(actId);
			wxActVoteParticipants.setCode("123123");
			wxActVoteParticipants.setOpenid(openid);
			wxActVoteParticipants.setWxNickname("");
			wxActVoteParticipants.setNickname("qqqqq");
			wxActVoteParticipants.setTel("123");
			wxActVoteParticipants.setAddr("123");
			wxActVoteParticipants.setDesc("123");
			wxActVoteParticipants.setPic("123");
			wxActVoteParticipants.setVideo("123");
			wxActVoteParticipants.setIsProhibit("123");
			wxActVoteParticipants.setCreateTime(new Date());
			wxActVoteParticipantsService.doAdd(wxActVoteParticipants);
            j.setObj(wxActVoteParticipants);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return j;
	}

	@SkipAuth
	@RequestMapping(value = "/clickVote")
	@ResponseBody
	public AjaxJson clickVote(@ModelAttribute WeixinDto weixinDto, HttpServletRequest request, HttpServletResponse response)throws Exception {
		AjaxJson j = new AjaxJson();
		try {
			String actId = request.getParameter("actId");
			String openid = request.getParameter("openid");
			String nickname = request.getParameter("nickname");
			WxActVoteRecord wxActVoteRecord = new WxActVoteRecord();
			wxActVoteRecord.setActid(actId);
			wxActVoteRecord.setOpenid(openid);
			wxActVoteRecord.setVoterOpenid("");
			wxActVoteRecord.setVoterNickname(nickname);
			wxActVoteRecord.setIsEffective("");
			wxActVoteRecord.setContent(new Date());
			wxActVoteRecordService.doAdd(wxActVoteRecord);
		} catch (Exception e) {
			e.printStackTrace();
			j.setSuccess(false);
		}
		return j;
	}
}
