package com.whut.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 堆溢出
 * JVM参数：
 * 1. -Xms20m：设置堆的最小值为20m
 * 2. -Xmx20m：设置堆的最大值为20m
 * 堆最小值和最大值相等，说明堆大小不可拓展
 *
 * 3. -XX:+HeapOutOfMemoryError: 虚拟机出现内存溢出时Dump出堆的快照以便进行分析
 */
public class HeapOOM {
    public static void main(String[] args){
        // 使用objects保持对象实例的引用，避免GC自动回收堆内存
        List<OOMObject> objects = new ArrayList<>();

        while (true){
            OOMObject oomObject = new OOMObject();
            objects.add(oomObject);
        }
    }

}


class OOMObject{

}
