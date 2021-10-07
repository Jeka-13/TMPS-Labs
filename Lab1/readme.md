#FAF-193 Chetrar Eugeniu
First lab for TMPS

##Topic: Company producing cars

##Introduction

Let's suppose we have a person who wants to buy a car. The person goes to the BMW office and chooses the type of the car wants and the method for the delivering it.

##Patterns used
- **Builder** *For generating parts of the car*
- **Singleton** *For generating only one BMW company*
- **Factory** *For generating delivery way*

##Implementation/Explanation

As I've said I've used **Builder**, **Singleton** and **Factory**  
Everything starts in the **Main** by generating a **Singleton** BMW office  
After that is calling the function to choose the type of the car. It's made with the **Builder** pattern  
According to the type it generates the car, regarding the type.  
Finally, it asks the client to choose the delivery method. It was made with the **Factory** pattern  
Depending on the type of the method it "delivers" the car

##Results
During this Lab I have learned patterns and made a project which combines some of them

