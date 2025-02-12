Level SuperMind App Test Automation

Overview

This project contains automated test scripts for testing the login functionality of the Level SuperMind app on both Android and iOS platforms. The scripts cover both positive and negative test scenarios.

Test Scripts

The test scripts have been developed using Appium for automating mobile app testing. The scripts are written in Java with TestNG framework.

Test Coverage

The following test scenarios are covered:

Positive Test Cases

Login with a valid phone number.

Login with a valid email address.

Enter a valid OTP for successful authentication.

Negative Test Cases

Attempt login with an invalid phone number.

Attempt login with an invalid OTP.

Tools & Frameworks Used

Appium: For mobile automation testing.

TestNG: For test case structuring and execution.

Java: Programming language for test automation.

AndroidDriver & iOSDriver: For interacting with mobile applications.

Prerequisites

Ensure the following tools are installed and configured:

Java JDK (8 or later)

Appium Server (Latest version)

Android Studio (For Android testing)

Xcode (For iOS testing)

Node.js & npm (For Appium dependencies)

TestNG Plugin (For running tests in Java)

Setup Instructions

Clone the repository:

git clone <repository-url>

Navigate to the project directory:

cd LevelSuperMindTests

Install dependencies:

npm install -g appium

Start the Appium server:

appium

Connect an Android/iOS device or use an emulator.

Running Test Cases

Running Android Tests

To execute the test scripts for Android:

mvn test -Dplatform=android

Running iOS Tests

To execute the test scripts for iOS:

mvn test -Dplatform=ios

Expected Results

Successful login should navigate the user to the home screen.

Invalid credentials should trigger appropriate error messages.

The OTP verification should allow access only with a valid OTP.

Challenges Faced

UI Element Locators: Some elements did not have unique identifiers, requiring XPath-based selection.

OTP Handling: Automating OTP verification was challenging as it required manual input or integration with a test OTP service.

Platform Differences: Variations between Android and iOS required separate handling of UI elements.

Tester Information

Name: Rohit Chouhan

Role: Automation Tester

References

Android App Link: Level SuperMind - Play Store

iOS App Link: Level SuperMind - App Store

Contact

For any queries or issues, please reach out to Rohit Chouhan.

