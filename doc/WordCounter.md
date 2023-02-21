## Find the word at given index within a given sentence in Java

This tutorial consists of 5 parts:

#### 1. Objectives
#### 2. Prerequisites
#### 3. Writing code in Java
#### 4. Compiling your code
#### 5. Running your code


## 1. Objectives

- Use regex Pattern and Matcher classes in Java
- Use command-line compilation with "javac" command
- Use command-line parameters with "java" command
- Use switch-case flow control structure
- Use a static method from a main method in a seperate class in a seperate file
- Compile and run the code in command-line on a Linux machine



## 2. Prerequisites


As hardware or software;
- A working computer with a Linux distribution on it
- An installed Open JDK or JDK which have version 8 or above
- A text editor


As skills;
- Basic file and directory navigation, generation and saving skill
- Basic skill to use a terminal on Linux machine


## 3. Writing code in java

As WordCounter.java,

```
package com.challenge.beginner;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class WordCounter{

	public static String countWord(String sentence, String word){
		try{
			Pattern p = Pattern.compile("(" + word + ")");
 			Matcher m = p.matcher(sentence);
 			int myMatches = 0;
			while (m.find()) {
    				myMatches++;
			}
			return Integer.toString(myMatches);
 			
		}
		catch(Exception e){
			return "Invalid sentence or word!";
		}
	}
	
	
}
```

As Application.java


```
package com.challenge.beginner;

import java.io.IOException;


public class Application{
	
			
	public static void main(String[] args)throws IOException{
		String result;
		switch(args[0].charAt(0)){
			case 'w':
			result = WordReversal.reverseUsingList(args[1]);
			System.out.println(result);
			break;
			case 'n':
			result = NthWordFinder.findNthWord(args[1], Integer.valueOf(args[2]));
			System.out.println(result);
			break;
			case 'c':
			result = WordCounter.countWord(args[1], args[2]);
			System.out.println(result);
			break;
		}
	}	
	
}

```


##### package com.challenge.beginner;

This is package identifier line.

##### import java.util.regex.Pattern;

Pattern is a Java class to define the pattern on a regex operation.

##### import java.util.regex.Matcher;

Matcher is a java class to define the regex group on a regex operation.

##### public class WordCounter{

The class name might be WordCounter

##### public static String countWord(String sentence, String word){

countWord named method might return a String according to its arguments sentence and word.

##### try{

try scope is going to used to catch any exceptions.

##### Pattern p = Pattern.compile("(" + word + ")");

Pattern class of Java's regex package is used to compile Regexp patterns.

##### Matcher m = p.matcher(sentence);

Matcher class instance is generated using pattern class instance p's matcher method. Here it takes the sentence String as parameter.

##### int myMatches = 0;

myMatches integer primitive is going to use as result while counting matches by the following lines.

##### while (m.find()) {

find method of m instance of Matcher class returns boolean value, true if it can find a match or false if can not find more.

##### myMatches++;

myMatches is counting more and more.

##### }

Closing while scope should be reminded.

##### return Integer.toString(myMatches);

The result of counting operation should be returned.

##### }

Closing method scope should be reminded too.

##### catch(Exception e){

If there is a problem appears within try block, the exception might be caught in catch block and the necessary warning might be take place.


##### return "Invalid sentence or word!";

Invalid sentence or word sentence as a warning might be returned as a String if the method is run into an unexpected behavior.

##### }

Catch block should be closed.

##### }

Method block should be closed.

##### }

Class method should be closed.




## 4. Compiling the code

Now open a terminal window and see the command prompt line like this:

> <your name>@<your computer name>:~$ 

direct to the path 

> /home/<your name>/Documents/learningJava/

by

> cd Documents/learningJava

commands till you have an command prompt line like this:

> <your name>@<your computer name>:~/Documents/learningJava$

Enter the line:

> javac WordReversal.java Application.java

With your favorite file explorer, navigate to the directory 

> /home/<your name>/Documents/learningJava/

see the class file named

> WordReversal.class
> Application.class

Then continue with next steps.

## 5. Running your code

While in terminal you see the command prompt line like below:

> <your name>@<your computer name>:~/Documents/learningJava$

enter below line:

> java Application "Kids compiles flowers!"

and see the result as:

> flowers! compiles Kids

