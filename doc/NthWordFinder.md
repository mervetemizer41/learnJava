## Find the word at given index within a given sentence in Java

This tutorial consists of 5 parts:

#### 1. Objectives
#### 2. Prerequisites
#### 3. Writing code in Java
#### 4. Compiling your code
#### 5. Running your code


## 1. Objectives

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

As NthWordFinder.java

```
package com.challenge.beginner;


public class NthWordFinder{

	public static String findNthWord(String sentence, int n){
		try{
			String[] sArray = sentence.split(" ");
			return sArray[n-1];
		}
		catch(Exception e){
			return "Invalid sentence or number for nth word finding!";
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
		}
	}	
	
}

```


##### package com.challenge.beginner;

This line describe the name of package which contains the Java code.

##### public class NthWordFinder{

This line specifies the class name which is going to have the code that is needed.

##### public static String findNthWord(String sentence, int n){

This line is a method signature which describes that there is going to be a method which is going to have a job like finding n th word.
Also in this line it is described that this method is going to be static which means that it is working independent of the object of this class's instantaneous state.
That is understood from the signature that this method can be accessed from inside and outside the class because of public access modifier.
And it is going to return an object if everything goes fine and this object's going to be a instance of String class.
Between parantheses, it is understood that the caller or user of this method should provide two arguments, one String instance and an integer primitive value.

##### try{

Before the code piece to work a try scope is opened for this method because if there's going to be an argument failure the user should take a return to be aware of what is going on.

##### String[] sArray = sentence.split(" ");

While sentence is provided as an instance of a String, it can be splitted by using the split method of String class. As split method can be called using an instance, 
sentence, it is understood that split method is not a static method, it is built to facilitate related to instance of the String rather than being independent of its state.

##### return sArray[n-1];

sArray is the result array of the sentence words, thus its n-1 th element is going to be announced as the word at given index, here n.

##### }

When the code that is under the spotlight by try scope, the scope of try should be closed by a curly brace.

##### catch(Exception e){

And when the scope of try closes the probable exception should be catched with a catch scope. 

##### return "Invalid sentence or number for nth word finding!";

The return statement in the catch block is used to inform user about the provided usage mistakes.

##### }

The catch block also should be finished.

##### }

The method block should be finished.

##### }

The class block should be finished.

##### package com.challenge.beginner;

This is package identifier for another class Application.

##### import java.io.IOException;

When using a class out of java.lang package one should write import statements. Because of usage of IOException class in following lines it should be imported.

##### public class Application{
	
THe class name is Application, it should be defined like this.
			
			
##### public static void main(String[] args)throws IOException{

In Application class the main method is added with this line. It is void because it is not going to return a value or an object as a return type.
As it is defined in parantheses it accepts a String array as parameter. Also it can be seen that it is going to throw IOException if something goes wrong with input output operations.


##### String result;

As the aim of this method is to print out the results of other class's jobs, a result String local variable is defined.

##### switch(args[0].charAt(0)){

The switch structure is a facility to do when branching code according to a value. Here that value is first args element's first char.

##### case 'w':

If first args element's first char is 'w' then this case statement runs until it runs into a break statement.
 
##### result = WordReversal.reverseUsingList(args[1]);

In this case we are going to assign the result variable the return value of reverseUsingList method in WordReversal class which takes parameter args[1] and runs according to it.

##### System.out.println(result);

The code prints out the result value with this line.

##### break;

The following cases are not going to be run according to this break statement.

##### case 'n':

If first args element's first char is 'n' then this case statement runs until it runs into a break statement.

##### result = NthWordFinder.findNthWord(args[1], Integer.valueOf(args[2]));

In this case we are going to assign the result variable the return value of findNthWord method in NthWordFinder class which takes parameter args[1] and runs according to it.

##### System.out.println(result);

The code prints out the result value with this line.

##### break;

The code prints out the result value with this line.

##### }

The switch structure should be ended by a curly closing brace.

##### }

The methos scope should be closed by a curly brace.

##### }

The class scope should be closed by a curly brace.

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

