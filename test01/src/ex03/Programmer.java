package ex03;

public class Programmer extends Person{
	private boolean notebook;
	private String[] languages;
	
	{
		this.languages = new String[5];
	}
	
	
	public Programmer() {;}
	public Programmer(boolean notebook, String[] languages) {
		this.notebook = notebook;
		this.languages = languages;
	}
	
	public void registerLanguages(String[] languages) {
	    String[] myLangs = this.getLanguages();
	    
	}

	public void showLanguages() {
		for(int i = 0; i < this.getLanguages().length; i++) {
			System.out.println(this.getLanguages()[i]);
		}
	}
	
	public boolean isNotebook() {
		return notebook;
	}
	public void setNotebook(boolean notebook) {
		this.notebook = notebook;
	}
	public String[] getLanguages() {
		return languages;
	}
	public void setLanguages(String[] languages) {
		this.languages = languages;
	}
	
	public static void main(String[] args) {
		Programmer temp = new Programmer();
		String[] ttt = {"1","2","3","4","1"};
		temp.registerLanguages(ttt);
		temp.showLanguages();
	}
}
