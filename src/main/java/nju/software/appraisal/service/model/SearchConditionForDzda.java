package nju.software.appraisal.service.model;

/**
 * @author ����Դ xxy
 *
 * 2014-6-30 ����05:22:21 Admin
 */

import java.util.Date;

public class SearchConditionForDzda {
	//����
	private String ah;
	//��������
	private String ajmc;
	//������ʼʱ��
	private Date la_begin_time;
	//��������ʱ��
	private Date la_end_time;
	//�᰸��ʼʱ��
	private Date ja_begin_time;
	//�᰸����ʱ��
	private Date ja_end_time;
	//����ͥ
	private String spt;
	//��������
	private String ajxz;
	//�а���
	private String cbr;
	//�鵵����
	private Date gdrq;
	//���ӵ�����Դ
	private String dzdaly;
	public String getAh() {
		return ah;
	}
	public void setAh(String ah) {
		this.ah = ah;
	}
	public String getAjmc() {
		return ajmc;
	}
	public void setAjmc(String ajmc) {
		this.ajmc = ajmc;
	}
	public Date getLa_begin_time() {
		return la_begin_time;
	}
	public void setLa_begin_time(Date la_begin_time) {
		this.la_begin_time = la_begin_time;
	}
	
	public Date getLa_end_time() {
		return la_end_time;
	}
	public void setLa_end_time(Date la_end_time) {
		this.la_end_time = la_end_time;
	}
	public Date getJa_begin_time() {
		return ja_begin_time;
	}
	public void setJa_begin_time(Date ja_begin_time) {
		this.ja_begin_time = ja_begin_time;
	}
	
	public Date getJa_end_time() {
		return ja_end_time;
	}
	public void setJa_end_time(Date ja_end_time) {
		this.ja_end_time = ja_end_time;
	}
	public String getSpt() {
		return spt;
	}
	public void setSpt(String spt) {
		this.spt = spt;
	}
	public String getAjxz() {
		return ajxz;
	}
	public void setAjxz(String ajxz) {
		this.ajxz = ajxz;
	}
	public String getCbr() {
		return cbr;
	}
	public void setCbr(String cbr) {
		this.cbr = cbr;
	}
	public Date getGdrq() {
		return gdrq;
	}
	public void setGdrq(Date gdrq) {
		this.gdrq = gdrq;
	}
	public String getDzdaly() {
		return dzdaly;
	}
	public void setDzdaly(String dzdaly) {
		this.dzdaly = dzdaly;
	}
}