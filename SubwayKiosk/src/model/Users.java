package model;

public class Users {
	
	private String name;
	private int age;
	private String id;
	private String password;
	
	public Users() {}
	
	public Users(String name, int age, String id, String password) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}