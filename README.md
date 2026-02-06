# NadjiDom QA Project

## Overview
This project contains a set of **manual test cases** created for the NadjiDom real estate portal.  
The goal is to demonstrate structured QA documentation, covering both **positive** and **negative** scenarios, as well as one independent exploratory test where a bug was identified.

## Test Suites
- **Positive Test Suite**  
  Includes 4 test cases:
    1. Log in with valid credentials
    2. Posting a new ad
    3. Verification of the posted ad
    4. Searching for the posted ad as a logged‑out user

- **Negative Test Suite**  
  Includes 2 test cases:
    1. Log in with invalid credentials
    2. Attempt to post an ad as a non‑logged‑in user

- **Independent Test**  
  Exploratory test of the quick search functionality using the keyword **"Stan"** in different variations (uppercase, lowercase, mixed case, with special characters).
    - **Bug found:** When searching with **"Stan"** (capitalized first letter), the system fails to return ads even though matching entries exist in the database.

- **General Suite**  
  A combined suite that executes both positive and negative test cases together.

## Structure
## Structure
- `NadjiDom_TestCases.xlsx` – Excel file containing all manual test cases (positive, negative, and independent).
- `README.md` – Documentation explaining the scope and structure of the project.

## Notes
- Positive test cases are provided as a clear example of manual QA documentation style.
- Negative and exploratory tests are included to demonstrate awareness of edge cases and bug detection.
- Test cases use original Serbian UI labels in quotes (e.g., `"Prijava"`, `"Tip"`, `"Kvadratura"`) for clarity and accuracy.

---

This project showcases my ability to:
- Write clear, maintainable manual test cases
- Organize test suites for different scenarios
- Document bugs found during exploratory testing
- Present QA work professionally for portfolio purposes