package nju.software.appraisal.service.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @author zym
 *
 */
public class UserContext implements Serializable{

	
	private static final long serialVersionUID = 3781213350527130400L;
	//�û����
	private int yhbh;
	//�û�����	
	private String name;
	//�û�����
	private String password;
	//�û������ɫ
	private String role;
	//�û����
	private String yhsf;
	//���ű��
	private String bmbh;
	//��������
	private String bmmc;
	//��¼IP
	private String loginIp;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYhbh() {
		return yhbh;
	}
	public void setYhbh(int yhbh) {
		this.yhbh = yhbh;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getYhsf() {
		return yhsf;
	}
	public void setYhsf(String yhsf) {
		this.yhsf = yhsf;
	}
	public String getBmbh() {
		return bmbh;
	}
	public void setBmbh(String bmbh) {
		this.bmbh = bmbh;
	}
	public String getBmmc() {
		return bmmc;
	}
	public void setBmmc(String bmmc) {
		this.bmmc = bmmc;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString(){
		return ToStringBuilder.reflectionToString(this);
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
}
