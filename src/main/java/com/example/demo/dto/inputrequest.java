package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown= true)
public class inputrequest <T>{
	
	

	@JsonProperty(value="userId",required=true)
	
	private String inputuser;
	private String Timezone;
	
	
	private T employe;
}
