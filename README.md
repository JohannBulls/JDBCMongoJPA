# User Registration Application

This application allows users to register with their details, which are then stored in MongoDB. It includes both a backend built with Spring Boot and a frontend developed with React. The frontend enables users to view the list of registered users and add new users through a modal form.

## Features

- **User Registration**: Allows adding new users with fields for first name, last name, birthdate, email, and program.
- **Data Storage**: Stores user data in a MongoDB database.
- **API Integration**: Provides RESTful APIs for managing user data.
- **Responsive UI**: Uses Bootstrap for a responsive and user-friendly interface.

## Project Structure

### Backend (Spring Boot)

The backend server is built using Spring Boot and provides RESTful APIs for managing user data.

#### Main Components

1. **AccessingDataMongodbApplication.java**:
   - The main class for bootstrapping the Spring Boot application.
   - Implements `CommandLineRunner` to initialize data.

2. **RegisterUser.java**:
   - A model class that represents a user.
   - Annotated with `@Document` to map to the MongoDB collection.

3. **RegisterUserRepository.java**:
   - A repository interface extending `MongoRepository` for CRUD operations.
   - Includes custom query methods.

4. **UserController.java**:
   - REST controller that handles incoming requests for managing user data.

5. **WebConfig.java**:
   - Configuration class to enable CORS for the frontend.

6. **application.properties**:
   - Configuration file for MongoDB connection.

### Frontend (React)

The frontend application is built using React and provides a user interface for viewing and adding users.

#### Main Components

1. **App.js**:
   - The main component that renders the `UserTable` component.

2. **UserTable.js**:
   - Displays a list of registered users in a table.
   - Includes a button to open the modal for adding a new user.

3. **UserModal.js**:
   - A modal form for adding new users.
   - Handles form input and submission.

4. **userService.js**:
   - Service module for making API calls to the backend.

## Installation and Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Node.js and npm
- MongoDB

### Backend Setup

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/JohannBulls/JDBCMongoJPA
   cd JDBCMongoJPA
   ```

2. **Compile and Run the Backend**:

   ```bash
   mvn clean install
   mvn java -jar target/JDBCMongoJPA-0.0.1-SNAPSHOT.jar
   ```

### Frontend Setup

1. **Navigate to Frontend Directory**:

   ```bash
   cd jdbcmongo
   ```

2. **Install Dependencies**:

   ```bash
   npm install
   ```

3. **Start the Frontend**:

   ```bash
   npm start
   ```

4. **Access the Application**:
   - Open your browser and go to `http://localhost:3000`


## Technologies Used

- **Backend**: Spring Boot, Java, MongoDB
- **Frontend**: React, Bootstrap
- **API**: RESTful API

## Author

- Johann Amaya Lopez - [GitHub](https://github.com/JohannBulls)

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE.txt) file for details.