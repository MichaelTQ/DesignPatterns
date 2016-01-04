package tests.random;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "1 a sepoi3";
		StringTokenizer st = new StringTokenizer( str );
		
		System.out.println("StringTokenizer testing");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String[] strArr = str.split("a");
		
		System.out.println("\nString .split() testing");
		for(String s: strArr) {
			System.out.println(s);
		}
	}
}
