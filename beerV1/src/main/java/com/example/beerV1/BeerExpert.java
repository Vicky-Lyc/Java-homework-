package com.example.beerV1;

import java.util.*;


public class BeerExpert {

    public List getBeer(String color){
        List<Beer> beer = new ArrayList<>();
        if(color.equals("amber")){
            beer.add(new Beer("雪花",5,30,"Vicky",2002));
            beer.add(new Beer("勇闯天涯",5,40,"Vicky",2002));
        }
        else{
            beer.add(new Beer("Rio",10,10,"Vicky",2002));
        }
        return(beer);
    }
}