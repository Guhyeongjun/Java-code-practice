package level1;

public class XtoN  {
	public static void main(String[] args) {
		class Solution {
		    public long[] solution(int x, int n) {
		        long[] answer = {};
		        answer = new long[n];
		        
		        for(int i = 0; i < n; i++){
		            answer[i] = Long.valueOf(x) * (i+1);
		        }
		        return answer;
		    }
		}
	}
}
