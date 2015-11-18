package nju.software.appraisal.web.controller;

import java.net.URLDecoder;
import java.security.SignatureException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import nju.software.appraisal.data.dataobject.Dmb;
import nju.software.appraisal.dynamicds.ChangeDataSource;
import nju.software.appraisal.service.DmbService;
import nju.software.appraisal.service.LoginService;
import nju.software.appraisal.service.model.DmbModel;
import nju.software.appraisal.service.model.UserContext;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/")
public class LoginController {
	private static Logger logger = Logger.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;
	@Autowired
	private DmbService dmbService;
	
	/**
	 * ѡ��Ժ
	 * 
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping(value = "/select_fy.aj", method = RequestMethod.POST)
	public void fy_select(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		String fyjc = request.getParameter("fyjc");
		Dmb dmb = dmbService.getDmbByms("FBZ0001-97", fyjc);
		request.getSession().removeAttribute("fydm");
		if(dmb != null)
			request.getSession().setAttribute("fydm", dmb.getDmbh());
		 
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String showMain(HttpServletRequest request,
			HttpServletResponse response, ModelMap model)
			throws SignatureException {
			String fymc = dmbService.getDmbBybh("ϵͳȱʡ", "��Ժ����").getDmms();
		    model.addAttribute("result","");
		    model.addAttribute("fymc","");
		    model.addAttribute("fydm","-1");
		    model.addAttribute("username","");
		    model.addAttribute("password","");
			return "login/login";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String showMainPage(HttpServletRequest request,
			HttpServletResponse response, Model model)
			throws Exception {
		//�л�����Դ����ǰ��Ժ
		ChangeDataSource.changeDataSource(request);	    		   
        String fydm=request.getParameter("fybh");
        String fymc = request.getParameter("fymc");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserContext user = loginService.login(username,password);
		if(user  == null)
		{
			model.addAttribute("result","�û���������");
			model.addAttribute("fymc",fymc);
		    model.addAttribute("fydm",fydm);
		    model.addAttribute("username",username);
		    model.addAttribute("password",password);
			return "login/login";
		}
		request.getSession().removeAttribute("user");
			
		user.setLoginIp(request.getRemoteHost());
		
	    return null;
	}
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout(HttpServletRequest request,
			HttpServletResponse response, ModelMap model) {
		ChangeDataSource.changeDataSource(request);
		// �жϵ�ǰ�Ƿ����userContext���������Ƚ����˳����������userContext
		if (request.getSession().getAttribute("userContext") != null) {
			// ����session�õ��û���Ϣ
			UserContext userContext = (UserContext) request
					.getSession().getAttribute("userContext");
			// ��־��¼�û��˳���Ϣ���û������˳�ʱ��
			if (logger.isInfoEnabled()) {
				logger.info("�û��˳�ϵͳ, �û���:" + userContext.getName() + ",�˳�ʱ��:"
						+ new Date());
			}

			request.getSession().removeAttribute("userContext");
		}
		String fymc = dmbService.getDmbBybh("ϵͳȱʡ", "��Ժ����").getDmms();
		model.addAttribute("fymc", fymc);
		return "login";
	}
	
	

}
