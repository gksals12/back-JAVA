package castingTask3;

public class User {
	private String user;
	
	public User(){;}
	public User(String user) {
		this.user = user;
	}
	
	public void watch(Netflix contents) {
		if(contents instanceof Movie) {
			Movie movie = (Movie)contents;
			movie.service();
		}else if(contents instanceof Animation) {
			Animation animation = (Animation)contents;
			animation.service();
		}else if(contents instanceof Drama) {
			Drama drama = (Drama)contents;
			drama.service();
		}
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
