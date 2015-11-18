package nju.software.appraisal.data.DAO;

import java.util.List;

import nju.software.appraisal.data.dataobject.Pcr;

public interface PcrDAO extends BaseDAO<Pcr> {
	
	/**
	 * �õ����е�������
	 * @return
	 */
	List<Pcr> getAllPcr();
	/**
	 * ���ݽ�ɫ��ȡ������
	 * @param jsbh
	 * @return
	 */
	List<Pcr> getPcrByJs(int jsbh);
	/**
	 * ����������ȡ������
	 * @param xm
	 * @return
	 */
	Pcr getPcrByXm(String xm);
}
