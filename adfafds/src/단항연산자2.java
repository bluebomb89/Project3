// 부정 연산자 ==> ! : 결과값(boolean)  ==> 조건문
public class 단항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean boo= true;
		System.out.println("boo="+boo);
		boo = !boo;
		System.out.println("boo="+boo);
		
		int a = 10; //저장 => 음수표현은 2의 보수 ( +1 )
		a = ~a; // 변경된 값을 다시 저장
		System.out.println("a="+a);
		/*
		 *    10
		 *    0000 0000 0000 1010
		 *    ===================
		 *    1111 1111 1111 0101 => 1의 보수
		 *    +                 1 
		 *    =================== => 2의 보수(-11)
		 *    1111 1111 1111 0110
		 *    ===================
		 *    0000 0000 0000 1001
		 *    +                 1
		 *    ===================
		 *    0000 0000 0000 1010
		 *    
		 *    ~ : 양수 => 음수, 음수 => 양수
		 */
		

	}

}
