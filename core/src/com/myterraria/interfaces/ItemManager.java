package com.myterraria.interfaces;

import java.util.HashMap;

public class ItemManager{

    public static HashMap<Integer,Item> items=new HashMap<>();

    public static void defineItem(int id,FrameBuffer fb){
        items.put(id,new Item(id,fb));
    }

    public static void defineItem(int id,Item i){
        items.put(id,i);
    }

    public static Item getItem(int id){
        return items.get(id);
    }

}
