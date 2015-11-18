package nju.software.appraisal.data.DAO;

import java.util.List;

import nju.software.appraisal.data.dataobject.Dmb;

public interface DmbDAO extends BaseDAO<Dmb>{
	/**
	 * ��������źʹ����Ż�ȡ��������
	 * @param lbbh
	 * @param dmbh
	 * @return
	 */
	public String getDmms(String lbbh,String dmbh);
	

	
	/**
	 * ��������źʹ����Ż�ȡ�����б�
	 * @param lbbh
	 * @param dmbh
	 * @param type 0:%XX%, 1:XX%, 2:%XX
	 * @return
	 */
	public List<Dmb> getDmbListByDmbhLike(String lbbh,String dmbh,int type);
	
	/**
	 * ��������Ż�ȡ�����List
	 * @param lbbh
	 * @return List &lt;Dmb&gt;
	 */
	public List<Dmb> getDmbList(String lbbh);

	
	/**
	 * ��������źʹ����ŷ���dmbDo
	 * @param lbbh
	 * @param dmbh
	 * @return
	 */
	public Dmb getDmbBybh(String lbbh, String dmbh);
	
	/**
	 * ��������źʹ�����������dmbDo
	 * @param lbbh
	 * @param dmms
	 * @return
	 */
	public Dmb getDmbByms(String lbbh, String dmms);
}
