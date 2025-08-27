package anonymousTask;

public interface Form {
//	메뉴등록
	public void registerMenus(String[] menus);
//	판매 상품을 받아서 판매 메뉴를 보여주는 매서드
	public void showMenus();
//	해당 메뉴를 판매하는 매서드
//	판매중인 메뉴에 있으면 판매완료 없으면 판매 준비중
	public void sell(String menu);
}
