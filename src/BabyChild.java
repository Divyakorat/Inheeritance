public class BabyChild extends Child{
    void mul() {
        double ans = a*b;
        System.out.println("multiplication of "  +ans);
    }
    public static void main (String []args){
        BabyChild babyChild = new BabyChild();
        babyChild.sub();
        babyChild.add();
        babyChild.mul();


    }

}
