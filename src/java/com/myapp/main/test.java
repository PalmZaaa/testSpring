/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.main;

import com.myapp.form.testForm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author PalmZaaa
 */
public class test {
    public static void main(String arg[]){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        testForm form = new testForm();
        form = (testForm) ctx.getBean("test");
        System.out.println(form.getMsg());
    }
}
