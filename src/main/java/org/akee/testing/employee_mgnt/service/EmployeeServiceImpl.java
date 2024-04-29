package org.akee.testing.employee_mgnt.service;

import java.util.List;
import java.util.stream.Collectors;

import org.akee.testing.employee_mgnt.dto.EmployeeDto;
import org.akee.testing.employee_mgnt.entity.Employee;
import org.akee.testing.employee_mgnt.exception.ResourceNotFoundException;
import org.akee.testing.employee_mgnt.repository.EmployeeRepository;
import org.akee.testing.employee_mgnt.util.CommonUtil;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private ModelMapper mapper;

	@Override
	public List<EmployeeDto> findAll() {
		List<Employee> entityList = employeeRepo.findAll();
		if (CommonUtil.checkList(entityList)) {
			return entityList.stream().map(emp -> mapper.map(emp, EmployeeDto.class)).collect(Collectors.toList());
		}
		return null;
	}

	@Override
	public EmployeeDto getEmployee(Long id) throws ResourceNotFoundException {
		Employee entity = employeeRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id : " + id));
		return mapper.map(entity, EmployeeDto.class);
	}

}
