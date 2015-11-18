package nju.software.appraisal.data.DAO;

import java.util.List;

import nju.software.appraisal.data.dataobject.Condition;

public interface ConditionDAO extends BaseDAO<Condition> {
	/**
	 * ���������Ż�ȡ����ɸѡ����
	 * @param pcbh
	 * @return
	 */
	List<Condition> getConditionsByPcbh(int pcbh);

}
