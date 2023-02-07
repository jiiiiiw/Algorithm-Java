
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	static int front = 0;
	static int back = 0;
	static int size = 0;
	static int[] deq = new int[10000];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
 
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			String[] op = br.readLine().split(" ");
			
			switch(op[0]) {
			
				case "push_front" : {
					push_front(Integer.parseInt(op[1]));
					break;
				}
				
				case "push_back" : {
					push_back(Integer.parseInt(op[1]));
					break;
				}
				
				case "pop_front" : {
					sb.append(pop_front()).append('\n');
					break;
				}
				
				case "pop_back" : {
					sb.append(pop_back()).append('\n');
					break;
				}
				
				case "size" : {
					sb.append(size()).append('\n');
					break;
				}
				
				case "empty" : {
					sb.append(empty()).append('\n');
					break;
				}
				
				case "front" : {
					sb.append(front()).append('\n');
					break;
				}
				
				case "back" : {
					sb.append(back()).append('\n');
					break;
				}
			}
			
		}
		System.out.println(sb);
	}
	static void push_front(int n) {
		deq[front] = n;
		front = (front - 1 + 10000) % 10000;
		size++;
	}
	
	static void push_back(int n) {
		back = (back + 1) % 10000;
		size++;
		deq[back] = n;
	}
	
	static int pop_front() {
		if (size == 0) {
			return -1;
		} 
		int num = deq[(front + 1) % 10000];
		front = (front + 1) % 10000;
		size--;	
		return num;
	}
	
	static int pop_back() {
		if (size == 0) {
			return -1;
		} 
		int num = deq[back];
		back = (back - 1 + 10000) % 10000;
		size--;
		return num;
	}
	
	static int size() {
		return size;
	}
	
	static int empty() {
		if(size == 0) {
			return 1;
		}
		return 0;
	}
	
	static int front() {
		if(size == 0) {
			return -1;
		}
		return deq[(front + 1) % 10000];
	}
	
	static int back() {
		if(size == 0) {
			return -1;
		}
		return deq[back];
	}
	
}


