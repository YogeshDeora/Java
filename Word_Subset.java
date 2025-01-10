// You are given two string arrays words1 and words2.

// A string b is a subset of string a if every letter in b occurs in a including multiplicity.

// For example, "wrr" is a subset of "warrior" but is not a subset of "world".
// A string a from words1 is universal if for every string b in words2, b is a subset of a.

// Return an array of all the universal strings in words1. You may return the answer in any order.

 

// Example 1:

// Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
// Output: ["facebook","google","leetcode"]
// Example 2:

// Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["l","e"]
// Output: ["apple","google","leetcode"]
 

// Constraints:

// 1 <= words1.length, words2.length <= 104
// 1 <= words1[i].length, words2[i].length <= 10
// words1[i] and words2[i] consist only of lowercase English letters.
// All the strings of words1 are unique.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word_Subset {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreqB = new int[26];
        for (String b : words2) {
            int[] freqB = countFreq(b);
            for (int i = 0; i < 26; i++) {
                maxFreqB[i] = Math.max(maxFreqB[i], freqB[i]);
            }
        }

        List<String> universalWords = new ArrayList<>();
        for (String a : words1) {
            int[] freqA = countFreq(a);
            if (isSubset(freqA, maxFreqB)) {
                universalWords.add(a);
            }
        }

        return universalWords;
    }

    private int[] countFreq(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    private boolean isSubset(int[] freqA, int[] maxFreqB) {
        for (int i = 0; i < 26; i++) {
            if (freqA[i] < maxFreqB[i]) {
                return false;
            }
        }
        return true;
    }
}