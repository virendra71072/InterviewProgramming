package hashing;

import java.util.*;
/*
Given an array of strings, return all groups of strings that are anagrams. Represent a group by a list of integers representing the index in the original list. Look at the sample case for clarification.

        Anagram : a word, phrase, or name formed by rearranging the letters of another, such as 'spar', formed from 'rasp'
        Note: All inputs will be in lower-case.
        Example :

        Input : cat dog god tca
        Output : [[1, 4], [2, 3]]*/
public class Anagrams {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> angrams = anagrams(Arrays.asList("cat", "dog", "god", "tac", "make"));
        System.out.println(angrams.toString());
    }

    private static ArrayList<ArrayList<Integer>> anagrams(List<String> list) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            char[] arr = list.get(i).toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            ArrayList<Integer> temp = new ArrayList<>();
            if (map.containsKey(str)) {
                ArrayList<Integer> newList = map.get(str);
                newList.add(i + 1);
                map.put(str, newList);
            } else {
                temp.add(i + 1);
                map.put(str, temp);
            }
        }
        map.forEach((k, v) -> {
            result.add(v);
        });

        return result;
    }
}
