package com.hms.te.controller;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.te.dto.EmployeeDTO;
import com.hms.te.dto.LoginDTO;
import com.hms.te.response.SuccessResponse;
import com.hms.te.service.EmployeeService;
import com.hms.te.utils.JwtUtils;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class ApplicationController {

	private final EmployeeService employeeService;
	private final AuthenticationManager authenticationManager;
	private final JwtUtils jwtUtils;

	@PostMapping("/register/employee")
	public ResponseEntity<SuccessResponse> registerEmployee(@RequestBody EmployeeDTO employeeDTO) {
		String employeeID = employeeService.registerEmployee(employeeDTO)
				.orElseThrow(() -> new RuntimeException("employee registration faied...!!"));
		return ResponseEntity.<SuccessResponse>ok().body(SuccessResponse.builder().data(employeeID)
				.message("employee registration successfull...!!").timesStamp(LocalDateTime.now()).build());
	}

	@PostMapping("/login")
	public ResponseEntity<SuccessResponse> login(@RequestBody LoginDTO loginDTO) {
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(loginDTO.getUsername(), loginDTO.getPassword()));
		String token = jwtUtils.generateToken(loginDTO.getUsername());
		return ResponseEntity.<SuccessResponse>ok().body(SuccessResponse.builder().data(token)
				.message("login successful.....!!!!").timesStamp(LocalDateTime.now()).build());
	}

}
