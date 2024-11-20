package com.arbaaz.SpringMappingDemo.responseWrapper;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmployeeWrapper {
    private String message;
    private Object data;
}
