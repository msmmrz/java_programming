import Controller.InternetC;

import java.util.Scanner;

public class Main {
    /*  first inter username and pass in db...
    username msm  and pass msm created...
    SQL> create table user3 (username varchar2(20) , pass varchar2(20));

    Table created.

    SQL> insert into user3 (username , pass) values ('msm' , 'msm');

1 row created.*/
    public static void main(String[] args) {

        InternetC internetC=new InternetC();
        Scanner input=new Scanner(System.in);
        System.out.println("pls enter your username : ");
        String username=input.next();
        System.out.println("pls enter your pass : ");
        String pass=input.next();
        internetC.check(username,pass);
        internetC.show();
        int i = input.nextInt();
        internetC.buy(i,username,pass);
    }
}
