

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String st = in.nextLine().trim();
		
		if(st.isEmpty())
			System.out.println('0');
		else
			System.out.println(st.split(" ").length);
	}

}
