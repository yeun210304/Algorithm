package baekjoonLevel03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class QuickAplusB {
	// 15552	빠른 A+B
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(bfr.readLine());
		
		for (int i=0; i<t; i++) {
			String input = bfr.readLine();
			String[] inputArr = input.split(" ");
			
			int sum = Integer.parseInt(inputArr[0]) + Integer.parseInt(inputArr[1]);
			
			bfw.write(sum + "\n");
		}
		
		bfw.flush();
		bfw.close();
	}
}
