/*
 * 	�ݺ� ���
 * 		break;		=> �ݺ��� �ߴ�
 * 		continue;	=>	����
 * 
 */
public class ���6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				break;		//	����
			System.out.println("i="+i);
		}
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				continue;	// ������(while==> ���ǽ�)
			System.out.println("i="+i);
		}
	}

}
