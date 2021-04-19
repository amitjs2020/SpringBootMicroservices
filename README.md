# SpringBoot-Microservices

Create docker image
mvn clean package dockerfile:push

User JSON:
{
    "firstName":"Amit",
    "lastName":"Jain",
    "email":"amit.jain@info.com",
    "departmentId":"1"
}

Department JSON:
{
    "departmentName":"IT",
    "departmentAddress":"3rd Cross, First Street",
    "departmentCode":"IT-006"
}