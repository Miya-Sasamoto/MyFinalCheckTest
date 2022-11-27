package com.domain.model;

import javax.validation.constraints.NotBlank;

import lombok.Data;


@Data
public class MMyTodoList {
	
	private Integer id;
	@NotBlank
	private String title;
	private boolean doneFlg;
}
