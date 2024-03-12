import java.util.Scanner;

public class LottoSystem {
	public static void main(String[] args) {
		
		//1 부터 45 번의 공을 모두 가진다.
		int[] lottoMachine = new int[45];
		//선택된 로또번호를 저장할 배열
		int[] lottoBalls = new int[6];
		//보너스번호 저장
		int bonusNumber = 0;
		
		//1 ~ 45개의 공을 생성
		for(int i = 0; i < lottoMachine.length; i++) {
			lottoMachine[i] = i+1;
		}
    }
}