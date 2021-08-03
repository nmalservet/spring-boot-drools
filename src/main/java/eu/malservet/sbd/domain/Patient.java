package eu.malservet.sbd.domain;

import java.util.Date;

public class Patient {
	
	private Integer pid;
    private String name;
    private Date birthDate;
    /**
     * age will be computed by rule
     */
    private Integer age;

	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
    
    

}
