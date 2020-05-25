package main3;
import java.util.*;

import javax.swing.JOptionPane;

import java.lang.*;

public class cla
{
	/* The main method sets up the rules of the game and prints out the 2d array
	* of students in the seating chart with the printArray2 method.
	*/
	public static void main(String[] args) {
	    //Creating array
		JOptionPane.showMessageDialog(null, "Here is a seating chart, there is a help section in the top tab, saying what you type to do the function"
				+ "\n You can also type a name, name, etc to make your own chart. Though it will only have the chart. And, you can add 2 students by typing their name."
				+ "\n Type remove# or move # to do the function. The # is the number of the column starting from 1- 5 and row 0");
	    String[][] blastTable = new String[][]{
			{"John M.","Maria S.","Emma C.","Sebastian E.","Brian R."},
			{"    null       "       ,"      null     "      ,"    null    "       ,"    null    "        ,"    null   "},
			{"    null       "       ,"      null     "      ,"    null    "       ,"    null    "        ,"    null   "},
			{"    null       "       ,"      null     "      ,"    null    "       ,"    null    "        ,"    null   "},
			{"    null       "       ,"      null     "      ,"    null    "       ,"    null    "        ,"    null   "},
		};

	    printArray2(blastTable);
	}
//INSTANCE VARIABLES
public static int a = (int)(Math.random()*4) +1;
public static int b = (int)(Math.random()*4) +1;
public static int c = (int)(Math.random()*4) +1;
public static int d = (int)(Math.random()*4) +1;
public static int e = (int)(Math.random()*4) +1;
static int f = 0;
static int r = 0;
static String q = ",";
static String[][] blastTable2;
static ArrayList<String> obj = new ArrayList<String>();

