package com.zdc.service;

/**
 * Created by ZDC on 2018/5/7.
 */
public interface ServiceB {
    /**
     * 在接口中定义的变量 ，相当于静态常量，他有几个特点
     *   1.不能是空对象,也就是说必须有值 相当于final static ，不能定义这样 Integer a;
     *   2. 接口中的方法相当于 abstract
     */
    String name="zuodengchao";
//    Integer a;
    public String getStrB(String str);
    public  String getSerivceC(String str);
}
