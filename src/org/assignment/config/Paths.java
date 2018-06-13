/**
 * 
 * For Working input and output path
 * @author : Chandan Singh Sroniyan
 * Profession : JAVA, PYTHON, PHP, AI, RPA Programmer
 * Contact : +91 7827711464
 * Email : contact.sroniyan@gmail.com
 * Date/Time : 13/06/2018 05:31 PM
 * 
 */
package org.assignment.config;


public interface Paths {
	
	public static String getInputDirectory()
	{
		return System.getProperty("user.dir")+"\\ws\\input\\";
		
	}
	
	public static String getOutputDirectory()
	{
		return System.getProperty("user.dir")+"\\ws\\output\\";
		
	}

}
