// ���������
/*
 *  + , - , * , / , %
 *  1) ������ : ����ȯ 
 *            (ĳ��Ʈ ������)  => ���(����) , Ȯ��(�ڵ�)
 *            => ������ �Ǹ� �׻� ū ������������ ����
 *            => int ���� ���������� ����Ǹ� int
 *            => / (����/���� = ����) , 0���� ������ ����
 *               ���� = 100
 *               ���� = 80
 *               ���� = 75
 *               => ��� = (����+����+����)/3.0
 *            => % : ���� ���� �׻� ������ ��ȣ�̴�
 *                   5%2 ==> 1
 *                   -5%2 ==> -1
 *                   -5%-2 ==> -1
 *                   5%-2 ==> 1 
 */
public class ���׿����� {

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
