package com.company.HW9;

import java.util.*;

public class Main {
private static List generalName = new ArrayList();
private static Set generalMails = new HashSet();
private static Map generalMap = new HashMap();


// public void method1(){                         //
//        List<String> list1 = new ArrayList<>();//
//        Information information;      тоже самое: // public void method1(List<String> list1,Information information)
    public void method1() {
        List<String> list1 = new ArrayList<>();
        Information information;

        InitilizationData initilizationData = new InitilizationData();
        initilizationData.filling();

        int a = 1000;
        int b = 2000;
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
//List:
        list1.add(as);
        list1.add(bs);
        generalName.add(list1);
        generalName.add(initilizationData.information.fakeName);
        initilizationData.information.fakeName.add(list1);


//Set:
        Set<String> set1 = new HashSet<>();
        set1.add("1000@gmail.com");
        set1.add("2000@gmail.com");
        generalMails.add(initilizationData.information.mails);
        if (!initilizationData.information.mails.contains(set1)) {
            generalMails.add(set1);
        } else {
            set1.remove(initilizationData.information.mails.contains(set1));
            generalMails.add(set1);
        }

//Map:
        Map map1 = new HashMap();
        map1.put(list1, set1);
        generalMap.put(list1, set1);
        generalMap.put(initilizationData.information.mails, initilizationData.information.fakeName);


    }


    public static void main(String[] args) {
InitilizationData initilizationData = new InitilizationData();
if(!initilizationData.isCh()) {
    initilizationData.filling();
}

        System.out.println("Size of fakename: "+initilizationData.information.fakeName.size());
       System.out.println("Size os mails: "+initilizationData.information.mails.size());
        System.out.println("Size of map:"+initilizationData.information.map.size());
        System.out.println("---------------------------------------------------------------");
        System.out.println("FakeName:"+initilizationData.information.fakeName);
        System.out.println("Mails:"+initilizationData.information.mails);
        System.out.println("Map::"+initilizationData.information.map);
        System.out.println("---------------------------------------------------------------");
        System.out.println("");

        Main main1 = new Main();
        main1.method1();
        System.out.println(generalName);
        System.out.println(generalMails);
        System.out.println(generalMap);


        }

    }

