package test;

class Solution1 {
	public int[] solution(int[] lottos, int[] win_nums) {
	        	
		int count=0;
		int zeroCount=0;
				for(int i=0; i<win_nums.length; i++) {
					zeroCount=0;
					for(int j=0; j<lottos.length; j++) { 
						if(win_nums[i] == lottos[j]) //구매한 로또번호와 당첨번호의 비교
							count++; // 맞는 갯수 카운트
						if(lottos[j]==0) 
						zeroCount++;
					}
				}
		int[] answer = {};
				if(count==0) {
					switch(zeroCount) {
						case 0 : answer = new int[] {6,6}; break;
						case 1 : answer = new int[] {6,6}; break;
						case 2 : answer = new int[] {5,6}; break;
						case 3 : answer = new int[] {4,6}; break;
						case 4 : answer = new int[] {3,6}; break;
						case 5 : answer = new int[] {2,6}; break;
						case 6 : answer = new int[] {1,6}; break;	
					}
			}else if(count==1) {
					switch(zeroCount) {
						case 0 : answer = new int[] {6,6}; break;
						case 1 : answer = new int[] {5,6}; break;
						case 2 : answer = new int[] {4,6}; break;
						case 3 : answer = new int[] {3,6}; break;
						case 4 : answer = new int[] {2,6}; break;
						case 5 : answer = new int[] {1,6}; break;
					}
			}else if(count==2) {
					switch(zeroCount) {
						case 0 : answer = new int[] {5,5}; break;
						case 1 : answer = new int[] {4,5}; break;
						case 2 : answer = new int[] {3,5}; break;
						case 3 : answer = new int[] {2,5}; break;
						case 4 : answer = new int[] {1,5}; break;

					}
			}else if(count==3) {
					switch(zeroCount) {
						case 0 : answer = new int[] {4,4}; break;
						case 1 : answer = new int[] {3,4}; break;
						case 2 : answer = new int[] {2,4}; break;
						case 3 : answer = new int[] {1,4}; break;

					}
			}else if(count==4) {
					switch(zeroCount) {
						case 0 : answer = new int[] {3,3}; break;
						case 1 : answer = new int[] {2,3}; break;
						case 2 : answer = new int[] {1,3}; break;
					}
			}else if(count==5) {
					switch(zeroCount) {
						case 0 : answer = new int[] {2,2}; break;
						case 1 : answer = new int[] {1,2}; break;
				}
			}else answer = new int[] {1,1};
		   return answer;
	    }
}

public class Solution_Lotto {
	public static void main(String[] args) {
		
		Solution1 s1 = new Solution1();
		
		int [] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		s1.solution(lottos, win_nums);
	}
}