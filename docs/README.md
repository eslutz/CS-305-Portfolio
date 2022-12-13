# CS-305-Portfolio

Portfolio from CS-305 Software Security.

## Projects

- Project 1 - [Vulnerability Assessment Report](../Artemis%20Financial%20Vulnerability%20Assessment%20Report.pdf)
- Project 2 - [Practices for Secure Software Report](../Artemis%20Financial%20Practices%20for%20Secure%20Software%20Report.pdf)

## Reflection

### Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

Artemis Financial, is a consulting company that develops individualized financial plans for their customers.  They were looking to modernize their operations using the most current and effective software security for their RESTful web application programming interface (API).  The goal was to identify any security vulnerabilities and to add a file verification step to their web application to ensure secure communications.  Additionally, when the web application is used to transfer data, it will need a data verification step in the form of a checksum. Lastly, this must be completed without adding any additional security vulnerabilities.

### What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

The part that I did well at was documenting the vulnerabilities and the mitigation steps needed to resolve the vulnerabilities.  It is important to code securely to keep company and user information safe and to prevent a program from being exploited in ways it was not meant to be used.  By working to limit vulnerabilities and security threats to an application it can add value to a company's overall wellbeing and reputation.

### What part of the vulnerability assessment was challenging or helpful to you?

The challenging part of the vulnerability assessment was creating a suppression file for all of the dependency vulnerabilities found during the static analysis.  The packages were very out-of-date and had many reported issued.

### How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

The layers of security were increased through the use of input validation where needed, cryptography, secure API interactions, secure error handling, and through following secure coding best practices and patterns.

### How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

The application was verified to be functional and secure through reviewing the code and testing to ensure the application worked as expected.  An initial dependency vulnerability scan was run before touching the code to determine what issues currently existed.  After refactoring the code another scan was run to ensure no additional vulnerabilities were introduced.

### What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Secure coding practices will be beneficial in any future assignments or tasks.  Additionally, the OWASP dependency check tool would be helpful for any future projects.

### Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

The Vulnerability Assessment Report and the Practices for Secure Software Report would be good examples to showcase the knowledge gained from this work.  Additionally, the refactored application from project 2 would be useful to demonstrate an ability to use self signed certificates with a RESTful API.
