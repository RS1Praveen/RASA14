package Generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fetch_prop {
	public static String getprop() throws IOException
	{
	FileInputStream fis = new FileInputStream("/Hello/src/main/java/utils/Golbal.properties");
	Properties p = new Properties();
	p.load(fis);
	String var = p.getProperty("basrURL");
	return var;

	}

}

