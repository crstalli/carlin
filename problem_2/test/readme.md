#Sample by Chris Stallings (chris.stal@gmail.com)
##Application to return json in the format provided. 
### Project:
This project has an endpoint /user to post a json to, and will return a json in the format specified in the sample. You can import this into eclipse, run with maven,
or just run the jar.


###Running
#### Command line with maven and java 8 installed.
To run, ensure that you have java 8 and maven installed properly. 
Go to the root of the project folder, and run  
    
    mvn package && java -jar target/test-0.0.1-SNAPSHOT.jar

#### Eclipse EE as Maven Project    
If you are in eclipse, just navigate import the project, and run the TestApplication class. Maven installs the dependencies to run this spring boot application in an embeded tomcat container.

#### Other
It is possible to run this on an existing tomcat server, although i did not leave the instructions or maven steps to export this as a war file.

###Using
####Get
Just send a get request to ip:8080/user to verify that this works (ip is the ip address, localhost, etc). 

####Post
Open your favorite means to send a post request, specify the Content-Type: application/json; charset=utf-8 in the request header, then paste some json representing the json you want to get back in the form provided in the sample. The easiest way to do this is to provide the exact json from the sample. 


    EX:
    Method:
        Post: localhost:8080/user
    Headers: 
        Content-Type: application/json; charset=utf-8
    Body:
        {   "id": 123,
        "name": "Sample Name",
        "active": true,
        "count": 1020,
        "address_ids": [
            1,
            30,
            100,
            50
        ],
        "accounts": [
            {
                "id": 1,
                "name": "Test Account 1"
            },
            {
                "id": 2,
                "name": "Test Account 2"
            }
        ]}
        
        
I believe that this is what was asked from the question, but I did not need to do any parsing of the json manually, as Spring/Jackson will do this for you.

Please contact me at chris.stal@gmail.com if you have any questions or if you would like me to iterate on this.

Although they are not thorough, Feel free to run the unit tests in com.test.TestApplicationTests