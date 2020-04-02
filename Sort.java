import java.util.Arrays;

/*
작성자 : 최희은
작성일 : 2020-03-23
내   용 : 문자열 안의 K개만큼 연속된 문자 최대한 제거
특이사항 : 2020-03-25) 선택정렬 버그 수정
 	    2020-04-02) 삽입정렬 추가
*/

public class Sort {

	/*
	 * 버블정렬 -> (N-1)번 + (N-2)번 .... + 1번 = N(N-1)/2 --> O(N2)
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
	 * 선택정렬 -> (N-1)번 + (N-2)번 .... + 1번 = N(N-1)/2 --> O(N2)
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
	 * 삽입정렬 -> 외부의 로직만 돌만 되기 때문에 최선의 경우엔 O(N), 최악의 경우 한번의 외부로직 당 내부로직이 계속 돌며 shift
	 * 해야하므로 O(N2)
	 */
	public static int[] InsertSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int standard = arr[i];
			int index = i - 1;

			while (index >= 0 && standard < arr[index]) {
				arr[index + 1] = arr[index]; // 교환 대상이면 하나씩 뒤로 밀려나야 하므로
				index--; // 하나씩 앞에 있는 대상과 비교해야 하므로
			}

			arr[index + 1] = standard; // 비교해야 할 대상까지 비교됐으면 현재위치에 기준 값을 삽입
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 3, 4, 6, 1, 8, 0 };

		System.out.println(Arrays.toString(BubbleSort(a))); // Array를 바로 String형으로 변환
		System.out.println(Arrays.toString(SelectSort(a))); // 선택정렬
		System.out.println(Arrays.toString(InsertSort(a))); // 삽입정렬
	}
}
