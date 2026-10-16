<!DOCTYPE html>
<html>

<head>
    <title>Student Registration</title>
    <style>
        body {
            background-color: #f5e6d3;
            color: #3b1f0e;
        }
        input, select {
            padding: 4px;
            border: 1px solid brown;
            background-color: #fffaf4;
        }
        input[type="submit"] {
            background-color: brown;
            color: white;
            padding: 6px 16px;
            cursor: pointer;
        }
    </style>
</head>

<body>

    <h2>Student Registration</h2>

    <form action="registerStudent" method="post">

        Name:
        <input type="text" name="name" required>

        <br><br>

        Email:
        <input type="email" name="email" required>

        <br><br>

        Phone:
        <input type="text" name="phone" required>

        <br><br>

        Age:
        <input type="number" name="age" required>

        <br><br>

        Course:

        <select name="course" required>

            <option value="">Select Course</option>

            <option value="B.Tech">B.Tech</option>

            <option value="BCA">BCA</option>

            <option value="MCA">MCA</option>

        </select>

        <br><br>

        <input type="submit" value="Register">

    </form>

</body>

</html>