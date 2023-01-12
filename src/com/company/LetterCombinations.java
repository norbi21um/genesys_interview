package com.company;

import java.util.ArrayList;
import java.util.List;


public class LetterCombinations {

    private final String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }

        result.add("");
        for (int i = 0; i < digits.length(); i++) {
            int digit = Character.getNumericValue(digits.charAt(i));
            List<String> temp = new ArrayList<>();
            for (String s : result) {
                for (int j = 0; j < map[digit].length(); j++) {
                    temp.add(s + map[digit].charAt(j));
                }
            }
            result = temp;
        }
        insertionSort(result);
        return result;
    }

    /**This would be the soring algorithm I would go with in this case. If you wanted to sort it in descending order you can use
     * the Collections.sort(results, Collections.reverseOrder()).
     You can also use different sorting algorithms like Arrays.sort() or List.sort() depending on the input size and desired performance.**/
//    public void sortResults(List<String> results) {
//        Collections.sort(results);
//    }

    /**... but for the sake of the exercise I implemented a simple insertion sort**/
    public void insertionSort(List<String> results) {
        for (int i = 1; i < results.size(); i++) {
            String key = results.get(i);
            int j = i - 1;
            while (j >= 0 && results.get(j).compareTo(key) > 0) {
                results.set(j + 1, results.get(j));
                j--;
            }
            results.set(j + 1, key);
        }
    }

}
