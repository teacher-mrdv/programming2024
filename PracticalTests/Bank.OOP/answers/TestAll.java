public class TestAll {
    private static void separator() {
        for(int i = 0; i < 105; i++)
            System.out.print("-");
        System.out.println();
    }
    public static void main(String[] args) {
        separator();
        Savings mySavingsAcc = new Savings("SA-1111", 5000, "pepeperez" );
        System.out.println("Expected output: ClientID: pepeperez | Acct: Savings | Number: SA-1111 | Funds: $5,000.00");
        System.out.println(">>> Your output: " + mySavingsAcc);
        System.out.println();
        System.out.println("Expected output: Withdrawing $5k -> Funds: false -> Deposit $2k -> Funds? true");
        System.out.print(">>> Your output: ");
        System.out.print("Withdrawing $5k -> ");
        mySavingsAcc.withdraw(5000);
        System.out.print("Funds: " + mySavingsAcc.hasFunds() + " -> Deposit $2k");
        mySavingsAcc.deposit(2000);
        System.out.println(" -> Funds? " + mySavingsAcc.hasFunds());
        System.out.println();
        System.out.print("Expected output: ");
        System.out.println("Savings acct. interest rate(%) = 0.05 -> Interest for SA-1111 = $100.0");
        System.out.print(">>> Your output: ");
        System.out.print("Savings acct. interest rate(%) = " + Savings.INTEREST);
        System.out.println(" -> Interest for " + mySavingsAcc.getNumber() + " = $" + mySavingsAcc.calculateInterest());
        System.out.println();
        Savings dodgy = new Savings("SA-1111", 5000000, "pepeperez" );
        Savings yourSavings = new Savings("SA-2222", 15000, "juanpavez" );
        System.out.println("Testing Savings account class equals method");
        System.out.print("Expected output: ");
        System.out.println("mySavingsAcc.equals(dodgy) = true; mySavingsAcc.equals(yourSavings) = false");
        System.out.print(">>> Your output: mySavingsAcc.equals(dodgy) = ");
        System.out.print(mySavingsAcc.equals(dodgy) + "; mySavingsAcc.equals(yourSavings) = ");
        System.out.println(mySavingsAcc.equals(yourSavings));

        separator();
        Current myCurrentAcc = new Current("CA-1234", 3500 );
        System.out.println("Expected output: Acct: Current | Number: CA-1234 | Funds: $3,500.00 | Overdraft penalty fee: $0.00");
        System.out.println(">>> Your output: " + myCurrentAcc);
        System.out.println();
        System.out.println("Overdraft fee: $" + myCurrentAcc.getOverdraftFee() + "  Expected output: $300.0");
        myCurrentAcc.setOverdraftFee(875);
        System.out.println("Overdraft fee: $" + myCurrentAcc.getOverdraftFee() + "  Expected output: $875.0");
        System.out.println();
        System.out.println("Expected output: Withdrawing $5k -> Funds: false -> Overdraft penalty fee: $2,375.00" );
        System.out.print(">>> Your output: ");
        System.out.print("Withdrawing $5k -> "); myCurrentAcc.withdraw(5000);
        System.out.println("Funds: " + myCurrentAcc.hasFunds() + " -> Overdraft penalty fee: " +
                String.format("$%,.2f", myCurrentAcc.getPenaltyFee()));
        Current dos = new Current("CA-5677", 50000);
        Current tres= new Current("CA-5677", 650000);
        System.out.println("\nTesting Current account class equals method");
        System.out.print("Expected output: ");
        System.out.println("dos.equals(tres) = true; myCurrentAcc.equals(dos) = false");
        System.out.print(">>> Your output: dos.equals(tres) = ");
        System.out.print(dos.equals(tres) + "; myCurrentAcc.equals(dos) = ");
        System.out.println(myCurrentAcc.equals(dos));

        separator();

    }
}