public class Launch {
    public static void main(String[] args){
        /*
        Child c = new Child();
        System.out.println(c.a);
        Parent p = c;
        System.out.println(p.a);

         */
        /*
        System.out.println(Child.a);
        System.out.println(Parent.a);

         */
        Parent p = new Child();
        p.print();
    }
}
