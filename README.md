# reverse-echo-server :


->Java Networking Project - Reverse Echo Server

This project demonstrates the fundamentals of networking in Java, focusing on creating a **multithreaded server** that communicates with multiple clients. It is designed for educational purposes to help understand how `ServerSocket` and `Socket` classes work in Java.

---

## Project Overview
- **Server**: Listens for client connections using a `ServerSocket`. For each client that connects, a new thread is spawned to handle communication, allowing multiple clients to interact with the server simultaneously.
- **Client**: Connects to the server using a `Socket` and communicates by sending messages. Each message is reversed by the server and sent back to the client.
- **Bidirectional Communication**: The client can continuously send messages to the server, which processes and responds to each message until the client sends the termination command (`dne`).

---

## Key Features
1. **Multithreading**: 
   - Each client connection is handled in a separate thread, ensuring simultaneous and independent communication with multiple clients.
2. **Message Processing**:
   - The server reads a message from the client, reverses it, and sends it back.
   - Communication continues until the client sends the termination keyword (`dne`).
3. **Multiple Clients**:
   - Any number of clients can connect to the server, and their requests are managed concurrently.
4. **Simple Termination**:
   - Sending the keyword `dne` ends the session for the respective client.

---


## Usage Example
1. **Start the Server**:
   - Run the server code in a terminal. The server will start listening for connections on port `2000`.
2. **Connect Clients**:
   - Open one or more terminals and run the client code. Each client establishes a connection to the server.
3. **Exchange Messages**:
   - Type messages in the client terminal, and the server will reverse the message and send it back. For example:
     - Client sends: `hello`
     - Server responds: `olleh`
4. **Terminate Communication**:
   - To end the session, the client sends the message `dne`. This closes the connection for that client.

---

## Practical Learning Outcomes
By working on this project, you will:
- Gain hands-on experience with Java networking APIs (`ServerSocket`, `Socket`).
- Understand how multithreading enables concurrent processing of multiple client requests.
- Learn the importance of synchronized communication between a server and its clients.
- Explore how to design and implement bidirectional communication protocols.

---

## Notes and Recommendations
- Ensure that the server is started before running the clients.
- The server listens on port `2000` by default. Modify the port if necessary.
- Each client operates independently, so multiple clients can interact with the server simultaneously without interfering with each other.
- This project can be extended by adding features like authentication, file transfer, or encryption for enhanced functionality.

---

## Author
**Narayan**  
An enthusiast exploring Java Networking and Development.

Feel free to use, modify, and learn from this project. Contributions are welcome!
```

