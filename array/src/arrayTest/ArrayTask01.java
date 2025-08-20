package arrayTest;

import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
		int[] arr1 = {10,9,8,7,6,5,4,3,2,1};
		String strTemp1 = "";
		for(int i = 0; i < arr1.length; i++) {
			if(i % 2 ==0) {
				strTemp1 += arr1[i];
			}
		}
		System.out.println(strTemp1);
//      1~10까지 배열에 담고 출력
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		String strTemp2 = "";
		for(int i = 0; i < arr2.length; i++) {
			strTemp2 += arr2[i];
		}
		System.out.println(strTemp2);
//      1~100까지 배열에 담은 후 홀수만 출력
		int[] arr3 = new int[100];
		for(int i = 0; i < arr3.length; i++) {
			if((arr3[i] += i) % 2 == 1) {
				System.out.println(arr3[i]);
			}
		}
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
		int[] arr4 = new int[100];
		int total1 = 0;
		for(int i = 0; i < arr4.length; i++) {
			total1 += (arr4[i] + (i+1));
		}
		System.out.println(total1);
//      A~F까지 배열에 담고 출력
		char[] arr5 = {'A','B','C','D','E','F'};
		for(int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
//      A~F까지 중 C제외하고 배열에 담은 후 출력
		for(int i = 0; i < arr5.length; i++) {
			if(arr5[i] == 'C') {
				continue;
			}
			System.out.println(arr5[i]);
		}
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
		Scanner sc = new Scanner(System.in);
		String userMsg1 = "";
		int userInput1 = 0, userInput2 = 0, userInput3 = 0, userInput4 = 0, userInput5 = 0, min = 0, max = 0;
		
		userMsg1 = "5개의 숫자를 입력하세요\n ex) 10 20 30 40 50";
		System.out.println(userMsg1);
		userInput1 = sc.nextInt();		
		userInput2 = sc.nextInt();		
		userInput3 = sc.nextInt();		
		userInput4 = sc.nextInt();		
		userInput5 = sc.nextInt();		
		
		int[] arr6 = {userInput1, userInput2, userInput3, userInput4, userInput5};
		
		for(int i = 0; i < arr6.length; i++) {
			if(arr6[i] < min) {
				min = arr6[i];
			}
			if(arr6[i] > max) {
				max = arr6[i];
			}
		}
		System.out.printf("최대값 : %d\n최소값 : %d",max, min);
		System.out.println();
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		int userInput6 = 0, total2 = 0, avg = 0;
		String userMsg2 = "몇개의 숫자를 입력하시겠습니까?\nex)5";
		System.out.println(userMsg2);
		userInput6 = sc.nextInt();
		
		int[] arr7 = new int[userInput6];
		String userMsg3 = "평균내고 싶은 숫자를 입력하세요\nex)10 10 avg:10";
		System.out.println(userMsg3);
		
		for(int i = 0; i < arr7.length; i++) {
			arr7[i] = sc.nextInt();
			total2 += arr7[i];
		}
		avg = total2 / userInput6;
		System.out.println("평균값 : " + avg);
	}
}
