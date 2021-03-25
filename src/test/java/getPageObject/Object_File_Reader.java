package getPageObject;

//This Class is used to read the text file

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Object_File_Reader {
	String fl = "src/test/resources/PageObjectRepository/";

	//method return the locator variable name (eg abc, xyz)
	public ArrayList<String> getObject(String pagename) {
		String filepath = fl + pagename + ".txt";
		File file = new File(filepath);
		ArrayList<String> object_name = new ArrayList<String>();
		try {
			// File file=new File(filepath);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] pair = line.split(":");
				object_name.add(pair[0].trim().replaceAll("\\s+", ""));
				// System.out.println(object_name);
				// System.out.println(locator_name);
				// System.out.println(locator_value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object_name;

	}

	
	//method return the locator name (eg css, id, xpath, classname)
	public ArrayList<String> getlocatorName(String pagename) {

		String filepath = fl + pagename + ".txt";
		File file = new File(filepath);
		ArrayList<String> locator_name = new ArrayList<String>();

		try {
			// File file=new File(filepath);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] pair = line.split(":");
				locator_name.add(pair[1].trim().replaceAll("\\s+", ""));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return locator_name;

	}

	//method return the locators value 
	public ArrayList<String> getlocatorValue(String pagename) {

		String filepath = fl + pagename + ".txt";
		File file = new File(filepath);
		ArrayList<String> locator_value = new ArrayList<String>();

		try {
			// File file=new File(filepath);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] pair = line.split(":");
				locator_value.add(pair[2].trim().replaceAll("\\s+", ""));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return locator_value;
	}

}
