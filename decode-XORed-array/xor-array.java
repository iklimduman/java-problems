package com.company;

class Solution {
    public int[] decode(int[] encoded, int first)
    {
        int length_encoded = encoded.length ;

        int[] original_array = new int[length_encoded + 1];

        original_array[0] = first ;

        original_array[1] = first ^ encoded[0];

        for(int i=0 ; i<length_encoded + 1 ; i++)
        {
            original_array[i] = original_array[i - 1] ^ encoded[i - 1];
        }

        return original_array ;
    }
}