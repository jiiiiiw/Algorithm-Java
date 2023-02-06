import java.io.*;

import java.util.Stack;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		int cnt = 0;
		
		int q = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < q; i++) {
			String line = bf.readLine();
			
			for(int j = 0; j < line.length(); j++) {
				char check = line.charAt(j);
				
				if(check == '(') {
					stack.push(check);
				}
				else if(stack.empty()) {
					System.out.println("NO");
					cnt = 1;
					break;
				}
				else {
					stack.pop();
				}
			}
			
			if(cnt == 0) {
				if(stack.empty()) {
					System.out.println("YES");
				}
				else System.out.println("NO");
			}
			cnt = 0;
			stack.clear();
		}
	}
}