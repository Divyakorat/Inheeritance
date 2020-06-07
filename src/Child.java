public class Child  extends Parent{
    void sub (){
        double ans = a-b;
        System.out.println("subtraction is " +ans);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.sub();
        child.add();



    }

}
