/*
 *		이차 for
 *		= 형식)		  1    2    7
 *				for(초기값;조건식;증가식)	: 줄수
 *				{		  3    4    6
 *					for(초기값;조건식;증가식)	: 실제 출력
 *					{
 *						실행문장 5 
 *					}
 *				}
 *
 *				*
 *				**
 *				***
 *				****
 *
 *				****
 *				***
 *				**
 *				*
 *
 *					*
 *				   **
 *				  ***
 *				 ****
 *
 *				****
 *				 ***	
 *				  **
 *	     		   *
 *
 *				*
 *			   ***
 *			  *****
 *			 *******
 *
 *						i  j  k
 *					     줄수 공백 별표
 *						0  3   1
 *						1  2   3
 *						2  1   5
 *						3  0   7
 *
 *						3=j+i
 *						k=2*i+1
 *
 *			A
 *			AB
 *			ABC
 *			ABCD
 *	
 *			A
 *			BC
 *			DEF
 *			GHIJ
 *			
 *			1###
 *			#2##
 *			##3#
 *			###4
 *
 *			구구단
 *			  1차 ~	줄수( 1~9)
 *			  2차~	구구단(2~9)
 */
public class 제어문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
			
		for(int i=1;i<=4;i++)
		{
			for(int j=0;j<=4-i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int z=0;z<4-i;z++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3-i;j++)
				System.out.print(" ");
			for(int j=0;j<2*i+1;j++)
				System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(char i=0;i<4;i++)
		{
			for(char j=65;j<=65+i;j++)
				System.out.print(j);
			System.out.println();
		}
		
		System.out.println();
		char ch=65;
		for(int i=0;i<4;i++)
		{
			for(char j=0;j<=i;j++)
			{
				System.out.print(ch++);
				
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(j==i)
					System.out.print(j+1);
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
}


