public class Savings extends Account
{
    private String clientID;
    public static final double INTEREST = 0.05; /* annual interest rate */

    public Savings(String number, double funds, String clientID)
    {
        super(number, funds);
        this.clientID = clientID;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public double calculateInterest()
    {
        return this.getFunds() * INTEREST;
    }

    public boolean equals(Savings account)
    {
        return this.getNumber() == account.getNumber() && this.clientID == account.clientID;
    }

    public String toString()
    {
        return "ClientID: " + this.clientID + " | " + super.toString();
    }

}