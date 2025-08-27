package anonymousTask;

public class Starbucks {
	public static void main(String[] args) {
		Form form = new Form() {

			private String[] menus;

			@Override
			public void showMenus() {
				//메뉴 출력
				for(String menu: this.getMenus()) {
					System.out.println(menu);
				}
			}
			
			@Override
			public void registerMenus(String[] menus) {
				//배열에 입력한대로 메뉴 넣기
				this.setMenus(menus);
			}

			@Override
			public void sell(String menu) {
				for(String m: this.getMenus()) {
					if(menu.equals(m)) {
						System.out.println("판매완료");
					}else {
						System.out.println("판매 준비중");
					}
				}
			}
			
			public String[] getMenus() {
				return menus;
			}

			public void setMenus(String[] menus) {
				this.menus = menus;
			}
		};
		String[] product = {"아아","아바라"};
		form.registerMenus(product);
		form.showMenus();
		form.sell("아바라");
		form.sell("콜라");
	}
}