	/* This method takes a 2d array as a parameter and makes 
	* each value a string to print out in one dialog box.
	* After, it asks if you want to swap, if so, it randomly
	* swaps the first row. And then runs the printArray method.
	*/
public static void printArray2(String[][] blastTable) {
    String output = "";
    for (int x = 0; x < blastTable.length; x++) {
        output += Arrays.toString(blastTable[x]) + "\n";
    }
    String s = JOptionPane.showInputDialog(null, output, "Help: Type swap first",
            JOptionPane.INFORMATION_MESSAGE);
    if(s.equalsIgnoreCase("swap")) {
    	blastTable[0][0] = "Maria S.";
    	blastTable[0][1]= "John M.";
    	blastTable[0][2] = "Brian R.";
    	blastTable[0][3] = "Emma C.";
    	blastTable[0][4] = "Sebastian E.";
    	printArray(blastTable);
    }

 

}
	/* This method prints out the new 2d seating chart, and has different
	* options: help, remove, move, name, chart and exit. All of these options
	* do different commands. Remove, removes a student from the chart and sets
	* the seat to null. Move, moves a student to a different seat if there is 
	* available seats. Chart, makes a new seating chart of a different size
	* with names inputted. Exit, exits the program. Finally, name, adds a student
	* of an inputted name to a random seat, if available.
	*/
	public static void printArray(String[][] blastTable) {
	    String output = "";
	    String[][] array = new String[3][3];
	    for (int x = 0; x < blastTable.length; x++) {
	        output += Arrays.toString(blastTable[x]) + "\n";
	    }
	    String s = JOptionPane.showInputDialog(null, output, "Help: remove#,move#, name, chart,exit", JOptionPane.INFORMATION_MESSAGE);
	    if(s.equalsIgnoreCase("chart")) {
	   	 String a = JOptionPane.showInputDialog("Type the names of the first student with first name, space last initial");
	   	 String b= JOptionPane.showInputDialog("Type the names of the second student with first name, space last initial");
	   	String c = JOptionPane.showInputDialog("Type the names of the third student with first name, space last initial");
		   	
	   	String d = JOptionPane.showInputDialog("Type the names of the fourth student with first name, space last initial");
	   	String e = JOptionPane.showInputDialog("Type the names of the fifth student with first name, space last initial");
	   	 String f= JOptionPane.showInputDialog("Type the names of the sixth student with first name, space last initial");
	   	String g = JOptionPane.showInputDialog("Type the names of the seventh student with first name, space last initial");
	    String h = JOptionPane.showInputDialog("Type the names of the eigth student with first name, space last initial");
	   	 String i= JOptionPane.showInputDialog("Type the names of the ninth student with first name, space last initial");
	   	
	   	
	   	String zhcbj = "";
	   	 if(a.equalsIgnoreCase(a.substring(0))) {
	   		 
			  array[0][0] = a.substring(0);
			  if(b.equalsIgnoreCase(b.substring(0))) {
				  array[1][0] = b.substring(0);
				  if(c.equalsIgnoreCase(c.substring(0))) {
					  array[2][0] = b.substring(0);
					  if(d.equalsIgnoreCase(d.substring(0))) {
						  array[0][1] = d.substring(0);
						  if(e.equalsIgnoreCase(e.substring(0))) {
							  array[1][1] = e.substring(0);
							  if(f.equalsIgnoreCase(f.substring(0))) {
								  array[2][1] = f.substring(0);
								  if(g.equalsIgnoreCase(g.substring(0))) {
									  array[0][2] = g.substring(0);
									  if(h.equalsIgnoreCase(h.substring(0))) {
										  array[1][2] = h.substring(0);
										  if(i.equalsIgnoreCase(i.substring(0))) {
											  array[2][2] = i.substring(0);
										  }
									  }
								  }
							  }
							  
						  }
					  }
				  }
			  }

			}
	   	 for (int k = 0; k <array.length; k++) {
		        zhcbj += Arrays.toString(array[k]) + "\n";
		    }
	   	 JOptionPane.showMessageDialog(null,zhcbj);
	   	 System.exit(0);
			
	   		 
	   		 
	       
	   			/*
	   		    
	   			 JOptionPane.showMessageDialog(null, a.substring(0).split(",", 4));
	   			 System.exit(0);
	   		
	   		*/
	   		
	   	 }
	   	 
	    
	    if(s.equalsIgnoreCase("exit")) {
	    	System.exit(0);
	    }
	    if(s.equalsIgnoreCase("remove1")) {
	    	blastTable[0][0] = "null";
	    	printArray(blastTable);
	    }
 if(s.equalsIgnoreCase("remove2")) {
	 blastTable[0][1] = "null";
 	printArray(blastTable);
	    }
 if(s.equalsIgnoreCase("remove3")) {
	 blastTable[0][2] = "null";
 	printArray(blastTable);
 }
 if(s.equalsIgnoreCase("remove4")) {
	 blastTable[0][3] = "null";
 	printArray(blastTable);
 }
 if(s.equalsIgnoreCase("remove5")) {
	 blastTable[0][4] = "null";
 	printArray(blastTable);
 }

 if(s.equalsIgnoreCase("move1")) {
	
	
	 blastTable[1][a] = blastTable[0][0];
	 blastTable[0][0]="null";
 	printArray(blastTable);
	 
	    }
 if(s.equalsIgnoreCase("move2")) {
	 blastTable[2][b] = blastTable[0][1];
	 blastTable[0][1]="null";
 	printArray(blastTable);
	    }
 if(s.equalsIgnoreCase("move3")) {
	 blastTable[3][c] = blastTable[0][2];
	 blastTable[0][2]="null";
 	printArray(blastTable);
	    }
 if(s.equalsIgnoreCase("move4")) {
	 blastTable[4][2] = blastTable[0][3];
	 blastTable[0][3]="null";
	 
 	printArray(blastTable);
	    }
 if(s.equalsIgnoreCase(s.substring(0) ) && f == 0) {
	 if(blastTable[4][d] != "null") {
	 blastTable[4][d] = s.substring(0);
	 f= f+1;
	 	printArray(blastTable);
	 }
 }
 
 if(s.equalsIgnoreCase(s.substring(0) ) && f >0 ) {
	 if(blastTable[3][e] != "null") {
	 blastTable[3][e] = s.substring(0);
	 	printArray(blastTable);
	 }
 }

 
	 
	
	
}
}
