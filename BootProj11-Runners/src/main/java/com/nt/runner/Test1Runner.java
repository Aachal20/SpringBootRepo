package com.nt.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class Test1Runner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//System.out.println("option arg names::"+args.getOptionNames());
		//System.out.println("Non option arg names::"+args.getNonOptionArgs());
		//System.out.println("addrs value::"+args.getOptionNames());
		System.out.println("Non option arg names::"+args.getNonOptionArgs());
		System.out.println(" option arg names and  value ::");
		for(String name:args.getOptionNames()) {
			System.out.println(name+"------>" +args.getOptionValues(name));
		}
	}

}
