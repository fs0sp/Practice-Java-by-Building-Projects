import java.util.Scanner;

 class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private String email;
    private int defaultPasswordLength = 4;
    private String companySuffix = "apple.com";


    Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        

        // call a method that generate random PASSWORD

        //this.password = randomPassword(defaultPasswordLength);
        

        // COMBINE elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"  + department + "." + companySuffix;
        
    }

    // ASK FOR THE DEPARTMENT

    private String setDepartment() { 
        System.out.println("Enter the Department\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none");

        Scanner in = new Scanner(System.in);
        int depChoice =  in.nextInt();

        // make a string to return the values to it.

        String ch = "";

        if(depChoice == 1) {
            ch = "sales";
        }

         if(depChoice == 2) {
            ch =  "Developemnt";
        }

         if(depChoice ==3) {
            ch = "Accounting";
        }

         if(depChoice == 0) {
            ch = "none";
        }

        //in.close();
        return ch;
    }


    // GENERATE A RANDOM PASSWORD

    private String randomPassword(int length) {
        int i;
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(i=0;i<length;i++) {
            int rand = (int) (Math.random() + passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    // SET the mailbox capacity

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // SET THE ALTERNATIVE EMAIL 

    public void setAlternativeEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // CHANGE THE PASSWORD

    public void changePassword(String password) {
        this.password = password;
    }

    // GET METHODS 

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME  :" + firstName + " " + lastName +
                "\nCompany Email :  " + email + "\nMAILBOX CAPACITY : " + " " +
                mailboxCapacity + "mb";
    }

}

public class EmailApplication {

    public static void main(String args[]) {
        Email em1 = new Email("John","Doe");

        System.out.println(em1.showInfo());
        
    }

}

















