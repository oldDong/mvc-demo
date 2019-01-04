package com.dongzj.annotation;

import java.lang.annotation.*;

/**
 *  @project dongzjMVC
 *
 *  @author Dongzj
 *  @Date 2018/3/5
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {

    /**
     * 表示参数的别名，必填
     * @return
     */
    String value();
}
