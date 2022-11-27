package com.form;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class MyTodoListForm {

	private Integer id;
	@NotBlank
	private String title;
	private boolean doneFlg;
	
}
