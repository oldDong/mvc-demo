package com.dongzj.annotation;

import java.lang.annotation.*;

/**
 *  @project dongzjMVC
 *
 *  @author Dongzj
 *  @Date 2018/3/5
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {

    /**
     * 表示访问该方法的URL
     * @return
     */
    String value() default "";
}
