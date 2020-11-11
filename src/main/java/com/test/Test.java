package com.test;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.NoOp;

public class Test {

    public static void main(String[] args) throws Exception {
        /*HelloWorld hello = new HelloWorld();
        Enhancer enhancer = new Enhancer();
        //设置代理目标
        enhancer.setSuperclass(hello.getClass());
        //设置单一回调对象，在调用中拦截对目标方法的调用
        enhancer.setCallback(new FixedValue() {
            public Object loadObject() throws Exception {
                // TODO Auto-generated method stub
                return "FixedValue";
            }
        });
        //设置类加载器
        enhancer.setClassLoader(hello.getClass().getClassLoader());

        Object obj = enhancer.create();
        System.out.println(obj);*/


        HelloWorld hello = new HelloWorld();
        Enhancer enhancer = new Enhancer();
        //设置代理目标
        enhancer.setSuperclass(hello.getClass());
        //设置单一回调对象，在调用中拦截对目标方法的调用
        enhancer.setCallback(NoOp.INSTANCE);
        //设置类加载器
        enhancer.setClassLoader(hello.getClass().getClassLoader());

        HelloWorld obj = (HelloWorld)enhancer.create();
        System.out.println(obj.say(true));


    }
}
