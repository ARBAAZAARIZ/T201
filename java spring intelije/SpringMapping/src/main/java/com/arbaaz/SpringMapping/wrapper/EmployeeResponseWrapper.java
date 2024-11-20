package com.arbaaz.SpringMapping.wrapper;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class EmployeeResponseWrapper {

    private Object data;
    private String message;

}
