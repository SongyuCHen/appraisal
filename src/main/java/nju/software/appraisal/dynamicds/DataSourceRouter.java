package nju.software.appraisal.dynamicds;

import nju.software.appraisal.util.PropertiesUtil;



public class DataSourceRouter {
	
	/**
	 * �л���ָ��Fydm���ݿ�
	 * @param fydm
	 */
	public static void routerTo(String fydm) {
		//System.out.println(1+""+CustomerContextHolder.getCustomerType());
		if(CustomerContextHolder.getCustomerType() == null || ! CustomerContextHolder.getCustomerType().equals(fydm)){
			CustomerContextHolder.setCustomerType(DataSourceMap
					.getDataSourceKey(fydm));
		}
		//System.out.println(2+""+CustomerContextHolder.getCustomerType());
	}
	
	/**
	 * �л�����Ժ����Դ
	 * @param fydm
	 */
	public static void routerToDefault() {
		//�л��ر�Ժ����Դ 
		CustomerContextHolder.setCustomerType(DataSourceMap
				.getDataSourceKey(PropertiesUtil.getCurrentFydm()));
	}
}
