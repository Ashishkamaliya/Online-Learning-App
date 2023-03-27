<?php
include('db_connect.php');

$db = new DB_CONNECT();
$con = $db->connect();
    
$email = trim($_POST['email']);
$password = trim($_POST['password']);

$qry = "select * from users where email='$email' and password='$password'";
$raw = mysqli_query($con,$qry);
$count = mysqli_num_rows($raw);

if($count>0){          
    $response['message']="exist";       
}else
{
    $response['message']="failed";
}
echo json_encode($response);
?>