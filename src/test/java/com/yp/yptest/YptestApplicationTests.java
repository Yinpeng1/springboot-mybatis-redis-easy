package com.yp.yptest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YptestApplicationTests {

//	private static Injector injector;
//	@Inject
//	private ApplicationService myapp;


	@BeforeClass
	public static void init(){
//		injector = Guice.createInjector(new MyAppModule());
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void testMyApp(){
//		ApplicationService myapp = injector.getInstance(ApplicationService.class);
//		myapp.work();
	}

}
