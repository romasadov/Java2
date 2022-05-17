package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {

    public static void main(String[] args) {
        Task();
        task2();


    }


    public static void Task() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Elephant", "Dog", "Cat",
                "Snake", "Dog" , "Wind" ,
                "Person", "Light","Street",
                "Bird","Bread", "Cat",
                "Bike","Snake","Wind"
        };
        for (int i = 0; i< words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
        }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("acrov", "8554323321");
        directory.add("acrov", "8766855326");
        directory.add("suhov", "8846455552");
        directory.add("suhov", "8913455672");
        directory.add("klepnev", "899999999");
        directory.add("klepnev", "899111111");
        directory.add("suhov", "89923231999");
        directory.add("bogun", "8888123113");
        directory.add("acrov", "8324325234");

        System.out.println(directory.get("acrov"));
        System.out.println(directory.get("suhov"));
        System.out.println(directory.get("klepnev"));
        System.out.println(directory.get("bogun"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }


    }



