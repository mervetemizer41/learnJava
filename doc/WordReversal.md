## Reversing the order of words in a given sentence in Java

This tutorial consists of 5 parts:

#### 1. Objectives
#### 2. Prerequisites
#### 3. Writing code in Java
#### 4. Compiling your code
#### 5. Running your code


## 1. Objectives

- Use command-line parameters with "java" command
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



## 3. Writing code in Java

Open your favorite text editor, copy and paste the below code piece:

As WordReversal.java;

```
package com.challenge.beginner;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WordReversal{


	public static String reverseUsingList(String sentence){
		try{
			String[] sArray = sentence.split(" ");
			List<String> listOfStrings = Arrays.asList(sArray);
			Collections.reverse(listOfStrings);
			String reversed = "";
			for(String s : listOfStrings){
				reversed += s;
				reversed += " ";
			}
			return reversed;
		}
		catch(Exception e){
			return "Invalid sentence for WordReversal!";
		}
	}


	

}
```

As Application.java;

```
package com.challenge.beginner;

import java.io.IOException;


public class Application{
	
			
	public static void main(String[] args)throws IOException{
		String result;
		result = WordReversal.reverseUsingList(args[1]);
		System.out.println(result);
		
	}	
	
}

```

Investigate code line by line.



##### `package com.challenge.beginner;`

This line defines the structure of directories where our code file takes place.


##### `public class WordReversal{`

By this line we tell that the class name which encapsulate the methods we need to reverse our word is WordReversal.


##### `public String reverseUsingList(String sentence){`

By this line;
going to be written method's access modifier is described as `public`.
That means you can use this method in any other Java class once you compile it without any restriction. Because Java has security concerns and force the developers by access modifiers to make them build code that meet object oriented concept needs.

Also by this line; 
the method is going to return a `String` as a return value when it stop its running after it will be called. 

Beside this by the line;
it is defined that we are going to use a method and its name is `reverseUsingArrayList`. 
The name of a method is a describer which allows the developers use in another code piece to call to do the job defined in curly brackets.

As one more point by this line:
the necessity is described that a `String` value should be provided when calling this method. The String that is going to be provided is going to be used as having a reference called `sentence`.

##### `String[] sArray = sentence.split(" ");`

This line makes sentence string tokenized into an array of substrings by using a whitespace as a delimeter. The array's name of substrings is going to be `sArray`.

##### `List listOfSrtings = Arrays.asList(sArray);`

The line prepares an object reference `listOfStrings` which is going to belong to java.util.List interface be a `List`. While running the code, after this line `sArray` array's elements are going to take place in `listOfStrings` collection. The Arrays class is going to use with its method `asList` at this line to the tokenization.

##### `Collections.reverse(listOfStrings);`

As a collection and also as a `List`, the `listOfStrings` object has the capability of being reversed by a single method call of the method `reverse`.


##### `String reversed = "";`

Define reference to return the reversed result.


##### `for(String s : listOfStrings){`

Here is the `for` loop with an 'iteration' which is going to be cycled by the elements of `listOfStrings` list. By the `s` reference, on a single cycle, the code between curly braces or in other words within the 'scope' of the for loop, the single element is going to be dealt with. 

##### `reversed += s + " ";`

Update `reversed` reference's value on each cycle with word `s`.


##### `}`

Declare the end of for loop scope. It is required to notice that the reference `s` won't going to be valid after the closing curly brackets. The scope concept can be thought that you do not have a legal identity card when you leave your country that you were born in it. There is no passport for references and objects, thus the `s` reference defined on iteration line of for loop can not be used after running continues.

##### `return reversed;`

Return to the line of calling wherever it was.

##### `}`

Declare the end of `reverseUsingArrayList` method's scope. To make it more comprehensible, let's repeat the identity card concept. After this curly bracket, the `sentence`, `sArray`, `listOfStrings` and `reversed` references can not be accessed or used any more.

##### `}`

Declare the end of `WordReversal` class scope. One more time encountering with curly bracket finishes the WordReversal class. Thus, reminding that `public` access modifier of the method within this class allows developer to use the `reverseUsingArrayList` method wherever required. 

After copying and pasting the first code piece containing WordReversal class, save it as 

> WordReversal.java

Also, after copying and pasting the second code piece with Application class, save it as 

> Application.java 

and notice the file names are crucial because our Java class in the code has this name. By saving your file please remind the place you save it in. Say, you save the file in the directory

> /home/<your name>/Documents/learningJava/

This piece of information will be needed in next step.

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
