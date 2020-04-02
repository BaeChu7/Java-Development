import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
//import java.util.stream.IntStream;

/*
�ۼ��� : ������
�ۼ��� : 2020-03-21
��   �� : ���ڿ� ���� K����ŭ ���ӵ� ���� �ִ��� ����
Ư�̻��� : 
*/

public class PowerCompany {
	public static int reduceCapacity(List<Integer> model) {
		int n = (int) Math.ceil(model.size() / 2.0);
		// ���� List �迭 �ٷ� �ߺ�����
		HashSet<Integer> modelset = new HashSet<Integer>(model);
		// �ߺ����ŵ� HashSet �ٽ� List�� ����
		ArrayList<Integer> gener = new ArrayList<Integer>(modelset);

		List<Integer> numarr = new ArrayList<Integer>();

		// String modelstr = sb(model);
		for (int i = 0; i < gener.size(); i++) {
			numarr.add(intnum(model, gener.get(i)));
		}

		// ����Ʈ ���� ��������
		Collections.sort(numarr, Collections.reverseOrder());

		/*
		 * �迭 Integer[] arr = { 4, 23, 12, 16, 91, 59, 73, 28, 33, 41 };
		 * Arrays.sort(arr, Collections.reverseOrder());
		 */

		int a = 0;
		int i = 0;

		for (i = 0; i < numarr.size(); i++) {
			a = a + numarr.get(i);

			if (a >= n) {
				break;
			}
		}
		return i + 1;

	}

	// ���ڿ� ��ġ��

	/*
	 * public static String sb(List<Integer> model) { StringBuilder sb = new
	 * StringBuilder();
	 * 
	 * for (int i = 0 ; i < model.size() ; i++) { sb.append(model.get(i)); }
	 * 
	 * return sb.toString(); }
	 */

	// Ư�� �迭 ���� Ư�� ������ ����
	public static int intnum(List<Integer> a, int b) {
		int cnt = 0;

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == b) {
				cnt++;
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		List<Integer> a = new LinkedList<Integer>();
		/*
		 * a.add(3);a.add(4);a.add(6);a.add(11);a.add(9);a.add(9);a.add(9);a.add(9);
		 * a.add(8);a.add(8);a.add(8);a.add(8);a.add(8);a.add(8);
		 */
		a.add(1);
		a.add(2);
		a.add(6);
		a.add(21);
		a.add(21);
		a.add(21);
		a.add(3);
		a.add(4);
		a.add(5);

		System.out.print(reduceCapacity(a));
	}
}