# MERSYS CAMPUS | UI AUTOMATION FRAMEWORK

### TECHNICAL SPECIFICATION
| Category | Tool |
| :--- | :--- |
| **Language** | Java |
| **Automation** | Selenium WebDriver |
| **Framework** | Cucumber (BDD) |
| **Design Pattern** | Page Object Model (POM) |
| **Build Tool** | Maven |

---

### DIRECTORY STRUCTURE
```text
src/test/java
├── hooks               # Setup and Teardown (Hooks.java)
├── pages               # WebElements and Page-specific methods
├── runner              # TestRunner configuration
├── stepDefinitions     # Gherkin-to-Java mapping logic
└── utilities           # BaseDriver, ConfigReader, ReusableMethods

src/test/resources
└── features            # Business requirements in Gherkin format

EST SCOPE & COVERAGE
The framework automates critical user paths based on official User Stories:

CORE AUTH & UI: Login verification, Home navigation, and Hamburger Menu interactions.

MESSAGING: Full lifecycle of internal communications (Inbox, Outbox, Compose, Attachments).

FINANCE: Tuition fee tracking, Stripe payment gateway integration, and report downloads.

PERSONALIZATION: Profile image management and application theme settings.

ACADEMICS: Attendance tracking and grading system (Transcripts) validation.

CONTRIBUTORS
Sibel

Gürhan

Ramazan

İbrahim
