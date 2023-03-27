<?php
include('db_connect.php');

$db = new DB_CONNECT();
$con = $db->connect(); 
    
	$name = $_POST['name'];
	$email= $_POST['email'];
	$password= $_POST['password'];
	$gender = $_POST['gender'];
	$m_number = $_POST['m_number'];
	$image = $_POST['image'];


if($name=="" && $email=="" && $password=="" && $gender=="" && $m_number=="")
{
echo '0';
}
else
{
$sql="INSERT INTO users(`id`,`name`,`gender`,`email`,`m_number`,`password`,`image`) VALUES (NULL,'$name','$gender','$email','$m_number','$password','$image')";
$res = mysqli_query($con,$sql);
}
?>