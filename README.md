# CI/CD Challenge
This project consist in the configuration of a pipeline workflow for Web test automation project for the [Sauce demo](https://www.saucedemo.com/) web application.
                
## Tools
### Testing

- Selenium
- TestNG
- Maven

### CI/CD

- Github Actions

## Browser
By default, is **Chrome**, but Edge can be used too.

## Pipeline workflow
1. Create two **events**:
    
   - When a `push` is done to a certain branch. 
   - When a `pull request` is done to the main branch.

2. Run a **workflow** with inputs through the action `workflow_dispatch`
3. Create a **job** to do the tasks to:

   - Build
   - Execute
   - Test
   - Publish report 

4. Implement **actions** to:

   - Clone the repository with `actions/checkout`
   - Install Java using `actions/setup-java`
9. Set up the Maven commands to **build** and **execute** the tests.
10. Generate the Allure report:

    - Get the Allure history
    - Create the report
    - Deploy the report