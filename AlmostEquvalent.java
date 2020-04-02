import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
 �ۼ��� : ������
 �ۼ��� : 2020-03-21
 ��   �� : ������ ���ڿ��� �� 2���� �迭�� ���� ���� ������ ���� ���̰� 3�� �̻��̸� NO
       , �׷��� ������ YES ���
 Ư�̻��� : 
*/
public class AlmostEquvalent {
	// 100��
	public static List<String> areAlmostEquivalent(List<String> s, List<String> t) {
		List<String> yesorno = new LinkedList<>();

		for (int i = 0; i < s.size(); i++) {
			String[] arr = distinctstring(s.get(i).toString() + t.get(i).toString());
			List<Integer> difference = new LinkedList<Integer>();

			for (int j = 0; j < arr.length; j++) {
				int sCount = charcnt(s.get(i).toString(), arr[j].toString());
				int tCount = charcnt(t.get(i).toString(), arr[j].toString());

				difference.add(Math.abs(sCount - tCount));
			}

			int DifferCnt = Collections.max(difference);

			if (DifferCnt < 3) {
				yesorno.add("YES");
			} else {
				yesorno.add("NO");
			}
		}

		return yesorno;
	}

	// ���ڿ� �ȿ� ������ ���� ���� �� �迭�� return
	public static String[] distinctstring(String distinctLst) {

		char[] chars = distinctLst.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();

		for (char c : chars) {
			charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();

		for (Character character : charSet) {
			sb.append(character);
		}

		String[] disLst = sb.toString().split("");

		return disLst;
	}

	// ���ڿ� �ȿ� Ư�� ���� ����
	public static int charcnt(String a, String b) {
		int cnt = 0;
		int index = -1;
		while ((index = a.indexOf(b, index + 1)) >= 0) {
			cnt++;
		}

		return cnt;
	}

	public static void main(String[] args) {
		// StringUtils.countOccurrencesOf!!! �ش� ���� ���� -> ���� Apache �ʿ�
		// System.out.print(distinctstring("aabaab"));
		// System.out.print(charcnt("aabaab", "f"));
		List<String> a = new LinkedList<String>();
		List<String> b = new LinkedList<String>();
		a.add("aabaab");
		a.add("aaabb");
		b.add("bbabbc");
		b.add("abb");
		System.out.print(areAlmostEquivalent(a, b));
	}
}