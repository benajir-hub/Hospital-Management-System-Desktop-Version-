<?php 
  include_once "inc/conn.php";
  include "inc/header.php";
?>
    <title>List Of Meeting</title>
</head>
<body>


<?php include "inc/nav.php"; ?>
     <br>
    <div class="container">
    <h3 style="text-align:center; text-decoration: underline;">List of Availabe Meeting</h3><br>
    <form action="details_meeting.php" method="post">
    <table class="table">
        <thead>
            <tr>
                <th scope="col">Meeting Id</th>
                <th scope="col">place</th>
                <th scope="col">start time</th>
                <th scope="col">End time</th>
                <th scope="col">Action</th>
            </tr>
        </thead>
        <tbody>
        <?php 
        $result = pg_query($db, "select * from get_meeting_overview();");
        if (!$result) {
            echo "An error occurred.\n";
            exit;
        }
        
        while ($row = pg_fetch_row($result)) {
            echo "<tr>";
                echo  "<td> $row[0] </td>";
                echo  "<td> $row[1] </td>";
                echo  "<td> $row[2] </td>";
                echo  "<td> $row[3] </td>";
                echo "<td><button class='btn btn-info' type= 'submit' name= 'details_meeting' value= '$row[0]' >" . "Details"  . "</button></td>";
                echo "<td><button class='btn btn-success' formaction='edit_meeting.php' type= 'submit' name= 'edit_meeting' value= '$row[0]' >" . "Edit"  . "</button></td>";
            echo "</tr>";
        }
            ?>
			
			
			
        </tbody>
    </table>
    </form>    
    </div>
    <br>
    <div class="container">
    <h3 style="text-align:center; text-decoration: underline;">Remove hidden meeting only</h3><br><br>
    <form action="fsr_if_process.php" method="post">
    <table class="table">
        <thead>
            <tr>
                <th scope="col">Meeting Id</th>
                <th scope="col">Place</th>
                <th scope="col">Start Time</th>
                <th scope="col">End Time</th>
                <th scope="col">Action</th>
            </tr>
        </thead>
        <tbody>
        <?php 
        $result = pg_query($db, "select * from only_hidden_meeting_list();");
        if (!$result) {
            echo "An error occurred.\n";
            exit;
        }
        
        while ($row = pg_fetch_row($result)) {
            echo "<tr>";
                echo  "<td> $row[0] </td>";
                echo  "<td> $row[1] </td>";
                echo  "<td> $row[2] </td>";
                echo  "<td> $row[3] </td>";
                echo "<td><button class='btn btn-danger' type= 'submit' name= 'delete_meeting' value= '$row[0]' >" . "Delete"  . "</button></td>";
                echo "<td><button class='btn btn-info' type= 'submit' name= 'visible' value= '$row[0]' >" . "Make Visible"  . "</button></td>";
                echo "</tr>";
        }
            ?>
        </tbody>
    </table>
    </form>   
    </div>
	

<?php include "inc/footer.php"; ?>