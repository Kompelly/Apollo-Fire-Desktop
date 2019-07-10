import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('CALL - URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Burgermenu'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Shop food'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Sides'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Pork'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Filter dropdown'))

WebUI.delay(2)

String a = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a=' + a)

int b = 0

WebUI.verifyNotEqual('a', 'b')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Sides'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Filter dropdown'))

WebUI.delay(2)

String a4 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.comment('a4=' + a4)

WebUI.verifyNotEqual('a4', 'b')

WebUI.delay(4)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Clear all filters'))

WebUI.delay(2)

String a12 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a12=' + a12)

WebUI.verifyNotEqual('a12', 'b')

