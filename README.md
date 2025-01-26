# Devoir2Java

This homework involves creating a simple RMI (Remote Method Invocation) project in Java to manage a list of contacts and perform various operations on them.

## Project Structure

The project consists of the following files:


## Overview

1. **CarnetAdresseImpl.java**: This file contains the implementation of the `ICarnetAdresse` interface, where all the methods related to contact operations are defined.
   
2. **Client.java**: This is the client-side application that connects to the RMI server and interacts with the contact list by calling the methods exposed by the RMI interface.

3. **ICarnetAdresse.java**: This is the RMI interface that declares the methods for managing the contact list, such as adding and retrieving contacts.

4. **Server.java**: The server-side application that registers the `CarnetAdresseImpl` object with the RMI registry and listens for client requests.


## How to Run

1. Compile and run the Server:
    ```bash
    javac Server.java && java Server
    ```

2. Compile and run the Client:
 
    - Use another terminal window to run the Client class:
    ```bash
    javac Client.java && java Client
    ```


