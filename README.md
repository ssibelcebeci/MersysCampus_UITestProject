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
