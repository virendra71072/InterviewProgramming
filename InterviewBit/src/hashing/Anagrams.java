package hashing;

import java.util.*;
import java.util.stream.Collectors;

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

        Map<String, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            char[] arr = list.get(i).toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            int index = i+1;
            map.computeIfPresent(str,(k,v)->{
                map.get(str).add(index);
                return v;
            });

            map.computeIfAbsent(str,(k)->{
                return Arrays.asList(index).stream().
                        collect(Collectors.toCollection(ArrayList::new));
            });
        }
        return map.values().stream()
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
