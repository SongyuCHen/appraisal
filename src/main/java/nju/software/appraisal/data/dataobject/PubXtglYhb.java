package nju.software.appraisal.data.dataobject;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "PUB_XTGL_YHB")
public class PubXtglYhb implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2390550181731900081L;
	/**
	 * �û����
	 */
	private Integer yhbh;
	/**
	 * �û�����
	 */
	private String yhdm;
	/**
	 * �û�����
	 */
	private String yhmc;
	/**
	 * �û�����
	 */
	private String yhkl;
	/**
	 * �û�����
	 */
	private String yhbm;
	/**
	 * �û����
	 */
	private String yhsf;
	/**
	 * ������Ϣ������
	 */
	private String jbxxjCode;
	
	public PubXtglYhb() {
	}

	public PubXtglYhb(Integer yhbh, String yhdm, String yhmc, String yhkl,
			String yhbm, String yhsf, String jbxxjCode) {
		super();
		this.yhbh = yhbh;
		this.yhdm = yhdm;
		this.yhmc = yhmc;
		this.yhkl = yhkl;
		this.yhbm = yhbm;
		this.yhsf = yhsf;
		this.jbxxjCode = jbxxjCode;
	}
	@Id
	@Column(name="YHBH",nullable=false)
	public Integer getYhbh() {
		return yhbh;
	}

	public void setYhbh(Integer yhbh) {
		this.yhbh = yhbh;
	}
	@Column(name="YHDM",nullable=true,length=10)
	public String getYhdm() {
		return yhdm;
	}

	public void setYhdm(String yhdm) {
		this.yhdm = yhdm;
	}
	@Column(name="YHMC",nullable=true,length=50)
	public String getYhmc() {
		return yhmc;
	}

	public void setYhmc(String yhmc) {
		this.yhmc = yhmc;
	}
	@Column(name="YHKL",nullable=true,length=20)
	public String getYhkl() {
		return yhkl;
	}

	public void setYhkl(String yhkl) {
		this.yhkl = yhkl;
	}
	@Column(name="YHBM",nullable=true,length=20)
	public String getYhbm() {
		return yhbm;
	}

	public void setYhbm(String yhbm) {
		this.yhbm = yhbm;
	}
	@Column(name="YHSF",nullable=true,length=20)
	public String getYhsf() {
		return yhsf;
	}

	public void setYhsf(String yhsf) {
		this.yhsf = yhsf;
	}
	@Column(name="JBXXJ_CODE",nullable=true,length=30)
	public String getJbxxjCode() {
		return jbxxjCode;
	}

	public void setJbxxjCode(String jbxxjCode) {
		this.jbxxjCode = jbxxjCode;
	}
}
