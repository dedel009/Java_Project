package project1221;

public class Ex_19 {

    public static int sum(int[] numbers) {
        int sum = 0;
        for(int i : numbers) {
        	sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
        System.out.printf("총합: %d\n", sum(arr));
    }
}
