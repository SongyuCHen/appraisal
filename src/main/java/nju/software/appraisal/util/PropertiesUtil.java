package nju.software.appraisal.util;
import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

/**
 * �����ļ���*.properties��������
 * 
 * @author wzq
 */
/**
 * @author wzq
 *
 */
public class PropertiesUtil {
	
	public static boolean setProperty(String key, String value) {
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties�ļ������ڣ�";
			System.out.println(errorMessage);
			return false;
		}
		pros.setProperty(key, value);
		String tempValue = pros.getProperty(key);
		if(value.equals(tempValue))
			return true;
		else
			return false;
	}
	
	/**
	 * ��ȡ���ӵ���Ŀ¼
	 * @return
	 */
	public static String getDzdaDir(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties�ļ������ڣ�";
			System.out.println(errorMessage);
		}
		String dzdaDir = pros.getProperty("dzdaDir");
		return dzdaDir;
	}
	
	/**
	 * ��ȡ��ǰ��Ժ����
	 * @return
	 */
	public static String getCurrentFydm(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties�ļ������ڣ�";
			System.out.println(errorMessage);
		}
		String fydm = pros.getProperty("currentFydm");
		return fydm;
	}
	
	public static String getQrcodeWidth(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties�ļ������ڣ�";
			System.out.println(errorMessage);
		}
		String width = pros.getProperty("qrcodeWidth");
		return width;
	}
	
	public static String getQrcodeHeight(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties�ļ������ڣ�";
			System.out.println(errorMessage);
		}
		String height = pros.getProperty("qrcodeHeight");
		return height;
	}
	
	/**
	 * ���ӵ����ϴ�Ŀ¼��ÿ���ļ��������ͼƬ����
	 */
	public static int getMaxNumPerFolder(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties�ļ������ڣ�";
			System.out.println(errorMessage);
		}
		String num = pros.getProperty("maxNumPerFolder");
		return Integer.parseInt(num);
	}
	
	/**
	 * ��ȡ���鰸���������ű��
	 */
	public static String getPcajSpbmbh(){
		ClassPathResource resource = new ClassPathResource("dzda.properties");
		Properties pros = new Properties();
		try {
			pros.load(resource.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
			String errorMessage = "dzda.properties�ļ������ڣ�";
			System.out.println(errorMessage);
		}
		String num = pros.getProperty("pcajSpbmbh");
		return num.trim();
	}
	
}
