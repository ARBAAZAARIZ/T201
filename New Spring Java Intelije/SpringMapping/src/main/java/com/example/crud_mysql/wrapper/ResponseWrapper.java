package com.example.crud_mysql.wrapper;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ResponseWrapper {
	private String message;
	private Object data;

}
