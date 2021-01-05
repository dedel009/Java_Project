package project1230;
import java.util.*;

public class App{
	private ArrayList<String> App_data = new ArrayList<String>() ;

	
	public App() {//기본적으로 깔려있는 앱
		App_data.add("설정");
		App_data.add("날씨");
		App_data.add("앱스토어");
		App_data.add("전화");
	}

	public ArrayList<String> getApp_data() {
		return App_data;
	}

	public void setApp_data(ArrayList<String> app_data) {
		App_data = app_data;
	}

	public void show_App() {	//깔려있는 앱 보기
		for(String s : getApp_data()) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	public void run_App(String app) {		//앱 실행
		try {
			System.out.println(app+" 실행");
			switch(app) {
			case "설정":
				break;
			case "날씨":
				break;
			case "앱스토어":
				download_App();
				break;
			case "전화":
				break;
			}

			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public void download_App() {
		Scanner sc = new Scanner(System.in);
		AppStore as = new AppStore();
		System.out.println("어떤 앱을 다운로드 하시겠습니까?");
		String asApp_name = sc.next();
		as.download_AppStore(asApp_name);
		setApp_data(as.getApp_data());
		show_App();
	}
	
	public void delete_App() {			//앱삭제
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 앱을 삭제하시겠습니까?");
		String app = sc.next();
		App_data.remove(app);
		show_App();
	}
}