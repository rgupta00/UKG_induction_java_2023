package a;

  public class A {
      public static int M=55;

      A(){

     }
     int i=4;//default
    private int j=5;
    public int k=6;
    protected int l=8;

    void fooADefault(){
        System.out.println("fooA of class A : fooADefault");
    }

     protected  void fooAProtected(){
         System.out.println("fooA of class A : fooAProtected");
     }

     public   void fooAPublic(){
         System.out.println("fooA of class A : fooAPublic");
     }
}
