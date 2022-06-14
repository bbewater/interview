package com.bewater.cording.interview.javaspring.transaction;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: bewater
 * @Date: Created in 16:10 2022/5/12
 */
public class AppConfig {

    @Transactional
    public void test(){

    }

}
