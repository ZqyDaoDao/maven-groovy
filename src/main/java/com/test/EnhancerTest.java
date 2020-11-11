package com.test;

public class EnhancerTest {
    public static void main(String[] args) throws Exception {
        HelloWorld hello = new HelloWorld();
        ProxyFactory proxy = new ProxyFactory();
        HelloWorld world = (HelloWorld)proxy.createProxy(hello);
        String result = world.say(false);
        System.out.println(result);
    }

}
