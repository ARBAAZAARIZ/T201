package com.arbaaz.CRUD_MYSQL.wrapper;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ResponseWrapper {

    private String message;
    private Object data;
}
//e balagurusamy