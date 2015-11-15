package com.epam.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Yahor local on 11/14/2015.
 */
public class CollectionRunner {

    public static void main(String[] args) {

        long tStartHashSet;
        long tEndHashSet;
        long tDeltaHashSet;
        double elapsedSecondsHashSet;

        long tStartTreeSet;
        long tEndTreeSet;
        long tDeltaTreeSet;
        double elapsedSecondsTreeSet;

        //Hash Set initialization
        HashSet<String> hset = new HashSet<String>();

        tStartHashSet = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            hset.add(String.format("HashSetItem%s", i));
        }
        tEndHashSet = System.currentTimeMillis();
        tDeltaHashSet = tEndHashSet - tStartHashSet;
        elapsedSecondsHashSet = tDeltaHashSet / 1000.0;

        System.out.println("Hash Set content: " + hset);

        //Tree Set initialization
        TreeSet<String> tset = new TreeSet<String>();

        tStartTreeSet = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            tset.add(String.format("TreeSetItem%s", i));
        }
        tEndTreeSet = System.currentTimeMillis();
        tDeltaTreeSet = tEndTreeSet - tStartTreeSet;
        elapsedSecondsTreeSet = tDeltaTreeSet / 1000.0;

        System.out.println("Tree Set content: " + tset);
        System.out.println();

        System.out.println("Elapsed seconds for Hash Set initialization: " + elapsedSecondsHashSet);
        System.out.println("Elapsed seconds for Tree Set initialization: " + elapsedSecondsTreeSet);
        System.out.println();

        //Search for definite Hash Set element
        Iterator<String> itHset = hset.iterator();
        tStartHashSet = System.currentTimeMillis();
        while (itHset.hasNext()) {
            if (itHset.next().equals("HashSetItem9147"))
                System.out.println("Definite Hash Set element was found");
        }
        tEndHashSet = System.currentTimeMillis();
        tDeltaHashSet = tEndHashSet - tStartHashSet;
        elapsedSecondsHashSet = tDeltaHashSet / 1000.0;

        //Search for definite Tree Set element
        Iterator<String> itTset = tset.iterator();
        tStartTreeSet = System.currentTimeMillis();
        while (itTset.hasNext()) {
            if (itTset.next().equals("TreeSetItem9147"))
                System.out.println("Definite Tree Set element was found");
        }
        tEndTreeSet = System.currentTimeMillis();
        tDeltaTreeSet = tEndTreeSet - tStartTreeSet;
        elapsedSecondsTreeSet = tDeltaTreeSet / 1000.0;

        System.out.println();
        System.out.println("Elapsed seconds for Hash Set definite element searching: " + elapsedSecondsHashSet);
        System.out.println("Elapsed seconds for Tree Set definite element searching: " + elapsedSecondsTreeSet);
        System.out.println();

        //Hash Set deletion
        tStartHashSet = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            hset.remove(String.format("HashSetItem%s", i));
        }
        tEndHashSet = System.currentTimeMillis();
        tDeltaHashSet = tEndHashSet - tStartHashSet;
        elapsedSecondsHashSet = tDeltaHashSet / 1000.0;

        //Tree Set deletion
        tStartTreeSet = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            tset.remove(String.format("TreeSetItem%s", i));
        }
        tEndTreeSet = System.currentTimeMillis();
        tDeltaTreeSet = tEndTreeSet - tStartTreeSet;
        elapsedSecondsTreeSet = tDeltaTreeSet / 1000.0;

        System.out.println("Elapsed seconds for Hash Set deletion: " + elapsedSecondsHashSet);
        System.out.println("Elapsed seconds for Tree Set deletion: " + elapsedSecondsTreeSet);

    }

}
