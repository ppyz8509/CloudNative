import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.cloudnative-skill.com/register')

WebUI.verifyTextPresent('Register', false)

Title = WebUI.getWindowTitle(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(Title, 'Modern Software Development Toolchains', false)

WebUI.setText(findTestObject('input_wdp'), '09/12/2540')

WebUI.sendKeys(findTestObject('input_wdp'), Keys.chord(Keys.ENTER))

result_age = WebUI.getAttribute(findTestObject('auto_age'), 'value')

WebUI.verifyMatch(result_age, '26', false)

result_OF = WebUI.getAttribute(findTestObject('OF'), 'placeholder')

WebUI.verifyMatch(result_OF, 'เช่น สำนักงานใหญ่', false)

WebUI.verifyElementNotChecked(findTestObject('checkbox_c1'), 10)

WebUI.verifyElementClickable(findTestObject('input_voice'))

