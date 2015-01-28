package controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Test;
import cdi.Controller;
import dao.TestDao;

@Controller
public class TestController implements Serializable{

	private String test = "TestString";
	
	@Inject
	private TestDao testDao;
	
	@PostConstruct
	public void postConstruct(){
		System.out.println("Post Construct");
	}
	
	@Transactional
	public void save(){
		Test test = new Test();
		test.setTestName("Hallo");
		testDao.create(test);
		System.out.println("saved");
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

}
