/*
 *		���� for
 *		= ����)		  1    2    7
 *				for(�ʱⰪ;���ǽ�;������)	: �ټ�
 *				{		  3    4    6
 *					for(�ʱⰪ;���ǽ�;������)	: ���� ���
 *					{
 *						���๮�� 5 
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
 *					     �ټ� ���� ��ǥ
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
 *			������
 *			  1�� ~	�ټ�( 1~9)
 *			  2��~	������(2~9)
 */
public class ���1 {

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


