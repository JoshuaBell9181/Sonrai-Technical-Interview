![alt text](https://media-exp1.licdn.com/dms/image/C4E0BAQEzIssen9c0aw/company-logo_200_200/0?e=2159024400&v=beta&t=ZKCEoUzVT5W3MJZI9-oZlt6KafC7DHdPBRZ1uuY1wew "Sonrai Security Logo")

# Sonrai-Technical-Interview
The purpose of this technical interview is to show java development skills.

## Challenge
Create a java program that calculates the power of a number without using the built-in pow() function from the math lib.

## Running the program

Clone repository
```bash
git clone https://github.com/JoshuaBell9181/Sonrai-Technical-Interview.git
cd ./Sonrai-Technical-Interview/
```

Build a jar with dependencies included
```bash
mvn clean install
```

Run the program
```bash
java -jar ./target/calculator-0.0.1-SNAPSHOT.jar tecical.interview.calculator.Main
```

## Design decisions
1. I decided to create a Calculator class and implement a calculatePower method in-case we decided to add more methods in the future.
2. Used Junit to add automated test cases for code maintainability 
If I missed a test scenario a future dev would be able to see what test cases were tested.
3. Used Maven to manage project dependencies which are standard in the industry.
4. Although I have only implemented this code set to handle integers a future design decision may be to use the real number set.

## Dependencies
#### Must have maven and java installed to run








