import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class face {
Connection conn2;
Statement st2,st3;
ResultSet rs2,rs3;
Scanner sc = new Scanner(System.in);

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    java.util.Date date = new Date();
    String dt = dateFormat.format(date);

    public face() {
        try {
            conn2 = DriverManager.getConnection("JDBC:mysql://localhost:3306/atm_interface", "root", "AfnanBaig@123");
            st2 = conn2.createStatement();
            st3 = conn2.createStatement();

        } catch (SQLException e) {throw new RuntimeException(e);}

    }
    public void Transaction(int account){
        System.out.println("........Transaction History........");
        try {
            String history = "select * from transaction_table where Account_No = "+account+";";
            rs2 = st2.executeQuery(history);
           // System.out.println("Account_No |"+" Credit     |"+"Debit      |"+" Transaction Date "+" Credited To "+" Debited From ");
            System.out.printf(" %-15s | %-15s | %-15s | %-16s | %-16s | %-16s  |","Account_No","Credit","Debit","Transaction Date","Credited To","Debited From");
            System.out.println("\n.....................................................................................................");
            while (rs2.next()){
//                System.out.println(rs2.getString(1)+"       | "+rs2.getString(2)+"       |"+rs2.getString(3)+"       | " +
//                        ""+rs2.getString(4)+" |    "+rs2.getString(5)+"       | "+   rs2.getString(6));

                String a = rs2.getString(1);
                String b = rs2.getString(2);
                String c = rs2.getString(3);
                String d = rs2.getString(4);
                String e = rs2.getString(5);
                String f = rs2.getString(6);

//

                System.out.printf(" %-15s | %-15s | %-15s | %-16s | %-16s | %-16s  |\n",a,b,c,d,e,f);
            }
        } catch (SQLException e) {throw new RuntimeException(e);}


    }



    public void Withdraw(int account){

        System.out.println("........Withdraw........");
        try {
            rs2 = st2.executeQuery("select User_Name from account where Account_No= "+account+";");
            rs2.next();
            String title = (rs2.getString("User_Name"));
            System.out.println(" User Name: "+title);

            System.out.println("Enter Amount To Withdraw");
            int wt = sc.nextInt();
            st2.executeUpdate("update account set Balance = Balance - "+wt+";");

            String gg = "Insert into transaction_table (Account_No,Debit,Transaction_Date) values ("+account+","+wt+",'"+dt+"');";
            st3.executeUpdate(gg);
            System.out.println("Amount is Withdrawn! Thank You For Using Public Bank");
        } catch (SQLException e) {throw new RuntimeException(e);}

    }
    public void Deposit(int account){

        System.out.println("........Deposit........");
        try {

            rs2 = st2.executeQuery("select User_Name from account where Account_No= "+account+";");
            rs2.next();
            String title = rs2.getString("User_Name");
            System.out.println(" User Name: "+title);

            System.out.println("Enter Amount To Deposit");
            int amt = sc.nextInt();

            st2.executeUpdate("update account set Balance = Balance + "+amt+";");

            String hh = "Insert into transaction_table (Account_No,Credit,Transaction_Date) values ("+account+","+amt+",'"+dt+"');";
            st3.executeUpdate(hh);

            System.out.println("Amount is Deposited! Thank You For Using Public Bank");
        } catch (SQLException e) {throw new RuntimeException(e);}

    }
    public void Transfer(int account){
        System.out.println("........Transfer........");

        System.out.println("Enter Recipient Account No");
        int NumAccount = sc.nextInt();

        try { // here transfer the values and compare them if there account number is correct or not and debit the money in transaction history and subtract the value in account's balance attribute
            rs2 = st2.executeQuery("select User_Name from account where Account_No = "+NumAccount);
            rs2.next();
            String Compare = rs2.getString("User_Name");
//            if (rs2 != null){
                System.out.println("Name of Recipient: "+Compare);

                System.out.println("Enter Transfer Amount");
                int TAmount = sc.nextInt();
                String ii = "insert into transaction_table (Account_No,Debit,Transaction_Date,Credited_To) values("+account+","+TAmount+",'"+dt+"',"+NumAccount+");"; // this side is from the sender who is transferring
                st3.executeUpdate("update account set Balance = Balance - "+TAmount+" where Account_No = "+account+";");
                // money to an account number, and you have to add an attribute as
                st2.executeUpdate(ii);

                String jj = "insert into transaction_table (Account_No,Credit,Transaction_Date,Debited_From) values ("+NumAccount+","+TAmount+",'"+dt+"',"+account+");"; // this amount is saved by the
                st2.executeUpdate(jj);

                System.out.println("Your Amount is transferred! Thank You For Using Public Bank ");
           // }
//            else {
                System.out.println("Incorrect Account No");
//            }

        } catch (SQLException e) {throw new RuntimeException(e);}

    }
    public void Balance(int account){
        try {
            rs3 = st2.executeQuery("select Balance from account where Account_No = "+account+";");
            rs3.next();
            int showAmount  = rs3.getInt("Balance");
            System.out.println("Bank Balance: "+showAmount);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

