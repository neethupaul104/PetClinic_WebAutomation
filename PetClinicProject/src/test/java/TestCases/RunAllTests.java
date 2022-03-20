package TestCases;

import java.io.IOException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Utilities.Base;


/**
 * Run All test cases class
 *
 * @author Neethu Paul
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RunAllTests extends Base{
	
	HomeTC homeTCObj = new HomeTC();
	FindOwnerTC findOwnerTCObj = new FindOwnerTC();
	
	@Test 
	public void PetClinic_HomeImageIcon_Validation() throws IOException, InterruptedException {
		test = ext.createTest("HomeImageIcon_Validation");		
		homeTCObj.HomeImageIcon_Validation();
		
	}
	@Test 
	public void PetClinic_NewOwner_Validation() throws IOException, InterruptedException {
		test = ext.createTest("PetClinic_NewOwner_Validation");
		findOwnerTCObj.FindOwner_AddNewOwner_Validation();	
		
	}
	@Test 
	public void PetClinic_NewPet_Validation() throws IOException, InterruptedException {
		test = ext.createTest("PetClinic_NewPet_Validation");
		findOwnerTCObj.FindOwner_AddNewPet_Validation();
		
	}
	

}
