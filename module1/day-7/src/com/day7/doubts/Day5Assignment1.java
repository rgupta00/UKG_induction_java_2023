package com.day7.doubts;
import java.io.*;
import java.util.*;

public class Day5Assignment1 {
    public static void main(String[] args) {
        //M 1: code to read the file and give me all tokens into a arrray

        //M 2: that Use HashMap to populate the data

        //M 3: print the data
        Map<String, Integer> wordsWithFreq=new HashMap<>();

        try(BufferedReader br=new BufferedReader(new FileReader(new File("story.txt")))){
            String line=null;
            while ((line=br.readLine())!=null){
               String tokens[]=line.split(" ");
               Integer freq=1;
               for(String token: tokens){
                   token=token.toLowerCase();
                  if(wordsWithFreq.containsKey(token)){
                      freq=wordsWithFreq.get(token);
                          freq++;
                  }
                  wordsWithFreq.put(token, freq);
               }
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }

        //3 print all the element
        wordsWithFreq.forEach((k, v)-> System.out.println(k+ ": "+ v));
    }
}
