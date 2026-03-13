# The Ground Truth: Spring Boot REST Control
This marketing hype is the only part where I had to use AI. It's pretty nice work by Gemini (in a separate browser chat window). I just couldn't make myself sound so hyperbolic.

Though the project is simple, I really liked actually digging into the documentations. 

It's like making dinner at home versus always going to a restaurant because now you can afford it. 

It's nice to know that you still remember how to cook.

## The Artisan’s Baseline in an AI-Driven World

**In the era of Agentic Orchestration, the greatest risk is False Velocity—moving fast without realizing the underlying architecture is decaying. This project was built 100% manually. It serves as my "Ground Truth," a reminder to sometimes sit back and read the documents and the APIs.**

### The Architecture
This is a triple-layer tested Spring Boot 3.x application (Java 21) designed to demonstrate the "proper" way to handle REST services.

Integration Tests: Full server-up testing to validate the entire network stack.

Container Tests: Targeted Spring Web Context testing for focused validation.

Controller Tests: Individual unit testing of entry points using Mock injection.

### Technical Lessons
While simple in scope, this project demonstrates mastery over the "tricky" parts of the Spring ecosystem:

Log4j2 vs. Logback: Explicitly navigating the dependency exclusions in pom.xml to enforce a specific logging implementation over the Spring default.

Mockito Inline-Mock-Maker: Proactively resolving Java 21+ deprecation warnings, showing a commitment to maintaining a clean, modern build path.

Lombok Integration: Using @Slf4j and boilerplate reduction to keep the focus on business logic without sacrificing observability.

### Staying Close to the Metal
This project is done in the spirit of "nothing is too basic to relearn." It is  a reflection of a core engineering philosophy: an architect must still know how to mix the concrete.

This project is the deliberate antidote to high-speed AI orchestration. It is an exercise in executing the fundamentals 100% by hand. You cannot effectively audit a micro-agent's output if your own foundational skills have grown rusty. This repository ensures my architectural standards remain rooted in active, ground-level craftsmanship rather than theoretical management.