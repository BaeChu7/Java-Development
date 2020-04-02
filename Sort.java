import java.util.Arrays;

/*
�ۼ��� : ������
�ۼ��� : 2020-03-23
��   �� : ���ڿ� ���� K����ŭ ���ӵ� ���� �ִ��� ����
Ư�̻��� : 2020-03-25) �������� ���� ����
 	    2020-04-02) �������� �߰�
*/

public class Sort {

	/*
	 * �������� -> (N-1)�� + (N-2)�� .... + 1�� = N(N-1)/2 --> O(N2)
	 */
	public static int[] BubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	/*
	 * �������� -> (N-1)�� + (N-2)�� .... + 1�� = N(N-1)/2 --> O(N2)
	 */
	public static int[] SelectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	/*
	 * �������� -> �ܺ��� ������ ���� �Ǳ� ������ �ּ��� ��쿣 O(N), �־��� ��� �ѹ��� �ܺη��� �� ���η����� ��� ���� shift
	 * �ؾ��ϹǷ� O(N2)
	 */
	public static int[] InsertSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int standard = arr[i];
			int index = i - 1;

			while (index >= 0 && standard < arr[index]) {
				arr[index + 1] = arr[index]; // ��ȯ ����̸� �ϳ��� �ڷ� �з����� �ϹǷ�
				index--; // �ϳ��� �տ� �ִ� ���� ���ؾ� �ϹǷ�
			}

			arr[index + 1] = standard; // ���ؾ� �� ������ �񱳵����� ������ġ�� ���� ���� ����
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 3, 4, 6, 1, 8, 0 };

		System.out.println(Arrays.toString(BubbleSort(a))); // Array�� �ٷ� String������ ��ȯ
		System.out.println(Arrays.toString(SelectSort(a))); // ��������
		System.out.println(Arrays.toString(InsertSort(a))); // ��������
	}
}
