package nju.software.appraisal.dynamicds;

import java.util.ArrayList;
import java.util.List;

import nju.software.appraisal.service.model.PubFyModel;
import nju.software.appraisal.util.StringUtil;

/**
 */


/**
 * ����ԴEnum
 * @author zym
 * 
 */
public enum DataSourceEnum {
	/**
	 * ��Ժ���п� 
	 */
	DEFAULT("000000","Default","��Ժ���п� "),
	
	/**
	 * ����Ժ
	 */
	TJGY("120000 200","Tjgy","����и߼�����Ժ"),
	/**
	 * ���һ��Ժ
	 */
	TJYZY("120100 210","Tjyzy","����е�һ�м�����Ժ "),
	/**
	 * ������Ժ
	 */
	TJEZY("120200 220","Tjezy","����еڶ��м�����Ժ "),
	/**
	 * ����·�Ժ
	 */
	TJHSFY("960200 230","Tjhsfy","����·�Ժ "),
	/**
	 * ����ƽ��Ժ
	 */
	TJHPFY("120101 211","Tjhpfy","����к�ƽ������Ժ "),
	/**
	 * ����Ͽ���Ժ
	 */
	TJNKFY("120104 212","Tjnkfy","������Ͽ�������Ժ "),
	/**
	 * ���ӱ���Ժ
	 */
	TJHBFY("120105 213","Tjhbfy","����кӱ�������Ժ "),
	/**
	 * �����ŷ�Ժ
	 */
	TJHQFY("120106 214","Tjhqfy","����к���������Ժ "),
	/**
	 * ������෨Ժ
	 */
	TJXQFY("120107 215","Tjxqfy","���������������Ժ "),
	/**
	 * ��򱱳���Ժ
	 */
	TJBCFY("120108 216","Tjbcfy","����б���������Ժ "),
	/**
	 * ���Ӷ���Ժ
	 */
	TJHDFY("120202 221","Tjhdfy","����кӶ�������Ժ "),
	
	/**
	 * ��������Ժ
	 */
	TJHXFY("120203 222","Tjhxfy","����к���������Ժ "),
	
	/**
	 * ���������Ժ
	 */
	TJTGFY("120204 223","Tjtgfy","���������������Ժ "),
	
	/**
	 * ��򺺹���Ժ
	 */
	TJHGFY("120205 224","Tjhgfy","����к���������Ժ "),
	
	/**
	 * ����۷�Ժ
	 */
	TJDGFY("120206 225","Tjdgfy","����д��������Ժ"),
	
	/**
	 * �������Ժ
	 */
	TJDLFY("120207 226","Tjdlfy","����ж���������Ժ"),
	
	/**
	 * �����Ϸ�Ժ
	 */
	TJJNFY("120208 227","Tjjnfy","����н���������Ժ"),
	
	/**
	 * ������ӷ�Ժ
	 */
	TJNHFY("120221 228","Tjnhfy","���������������Ժ "),
	
	/**
	 * ������巨Ժ
	 */
	TJWQFY("120222 217","Tjwqfy","���������������Ժ"),
	
	/**
	 * ��򾲺���Ժ
	 */
	TJJHFY("120223 218","Tjjhfy","����о���������Ժ"),
	
	/**
	 * ����淨Ժ
	 */
	TJBDFY("120224 219","Tjbdfy","����б���������Ժ"),
	
	/**
	 * ����ط�Ժ
	 */
	TJJXFY("120225 21A","Tjjxfy","����м�������Ժ"),
	/**
	 * ��򿪷�������Ժ
	 */
	TJKFQFY("120241 229","Tjkfqfy","������������"),
	/**
	 * ������������Ժ
	 */
	TJBHXQFY("120242 22A","Tjbhxqfy","����б�����������Ժ "),
	/**
	 * �����·��Ժ
	 */
	TJTLFY("920103 132","Tjtlfy","�����·��Ժ")
	;
	
	
	String fydm;
	
	String source;
	
	String fymc;

	/**
	 * @param fydm
	 * @param source
	 */
	private DataSourceEnum(String fydm, String source, String fymc) {
		this.fydm = fydm;
		this.source = source;
		this.fymc = fymc;
	}
	
	public static String getFydmBySource(String source){
		for (DataSourceEnum src : DataSourceEnum.values()) {
			if (StringUtil.equals(source, src.getSource())) {
				return src.getFydm();
			}
		}
		return "";
	}

	public static List<PubFyModel> getALlFydmFymc() {
		List<PubFyModel> list= new ArrayList<PubFyModel>();
		for (DataSourceEnum src : DataSourceEnum.values()) {
			if(!"000000".equals(src.getFydm()))
				list.add(new PubFyModel(src.getFydm(), src.getFymc()));
		}
		return list;
	}
	/**
	 * @return the fydm
	 */
	public String getFydm() {
		return fydm;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	
	/**
	 * @return the fymc
	 */
	public String getFymc() {
		return fymc;
	}
}
