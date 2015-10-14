// 산술연산자
/*
 *  + , - , * , / , %
 *  1) 주의점 : 형변환 
 *            (캐스트 연산자)  => 축소(강제) , 확대(자동)
 *            => 연산이 되면 항상 큰 데이터형으로 변경
 *            => int 이하 데이터형이 연산되면 int
 *            => / (정수/정수 = 정수) , 0으로 나눌수 없다
 *               국어 = 100
 *               영어 = 80
 *               수학 = 75
 *               => 평균 = (국어+영어+수학)/3.0
 *            => % : 남는 값이 항상 왼쪽편 부호이다
 *                   5%2 ==> 1
 *                   -5%2 ==> -1
 *                   -5%-2 ==> -1
 *                   5%-2 ==> 1 
 */
public class 이항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		byte b1 = 100;
		byte b2 = 127;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);*/
		/*
		 *     227
		 *     128 64 32 0 0 0 1 1
		 *     1 1 1 0 0 0 1 1 
		 *
		 */
		System.out.println(10/3);
		//System.out.println(10/0);
		System.out.println(5%2);//1
		System.out.println(-5%2);//-1
		System.out.println(5%-2);//1
		System.out.println(-5%-2);//-1
		

	}

}
