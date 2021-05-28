package javaLabPrograms.practiceagain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args) {

        //1.Collections.synchronizedList
        List<String> nameslist = Collections.synchronizedList(new ArrayList<String>());
        nameslist.add("java");
        nameslist.add("python");
        nameslist.add("c sharp");
        //to add or remove we don't need to explicit synchronization
        //to fetch or traverse the values from list we have to use explicit synchronization
        synchronized (nameslist) {
            Iterator iterator = nameslist.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next()
                );
            }
        }

        //its already synchronized/thread safe we don't need explicit synchronization for any operation : add, remove, traverse
        CopyOnWriteArrayList<String> copyOnWriteArrayList= new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("len");
        copyOnWriteArrayList.add("steve");
        copyOnWriteArrayList.add("gamer");
        copyOnWriteArrayList.add("gamora");



    }
}
