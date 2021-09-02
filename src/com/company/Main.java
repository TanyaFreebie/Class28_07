package com.company;

import com.company.HomeAsigment.Bardy.Bardy;
import com.company.HomeAsigment.Person.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        List<Bardy> lotteryBardies = new ArrayList<>();
//
//        lotteryBardies.add(new Bardy(4, "black", 4, false));
//        lotteryBardies.add(new Bardy(4, "red", 4, false));
//        lotteryBardies.add(new Bardy(4, "orange", 2, true));
//        lotteryBardies.add(new Bardy(4, "yellow", 4, false));
//        lotteryBardies.add(new Bardy(4, "blue", 2, true));
//
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("Fred", 34, true, true));
//        personList.add(new Person("Wilma", 20, true, false));
//        personList.add(new Person("Shaggy", 28, false, false));
//        personList.add(new Person("Carly", 29, false, false));
//        personList.add(new Person("Dan", 30, true, false));
//
//
//        for(Person person : personList){
//            List<Bardy> bardiesOwned = new ArrayList<>();
//
//            if(person.isLikeBardy() && person.isHasbardy()){// if person like and have
//                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
//                person.setBardyOwned(bardiesOwned);
//            } else if(person.isLikeBardy() && !person.isHasbardy()){//If person like, but don't have
//                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
//                person.setHasbardy(true);
//                person.setBardyOwned(bardiesOwned);
//            }

//        }
//        for (Person person : personList){
//            if (person.isLikeBardy() && person.isHasbardy()) {
//                System.out.println(person.getName() + " has this " + person.getBardyOwned().get(0).getColor() + " bardy");
//            }
//        }
        //++++QUEUE+++
//        Queue<String> names = new LinkedList<>();
//        Queue<String> people = new LinkedList<>();
//        names.offer("Josh");
//        names.offer("Harry");
//        names.offer("David");
//        names.offer("George");Li
//        System.out.println(names.element());
//        System.out.println(people.peek());
//
//        names.remove();// returns an item from teh front queue
//        names.poll(); // poll method does as the same as remove method, except it doesn't trow am error
//        // when faces with an empty queue
//
        //+++DEQUE+++
//        Deque <String> names = new ArrayDeque<>();
//        names.addFirst("Josh");//offerFirst
//        names.add("Dave");//offer
//        names.addLast("Paul");//offerLast
//        System.out.println(names);

        //+++MAP++++
        // is a collection interface that affords us a key-value pair relationship in a data structure
//        Map<String, String> countries = new TreeMap<>();
//        countries.put("Nigeria", "Abija"); //use put method of the Map interface to add new item in a map
//        countries.put("USA", "Washington");
//        countries.put("China", "Hong Kong");
//        countries.put("Japan", "Tokio");
//
//for(String country : countries.keySet()){
//    System.out.println("The capital of "  +country + " is: " +countries.get(country));
//}
//
//        System.out.println(countries.size());
// TASK 1
        Map <String, String> animalTalk = new HashMap<>();
        animalTalk.put("Cat", "Miau");
        animalTalk.put("Cow", "Moo");
        animalTalk.put("Snake", "Shhh");
        animalTalk.put("Dog", "Wuf");

        for(String animal : animalTalk.keySet()){
            System.out.println(animal + " says '" + animalTalk.get(animal) + "'");
        }

        //Task 2
        Map <String, String> wildBabies = new TreeMap<>();
        wildBabies.put("alligator", "hatchling");
        wildBabies.put("bear","cub");

        for(String animal : wildBabies.keySet()){
            System.out.println(animal + "'s baby is called " + wildBabies.get(animal));
        }


    }


//    public static int getRandomIndex(List<Bardy> objectList){
//        int randomIndex = (int) (Math.random() * 10);//generate random number
//
//        if(randomIndex < objectList.size()) return  randomIndex;
//        else return getRandomIndex(objectList);
//    }
}
