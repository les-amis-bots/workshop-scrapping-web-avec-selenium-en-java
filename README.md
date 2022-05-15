# Workshop Selenium Java

## Introduction

Java was designed to be easy to use and is therefore easy to write,
compile, debug, and learn than other programming languages. Java is
object-oriented. This allows you to create modular programs and reusable
code. Java is platform-independent.

**Java technology is used by more than 6 million developers and runs on
more than 5.5 billion devices.**

## Installation

What is MAVEN?
- Maven is a built automation tool.
- Maven is a tool that helps us create projects easyly.
### What is built?
- Creating, adding, compiling, testing and deploying a project.
All of these combined are called a Built.
- Since maven is "built" automation tool, it helps us automate
all of these steps.
### Similar tools like Maven ?
- ant
- gradle
- kotlin
### Most important file in a Maven project?
- pom.xml is the most important file in a Maven project.

You should install manually of with you favorite package manager Maven :
https://maven.apache.org/install.html

## Compile

To compile this Java program you should run :

```
mvn compile assembly:single
java -jar target/your-amazing-jar-file.jar
```

If it's not work, try to run with the new version or java or directly with
your IDE like Jetbrain IntelliJ.
https://www.jetbrains.com/fr-fr/idea/

PS: Fuck VS Code for Java !

## Selenium ?

Selenium is a Java library and tool used for automating web browsers to do
a number of tasks. One of such is web-scraping to extract useful data and
information that may be otherwise unavailable via API.

Add this dependencie to you pom.xml.
https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java

Then install Chromedriver run the

```bash
./install_chromedriver.sh
```

You need to check that your version of chrome match the version 101 and
Chrome Stable is installed on your computer.

## First step to try if it's work

You can run this simple code:

```java
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
"/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,
Duration.ofSeconds(10));
        try {
            driver.get(https://intra.epitech.eu/");
            Thread.sleep(10000);
            System.out.println("OK !");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
```

## Exercise 1 (Easy bro)

Try to extract the price of my favorite video game from Amazon:
https://www.amazon.fr/Grand-Theft-Auto-%C3%A9dition-Premium/dp/B07CLVXHXP/ref=sr_1_2?__mk_fr_FR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=3LGM7C1F5AV76&keywords=gta+5&qid=1651519369&sprefix=gta+%2Caps%2C387&sr=8-2

Many online shop use this tool to adapt their price from their concurrent.

## Exercise 2 (Medium)

All api to get the price of my favorite crypto-currency is not free.
Get the price of the Ethereum from this website with rank.

https://coinmarketcap.com/fr/currencies/ethereum/

## Exercise 3 (Hardcore)

I'm so sad because sometime i found a captcha, try to breack it with
selenium:

https://patrickhlauke.github.io/recaptcha/

Then, get the value of the id of "recaptcha-token".

Be careful with the iframe in selenium :)