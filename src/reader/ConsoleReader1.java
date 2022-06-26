package reader;

import java.io.IOException;

public class ConsoleReader1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String name = System.console().readLine();
		System.out.println("your entered string is: "+name);

	}

}
