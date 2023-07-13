package com.day6.session1.basics_collections;

import java.util.*;

public class D_MapExample {
    public static void main(String[] args) {
        //Hashtable                                     vs HashMap
        //null as a key is not allowed                      allowed
        //slow (all methods are syn)                        faster , only for non concurrenty*

        //CHM: concurrent hashmap
        Map<Integer, String>map=new HashMap<>();//what is fill ration in map

        map.put(112,"ravi");
        map.put(12,"ravi kumar");
        map.put(56,"sumit");
        map.put(712,"amit");
        map.put(192,"kapil");


        map.forEach((k, v)-> System.out.println(k+": "+v));


        //can i apply iterator to map
       //how to iterate though map

        //Keyset vs EntrySet(better peformance )

        //System.out.println(map);
//        Set<Integer>  keys=map.keySet();
//        for(Integer k: keys){
//            System.out.println(k+": "+map.get(k));
//        }

//       Set<Map.Entry<Integer, String>>entries=  map.entrySet();
//       for (Map.Entry<Integer, String> entry: entries){
//           System.out.println(entry.getKey()+" : "+entry.getValue());
//       }




    }
}


//{192=kapil, 712=amit, 12=ravi kumar, 127=sumit}
//{12=ravi kumar, 127=sumit, 712=amit, 192=kapil}
//{12=ravi kumar, 127=sumit, 192=kapil, 712=amit}