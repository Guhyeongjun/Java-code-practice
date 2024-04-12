package section05;

public class EX05_03 {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "X" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		
	}
}
