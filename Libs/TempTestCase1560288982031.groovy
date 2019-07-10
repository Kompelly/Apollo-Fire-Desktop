import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/1t/c55l8xzs6gq_q7skx3wcbvjr0000gn/T/Katalon/Test Cases/HOME PAGE/Popular products/20190611_173622/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.callTestCase(findTestCase('CALL - URL'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile'), 0)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile - women slider'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/first product- women'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.delay(2)

not_run: WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile'), 0)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile - kids slider'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/first product- kids'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.delay(2)

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile - men slider'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/first product- men'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.delay(2)

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile'), 0)

not_run: WebUI.delay(2)

not_run: WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Popular products/first product- men'))

not_run: WebUI.delay(2)

not_run: WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Popular products/Previous button chevron - hover'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Previous button chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Next button chevron'))

''', 'Test Cases/HOME PAGE/Popular products', new TestCaseBinding('Test Cases/HOME PAGE/Popular products',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
