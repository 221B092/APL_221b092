/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    System.out.println("Whiskey :");
		Beverage bev=new Whiskey();
		bev.templateMethod(30);
		System.out.println();
		
		System.out.println("Rum :");
		bev=new Rum();
		bev.templateMethod(30);
		System.out.println();
		
		System.out.println("Beer :");
		bev=new Beer();
		bev.templateMethod(100);
	}
}
