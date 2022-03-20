package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utilities.Base;
import Utilities.CommonMethods;

/**
 * Find Owner Page elements class
 *
 * @author Neethu Paul
 */
public class FindOwner extends Base {

	CommonMethods commonMethodsObj = new CommonMethods();

	public WebElement lnk_FindOwner() {
		WebElement lnk_FindOwner = driver.findElement(By.xpath("//a[@title=\"find owners\"]"));
		return lnk_FindOwner;
	}

	public WebElement lnk_AddOwner() {
		WebElement btn_AddOwner = driver
				.findElement(By.xpath("//a[@class=\"btn btn-primary\" and text()=\"Add Owner\"]"));
		return btn_AddOwner;
	}

	public WebElement txt_FirstName() {
		WebElement txt_FirstName = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		return txt_FirstName;
	}

	public WebElement txt_LastName() {
		WebElement txt_LastName = driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
		return txt_LastName;
	}

	public WebElement txt_Address() {
		WebElement txt_Address = driver.findElement(By.xpath("//input[@id=\"address\"]"));
		return txt_Address;
	}

	public WebElement txt_City() {
		WebElement txt_City = driver.findElement(By.xpath("//input[@id=\"city\"]"));
		return txt_City;
	}

	public WebElement txt_Telephone() {
		WebElement txt_Telephone = driver.findElement(By.xpath("//input[@id=\"telephone\"]"));
		return txt_Telephone;
	}

	public WebElement btn_AddOwner() {
		WebElement btn_AddOwner = driver.findElement(By.xpath("//button[@type=\"submit\" and text()=\"Add Owner\"]"));
		return btn_AddOwner;
	}

	public WebElement lbl_OwnerName() {
		WebElement lbl_OwnerName = driver.findElement(By.xpath("(//tbody//th[text()=\"Name\"]/following :: td)[1]"));
		return lbl_OwnerName;
	}

	public WebElement lbl_OwnerAddress() {
		WebElement lbl_OwnerAddress = driver
				.findElement(By.xpath("(//tbody//th[text()=\"Address\"]/following :: td)[1]"));
		return lbl_OwnerAddress;
	}

	public WebElement lbl_OwnerCity() {
		WebElement lbl_OwnerCity = driver.findElement(By.xpath("(//tbody//th[text()=\"City\"]/following :: td)[1]"));
		return lbl_OwnerCity;
	}

	public WebElement lbl_OwnerTelephone() {
		WebElement lbl_OwnerTelephone = driver
				.findElement(By.xpath("(//tbody//th[text()=\"Telephone\"]/following :: td)[1]"));
		return lbl_OwnerTelephone;
	}

	public WebElement lnk_AddNewPet() {
		WebElement lnk_AddNewPet = driver
				.findElement(By.xpath("//a[@class=\"btn btn-primary\" and contains(text(),\"New Pet\")]"));
		return lnk_AddNewPet;
	}

	public WebElement btn_AddPet() {
		WebElement btn_AddPet = driver.findElement(By.xpath("//button[@type=\"submit\" and text()=\"Add Pet\"]"));
		return btn_AddPet;
	}

	public WebElement txt_PetName() {
		WebElement txt_PetName = driver.findElement(By.xpath("//input[@id=\"name\"]"));
		return txt_PetName;
	}

	public WebElement dp_PetDateOfBirth() {
		WebElement dp_PetDateOfBirth = driver.findElement(By.xpath("//input[@id=\"birthDate\"]"));
		return dp_PetDateOfBirth;
	}

	public WebElement drp_PetType() {
		WebElement drp_PetType = driver.findElement(By.xpath("//select[@id=\"type\"]"));
		return drp_PetType;
	}

	public WebElement lbl_PetName() {
		WebElement lbl_PetName = driver.findElement(
				By.xpath("(//h2[text()=\"Pets and Visits\"]/following:: dt[text()=\"Name\"]/following:: dd)[1]"));
		return lbl_PetName;
	}

	public WebElement lbl_PetDateOfBirth() {
		WebElement lbl_PetDateOfBirth = driver.findElement(
				By.xpath("(//h2[text()=\"Pets and Visits\"]/following:: dt[text()=\"Birth Date\"]/following:: dd)[1]"));
		return lbl_PetDateOfBirth;
	}

	public WebElement lbl_PetType() {
		WebElement lbl_PetType = driver.findElement(
				By.xpath("(//h2[text()=\"Pets and Visits\"]/following:: dt[text()=\"Type\"]/following:: dd)[1]"));
		return lbl_PetType;
	}

}
