package project1230;

public class Movie_info extends Movie{

	public void changes() {
		super.movie_name = "스위트홈X";
		super.movie_RunTime = 3;
	}
	
	public void prints() {
		System.out.println("영화 제목: "+super.movie_name);
		System.out.println("영화 시간: "+super.movie_RunTime);
	}
	
}
