
//5/6/25
//Exception handling

package com.pack6;

public class OperatingSystem extends Boot{
	OperatingSystem() {
		System.out.println("select your prefered OS");
	}
	@Override
	String osName(String name) {
		return name;
	}
}
