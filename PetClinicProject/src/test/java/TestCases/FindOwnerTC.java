package TestCases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.ui.Select;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import PageObjects.FindOwner;
import Utilities.Base;
import Utilities.CommonMethods;

/**
 * Test class Find Owner Page
 *
 * @author Neethu Paul
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FindOwnerTC extends Base {

	FindOwner findOwnerObj = new FindOwner();
	CommonMethods commonMethodsObj = new CommonMethods();

	@Test
	public void FindOwner_AddNewOwner_Validation() throws InterruptedException, IOException {
		try {

			Navigate_FindOwner();
			Add_NewOwner();
			Validate_NewOwner();

		} catch (Exception e) {
			String SC = commonMethodsObj.TakeScreenshot("Screenshot");
			test.error("Failed", MediaEntityBuilder.createScreenCaptureFromPath("." + SC).build());
		}
	}

	@Test
	public void FindOwner_AddNewPet_Validation() throws InterruptedException, IOException {
		try {

			AddNewPet();
			ValidatePetDetails();

		} catch (Exception e) {
			String SC = commonMethodsObj.TakeScreenshot("Screenshot");
			test.error("Failed", MediaEntityBuilder.createScreenCaptureFromPath("." + SC).build());
		}
	}

	public void Navigate_FindOwner() throws IOException {
		try {
			findOwnerObj.lnk_FindOwner().click();
		} catch (Exception e) {
			String SC = commonMethodsObj.TakeScreenshot("Screenshot");
			test.error("Failed", MediaEntityBuilder.createScreenCaptureFromPath("." + SC).build());
		}
	}

	public void Add_NewOwner() throws IOException {

		findOwnerObj.lnk_AddOwner().click();
		try {
			findOwnerObj.txt_FirstName().sendKeys(prop.getProperty("FirstName"));
			findOwnerObj.txt_LastName().sendKeys(prop.getProperty("LastName"));
			findOwnerObj.txt_Address().sendKeys(prop.getProperty("Address"));
			findOwnerObj.txt_City().sendKeys(prop.getProperty("City"));
			findOwnerObj.txt_Telephone().sendKeys(prop.getProperty("Telephone"));
			findOwnerObj.btn_AddOwner().click();
		} catch (Exception e) {
			String SC = commonMethodsObj.TakeScreenshot("Screenshot");
			test.error("Failed", MediaEntityBuilder.createScreenCaptureFromPath("." + SC).build());
		}
	}

	public void Validate_NewOwner() throws IOException {
		try {			
			String OwnerName = prop.getProperty("FirstName").concat(" ").concat(prop.getProperty("LastName"));
			Assert.assertTrue("Added Owner Name is not matching",
					findOwnerObj.lbl_OwnerName().getText().toString().equals(OwnerName));
			Assert.assertTrue("Added Owner Address is not matching",
					findOwnerObj.lbl_OwnerAddress().getText().toString().equals(prop.getProperty("Address")));
			Assert.assertTrue("Added Owner City is not matching",
					findOwnerObj.lbl_OwnerCity().getText().toString().equals(prop.getProperty("City")));
			Assert.assertTrue("Added Owner Telephone number is not matching",
					findOwnerObj.lbl_OwnerTelephone().getText().toString().equals(prop.getProperty("Telephone")));

			test.log(Status.PASS, "New Owner details are validated successfully");			

		} catch (Exception e) {
			String SC = commonMethodsObj.TakeScreenshot("Screenshot");
			test.error("Failed", MediaEntityBuilder.createScreenCaptureFromPath("." + SC).build());
		}

	}

	public void AddNewPet() throws IOException {
		try {
			findOwnerObj.lnk_AddNewPet().click();
			findOwnerObj.txt_PetName().sendKeys(prop.getProperty("PetName"));
			findOwnerObj.dp_PetDateOfBirth().sendKeys(prop.getProperty("PetDateOfBirth"));

			Select PetType = new Select(findOwnerObj.drp_PetType());
			PetType.selectByVisibleText(prop.getProperty("Type"));
			findOwnerObj.btn_AddPet().click();

		} catch (Exception e) {
			String SC = commonMethodsObj.TakeScreenshot("Screenshot");
			test.error("Failed", MediaEntityBuilder.createScreenCaptureFromPath("." + SC).build());
		}

	}

	public void ValidatePetDetails() throws IOException {
		try {			
			String PetDateOfBirth = prop.getProperty("PetDateOfBirth");
			PetDateOfBirth = new SimpleDateFormat("yyyy-MM-dd")
					.format(new SimpleDateFormat("MM/dd/yyyy").parse(PetDateOfBirth));
			Assert.assertTrue("Added Pet Name is not matching",
					findOwnerObj.lbl_PetName().getText().toString().equals(prop.getProperty("PetName")));
			Assert.assertTrue("Added Pet Date Of Birth is not matching",
					findOwnerObj.lbl_PetDateOfBirth().getText().toString().equals(PetDateOfBirth));
			Assert.assertTrue("Added Pet Type is not matching",
					findOwnerObj.lbl_PetType().getText().toString().equals(prop.getProperty("Type")));

			test.log(Status.PASS, "Pet Details are validated successfully");			

		} catch (Exception e) {
			String SC = commonMethodsObj.TakeScreenshot("Screenshot");
			test.error("Failed", MediaEntityBuilder.createScreenCaptureFromPath("." + SC).build());
		}
	}

}
