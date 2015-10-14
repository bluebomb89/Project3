/*
 * 	반복 제어문
 * 		break;		=> 반복문 중단
 * 		continue;	=>	제외
 * 
 */
public class 제어문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				break;		//	종료
			System.out.println("i="+i);
		}
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				continue;	// 증가식(while==> 조건식)
			System.out.println("i="+i);
		}
	}

}
