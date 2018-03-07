package com.whut.java;

import java.util.ArrayList;
import java.util.List;

/**
 * User:  Chunguang Li
 * Date:  2018/3/7
 * Email: 1192126986@foxmail.com
 */

/**
 * 方法区和运行时常量池溢出
 * JVM参数：
 * -XX：PermSize=10m：设置方法区内存为10m
 * -XX:MaxPermSize=10m：设置方法区最大内存为10m
 */
public class RuntimeConstantOOM {
    public static void main(String[] args) {
        // 使用list保持着字符串常量的引用，避免GC自动回收常量池
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
