Пояснения к проектам: 

e2_Builder\mvn-builder-example-test\pom.xml - главный проект , в него добавлены остальные модули

0. FourTestStage
FourTestStage1Test - simple example
FourTestStage2Test - пример с webdriver и страницей email
package exampleWithout; - без использования паттерна 
package fourTestStage; - с использованием паттерна

================================
1. Builder 
Пример использования :
featuretest.dataprovider.DataProviderAuthentication

================================
2. Page Object – Page Action
e3_PageObject_PageActions\pageObjects-nWithout\pom.xml - проект без использования PageObject 
package example;
e3_PageObject_PageActions\pageObjects-pageActions\pom.xml - проект с использованием Page Object – Page Action
package exampleWithout;

package exampleWithPageObject; - использование PageActions 
GoogletTest: googlePage.search.sendKeys("Selenium");
SoftwareTestingRuTest : использование списков - softwareTestingPage.mainMenus.get(0).click();
Структура : page в test

ExampleMailTest - главный пример 
Структура : в main : pages + actions , в соседнем package content 
использование инкапсуляции элементов : 

================================
3. Verification Action – Global Assert
e4_VerificationAction–Global_Assert\qmvn-hibernate-test\pom.xml - проект для Hibernate 
package hibernateWihout; - без использования Verification pattern 
package hibernateverification; - c использованиtv Verification pattern 

e3_PageObject_PageActions\pageObjects-pageActions\pom.xml - проект для PageActions + Verification 
package exampleWithout; class ExampleMailTest - без использования паттерна 
package exampleWithPageObject; class ExampleMailVerificationTest - пример с использованием паттерна 

================================
4. Logging
package example.testng;
AssertWithLogging - Assert с логированием 
package exampleWithPageObject; 
class ExampleMailVerificationTest - тест пример с использованием паттерна 
class EmailVerificationWithWrapperLogging - class PageAction с использованием паттерна 

================================
БД : Для работы необходимы скрипты базы ships : 
http://sql-ex.ru/download/mysql_script.zip 


