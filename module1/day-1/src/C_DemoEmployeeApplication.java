//Employee application
//id name salary... and i need to auto gen employee id
class Foo{
    private int id;

    public Foo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Employee{
     private int id;

    private String name;//instance variable each object have sepreate copy

    private double salary;

    private static int counter=0;//class vairable / static variable => it store with meta data of the class , only one copy per class

    //A STATIC METHOD DONT HAVE "this" reference !!!



    public  Employee(String name, double salary){
       // this();
       this.id=++counter;
       this.salary=salary;
       this.name=name;
    }

    public void print(){
        System.out.println("id : "+ id);
        System.out.println("name : "+ name);
        System.out.println("salary : "+ salary);

    }



//
//    public void foo(){
//        foo();
//    }

//    public Employee(){
//       //i call call one ctr from another => constructor chaining
//        this(1,"foo",10_0000);
//    }

    //static method vs normal method
    public static  void foo2(){

//        Foo f=new Foo(33);
//        System.out.println(f.getId());
        System.out.println();

        //System.out.println(this.id);
        System.out.println(counter);
        System.out.println("it is a static method ...");
    }
    public void foo(){
        System.out.println(this.id);//this is a implict referece
        System.out.println("it is a normal method ...");
    }
}


public class C_DemoEmployeeApplication {
    public static void main(String[] args) {

        Employee e1=new Employee("raj",78000);//default ctr => java provide u
        e1.print();
        e1.foo2();

        Employee e2=new Employee("ravi",77000);//default ctr => java provide u
        e2.print();

    }
}
