// ���� ������ ==> ! : �����(boolean)  ==> ���ǹ�
public class ���׿�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean boo= true;
		System.out.println("boo="+boo);
		boo = !boo;
		System.out.println("boo="+boo);
		
		int a = 10; //���� => ����ǥ���� 2�� ���� ( +1 )
		a = ~a; // ����� ���� �ٽ� ����
		System.out.println("a="+a);
		/*
		 *    10
		 *    0000 0000 0000 1010
		 *    ===================
		 *    1111 1111 1111 0101 => 1�� ����
		 *    +                 1 
		 *    =================== => 2�� ����(-11)
		 *    1111 1111 1111 0110
		 *    ===================
		 *    0000 0000 0000 1001
		 *    +                 1
		 *    ===================
		 *    0000 0000 0000 1010
		 *    
		 *    ~ : ��� => ����, ���� => ���
		 */
		

	}

}
