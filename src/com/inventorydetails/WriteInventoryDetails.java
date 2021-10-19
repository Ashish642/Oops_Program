package com.inventorydetails;
import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException
public class WriteInventoryDetails {
    @SuppressWarnings("unchecked")
    public static void main(String[] args )
    {
        JSONObject Details = new JSONObect();
        Details.put("Name","Rice");
        Details.put("weight in kg", "10");
        Details.put("perkg price", "50");
        JSONObject Detailsobject = new JSONObject();
        Detailsobject.put("Details", Details);

        JSONObject Details2 = new JSONObject();


    }

}
