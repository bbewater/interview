package com.bewater.cording.interview.javaspring;

import org.springframework.stereotype.Component;

/**
 * @Author: bewater
 * @Date: Created in 18:20 2022/5/10
 */
@Component
public class AnnotationBeanTest {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
