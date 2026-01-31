Mersys Campus UI Automation Project
This repository contains the automated UI tests for the Mersys Campus web application. The project is built using the Cucumber framework with Selenium WebDriver, following the Page Object Model (POM) design pattern to ensure maintainability and scalability.

🚀 Project Overview
The goal of this project is to automate critical user journeys on the Mersys Campus platform, ranging from secure authentication to managing financial records and user profile customization.

Key Features Automated:
Authentication: Secure Login/Logout functionality (US-001).

Navigation: Top Navigation Bar and Hamburger Menu interactions (US-002, US-003).

Communication: Messaging system including Inbox and Outbox management (US-004, US-005, US-006).

Finance Management: Viewing fee details, processing payments via Stripe, and downloading financial reports (US-009, US-010, US-011).

Profile & Settings: Customizing user profile pictures and application themes (US-014, US-015).

Education Tools: Accessing courses, attendance records, and grading systems (US-013, US-016).

🛠 Tech Stack
Language: Java

Automation Tool: Selenium WebDriver

Framework: Cucumber (BDD)

Design Pattern: Page Object Model (POM)

Reporting: Cucumber HTML Reports / Extent Reports

Build Tool: Maven

📂 Project Structure
The project follows a modular structure for clear separation of concerns:

Plaintext
src/test/java
├── hooks          # Scenario setup and teardown (Hooks.java)
├── pages          # Page Object classes containing WebElements and methods
├── runner         # Test execution entry point (TestRunner.java)
├── stepDefinitions # Implementation of Gherkin steps
└── utilities      # Reusable utility classes (BaseDriver, ConfigReader, ReusableMethods)
src/test/resources
└── features       # Gherkin feature files containing User Stories
🚦 Getting Started
Prerequisites
JDK 11 or higher

Maven installed

Chrome or Firefox browser

Installation & Execution
Clone the repository:

Bash
git clone https://github.com/ssibelcebeci/MersysCampus_UITestProject.git
Navigate to the project directory:

Bash
cd MersysCampus_UITestProject
Run the tests via Maven:

Bash
mvn clean test
Alternatively, you can run the TestRunner.java class directly from your IDE.

👥 Collaborators
This project was developed by a dedicated QA team:

Sibel * Gürhan

Ramazan

İbrahim

📝 Notes on User Stories
The automation coverage includes specific Acceptance Criteria (AC) as defined in the project documentation, ensuring that each feature behaves as expected from a student's perspective.
