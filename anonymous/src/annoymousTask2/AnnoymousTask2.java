package annoymousTask2;

public class AnnoymousTask2 {
	public static void main(String[] args) {
		MyInter myinter = new MyInter() {
			
			@Override
			public void getString(String str) {
			    for(int i = 0; i < str.length(); i++) {
			        char tempChar = str.charAt(i);
			        if(tempChar == 'C') {
			            System.out.print('E');
			        } else {
			            System.out.print(tempChar);
			        }
			    }
			    System.out.println();
			}

			@Override
			public String changeLetterCase(String str) {
			    int ascii = 0;
			    String temp = "";
			    for(int i = 0; i < str.length(); i++) {
			        ascii = str.charAt(i);
			        if(ascii >= 65 && ascii <= 90) {
			            ascii += 32; 
			            temp += (char)ascii;
			        } else if(ascii >= 97 && ascii <= 122) {
			            ascii -= 32; 
			            temp += (char)ascii;
			        }
			    }
			    return temp;
			}
		};
		myinter.getString("ABCD");
		System.out.println(myinter.changeLetterCase("Aa"));
	}
}
