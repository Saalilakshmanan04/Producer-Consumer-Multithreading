# Producer–Consumer Problem (Java Multithreading)

## Project Description
This project implements the classic **Producer–Consumer Problem** using **Java multithreading**.  
It demonstrates how multiple threads can safely share data using synchronization and inter-thread communication.

---

## Objective
- Implement producer and consumer threads
- Maintain a shared buffer with limited capacity
- Prevent race conditions
- Handle thread coordination using wait and notify

---

## Technologies Used
- Java (Core Java)
- Multithreading
- Synchronization
- wait() and notify()

---

## Key Concepts Demonstrated
- Thread creation using Runnable
- Synchronized methods
- Inter-thread communication
- Thread-safe shared resource handling

---

## Project Structure
Producer-Consumer-Multithreading:
- Buffer.java
- Producer.java
- Consumer.java
- Main.java

----
## Working Explanation

The Producer thread generates data and adds it to a shared buffer.

The Consumer thread removes data from the buffer.

If the buffer is full, the Producer waits.

If the buffer is empty, the Consumer waits.

Synchronization ensures thread safety.

## Output

The output shows produced and consumed values.
Execution order may vary due to thread scheduling.

## Conclusion

This project provides a clear understanding of Java multithreadin
