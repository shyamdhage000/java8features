package com.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class UserDTO{
	private int id;
	private String userName;
	private String email;
	
	
	public UserDTO(int id, String userName, String email) {
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	
}

class User{
 
	private int id;
	private String userName;
	private String password;
	private String email;
	
	
	public User(int id, String userName, String password, String email) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
	
}

public class StreamMapExample {

	public static void main(String args[]) {
		List<User>users=new ArrayList<User>();
		users.add(new User(1,"Ram","abc@123","ram@gmail.com"));
		users.add(new User(2,"Sham","abv#34","sham@gmail.com"));
		users.add(new User(3,"shubu","ghfdf@34","shubh@gmail.cmo"));
		users.add(new User(4,"Rahul","erwf@452","rahul@gmail.com"));
		
		//without using lambda expression by using anonimous class
		users.stream().map(new Function<User, UserDTO>() {
			@Override
			public UserDTO apply(User user) {
				return new UserDTO(user.getId(),user.getUserName(),user.getEmail());
			}
		});
		
		//By using lambda expression print directly using foreach
		users.stream().map((User user) ->
						new UserDTO(user.getId(),user.getUserName(),user.getEmail()))
		.forEach((userdto)->{
			System.out.println(userdto);
		});
		
		
		//By using lambda expression store in another object and then print
		List<UserDTO> userDto=		users.stream().map((User user) ->
			new UserDTO(user.getId(),user.getUserName(),user.getEmail())).collect(Collectors.toList());
		
		userDto.forEach(user->System.out.println(user));
		System.out.println(userDto);
				
	}
	
	
}
