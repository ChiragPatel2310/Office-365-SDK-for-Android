package com.microsoft.office365.demo;

public class Constants {
	// -------------------------------AAD PARAMETERS----------------------------------
	public static final String AUTHORITY_URL = "https://login.windows.net/common/oauth2/token";
	public static final String CLIENT_ID = "your-client-id"; 
	public static final String REDIRECT_URL = "http://your-redirect-url.com";
	
	// In this initial Preview release, you must use a temporary Resource ID for Service Discovery ("Microsoft.SharePoint").
        // TODO: If this Resource ID ceases to work, check for an updated value at http://go.microsoft.com/fwlink/?LinkID=392944

	public static final String DISCOVERY_RESOURCE_ID =  "Microsoft.SharePoint";
	public static final String MYFILES_CAPABILITY = "MyFiles";
	
	public static String LIST_NAME = "TestList";
	public static String TITLE_FIELD = "Title";
	//------------------------------------------------------------------------------------------	
}
