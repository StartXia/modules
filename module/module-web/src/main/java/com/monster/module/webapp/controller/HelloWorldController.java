package com.monster.module.webapp.controller;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * 
 * @author  xia
 * @version $Id: HelloWorldController.java, v 0.1 2019年3月7日 下午3:08:38 xia Exp $
 */
public class HelloWorldController {
    
    public static void main(String[] args) {
        System.out.println("有些东西");
        System.out.println("qita");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("第二次上传");
        System.out.println("第三次上传");
    }
}
