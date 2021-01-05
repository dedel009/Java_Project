package project1215;
import java.util.*;


public class Movie_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] movie_title = new String[5];	
		int choice_genre = 0;
		System.out.println("[1]SF [2]액션 [3]전쟁 ");
		choice_genre = sc.nextInt();
		switch(choice_genre) {
		case 1:
			movie_title=sf();
			print(movie_title);
			break;
		case 2:
			movie_title = action();
			print(movie_title);
			break;
		case 3:
			movie_title = war();
			print(movie_title);
			break;
			default:
				System.out.println("잘못입력");
				break;
		}
	}

	
	public static String[] sf() {
		String title[] = {"킹킹킹", "쿵쿵쿵", "쿵쿵쿵", "쿵쿵쿵", "쿵쿵쿵"};
		return title;
	}
	public static String[] action() {
		String title[] = {"1232", "1323", "1423", "1523", "6123"};
		return title;
		
	}
	public static String[] war() {
		String title[] = {"킹456", "4645", "456", "쿵456쿵", "456쿵"};
		return title;
	}
	public static void print(String[] title) {
		for(String s : title) {
			System.out.println("영화의 종류는 "+s);
		}
	}
}
