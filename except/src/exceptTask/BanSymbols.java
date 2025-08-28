package exceptTask;

public class BanSymbols extends RuntimeException{

	public BanSymbols() {;}
	public BanSymbols(String message) {
		super(message);
	}
}
