<?php 
  include_once "inc/conn.php";
  include "inc/header.php";
?>
    <title>Details Of Meeting</title>
</head>
<body>
<?php include "inc/nav.php"; ?>
    <br><br>
    <div class="container">
         <h3 style="text-align:center; text-decoration: underline;">Meeting Details</h3><br><br>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">Study group id</th>
                <th scope="col">Meeting Id</th>
                <th scope="col">Topic </th>
                <th scope="col">Description</th>
                <th scope="col">Member Limit</th>
                <th scope="col">Created on</th>
                <th scope="col">Student Id</th>
                <th scope="col">Student Name</th>
            </tr>
        </thead>
        <tbody>
        <?php 
        if(isset($_POST['details_meeting']))
        {	 
            $meeting_id = $_POST['details_meeting'];
            $sql = "select * from get_single_meeting_details($meeting_id)";
            $result = pg_query($db, $sql);
            while($row = pg_fetch_row($result)) {
                echo "<tr>";
                echo  "<td> $row[0] </td>";
                echo  "<td> $row[1] </td>";
                echo  "<td> $row[2] </td>";
                echo  "<td> $row[3] </td>";
                echo  "<td> $row[4] </td>";
                echo  "<td> $row[5] </td>";
                echo  "<td> $row[6] </td>";
                echo  "<td> $row[7] </td>";
                //echo "<td><button class='btn btn-info' type= 'submit' name= 'details_meeting' value= '$row[0]' >" . "Details"  . "</button></td>";
                echo "</tr>";
            }
        }
            ?>
        </tbody>
    </table>
    </div>
<?php include "inc/footer.php"; ?>