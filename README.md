# Selenium TestNG Automation

This repository contains Selenium test cases written in Java using the TestNG framework for automated testing of [Entrata](https://www.entrata.com/) website.

## TestNG Suite Configuration

The test suite configuration is defined in the `testng.xml` file. The suite includes four test classes: `SignInTest`, `LaunchEntrataURL`, `ProductNevigation`, and `WatchDemo`. These classes are part of the `test_Scenarios1` package.

## Prerequisite
1. The pom.xml file is required to open for the dependencies.

### Steps to import the project( Used: Eclipse IDE )
1. Go to file>>Import>>Git>>Projects From Git>>Clone URI and provide the following URL
 https://github.com/manishaparihar/entrata_website.git
2. Use the required directory location

### Steps to run the project
1. In Project Explorer of Eclipse locate pom.xml and open it.
2. In the Project Explorer of Eclipse, locate testNG.xml( From the main directory).
3. Right-click on the "testNG.xml" file and Run as testNG test.
