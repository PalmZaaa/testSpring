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
public class testSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        testForm formA = (testForm) ctx.getBean("testPrototype");
        formA.setMsg("testsetetsetst");
        System.out.println(formA.getMsg());
        
        testForm formB = (testForm) ctx.getBean("testPrototype");
        System.out.println(formB.getMsg());
    }
    
}
