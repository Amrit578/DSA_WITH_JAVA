package DSA.OOPS.Encapsulation;

public class TestAccount {
    public static void main(String[] args) {

        Account a1 = new Account();


        a1.setAccount_No(91323456l);
        a1.setEmail("amrit578singh@gmail.com");
        a1.setAmount(40000.34f);
        a1.setName("Amrit Singh");

        System.out.println("The Account no is : " + a1.getAccount_No() + " The Email is : " + a1.getEmail() + " The Amount is : " + a1.getAmount() + " The Name is : " + a1.getName());

    }
}
