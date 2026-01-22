# DemoQA Selenium POM Framework

Selenium automation framework using **Page Object Model (POM)** for DemoQA website testing, built with **Java**, **TestNG**, and **Maven**.

## 📋 Table of Contents
- [🔧 Features](#features)
- [🛠️ Tech Stack](#tech-stack)
- [📁 Project Structure](#project-structure)
- [🚀 Quick Start](#quick-start)
- [⚙️ Configuration](#configuration)
- [🧰 Utilities](#utilities-included)
- [📊 Reporting](#reporting)
- [🤝 Contributing](#contributing)

## 🔧Features
- ✅ **POM architecture** for DemoQA forms & elements
- ✅ **Java + Selenium WebDriver + TestNG**
- ✅ **Maven** dependency management
- ✅ **Eclipse IDE** compatible
- ✅ Dynamic elements, explicit waits, validations
- ✅ Data-driven testing approach

## 🛠️Tech Stack
```plaintext
Java 11+
Selenium WebDriver 4.x
TestNG 7.x
Maven 3.8+
Eclipse IDE
DemoQA: https://demoqa.com
```

## 📁Project Structure
```plaintext
DemoQaSelenium/
├── pom.xml                    # Maven config
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/         # Page Objects
│   │           ├── BasePage.java
│   │           ├── HomePage.java
│   │           └── Forms/
│   │               └── PracticeFormPage.java
│   └── test/
│       └── java/
│           ├── tests/        # Test classes
│           │   └── PracticeFormTest.java
│           └── resources/
│               ├── config.properties
│               └── testdata.csv
└── target/                   # Reports & output
```
## 🚀Quick start
git clone https://github.com/reventhkumar/DemoQaSelenium.git
cd DemoQaSelenium
mvn clean compile
mvn test

## ⚙️Configuration
```plaintext
browser.name=chrome
url=https://demoqa.com
implicit.wait=10
explicit.wait=15
headless=false
```
## 🧰Utilities Included
```plaintext
BasePage: Click, sendKeys, waits
Listeners: TestNG logging
DataProvider: CSV-driven tests
ExtentReports: Failure screenshots
Eclipse Setup
Import → Maven → Existing Maven Project
Right-click → Maven → Update Project
Run testng.xml as TestNG Suite
```
## 📊Reporting
bash
```plaintext
mvn clean test site:site
Surefire: target/surefire-reports/
Maven Site: target/site/index.html
```

## 🤝Contributing
```plaintext
Fork repo
Add pages: src/main/java/pages/
Add tests: src/test/java/tests/
Submit PR
```

## 📄License
```plaintext
MIT License - Free for QA portfolios.
```
