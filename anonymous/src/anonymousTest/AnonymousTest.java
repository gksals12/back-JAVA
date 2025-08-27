package anonymousTest;

public class AnonymousTest {
	public static void main(String[] args) {
		Study study = new Study() {
			
			@Override
			public String setTopic(String topic) {
				return topic;
			}
		};
		
		study.setTopic("토픽");
	}
}
