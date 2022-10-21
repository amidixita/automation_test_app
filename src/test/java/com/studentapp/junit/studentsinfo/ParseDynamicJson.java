package com.studentapp.junit.studentsinfo;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import com.details.model.SenderClass;
//import com.studentapp.cucumber.serenity.StudentSerenitySteps;
import com.studentapp.cucumber.serenity.TestSerenitySteps;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;


public class ParseDynamicJson {
	@Steps
	 TestSerenitySteps test;
	@Steps
	SenderClass sender;
	String name;
	public String firstName;
	public String lastName;
	public String email;
	public String password;
	public void getKey(JSONObject json , String key)
	{
		boolean exists = json.has(key);
		Iterator<?> keys;
		String nextKeys;
	
		if(!exists)
		{
			
			
			keys= json.keys();
			while(keys.hasNext())
			{
				nextKeys= (String)keys.next();
				
				try {
					
					if(json.get(nextKeys) instanceof JSONObject)
					{
						if(exists == false)
						{
							getKey(json.getJSONObject(nextKeys), key);
						}
					}
					else if (json.get(nextKeys) instanceof JSONArray) {
						JSONArray jsonarray = json.getJSONArray(nextKeys);
						
						for(int i=0; i<jsonarray.length(); i++)
						{
							String jsonArrayString=jsonarray.get(i).toString();
							JSONObject newJSONObject= new JSONObject(jsonArrayString);
							if(exists == false)
							{
								getKey(newJSONObject, key);
							}
						}
					}
						
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}
		
		else {
			
			 name= (String) json.get(key);
			 
		
		}
		
	} 
	
	
	public void getSenderDetails()
	{
		
      Response response=  test.getStudentByName().extract().response();
		
		String response1= response.asString();
	
		
		JSONObject newJSONObject= new JSONObject(response1);
		
		
		 getKey(newJSONObject , "first");
		 firstName=name;
		 System.out.println(firstName);
//         sender.setFirstName(name);
//          System.out.println(sender.getFirstName());

		getKey(newJSONObject , "last");
		lastName=name;
		 System.out.println(lastName);
//		sender.setLastName(name);
//		System.out.println(sender.getLastName());
		
		
		getKey(newJSONObject , "email");
		email=name;
		 System.out.println(email);
//		sender.setEmail(name);
//		System.out.println(sender.getEmail());
		
//		getKey(newJSONObject , "number");
//		sender.setAddress(name);
//		sender.setSsnNumber(name);
//		System.out.println(sender.getAddress());
//		
//		getKey(newJSONObject , "city");
//		sender.setCity(name);
//		System.out.println(sender.getCity());
//		
//		getKey(newJSONObject , "state");
//		sender.setState(name);
//		System.out.println(sender.getState());
//		
//		getKey(newJSONObject , "postcode");
//		sender.setZipCode(name);
//		System.out.println(sender.getZipCode());
//		
//		getKey(newJSONObject , "username");
//		sender.setUserName(name);
//		System.out.println(sender.getUserName());
		
		getKey(newJSONObject , "password");
		password=name.concat("@199826");
		System.out.println(password);
//		sender.setPassword(name);
//		sender.setConfirmPassword(name);
//		
	}
}
