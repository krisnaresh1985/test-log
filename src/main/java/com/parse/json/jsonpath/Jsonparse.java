package com.parse.json.jsonpath;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

/**
 * Hello world!
 *
 */
public class Jsonparse 
{
	Object document;
	Object value = null;
	Jsonparse(String json){
		document = Configuration.defaultConfiguration().jsonProvider().parse(json);
	}
	
	public Object getValue(String path) {
		value = JsonPath.read(document,path);
		return value;
	}
	
    public static void main( String[] args )
    {
    	String json = "[       {       \"memberId\": \"A0002\",       \"subscriberId\": \"A0002\",       \"startDate\": \"01/12/2017\",       \"endDate\": \"12/15/2017\",       \"limit\": 10,       \"network\": \"INB\",       \"benefit\": \"Specialist Office Visit\",       \"accumulation\": 60,       \"units\": 5    },       {       \"memberId\": \"A0002\",       \"subscriberId\": \"A0002\",       \"startDate\": \"01/12/2017\",       \"endDate\": \"12/15/2017\",       \"limit\": 10,       \"network\": \"INB\",       \"benefit\": \"Specialist Office Visit\",       \"accumulation\": 60,       \"units\": 5    } ]";
    	Jsonparse jsonparse = new Jsonparse(json);
    	System.out.println(jsonparse.getValue("$..limit"));        
//        Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);
//        System.out.println(JsonPath.read(document, "$.store.book[0].author"));
    }
}
