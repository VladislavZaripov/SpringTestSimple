package com.zaripov.test;

import org.junit.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
class TestApplicationTests {

	@BeforeClass
	public void beforeClass(){
		System.out.println("beforeClass");
	}

	@Before
	public void before(){
		System.out.println("before");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}

	@After
	public void after(){
		System.out.println("after");
	}

	@AfterClass
	public void afterClass(){
		System.out.println("afterClass");
	}
}
