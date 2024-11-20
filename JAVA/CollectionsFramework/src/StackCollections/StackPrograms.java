package StackCollections;

import java.util.Stack;

public class StackPrograms {
    public static void main(String[] args) {
        Stack<String> bookSelf=new Stack<>();
        bookSelf.push("abc");
        bookSelf.push("ghi");
        bookSelf.push("klm");
        bookSelf.push("123");
        bookSelf.push("few");
        bookSelf.push("iuhnh");
        bookSelf.push("yteggtr");


        System.out.println(bookSelf);

//        System.out.println(bookSelf.peek());

//        System.out.println(bookSelf.empty());

//        System.out.println(bookSelf.pop());

//        System.out.println(bookSelf);

//        bookSelf.clear();

//        System.out.println(bookSelf.pop());

        System.out.println( bookSelf.search("few"));

    }

}
