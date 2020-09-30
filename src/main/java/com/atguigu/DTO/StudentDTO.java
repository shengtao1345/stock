package com.atguigu.DTO;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class StudentDTO {

	private Integer tId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime tBirthday;
	
	private String tAddress;
	
	private LocalDateTime tUpdateTime;
	
	 private String tName;

	  
	 private String tSex;

	   
	 private Integer tAge;
	 
	 private LocalDateTime tEntryTime;
	 
	 private Integer tNumber;
	 
	 private Integer tStatus;
}
