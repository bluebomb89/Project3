import java.util.Scanner;

// while
/*
 * 		while :
 * 			�ʱⰪ 		===> 1
 * 			while(���ǽ�)	===> 2	true=>3 , false=>����
 * 			{
 * 				���๮��	===> 3
 * 				������	===> 4 ===>2��
 * 			}
 * 
 * 
 */
public class ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=1;
		while(i<=10)
		{
			System.out.println("i="+i);
			i++;
		}*/
		Scanner scan =new Scanner(System.in);
		int com=(int)(Math.random()*100)+1;
		while(true)
		{
			System.out.print("1~100 ���� �Է�:");
			int user=scan.nextInt();
			if(user<com)
			{
				System.out.println("UP");
				
			}
			else if(user>com)
			{
				System.out.println("DOWN");
			}
			else
			{
				System.out.println("Game OVER");
				break;
				
			}
		}
	}

}
