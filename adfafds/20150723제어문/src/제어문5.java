/*
 * 	do~while
 * 	����)
 * 		�ʱⰪ ==>1
 * 		do
 * 		{
 * 			���๮��===>2
 * 			������===>3
 * 		}while(���ǽ�); ==> 4 (2���̵�)
 * 
 */
public class ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
		System.out.println();
		i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		for(i=1;i<=10;i++){
			System.out.print(i+" ");
		}
	}

}
