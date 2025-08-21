package arrayTest;

import java.util.Scanner;

public class ArrayTask02 {
	public static void main(String[] args) {
//      1. 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
//      입력 예)안녕hI!!
//      출력 예)안녕Hi!!
		
//		input을 받으려면 -> Scanner
//		배열을 활용해서 문제를 풀려면 array사용
//		input을 받았을 때 배열의 크기를 지정해야하기 때문에 input을 받고 input의 길이를 배열의 크기로 할당
//		input을 String으로 받을거기 때문에 글자 하나씩 확인하려면 charAt() 사용
//		charAt으로 문자열의 문자를 확인하려면 그 길이 만큼 반복해야하기 때문에 반복횟수를  ~~~.length()로 조건
//		만든 배열안에는 길이만 할당 되었기 때문에, 배열의 인덱스마다 돌면서 input으로 받은 문자 하나씩 charAt으로 값 넣기
//		배열안에 값을 넣었으면 배열의 인덱스 마다 반복을 돌면서 문자들의 ascii 코드를 비교하여 소문자인지 대문자인지 비교
//		a ~ z -> 97 ~ 122 / A ~ Z -> 65 ~ 90
//		대문자면 소문자로 변경 문자 >= 65 && 문자 <= 90
//		소문자면 대문자로 변경 문자 >= 97 && 문자 <= 122
//		조건을 걸고 조건에 만족한다면 배열의 인덱스에 현재의 값에서 gap, -32 또는 +32를 하여 변경된 값을 다시 담기
		Scanner sc = new Scanner(System.in);
		String userMsg1 = null, userInput1 = null, strTemp1 = "";
		int gap = 32;
		
		userMsg1 = "영어문자를 입력해주세요\nex)appLE -> APPle";
		System.out.println(userMsg1);
		userInput1 = sc.next();
		
		char[] arr1 = new char [userInput1.length()];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = userInput1.charAt(i);
			if (arr1[i] >= 65 && arr1[i] <= 90/* 대문자를소문자로 */) {
				arr1[i] = (char)(arr1[i] + gap);
				strTemp1 += arr1[i];
			} else if (arr1[i] >= 97 && arr1[i] <= 122/* 소문자를 대문자로 */) {
				arr1[i] = (char)(arr1[i] - gap);
				strTemp1 += arr1[i];
			}
		}
		System.out.println(strTemp1);
		
//      2. 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
//		사용자의 input를 받기위해서 Scanner
//		사용자의 input를 문자열로 받고, 하나씩 비교해야하기 때문에 charAt
//		배열을 사용해야하기 때문에 int 배열을 만들고 칸수는 사용자가 입력한 input만큼 할당 ~~length
//		input의 길이 만큼 반복을 돌면서 글자를 확인하면서 숫자로 바꿔야하기 때문에 for
//		input에 charAt으로 값을 가져오면 ascii 코드로 가져오기때2. 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
//		사용자의 input를 받기위해서 Scanner
//		사용자의 input를 문자열로 받고, 하나씩 비교해야하기 때문에 charAt
//		배열을 사용해야하기 때문에 int 배열을 만들고 칸수는 사용자가 입력한 input만큼 할당 ~~length
//		input의 길이 만큼 반복을 돌면서 글자를 확인하면서 숫자로 바꿔야하기 때문에 for
//		input에 charAt으로 값을 가져오면 ascii 코드로 가져오기때문에 -48 를 해야함
//		특정한 값을 어떻게 바꿔야하기 때문에 switch 사용 1일때 "일"		문에 -48 를 해야함
//		특정한 값을 어떻게 바꿔야하기 때문에 switch 사용 1일때 "일"		
		String userMsg2 = null, userInput2 = null, strTemp2 = "";
		
		userMsg2 = "한글로 바꾸고싶은 숫자를 입력하세요\nex)1024->일공이사";
		System.out.println(userMsg2);
		userInput2 = sc.next();
		
		int[] arr2 = new int [userInput2.length()];
		
		for(int i = 0; i < arr2.length; i++) {
			int convertedInt = userInput2.charAt(i) - 48;
			arr2[i] = convertedInt;
			switch(arr2[i]) {
			case 1:
				strTemp2 += "일";
				break;
			case 2:
				strTemp2 += "이";
				break;
			case 3:
				strTemp2 += "삼";
				break;
			case 4:
				strTemp2 += "사";
				break;
			case 5:
				strTemp2 += "오";
				break;
			case 6:
				strTemp2 += "육";
				break;
			case 7:
				strTemp2 += "칠";
				break;
			case 8:
				strTemp2 += "팔";
				break;
			case 9:
				strTemp2 += "구";
				break;
			case 0:
				strTemp2 += "공";
				break;
			default:
				System.out.println("잘못입력하셨습니다");
				break;
			}
		}
		System.out.println(strTemp2);
	}
}
