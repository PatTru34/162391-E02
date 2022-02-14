package com.company;

import java.util.ArrayList;

public class Z2 {

    public static<E> void print(Iterable<E>it)
    {
        int i=0;
        ArrayList<E>list=new ArrayList<>();
        for(E e:it)
        {
            list.add(e);
        }
        for(E e:it)
        {
            if(i<list.size()-1)
            {
                System.out.print("["+e+"],");
            }
            else
            {
                System.out.print("["+e+"]");
            }
            i++;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {

        ArrayList<Integer>ints=new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        print(ints);
        ArrayList<String>strings=new ArrayList<>();
        strings.add("Kot");
        strings.add("Kot2");
        strings.add("Kot3");
        print(strings);
        ArrayList<Character>chars=new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        print(chars);
    }
}
