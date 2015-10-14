/*
 * 	do~while
 * 	형식)
 * 		초기값 ==>1
 * 		do
 * 		{
 * 			실행문장===>2
 * 			증가식===>3
 * 		}while(조건식); ==> 4 (2번이동)
 * 
 */
public class 제어문5 {

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
