package level1;

public class RemainTo1 {
	public static void main(String[] args) {
		//n에서 1뺀값의 약수중에서 1을 제외하고 가장 작은 수가 x이다
		int answer = 0;
		for(int i = 2; i <= 12; i++) {
			if(11 % i == 0) {
				answer = i;
				break;
			} else {
				continue;
			}
		}
		System.out.println(answer);
	}	
}
