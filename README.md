# dirty-code-to-clean

Requirement:

-Name not empty
-Last name not empty
-Valid email (that contains @)
-More (or equals) than 10 years of experience
-At least 1 degree or 1 certification


to run:

mvn spring-boot:run

To test:

http://localhost:8080/api/v1/speaker

Method: POST

Body:

{
	"name":"my name",
	"lastName":"my last name",
    "emailAddress":"mail@mail.com",
    "yearsOfExperience":10,
    "employeer":"my company",
    "hasBlog":false,
    "blogUrl":null,
    "degrees":[
    	"Software engineer", "Computer Sciences"
    ],
    "certifications":[
    	"Java 7"
    ],
    "sessions":[
    	"clean code", "microservice with spring boot", "design patterns"
    ]
}

