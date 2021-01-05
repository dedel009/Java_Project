package project1230;

public class Movie_actor extends Movie{

	public void change_actor() {
		super.movie_actor = "아저씨";
	}
	
	public void print() {
		System.out.println("영화 배우: "+super.movie_actor);

	}
}
