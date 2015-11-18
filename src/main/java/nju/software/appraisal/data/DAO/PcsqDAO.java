package nju.software.appraisal.data.DAO;

import java.sql.Date;
import java.util.List;

import nju.software.appraisal.data.dataobject.Pcsq;

public interface PcsqDAO extends BaseDAO<Pcsq> {
	/**
	 * ���������Ż�ȡ��������
	 * @param pcbh
	 * @return
	 */
	Pcsq getPcsqByPcbh(int pcbh);
	/**
	 * �����������ƻ�ȡ��������
	 * @param pcmc
	 * @return
	 */
	Pcsq getPcsqByMc(String pcmc);
	/**
	 * ��������ʱ���ȡ��������
	 * @param kssj
	 * @param jssj
	 * @return
	 */
	List<Pcsq> getPcsqByDate(Date kssj,Date jssj);
	/**
	 * ��������״̬��ȡ��������
	 * @param pczt
	 * @return
	 */
	List<Pcsq> getPcsqByZt(String pczt);

}
