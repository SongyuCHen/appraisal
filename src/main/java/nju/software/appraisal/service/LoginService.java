package nju.software.appraisal.service;

import nju.software.appraisal.service.model.UserContext;



/**
 * ��¼����
 * @author wzq
 *
 */
public interface LoginService {
	/**
	 * ��¼
	 * @param username
	 * @param password
	 * @param fydm
	 * @return
	 */
	public UserContext login(String username,String password);
}
