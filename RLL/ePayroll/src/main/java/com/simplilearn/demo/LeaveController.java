package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class LeaveController {
	
	@Autowired
	private LeaveService service;
	
	@PostMapping("/leave")
	public Leaves applyLeave(@RequestBody Leaves leave) {
		return service.applyLeave(leave);
	}
	
	@GetMapping("/leave")
	public List<Leaves> getAllLeave() {
		return service.getAllLeave();
	}
	
	@GetMapping("/leave/{employeeid}")
	public Leaves getLeaveByEmployeeid(@PathVariable String employeeid){
		return service.getLeaveByEmployeeid(employeeid);
	}
	
	@PutMapping("/leave/{employeeid}")
	public Leaves updateLeave(@RequestBody Leaves leave,@PathVariable String employeeid) {
		return service.updateLeave(employeeid, leave);
	}
	
	@DeleteMapping("/leave/{employeeid}")
	public ResponseEntity<Object> deleteUser(@PathVariable  String employeeid ){	
		if(service.deleteLeave(employeeid))
			return new ResponseEntity<Object>("Leave Deleted", HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No Leave Found",HttpStatus.NOT_FOUND);
	}

}
