package org.akee.testing.employee_mgnt.controller;

import org.akee.testing.employee_mgnt.dto.EmployeeDto;
import org.akee.testing.employee_mgnt.exception.ResourceNotFoundException;
import org.akee.testing.employee_mgnt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable(value="id") Long id) throws ResourceNotFoundException {
		EmployeeDto dto = employeeService.getEmployee(id);
		return ResponseEntity.ok().body(dto);
	}

}
