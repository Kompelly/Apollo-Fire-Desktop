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

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Featured collection/Chicken'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Featured collection/Chicken'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Featured collection/Chicken - Shop collection'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Featured collection/Salads'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Featured collection/Salads'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Featured collection/Salads - Shop collection'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Collection - sides'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Collection - sides'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Sides - shop collection'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Featured collection/Meals'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Featured collection/Meals'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Featured collection/Meals - Shop collection'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Featured collection/healthy'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Featured collection/healthy'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Featured collection/Healthy - shop collection'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Featured collection/Lamb'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Featured collection/Lamb'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Featured collection/Lamb - shop collection'))

WebUI.delay(1)

