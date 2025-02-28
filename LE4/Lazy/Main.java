/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

//Problem Design = {only one instance must exist, Lazy problem, Single threaded environment}

public class Main
{
	public static void main(String[] args) {
	    Singleton a = Singleton.getinstance(); // For this the output is "New object created".
		Singleton b = Singleton.getinstance(); // For this these there is no output on the screen.
	}
}