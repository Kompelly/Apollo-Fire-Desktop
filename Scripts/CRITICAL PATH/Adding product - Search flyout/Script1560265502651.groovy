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

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Search input'))

WebUI.delay(1)

WebUI.setText(findTestObject('APOLLO- Desktop/Home page/Search input box to enter'), 'Chicken')

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/2nd product - search flyout'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/1 piece'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/2 piece'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/3 piece'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag - Copy'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/4 piece'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag - Copy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('APOLLO- Desktop/Home page/cart icon open'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Checkout'))

WebUI.delay(1)

WebUI.callTestCase(findTestCase('CALL- CUSTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CALL - SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

