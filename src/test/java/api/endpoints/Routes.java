package api.endpoints;

/*
 * Swagger URI --> https://petstore.swagger.io/

Create user(Post) : https://petstore.swagger.io/v2/user	
Get user (Get) :	https://petstore.swagger.io/v2/user/{username}
Update user (Put) : https://petstore.swagger.io/v2/user/{username}
Delete user (Delete) : https://petstore.swagger.io/v2/user/{username}

*/	

public class Routes {

	public static String base_url="https://petstore.swagger.io/v2";

	//User module
	
public static String post_url1=base_url+"/user";
public static String get_url1=base_url+"/user/{username}";
public static String update_url1=base_url+"/user/{username}";
public static String delete_url1=base_url+"/user/{username}";
	

//Strore module
  
public static String post_url2=base_url+"/store";
public static String get_url2=base_url+"/store/{username}";
public static String update_url2=base_url+"/store/{username}";
public static String delete_url2=base_url+"/store/{username}";
	

//Pet module

public static String post_url3=base_url+"/pet";
public static String get_url3=base_url+"/pet/{username}";
public static String update_url3=base_url+"/pet/{username}";
public static String delete_url3=base_url+"/pet/{username}";
	


}
