/*

Write a program to check whether the user is an authorized user or not. Create a class Login with the private attributes userName and password,write a method boolean validate() in the Login class, this method should check whether the given username is john and the password is 123abc in that case return true else return false. Print "Valid user" or "Invalid user" based on the value returned from validate method.
Note: Write a constructor in the Login to set username and password. Include appropriate getter method

Sample Input 1:
Enter the username:
john
Enter the password:
123abc

Sample Output 1:
Valid user

*/

import java.util.*;

public class Login{
    private String password;
    private String userName;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name:");
        String name = sc.nextLine();
        System.out.println("Enter the password:");
        String pass = sc.nextLine();
        Login login = new Login(name,pass);
        if(login.validate())
            System.out.println("Valid user");
        else
            System.out.println("Invalid user");
    }    
    public Login(String name,String pass){
        setUserName(name);
        setPassword(pass);
    }
    public void setUserName(String name){
        this.userName=name;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public boolean validate(){
        String value=getUserName()+" "+getPassword();
        if(value.equals("john 123abc"))
           return true;
        else
           return false;
    }
}