package com.hms.te.exceptionhandle;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import static com.hms.te.constant.EmployeeConstant.EXCEPTIONHANDLE;
import com.hms.te.exception.EmployeeException;
import com.hms.te.response.ErrorResponse;

@RestControllerAdvice
public class EmployeeExceptionHandle {

	@ExceptionHandler(value = EmployeeException.class)
	public ResponseEntity<ErrorResponse> handler(RuntimeException runtimeException) {

		return ResponseEntity.<ErrorResponse>ok()
				.body(ErrorResponse.builder().message(EXCEPTIONHANDLE).timeStamp(LocalDateTime.now()).build());
	}
}
