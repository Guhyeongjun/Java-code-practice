package level1;
class Solution {
	public int solution(int n) {
		int answer = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
			}
		}
		System.out.println(n + " " + answer);
		return answer;
	}
}

public class SumOfDivisors extends Solution  {
	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.solution(12);
	}
}
