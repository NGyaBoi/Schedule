/* Filename:		Schedule.java
 * Author:  		Yifan Feng, Neel Ghosh, Seungyup Lee, Miloni Shah
 * Section: 		IST 140.001
 * Assignment: 		Final Project
 * Date:    		Dec 12th 2019
 * Description:		(empty)
 */

import javax.swing.*;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Schedule 
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		String strName = "";
		String strDate = "";
		
		
		strName = GetName();
//		strDate = GetDate();
		
	}
	
	public static String GetName()
	{
		String strName = "";
		
		strName = JOptionPane.showInputDialog("Enter in your name:");
		
		return strName;
	}
	
	public static String GetTimeInterval()
	{
		String strInterval = "";
		String strStartTime = "";
		String strEndTime = "";
		
		strStartTime = JOptionPane.showInputDialog("Enter in the starting time:");
		strEndTime = JOptionPane.showInputDialog("Enter in the ending time:");
		
		strInterval = strStartTime + " to " + strEndTime;
		
		return strInterval;
	}
}
