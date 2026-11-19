//Constants 
/**
 A constant is an identifier that is similar to variable except that 
 it holds the same value during its entire existence. 
 In Java, we use the 'final'modifier to declare constant
 */

// Escape Sequences
/** 
An escape sequence is a series of characters 
that represents a special character. It is like 
leaving the quote inside of the string message. 
For example: 
"I said \"hello"\ to you"

-------------------------------------

Escape Sequence		Meaning
\b					backspace 
\t 					tab 
\n 					newline
\r 					carriage return 
\" 					double quote
\'					single quote 
\\ 					backslash

 */

package practise_java;

public class Escape {
	
	public static void main(String[] args) {
		System.out.println("These are double quotes \"\""); 
		System.out.println("This is a backslash \\");
		System.out.println("What do you mean \"stinky\""); 
		System.out.println("This file is located at `\\Desktop\\FunnyCatPics");
		System.out.println("This is a tab \t");
		System.out.println("This \n is \n on \n multiple lines"); 
	}

}
