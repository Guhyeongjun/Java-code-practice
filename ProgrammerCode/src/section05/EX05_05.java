package section05;

public class EX05_05 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		// i가 10보다 작을 때까지 반복
		while(i <= 10) {
			sum += i; // sum에 i 값을 누적
			i++; // i가 증가
		}
		
		System.out.println("합 : " + sum);
	}
}
