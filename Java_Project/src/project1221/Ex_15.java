package project1221;

public class Ex_15 {

    public static void printPay(double basePay, int hours) {
        if(hours>60) {
        	System.out.println("제한 근무시간 초과");
        }else {
        	if(basePay>=8.00) {		
        		if(hours>40) {		//초과 근무수당
        			int over_hours = 0;
        			over_hours = hours-40;
        			System.out.println("$ "+((over_hours*basePay*1.5)+(basePay*(hours-over_hours))));
        		}else {		//기본 근무수당
        			System.out.println("$ "+basePay*hours);
        		}
        		
        	}else {
        		System.out.println("최저시급 불이행");
        	}
        }
    }
    public static void main(String[] args) {
        printPay(7.50, 35);
        printPay(8.20, 47);
        printPay(10.00, 73);
    }

}
