package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
//@Component
public class TestRunner  implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Runner to Test::"  +Arrays.toString(args));
		
	}
   
}
