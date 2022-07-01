package com.mln.pageFactory;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mln.utilities.Common_Utility;

public class Login_MyStorePF {

	WebDriver driver;
	String strTestName;

	@FindBy(xpath="//input[@id='email_create']")
	private WebElement txtbxCreateEmail;
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement btnCreateAccount;

	@FindBy(xpath= "//input[@id='email']")
	private WebElement txtEmailaddress;

	@FindBy(xpath= "//input[@id='passwd']")
	private WebElement txtPassword;

	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement btnSignin;


	public Login_MyStorePF(WebDriver driver , String strTestName){
		this.driver =driver;
		this.strTestName = strTestName;
		PageFactory.initElements(driver, this);

		if(!driver.getTitle().equalsIgnoreCase("Login - My Store")){
			throw new IllegalStateException("This is not My Login - My Store Page. The Current Page is " + driver.getTitle());
		}

	}

	public Login_MyStorePF(WebDriver driver) {
		//this.driver =driver;
		PageFactory.initElements(driver, this);

		if(!driver.getTitle().equalsIgnoreCase("Login - My Store")){
			throw new IllegalStateException("This is not My Login - My Store Page. The Current Page is " + driver.getTitle());
		}

	}

	public void EnterTxtCreateEmail(Common_Utility wmobj,String stxtboxvalue) throws Exception
	{		
		wmobj.setValue(txtbxCreateEmail, stxtboxvalue);
	}
	public void ClickCreateAccount(Common_Utility wmobj) throws Exception
	{
		wmobj.clickLnkBtn(btnCreateAccount);
	}
	public boolean VerifyLogin_MyStore(Common_Utility wmobj) throws Exception
	{
		boolean bResult = false;
		return bResult =wmobj.isElementPresent(txtbxCreateEmail);
	}

	public void EnterEmailaddress(Common_Utility wmobj,String stxtboxvalue) throws Exception
	{		
		wmobj.setValue(txtEmailaddress, stxtboxvalue);
	}
	public void EnterPassword(Common_Utility wmobj,String stxtboxvalue) throws Exception
	{		
		wmobj.setValue(txtPassword, stxtboxvalue);
	}
	public void ClickSignin(Common_Utility wmobj) throws Exception
	{
		wmobj.clickLnkBtn(btnSignin);
	}



}
