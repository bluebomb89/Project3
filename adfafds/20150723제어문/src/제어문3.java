import java.util.Scanner;

/*
 * 	==> while : ¦��,Ȧ��
 * 				
 */
public class ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���?");
		int dan=scan.nextInt();
		int i=1;
		while(i<=9)
		{
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			i++;
		}
	}

}
