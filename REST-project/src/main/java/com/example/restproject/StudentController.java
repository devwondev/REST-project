package com.example.restproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@GetMapping("/student")
	public List<Student> students() {
		// Service Layer 메서드의 리턴값
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, 202, "복영수"));
		list.add(new Student(2, 202, "박형민"));
		list.add(new Student(3, 202, "이영호"));
		list.add(new Student(4, 202, "송동일"));
		list.add(new Student(5, 202, "이유림"));
		list.add(new Student(6, 202, "양진선"));
		list.add(new Student(7, 202, "정진우"));
		list.add(new Student(8, 202, "방혜원"));
		list.add(new Student(9, 202, "박혜란"));
		return list;
	}
	
}
