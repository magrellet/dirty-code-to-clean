# dirty-code-to-clean

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
    "certifications":[
    	"Java 7"
    ],
    "sessions":[
    	"clean code", "microservice with spring boot", "design patterns"
    ]
}