
<?php 
  include "inc/conn.php";
  include "inc/header.php";
?>
    <title>Student</title>
</head>
<body>

<?php include "inc/nav.php"; ?>
    <br>
    <div class="container">
<form action="select_meeting.php" method="post">
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Student Name</th>
      <th scope="col">Password</th>
      <th scope="col">Joining Time</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <?php 
  $show_student = pg_query($db, "select * from students order by student_id");
if (!$show_student) {
    echo "An error occurred.\n";
    exit;
  }
  
  while ($row = pg_fetch_row($show_student)) {
    echo "<tr>";
        echo  "<td> $row[0] </td>";
        echo  "<td> $row[1] </td>";
        echo  "<td> $row[2] </td>";
        echo  "<td> $row[3] </td>";
        echo  "<td> $row[4] </td>";
        echo "<td><button class='btn btn-primary' type= 'submit' name= 'select_student' value= '$row[0]' >" . "Log In"  . "</button></td>";
        echo "<td><button class='btn btn-info' formaction='edit_student.php' type= 'submit' name= 'edit_student' value= '$row[0]' >" . "Edit"  . "</button></td>";
    echo "</tr>";
  }
    ?>
  </tbody>
</table>
</form>
        </div>
<?php include "inc/footer.php"; ?>
