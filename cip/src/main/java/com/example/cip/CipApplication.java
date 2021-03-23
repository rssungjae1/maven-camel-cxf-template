package com.example.cip;

import org.apache.camel.spring.Main;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CipApplication {

	public static void main(String[] args) throws Exception {
		Main main = new Main();
		main.setApplicationContextUri("test.xml");
		main.run(args);
	}

}
