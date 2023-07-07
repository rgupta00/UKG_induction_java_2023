package a.b;
//default class is package private
public class A {

    private  int i=8;
    public   int j=88;
    protected   int k=888;
      int l=8888;


    private void fooPrivate(){
        System.out.println("foo fooPrivate method");
    }

    //protected vs default
    void fooDefault(){
        System.out.println("foo fooDefault method");
    }
    protected void fooProtected(){
        System.out.println("foo fooProtected method");
    }

    //public is accessbale
    public void fooPublic(){
        System.out.println("foo public method");
    }

}
