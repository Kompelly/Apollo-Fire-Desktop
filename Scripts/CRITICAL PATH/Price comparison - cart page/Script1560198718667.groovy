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

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Burgermenu'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Shop food'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Beef'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Beef skewers'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/1 piece'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Burgermenu'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Shop food'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Chicken'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Grilled lemon chicken'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/1 piece'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Checkout'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Customer Information page/Cart page breadcrumb'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

String a = WebUI.getText(findTestObject('APOLLO- Desktop/Cart page/Unit price - 1st product'))

WebUI.comment('a=' + a)

String a1 = a.substring(1)

WebUI.comment('a1=' + a1)

String b = WebUI.getText(findTestObject('APOLLO- Desktop/Cart page/Unit price - 2nd product'))

WebUI.comment('b=' + b)

String b1 = b.substring(1)

WebUI.comment('b1=' + b1)

double p1

double p2

// code to convert string to int
try {
    String str = a1

    WebUI.comment('str=' + str)

    p1 = Double.valueOf(str)

    WebUI.comment('p1=' + p1)
}
catch (NumberFormatException ex) {
} 

try {
    String str5 = b1

   WebUI.comment('str5=' + str5)

    p2 = Double.valueOf(str5)

    WebUI.comment('p2=' + p2)
}
catch (NumberFormatException ex) {
} 

double total = p1 + p2

WebUI.comment('total=' + total)

String c = WebUI.getText(findTestObject('APOLLO- Desktop/Cart page/Subtotal in cart page'))

WebUI.comment('c=' + c)

String c1 = c.substring(1)

WebUI.comment('c1=' + c1)

double p3

// code to convert string to int
try {
    String str = c1

    WebUI.comment('str=' + str)

    p3 = Double.valueOf(str)

    WebUI.comment('p3=' + p3)
}
catch (NumberFormatException ex) {
} 

WebUI.verifyEqual(total, p3)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Checkout'))

WebUI.callTestCase(findTestCase('CALL- CUSTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CALL - SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

