package com.speedrun.flooringco;

import com.speedrun.flooringco.controller.Controller;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FlooringcoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("com.speedrun.flooringco");
		appContext.refresh();
		
		Controller controller = appContext.getBean("controller", 
				Controller.class);
		controller.run();
		appContext.close();	
	}

}
