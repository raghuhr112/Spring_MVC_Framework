<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Info of Traffic Violation</title>

<style>
        input {
            width: 100px;
            position: absolute;
            align-self: auto;
        }

        label {
            text-align: right;
            position: relative;
        }

        .traffic {
            align-items: center;
            text-align: center;
        }

        h2 {
            text-align: center;
        }
    </style>


</head>
<body>

    <h2>Info of Traffic Violation </h2>

    <form action="save.do" class="traffic">
        <label for="fname">Vehicle Reg No.</label>
        <input type="text" name="vehicleNo"> <br><br>
        <label for="place">Place</label>
        <input type="text" name="place"><br><br>
        <label for="dateAndTime">Date and Time</label>
        <input type="datetime-local" name="dateAndTime"><br><br>
        <label for="violation">Nature of Violation</label>
        <select name="violation">
            <option value="select">---Select Violation---</option>
            <option value="Drink & Drive ">Drink and Drive</option>
            <option value="Minor age Driver">Minor age Driver</option>
            <option value="No DL">No DL</option>
            <option value="No RC">No RC</option>
            <option value="No Insurance">No Insurance</option>
        </select><br><br>
        <label for="file">Upload Violation Photo</label>
        <input type="file" name="file">
        <input type="submit">
    </form>

</body>
</html>