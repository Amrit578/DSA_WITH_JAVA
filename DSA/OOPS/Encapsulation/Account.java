package DSA.OOPS.Encapsulation;

public class Account {
    private long Account_No;
    private String name,email;
    private float amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }



    public long getAccount_No()
    {
        return Account_No;
    }
    public void setAccount_No(long Account_no)
    {
        this.Account_No = Account_no;
    }





}
