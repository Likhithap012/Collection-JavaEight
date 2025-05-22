package com.gevernova.javaeightfeatures.streamapi;

import java.util.Arrays;
import java.util.List;

public class LongestString {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("likhitha","Vyshnavi","Manasa","chaitanya");
        String Longeststr=list.stream().filter(x->x.length()>0).sorted((a,b)->b.length()-a.length()).findFirst().orElse("");

        System.out.println(Longeststr);
    }
}
