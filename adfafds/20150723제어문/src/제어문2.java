import java.util.Scanner;

// while
/*
 * 		while :
 * 			초기값 		===> 1
 * 			while(조건식)	===> 2	true=>3 , false=>종료
 * 			{
 * 				실행문장	===> 3
 * 				증가식	===> 4 ===>2번
 * 			}
 * 
 * 
 */
public class 제어문2 {

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
			System.out.print("1~100 정수 입력:");
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
