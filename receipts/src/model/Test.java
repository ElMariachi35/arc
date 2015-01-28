package model;

import javax.persistence.Entity;

@Entity
public class Test extends BaseEntity{
	private String testName;

	public Test() {
	}
	
	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}
}
