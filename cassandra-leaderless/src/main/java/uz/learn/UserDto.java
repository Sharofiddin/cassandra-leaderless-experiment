package uz.learn;

import java.time.LocalDateTime;

public class UserDto {

	private String name;
	private LocalDateTime lastUpdated;
	public String getName() {
		return name;
	}
	
	public UserDto() {
	}

	public UserDto(String name, LocalDateTime lastUpdated) {
		super();
		this.name = name;
		this.lastUpdated = lastUpdated;
	}

	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	
}
