��������� � ��������: 

e2_Builder\mvn-builder-example-test\pom.xml - ������� ������ , � ���� ��������� ��������� ������

0. FourTestStage
FourTestStage1Test - simple example
FourTestStage2Test - ������ � webdriver � ��������� email
package exampleWithout; - ��� ������������� �������� 
package fourTestStage; - � �������������� ��������

================================
1. Builder 
������ ������������� :
featuretest.dataprovider.DataProviderAuthentication

================================
2. Page Object � Page Action
e3_PageObject_PageActions\pageObjects-nWithout\pom.xml - ������ ��� ������������� PageObject 
package example;
e3_PageObject_PageActions\pageObjects-pageActions\pom.xml - ������ � �������������� Page Object � Page Action
package exampleWithout;

package exampleWithPageObject; - ������������� PageActions 
GoogletTest: googlePage.search.sendKeys("Selenium");
SoftwareTestingRuTest : ������������� ������� - softwareTestingPage.mainMenus.get(0).click();
��������� : page � test

ExampleMailTest - ������� ������ 
��������� : � main : pages + actions , � �������� package content 
������������� ������������ ��������� : 

================================
3. Verification Action � Global Assert
e4_VerificationAction�Global_Assert\qmvn-hibernate-test\pom.xml - ������ ��� Hibernate 
package hibernateWihout; - ��� ������������� Verification pattern 
package hibernateverification; - c ������������tv Verification pattern 

e3_PageObject_PageActions\pageObjects-pageActions\pom.xml - ������ ��� PageActions + Verification 
package exampleWithout; class ExampleMailTest - ��� ������������� �������� 
package exampleWithPageObject; class ExampleMailVerificationTest - ������ � �������������� �������� 

================================
4. Logging
package example.testng;
AssertWithLogging - Assert � ������������ 
package exampleWithPageObject; 
class ExampleMailVerificationTest - ���� ������ � �������������� �������� 
class EmailVerificationWithWrapperLogging - class PageAction � �������������� �������� 

================================
�� : ��� ������ ���������� ������� ���� ships : 
http://sql-ex.ru/download/mysql_script.zip 


