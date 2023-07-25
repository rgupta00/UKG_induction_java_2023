package com.doubts;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "c")
public class C {
    private B b;
    private A a;

    public C(){
        System.out.println("ctr of class C");
    }
    public C(A a,B b) {
        System.out.println("public C(A a,B b)");
        this.b = b;
        this.a = a;
    }
    public C(B b, A a) {
        System.out.println("public C(B b, A a) ");
        this.b = b;
        this.a = a;
    }

    public void setB(B b) {
        this.b = b;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void printC(){
        System.out.println("a :"+ a.hashCode());
        System.out.println("b :"+ b.hashCode());
    }
}
