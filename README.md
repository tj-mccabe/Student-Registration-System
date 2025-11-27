# 📚 Student Registration System (Admin Mode)

A simple Java console application that allows an administrator to add students, validate inputs, and view all registered students.
This personal project demonstrates the use of arrays, ArrayLists, loops, input validation, and simple user authentication.

✅ Features

🔐 Admin Login

Requires a valid username and password:

- Username:
- Password:

Re-prompts until correct details are entered.

➕ Add Student

The admin can add a new student with the following validations:

✔ Name Validation

- Must contain letters only (A–Z)
- Cannot be empty.
- Automatically formatted to: first letter uppercase (e.g., alice → Alice)

✔ Age Validation

- Must be a number.
- Must be between 18 and 25.

✔ Username Validation

Must contain:
- letters
- exactly 3 digits at the end

Example valid usernames:

- alice123
- bob456
- mike777

Regex used:

[a-zA-Z]+\d{3}

👀 View Students

Displays all students in the format:

Name | Age | Username

🚪 Exit

Cleanly exits the program.

🛠 Technologies Used

- Java
- Arrays and ArrayList
- Loops & validation
- Scanner for user input
- Regex for username pattern checking
  
📌 Sample Menu

-----------Student Registration System-----------

1. Add student
2. View students
3. Exit

🚀 Future Improvements

- Save/load students to file
- Remove/Edit student
- Admin menu with more options
- Prevent duplicate usernames
