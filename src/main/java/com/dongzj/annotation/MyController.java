package com.dongzj.annotation;

import java.lang.annotation.*;

/**
 *  @project dongzjMVC
 *
 *  @author Dongzj
 *  @Date 2018/3/5
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {

    /**
     * 表示给controller注册别名
     * @return
     */
    String value() default "";
}
