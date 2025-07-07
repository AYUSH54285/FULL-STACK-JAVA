//5/6/25
//Exception handling

package com.pack6;
import java.util.Scanner;
public class Start extends OperatingSystem{
	public static void main(String[] args) throws Exception{ //throws Exception used for handle InterruptedException throw by Thread.sleep() 
		Scanner sc = new Scanner(System.in);
		Boot os = new OperatingSystem();
		System.out.println("Please enter your preferred OS to boot");
		String osName = os.osName(sc.nextLine());
		System.out.println(osName + " is starting----");
		Thread.sleep(5000); // exception will stop for 5 second
		System.out.println("-----20%-------");
		Thread.sleep(5000);
		System.out.println("-----50%-------");
		Thread.sleep(5000);
		System.out.println("-----70%-------");
		Thread.sleep(5000);
		System.out.println("-----100% loaded------");
		System.out.println("You can use us os");
		sc.close();
	}
}
