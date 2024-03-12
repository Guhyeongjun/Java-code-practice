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

		int count = 0;
		
		while(count < 7) {
			// 공을 선택하는 위치(배열의 index)를 랜덤함수로 pick!
			int index = (int)(Math.random() * 45);
			
			//선택된 index 의 값이 0 이 아니면 아직 미사용, 0이면 사용된 위치
			if(lottoMachine[index] != 0) {
				
				if(count < 6) {
					lottoBalls[count++] = lottoMachine[index];
				}else {
					bonusNumber = lottoMachine[index];
					count++;
				}
				
				
				lottoMachine[index] = 0; // 사용했다는 증명!
			}
		}
    }
}