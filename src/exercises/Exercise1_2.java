package exercises;

import java.io.*;

public class Exercise1_2 {
	public static void main(String[] args) throws IOException {
//		int a = 3;
//		int b = 5;
//		int c = a * b;
//		System.out.println("縦幅3横幅5の長方形の面積は、" + c);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if (x > y) {
			System.out.println("xはyより大きい。");
		}
	}
}
