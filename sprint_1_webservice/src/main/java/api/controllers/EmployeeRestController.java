package api.controllers;

import api.services.IEmployeeService;
import api.services.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/employee")
public class EmployeeRestController {

    @Autowired
    IEmployeeService iEmployeeService;

    @Autowired
    IPositionService iPositionService;

}
