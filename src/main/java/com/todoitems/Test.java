package com.todoitems;

public class Test {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
        int num=1+(int)(Math.random()*26);
        System.out.println(getString(num));
        }
    }
    private static String getString(int length){
        char[] chars=new char[length];
        for(int i=0;i<length;i++){
            chars[i]=(char)('a'+(int)(Math.random()*26));
        }
        return new String(chars);
    }
}
