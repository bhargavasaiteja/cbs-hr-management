package com.codexbox.employee.hiring;

import com.codexbox.employee.hiring.employeeHiring.controller.EmployeeHiringController;
import com.codexbox.employee.hiring.employeeHiring.models.EmployeeHiringModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeHiringApplication {
	public static EmployeeHiringModel employeeHiringModel;
	public EmployeeHiringApplication(EmployeeHiringModel employeeHiringModel) {
		this.employeeHiringModel = employeeHiringModel;
	}
	public static void main(String[] args) {
		SpringApplication.run(EmployeeHiringApplication.class, args);
		EmployeeHiringController cbs=new EmployeeHiringController(employeeHiringModel);
	}
}
