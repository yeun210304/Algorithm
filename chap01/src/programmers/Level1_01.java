package programmers;

public class Level1_01 {
	
	public static void main(String[] args) {
		System.out.println(solution(3, 20, 4));
	}
	
	 public static long solution(int price, long money, int count) {
	        long answer = -1;
	        int total = 0;
	        
	        for(int i=1; i<=count; i++){
	            total += price*i;
	        }
	        
	        answer = (total > money) ? total-money :0;
	        
	        /*
	        if(money > total){
	             answer = 0;
	        } else if(money-total <= 0){
	           answer = total-money;
	        }
	        */
	        return answer;
	   }
}
