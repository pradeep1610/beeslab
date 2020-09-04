/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Main
{
	static int getmissingno(int a[],int b)
	{
	    int i,s;
	    s=(b+1)*(b+2)/2;
	    for(i=0;i<b;i++)
	    s-=a[i];
	    return s;
	}
	public static void main(String args[])
	{
	    int a[]={1,2,4,6,3,7,8};
	    int miss=getmissingno(a,7);
	    System.out.println(miss);
	}
}