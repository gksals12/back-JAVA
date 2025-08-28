package chatting;

// Exception을 상속받으면 try catch를 강제한다 (컴파일러가 검사하기 때문에)
// 강제 종료가 된다

// RuntimeException을 상속받으면 컴파일러가 검사하지 않는다. 즉 강제종료가 되지않는다.
public class BadWordException extends RuntimeException{
	
	public BadWordException() {;}
	public BadWordException(String message) {
		super(message);
	}
}
