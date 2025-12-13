# Spring Boot test framework samples
Some samples for testing REST services in Spring Boot. 

Tests:
* Integration tests (with a server)
* Container tests (only Spring web context)
* Controller tests for individual containers.

Features:
* Mock injection
* Logging with log4j2

Some pro tips include: 
* New versions of Java warn of coming deprecation of Mockito "inline-mock-maker". See pom.xml for fix.
* Actually having log4j implementation instead of Logback is slightly tricky. See pom.xml exclusion and Lombok @Slf4j inclusion (pom.xml and annotations in classes)
