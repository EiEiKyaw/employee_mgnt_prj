package org.akee.testing.employee_mgnt;

import org.akee.testing.employee_mgnt.dto.EmployeeDto;
import org.akee.testing.employee_mgnt.exception.ResourceNotFoundException;
import org.akee.testing.employee_mgnt.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeUT {

	private static Logger LOG = LoggerFactory.getLogger(EmployeeUT.class);

	@Autowired
	private EmployeeService empService;

	@Test
	void test() throws ResourceNotFoundException {
		Long id = 2L;
		EmployeeDto employee = empService.getEmployee(id);
		LOG.info("Id : " + id);
		LOG.info("Info : " + employee.toString());
	}

}
