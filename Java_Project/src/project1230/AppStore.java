package project1230;

public class AppStore extends App{
	
	private String app_name[] = {"카카오톡", "FLO", "유튜브", "카트라이더"};	//다운받을 수 있는 앱들
	
	public String[] getApp_name() {
		return app_name;
	}

	public AppStore() {
		System.out.println("앱스토어 메뉴");		//메뉴
		for(String app_name : app_name) {
			System.out.print(app_name+" ");
		}
		System.out.println();
	}
	
	public void download_AppStore(String app) {		//앱다운로드
		System.out.println(app+" 다운로드 중");
		getApp_data().add(app);
		System.out.println(app+" 다운로드 완료!");
	}
	

}
