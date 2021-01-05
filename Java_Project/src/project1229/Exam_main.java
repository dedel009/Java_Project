package project1229;

import java.util.Scanner;

public class Exam_main {
	public static void main(String[] args) {
		Exam exam = new Exam();
		input(exam);
		print(exam);
	}

	public static void print(Exam exam) {
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math =  exam.getMath();
		int science = exam.getScience();
		int social = exam.getSocial();
		
		System.out.println("----------------------------------------------------------");
		System.out.println("|           성적 출력                  | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();

		int total = kor + eng + math + science + social;
		double avg = total / 5.0;

		System.out.printf("국어 : %d\n",kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("과학 : %d\n", science);
		System.out.printf("사회 : %d\n", social);
		
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("----------------------------------------------------------");
	}

	public static void input(Exam exam) {
		String subject_array[] = {"국어", "영어", "수학", "과학", "사회"};
		
		System.out.println("----------------------------------------------------------");
		System.out.println("|         성적 입력                    | ");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		
		for(int i = 0; i<subject_array.length; i++) {
			switch(subject_array[i]) {
			case "국어":
				exam.setKor(do_process(subject_array[i]));
				break;
			case "영어":
				exam.setEng(do_process(subject_array[i]));
				break;
			case "수학":
				exam.setMath(do_process(subject_array[i]));
				break;
			case "과학":
				exam.setScience(do_process(subject_array[i]));
				break;
			case "사회":
				exam.setSocial(do_process(subject_array[i]));
				break;
			}
		}
	}
	
	public static int do_process(String str) {
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.printf(str + " : ");
			num = scan.nextInt();
			if (num < 0 || 100 < num)
				System.out.println(str + " 성적은 0~100까지의 범위만 입력해주세요.");
		} while (num < 0 || 100 < num);
	
		System.out.println("----------------------------------------------------------");
	return num;	
	}
}
