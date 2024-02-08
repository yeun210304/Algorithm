package baekjoonLevel06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// 1157	단어 공부
public class StudyWords {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		final String[] word = in.next().toUpperCase().split("");
		in.close();
		
		int cnt = 1;
		int max = 0;
		
		String c = "";
		
		HashMap<Integer, ArrayList> map = new HashMap<>();
		
		Arrays.sort(word);
		
		for (int i = 0; i < word.length; i++) {
			ArrayList<String> cArr = new ArrayList<>(); 
					
			if (word[i].equals(word.length == i + 1 ? word[i] : word[i + 1])
				&& word.length != i + 1) {
				cnt++;
			}
			else {
				c = word[i];
				
				ArrayList<String> mapArr = (ArrayList<String>) map.get(cnt);
				
				if (mapArr != null ) {
					for (int j = 0; j < mapArr.size(); j++) {
						cArr.add(mapArr.get(j));
					}
				}
				
				cArr.add(c);
				map.put(cnt, cArr);
				
				cnt = 1;
			}
		}
		
		for (Object key : map.keySet().toArray()) {
			max = Math.max((int) key, max);
		}
		
		ArrayList<String> cArr = map.get(max);
		
		System.out.print(cArr.size() != 1 ? "?" : cArr.get(0));
	}
}
