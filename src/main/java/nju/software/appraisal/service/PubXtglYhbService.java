package nju.software.appraisal.service;

import java.util.List;

import nju.software.appraisal.data.dataobject.PubXtglYhb;
import nju.software.appraisal.service.model.UserContext;

public interface PubXtglYhbService {
	
	/**
	 * ��½
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public PubXtglYhb checkin(String username,String password);
	
	/**
	 * ͨ�����ű���б��ѯ�û�
	 */
	public List<PubXtglYhb> getXtglYhListByBmdmList(List<String> bmbhList);


	
	/**
	 * ��ȡ�����û��б�
	 * 
	 * @return
	 */
	public List<UserContext> getAllYhList();
	
	/**
	 * �����û���Ż�ȡ�û���������
	 * 
	 * @param yhbh
	 * @return
	 */
	public String getYhbmmcByyhbh(Integer yhbh);
	
	/**
	 * 
	 * @param bmbhList
	 * @return
	 */
	public PubXtglYhb getXtglYhListByyhmc(String yhmc);

	
	/**
	 * ����Դ ͨ���û���ŵõ��û�
	 * 
	 * @param bmbh
	 * @param filter
	 * @return
	 */
	public PubXtglYhb getByYhbh(int yhbh);

	
}
