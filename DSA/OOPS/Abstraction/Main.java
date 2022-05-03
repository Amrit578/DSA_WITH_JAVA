package DSA.OOPS.Abstraction;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(38);
        son.career();
        son.partner();
        Daughter dau = new Daughter(45);
        dau.partner();

        Parent p = new Parent(34) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };
        Parent.hello();
        son.normal();
        System.out.println(p.age);
        System.out.println(son.age);
    }
}
