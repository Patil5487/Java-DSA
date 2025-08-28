import com.sun.jdi.IntegerValue;

import java.util.*;

public class AList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //adding element's in arraylist
        list.add(11);
        list.add(2);
        list.add(13);
        list.add(4);
        list.add(15);

        System.out.println("List Created:");
        System.out.println(list);


        //get element
        int a = list.get(0);
        int b = list.get(1);
        System.out.println("Getting element from Oth index: "+a);
        System.out.println("Getting element from 1st index: "+b);


        //Add element in between
        list.add(0,11);
        list.add(1,12);
        System.out.println("After adding elements from Oth and 1st index: "+list);


        //Set element
        list.set(0,0);
        list.set(1,0);
        System.out.println("After setting elements from Oth and 1st index: "+list);

        //Delete element
        list.remove(0);
        list.remove(0);
        System.out.println("After removing elements from Oth and 1st index: "+list);

        //Size of list
        System.out.println("Size of list: "+list.size());


        //loop
        for(int i=0; i<list.size();i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        //sorting
            Collections.sort(list);
            System.out.println("List after sorting "+(list));

        //Find Maximum and Minimum
        System.out.println("Max :"+ Collections.max(list));
        System.out.println("Min :"+ Collections.min(list));

        //Calculate sum and average
        int sum = 0;
        for(int i=0; i<list.size();i++) {
            sum+=list.get(i);
        }
        System.out.println("Sum of all elements: "+sum);
        System.out.println("Average of all elements: "+sum/list.size());

        //Contains
        System.out.println("Checking 15 is available or not: "+list.contains(15));

        //Removing by value and index
        list.remove(Integer.valueOf(15));
        System.out.println("After removing 15 is available or not: "+list);

        //Reversing
        Collections.reverse(list);
        System.out.println("Reversing :"+list);

        //Counting frequency of and element
        System.out.println("Frequency of 2 is: "+Collections.frequency(list,2));


        //Removing Duplicates from list
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        System.out.println("Before removing Duplicates: "+list);
        Set<Integer> set = new LinkedHashSet<>(list);
        list = new  ArrayList<>(set);
        System.out.println("After removing Duplictes: "+list);

        //Merging two arraylists
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(111,222,333,444));
        System.out.println("List 2: "+list2);
        list.addAll(list2);
        System.out.println("After Merging: "+list);


        //Without sorting find second largest no
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int num: list) {
            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num < largest) {
                secondlargest = num;
            }
        }

            if(secondlargest==Integer.MIN_VALUE){
                System.out.println("Not found");
            }
            else{
                System.out.println("SecondLargest: "+secondlargest);
            }


            //Find all odd and even
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            for(int num: list) {
                if(num%2==0){
                    even.add(num);
                }
                else{
                    odd.add(num);
                }
            }
            System.out.println("Even: "+even);
            System.out.println("Odd: "+odd);

        //Shift all zeroes to the end
        list.add(1,0);
        list.add(2,0);
        System.out.println("After adding 0: "+list);

        Iterator<Integer> iter = list.iterator();
        int cnt = 0;
        while(iter.hasNext()){
            if(iter.next()==0){
                iter.remove();
                cnt++;
            }
        }

        for(int i=0; i<cnt;i++){
            list.add(0);
        }
        System.out.println("After shifting 0: "+list);
    }
}
