# NR_Assignments
NR Practice Assignments

## Assignment 1
### Details of individual assignment under Project Knowledge Transition 1:

Develop an application which receives data from a “Read More Books” website and forward it for backend processing. Your application should send order details in below XML format to backend. 
 If City is not Mumbai, Rs 100 is to be charged additionally before forwarding XML  for backend processing. Also read response from backend.
ContextInformation is order metadata.

Pre requisites:
Create a Java - Maven project
Should define 2 POJOs – ContextInformation and Book.
Well defined packages to segregate transformations, DTOs, configuration files and templates etc.
Use Naming conventions, add code comments etc.
Use Freemarker (POJO to XML)  and Smooks (XML to POJO) transformation
Define a custom method in Freemarker to calculate and return additional charges as per city

Your order below:
1)	Head First Design Pattern by Freeman & Freeman, Price 1000, Publisher Oreilly and order date is 1st May 2020
2)	Head First Java by Freeman & Freeman, Price 950, Publisher Oreilly and order date is 1st May 2020
3)	Head First JSP and Servlets by Freeman & Freeman, Price 1200, Publisher Oreilly and date is 1st May 2020

**Sample XML below.**

<img src="https://github.com/dhrumil29796/NR_Assignments/blob/master/XMLsample1.PNG"></a>


**Backend processes the data and returns with BookOrderId, DeliveryDate and DispatchDate. Response from Backend:**

<img src="https://github.com/dhrumil29796/NR_Assignments/blob/master/XMLsample2.PNG"></a>
