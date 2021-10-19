package com.inventorydetails;
import org.json.simple.JSONArray;
import org.json.simle.JSONobject;
import org.json.simpl.parser.JSONParser;
import org.json.simple.parser.parser.ParseExceptin;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
public class RealInventoryDetails {
    public static void main(String[] args)
    {
        JSONParser jsonParser =new JSONParser();
        try (FileReader reader = new FileReader("inventorydetails.json"))
        {
            object obj = jsonParser.parse(reader);
            JSONArray inventoryList = (JSONArray) obj;
            System.out.println(inventoryList);inventoryList.forEach( det -> parseDetailsobject(JSONobject) det)
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ParseException e){
            e.printStackTrace();{

            }
        }
        private static void parseDetailsobect(JSONObject det) {
        JSONObject Detailsobject = (JSONObject) det.get("Details");
        String firstName = (String) Detailsobject.get("Name");
        System.out.println(firstName);


        String lastName=(String) Detailsobject.get("Weight in kg");
        System.out.println(lastName);

        String website = (String) Detailsobject.get("perkg price");
        System.out.println(website);
    }
    }
}
