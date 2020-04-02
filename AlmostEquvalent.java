import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/*
 작성자 : 최희은
 작성일 : 2020-03-21
 내   용 : 각각의 문자열이 든 2개의 배열이 서로 같은 문자의 갯수 차이가 3개 이상이면 NO
       , 그렇지 않으면 YES 출력
 특이사항 : 
*/
public class AlmostEquvalent {
	// 100점
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

	// 문자열 안에 동일한 문자 제거 후 배열로 return
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

	// 문자열 안에 특정 문자 갯수
	public static int charcnt(String a, String b) {
		int cnt = 0;
		int index = -1;
		while ((index = a.indexOf(b, index + 1)) >= 0) {
			cnt++;
		}

		return cnt;
	}

	public static void main(String[] args) {
		// StringUtils.countOccurrencesOf!!! 해당 문자 갯수 -> 따로 Apache 필요
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