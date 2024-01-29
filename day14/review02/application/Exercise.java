package application;

public class Exercise {
    public static void main(String[] args) {
        String hello = "         HELLO           ";
        System.out.println(hello.trim());
        System.out.println(hello.replace("E", "3"));
        System.out.println(hello.trim().substring(1, 5));
        String[] helloArray = hello.trim().split(" ");

        for (int i = 0; i < helloArray.length; i++) System.out.println(helloArray[i]); 

       
    }
}
