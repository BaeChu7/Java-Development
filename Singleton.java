/*
�ۼ��� : ������
�ۼ��� : 2020-03-27
��   �� : ������ ��ƾ)�̱��� ���� ����
Ư�̻��� : �ѹ��� new�� ���� ��ü�� ��𼭵��� ���� �����ϵ��� ����
*/
public class Singleton {
	private static Singleton singleton;
	public static final Singleton get1() { // final Ű���带 �������ν� ��Ƽ������ ȯ�濡�� ���� ��ü�� �������� �ʰ� ���� ����
		if (singleton == null) {
			singleton = new Singleton();
			return singleton;
		}
		else
		{
			return singleton;
		}
	}
}
