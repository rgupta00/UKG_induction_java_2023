//Design pattern *
//smart use of static concept
//Database connection factory:
class Singleton{
    private static  Singleton singleton=new Singleton();;

    public static Singleton getInstance(){
        return singleton;
    }

    private Singleton(){
        System.out.println("dare to call me");
    }
    public void doWork(){
        System.out.println("doing work...");
    }
}
public class Demo {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton.hashCode());//waht is hashcode?

        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton2.hashCode());//waht is hashcode?

       singleton.doWork();
//        Singleton singleton=new Singleton();
    }
}







