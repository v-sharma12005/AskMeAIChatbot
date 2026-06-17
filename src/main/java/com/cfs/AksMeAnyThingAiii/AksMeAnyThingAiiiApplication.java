package com.cfs.AksMeAnyThingAiii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AksMeAnyThingAiiiApplication {

	public static void main(String[] args) {


        System.out.println(System.getenv("GEMINI_API_KEY"));
        SpringApplication.run(AksMeAnyThingAiiiApplication.class, args);
	}

}
