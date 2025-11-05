public class Current extends Account
{
    private double penaltyFee;
    private double overdraftFee;

    public Current(String number, double funds)
    {
        super(number, funds);
        this.penaltyFee = 0;
        this.overdraftFee = 300;
    }

    public double getOverdraftFee()
    {
        return overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public double getPenaltyFee() {
        return this.penaltyFee;
    }

    public void setPenaltyFee() {
        this.penaltyFee = Math.abs(this.getFunds()) + overdraftFee;
    }

    public void withdraw(double money) {
        this.setFunds( this.getFunds() - money);
        if(this.getFunds() < 0) {
            this.setPenaltyFee();
            //this.setFunds(0);
        }
    }

    public double calculateInterest()
    {
        return 0;
    }

    public boolean equals(Current account)
    {
        return this.getNumber() == account.getNumber();
    }

    public String toString()
    {
        return super.toString() + " | Overdraft penalty fee: " + String.format("$%,.2f", this.penaltyFee);
    }



}