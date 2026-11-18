/* 
 Chapter - 1 
 - First Java Program 
 - Comments 
 - Class Name / Source Code Filename 
 - Braces 
 - system.out.println() 
 */

// System.out.println()
/** to generate output use "System.out.println()"


// Braces 
/** Use braces {}, to group things together


// Class Name / Source Code Filename 
/** All Java programs must be enclosed in a class. The name of the Java 
 * program's file must match the name of the Java program's class.
 * Java is case-sensitive, that means the filename should also start with an 
 * uppercase first letter. 
 */


// Comments

// this single line comment 
/* this comment runs to the terminating symbol, even across line breaks 
/** this is a javadoc comment or you can call it multiple line comment*/


// This is First Java Program

package practise_java;

class Student { 
	String name; 
	int id; 
	Student() {
		name = "Clinton";
		id = 2015;
	}
}

public class Hello_world {
	public static void main (String[] args)
	{
		System.out.println("Hello, world!"); 
		System.out.println(); // prints a blank new line
		
		//SampleMessage 
		Student obj = new Student();
		System.out.println(obj.name);
		System.out.println(obj.id);
	}
} // ends class Hello
 



