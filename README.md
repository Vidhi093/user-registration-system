# user-registration-system

### Entity Class: UserInfo.java

#### Purpose:
The `UserInfo` class serves as a model for storing user information in the system.

#### Structure:
- **Attributes**:
  - `username`: String representing the user's unique username.
  - `password`: String representing the user's password.
  - `email`: String representing the user's email address.
  - `name`: String representing the user's name.

#### Methods:
- `getUsername()`: Retrieves the username.
- `setUsername()`: Sets the username.
- `getPassword()`: Retrieves the password.
- `setPassword()`: Sets the password.
- `getEmail()`: Retrieves the email.
- `setEmail()`: Sets the email.
- `getName()`: Retrieves the name.
- `setName()`: Sets the name.

### Servlet: LoginServlet.java

#### Purpose:
The `LoginServlet` handles user authentication.

#### Functionality:
- **`doGet()` Method**:
  - Accepts user-provided credentials (username, password) via GET request.
  - Validates the credentials against stored user information.
  - Grants access upon successful authentication.

#### Dependencies:
- `UserInfo` for retrieving and validating user login information.

### Servlet: RegisterServlet.java

#### Purpose:
The `RegisterServlet` manages the user registration process.

#### Functionality:
- **`doGet()` Method**:
  - Receives user details (name, email, username, password) via GET request.
  - Validates the information and creates a new user account.
  - Stores the new user's information in the temporary storage.

#### Dependencies:
- `UserInfo` for creating and storing new user accounts.

### Servlet: UpdateServlet.java

#### Purpose:
The `UpdateServlet` handles updating user information.

#### Functionality:
- **`doGet()` Method**:
  - Accepts updated user details (username, password, new email) via GET request.
  - Validates the changes and updates the user's information.
  - Reflects the changes in the temporary storage.

#### Dependencies:
- `UserInfo` for retrieving, modifying, and updating user data.

### HTML Files:

#### `login.html` (Login/Signup Page)
- A landing page with options for login and registration.
- Links to `loginform.html` and `registerform.html`.

#### `loginform.html` (Login Form)
- Accepts username and password for login authentication.
- Sends data to `LoginServlet` for processing.

#### `registerform.html` (Registration Form)
- Collects user details (name, email, username, password) for registration.
- Sends data to `RegisterServlet` for account creation.

#### `dashboard.html` (User Dashboard)
- Displays user information (name, email, username, possibly password hidden).
- May link to the `updateform.html` for information modification.

#### `updateform.html` (Update Email Form)
- Allows users to update their email address.
- Sends data to `UpdateServlet` for processing.
  
