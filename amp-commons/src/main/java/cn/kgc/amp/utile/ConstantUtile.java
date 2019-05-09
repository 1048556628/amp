package cn.kgc.amp.utile;

import java.io.IOException;
import java.util.Properties;

public class ConstantUtile {
	private static Properties pro =new Properties();
	static {
		
		try {
			pro.load(ConstantUtile.class.getClassLoader().getResourceAsStream("system.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Integer PAGE_NUM=  Integer.parseInt(pro.getProperty("pageNum"));
	public static Integer PAGE_SIZE=  Integer.parseInt(pro.getProperty("pageSize"));
	
	
	

}
