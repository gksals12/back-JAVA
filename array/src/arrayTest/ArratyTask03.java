package arrayTest;

public class ArratyTask03 {
	public static void main(String[] args) {
//		1 ~ 20까지 짝수만 배열에 담고 배열안에 값에 모두 3을 더한 값으로 변경 후 출력
//		2, 4, 6, 8, 10, 12, 14, 16, 18, 20
//		이미 값을 알고있기 때문에 int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
//		반복(for)을 돌면서 출력하고 출력하기 전에 값에다가 3 더하기
//		예상 결과 : 5 7 9 11 13 15 117 19 21 23
		
//		int[] arr1 = new int[20];
//		for(int i = 0; i < arr1.length; i++) {
//			int arr1Data = arr1[i] += i + 1;
//			if(arr1Data % 2 == 0) {
//				arr1Data = arr1Data + 3;
//				System.out.println(arr1Data);
//			}
//		}
		
//		int[] arr1 = new int[10];
//		for(int i = 0; i < arr1.length; i++) {
//			arr1[i] = (i + 1) * 2;
//			arr1[i] += 3;
//			System.out.println(arr1[i]);
//		}
		
		int[] arr1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		for(int i = 0; i < arr1.length; i ++) {
			System.out.println(arr1[i] + 3);
		}
		
//      2. 초기값으로 10, 20, 30, 40, 50 값을 넣고 평균을 출력하기
//		10, 20, 30, 40 ,50
//		이미 값을 알고있기 때문에 int[] arr = {10, 20, 30, 40, 50}
//		반복(for)을 돌면서 누적합을 저장하고 마지막에 length()길이로 나누면 평균
//		예상 결과 : 30
		
		int[] arr2 = {10, 20, 30, 40, 50};
		int sum1 = 0, avg = 5;
		for(int i = 0; i < arr2.length; i++) {
			sum1 += arr2[i];
		}
		System.out.println(sum1 / avg);
		
//      3. 1~10까지 배열에 담고 값이 5보다 크다면 값을 2배로 변경해서 출력하기 
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//		이미 값을 알고있기 때문에 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//		반복(for)을 돌면서 5보다 큰지 확인하고 그 값에 * 2
//		예상 결과 : 1 2 3 4 5 12 14 16 18 20
		
		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < arr3.length; i++) {
			if(arr3[i] > 5) {
				arr3[i] *= 2;
			}
			System.out.println(arr3[i]);
		}
		
//      4. 1~10까지 배열에 담고, 모든 값에 *을 붙여서 출력하기 1*2*3*4*...10 
//      단 마지막은 *이 붙지 않는다
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//		이미 값을 알고있기 때문에 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//		반복(for)을 돌면서 값 뒤에 * 추가 10일댄 그냥 출력
//		예상 결과 : 1*2*3*4*5*6*7*8*9*10
		
		int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		for(int i = 0; i < arr4.length; i++) {
			if(arr4[i] != 10) {
				System.out.print(arr4[i] + "*");
			}else {
				System.out.print(arr4[i]);
			}
		}
		System.out.println();
		
//      5. 1~10까지 배열에 담고 들어간 값 중 3의 배수만 모두 더해서 출력하기 
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//		이미 값을 알고있기 때문에 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//		반복(for)을 돌면서 3의 배수인지 확인하고 그 배수들만 누적합 해서 출력
//		예상 결과 : 3 + 6 + 9 = 18
		
		int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int sum2 = 0;
		for(int i = 0; i < arr5.length; i++) {
			if(arr5[i] % 3 == 0) {
				sum2 += arr5[i];
			}
		}
		System.out.println(sum2);
	}
}
