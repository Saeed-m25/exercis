package com.example.exercises1week4.ControllerAdvise;

import com.example.exercises1week4.ApiExeception.ApiExeseption;
import com.example.exercises1week4.ApiResponse.ApiResponse;
import jakarta.validation.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvise {

    @ExceptionHandler(value = ApiExeseption.class)
    public ResponseEntity<ApiResponse> ApiException(ApiExeseption e);
    String message=e.getmessage();
       return ResponseEntity.stotus(400).body(new ApiResponse(message)){

    }
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ApiResponse> ApiExcption(ApiExeseption e);
    String Message=e.getmessage();
       return ResponseEntity.stotus(400).body(new ApiResponse(message)){

    }
    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity<ApiResponse> ConstraintViolationException(ConstraintViolationException e) {
        String msg =e.getMessage();
        return ResponseEntity.status(400).body(new ApiResponse(msg));
    }


    @ExceptionHandler(value = InvalidDataAccessResourceUsageException.class )
    public ResponseEntity<ApiResponse> InvalidDataAccessResourceUsageException(InvalidDataAccessResourceUsageException e){
        String msg=e.getMessage();
        return ResponseEntity.status(200).body(new ApiResponse(msg));
    }
}
