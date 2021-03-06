 # Java Spring Boot -- Github dataset API

In this challenge, you are part of a team building a git event tracking platform. One requirement is for a REST API service to provide events information using the Spring Boot framework. You will need to add functionality to add and delete information as well as to perform some queries. You'll be dealing with typical information for git event data like repository, actor, event type, etc. The team has come up with a set of requirements including filtering and ordering requirements, response codes and error messages for the queries you must implement.

 

The definitions and a detailed requirements list follow. You will be graded on whether your application performs data retrieval and manipulation based on given use cases exactly as described in the requirements.

 

Each event data is a JSON entry with the following keys:
```json
id: This is the event unique ID.
type: This is the event type.
actor: The actor responsible for the event. The actor itself is a JSON entry consisting of following fields:
	id: This is the actor unique ID.
	login: This is the actor unique login ID.
	avatar_url: This is the actor avatar URL.
repo: The repository to which this event is associated with. The repo itself is a JSON entry consisting of following fields:
	id: This is the repo unique ID.
	name: This is the repo name.
	url: This is the repo URL.
created_at: This is the timestamp for the event creation given in the format yyyy-MM-dd HH:mm:ss. The timezone is UTC +0.
```

Sample JSON git event object
 
## API
The REST service should implement the following functionalities:

- Erasing all the events: The service should be able to erase all the events by the DELETE request at /erase. The HTTP response code should be 200.

- Adding new events: The service should be able to add a new event by the POST request at /events. The event JSON is sent in the request body. If an event with the same id already exists then the HTTP response code should be 400, otherwise, the response code should be 201.

- Returning all the events: The service should be able to return the JSON array of all the events by the GET request at /events. The HTTP response code should be 200. The JSON array should be sorted in ascending order by event ID.

- Returning the event records filtered by the actor ID: The service should be able to return the JSON array of all the events which are performed by the actor ID by the GET request at /events/actors/{actorID}. If the requested actor does not exist then HTTP response code should be 404, otherwise, the response code should be 200. The JSON array should be sorted in ascending order by event ID.

- Updating the avatar URL of the actor: The service should be able to update the avatar URL of the actor by the PUT request at /actors. The actor JSON is sent in the request body. If the actor with the id does not exist then the response code should be 404, or if there are other fields being updated for the actor then the HTTP response code should be 400, otherwise, the response code should be 200.

- Returning the actor records ordered by the total number of events: The service should be able to return the JSON array of all the actors sorted by the total number of associated events with each actor in descending order by the GET request at /actors. If there are more than one actors with the same number of events, then order them by the timestamp of the latest event in the descending order. If more than one actors have the same timestamp for the latest event, then order them by the alphabetical order of login. The HTTP response code should be 200.

- Returning the actor records ordered by the maximum streak: The service should be able to return the JSON array of all the actors sorted by the maximum streak (i.e., the total number of consecutive days actor has pushed an event to the system) in descending order by the GET request at /actors/streak. If there are more than one actors with the same maximum streak, then order them by the timestamp of the latest event in the descending order. If more than one actors have the same timestamp for the latest event, then order them by the alphabetical order of login. The HTTP response code should be 200.
 

You should complete the given incomplete project so that it passes all the test cases when running the provided JUnit tests. The project by default supports the use of H2 database, but you can make use of any database to store the events data by specifying the dependency in the pom.xml file.
```sh
/home/rsouza/Ontwikkeling/apache-maven-3.5.4/bin/mvn clean spring-boot:run
/home/rsouza/Ontwikkeling/apache-maven-3.5.4/bin/mvn clean install
/home/rsouza/Ontwikkeling/apache-maven-3.5.4/bin/mvn clean test; cat target/customReports/result.txt
```



### Links

- https://www.concretepage.com/spring-boot/spring-boot-crudrepository-example#Interface
- https://www.baeldung.com/spring-jpa-test-in-memory-database
- https://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration#controller

- http://localhost:8000/h2-console
