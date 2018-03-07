package com.whut.java;

/**
 * User:  Chunguang Li
 * Date:  2018/3/7
 * Email: 1192126986@foxmail.com
 */

/**
 * 虚拟机栈溢
 * JVM参数：
 * -Xss128k：设置栈容量为128k
 */
public class StackOOM {
    private int stackLength = 1;

    /**
     * 递归调用，方法入栈
     */
    public void stackLeak(){
        stackLength ++ ;
        stackLeak();
    }

    public static void main(String[] args) {
        StackOOM stackOOM = new StackOOM();
        try {
            stackOOM.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length: " + stackOOM.stackLength);
            throw e;
        }
    }

}
