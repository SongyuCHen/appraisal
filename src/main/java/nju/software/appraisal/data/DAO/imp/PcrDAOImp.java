package nju.software.appraisal.data.DAO.imp;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import nju.software.appraisal.data.DAO.PcrDAO;
import nju.software.appraisal.data.dataobject.Pcr;
@Repository("pcrDao")
public class PcrDAOImp extends BaseDaoImp<Pcr> implements PcrDAO {

	

	@Override
	public List<Pcr> getAllPcr() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pcr> getPcrByJs(int jsbh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pcr getPcrByXm(String xm) {
		// TODO Auto-generated method stub
		return null;
	}

}
