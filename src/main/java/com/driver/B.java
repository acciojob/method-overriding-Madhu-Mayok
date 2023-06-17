package com.driver;

public class B extends A{
    public B() {
    }

    @Override
    public String meth() {
        return "Method is overridden in Extendend class B";
    }

    public static void main(String[] args) {
        B obj = new B();
        //System.out.println(obj.meth());
        obj.meth();

    }


}
