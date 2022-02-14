package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Z1 {

    class ArrayUtil
    {
        public static<T extends Comparable> boolean isSorted(ArrayList<T>tab)
    {
        ArrayList<T>list=new ArrayList<>();
        list.addAll(tab);
        Collections.sort(list);
        boolean wynik=true;
        System.out.println(list);
        System.out.println(tab);
        for(int i=1;i<tab.size();i++)
        {

            if(list.get(i).compareTo(tab.get(i))!=0)
            {
                wynik=false;
            }
        }
        return wynik;
    }
    }
    public static void main(String[] args)
    {
        ArrayList<Integer>ints=new ArrayList<>();
        ints.add(1);
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(5);
        System.out.println(ArrayUtil.isSorted(ints));

        ArrayList<Integer>ints2=new ArrayList<>();
        ints2.add(1);
        ints2.add(1);
        ints2.add(4);
        ints2.add(3);
        ints2.add(5);
        System.out.println(ArrayUtil.isSorted(ints2));

        ArrayList<LocalTime>time=new ArrayList<>();
        time.add(LocalTime.of(15,30));
        time.add(LocalTime.of(15,40));
        time.add(LocalTime.of(15,50));
        time.add(LocalTime.of(15,50));
        System.out.println(ArrayUtil.isSorted(time));

        ArrayList<LocalTime>time2=new ArrayList<>();
        time2.add(LocalTime.of(15,30));
        time2.add(LocalTime.of(14,20));
        time2.add(LocalTime.of(15,50));
        time2.add(LocalTime.of(15,50));
        System.out.println(ArrayUtil.isSorted(time2));

        ArrayList<String>strings=new ArrayList<>();
        strings.add("kot");
        strings.add("kota");
        strings.add("kotb");
        strings.add("kotb");
        System.out.println(ArrayUtil.isSorted(strings));

        ArrayList<String>strings2=new ArrayList<>();
        strings2.add("zkot");
        strings2.add("kota");
        strings2.add("kotb");
        strings2.add("kotb");
        System.out.println(ArrayUtil.isSorted(strings2));
    }
}
