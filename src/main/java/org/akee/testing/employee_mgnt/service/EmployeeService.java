package org.akee.testing.employee_mgnt.service;

import java.util.List;

import org.akee.testing.employee_mgnt.dto.EmployeeDto;
import org.akee.testing.employee_mgnt.exception.ResourceNotFoundException;

public interface EmployeeService {
	
	List<EmployeeDto> findAll();
	
	EmployeeDto getEmployee(Long id) throws ResourceNotFoundException;

}
