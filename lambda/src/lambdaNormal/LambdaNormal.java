package lambdaNormal;

import java.util.Random;

public class LambdaNormal {
	public static void main(String[] args) {
		Random rand = new Random();
		NormalInter normalInter = (randArr) -> {
//			get rand num
			int result = 0;
			for(int i = 0; i < randArr.length; i++) {
				for(int j = 0; j < randArr.length; j++) {
					int sumResult = randArr[i] + randArr[j];
					if(i == j) {
						continue;
					}
					if(sumResult % 2 == 0) {
						result =  sumResult;
						break;
					}
				}
			}
			return result;
		};
		
		int[] intArr = new int [5];
		for(int i = 0; i < intArr.length; i++) {
			int randTemp = rand.nextInt(1, 30); // rand num
			intArr[i] = randTemp; // 5칸에 5개 랜덤값
		}
		System.out.println(normalInter.getRandomEven(intArr));
	}
}
