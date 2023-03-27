<?php
include('db_connect.php');

$db = new DB_CONNECT();
$con = $db->connect(); 

    $sql="select * from users";
    
    $r=mysqli_query($con,$sql);
    $response=array();
    
    while($row=mysqli_fetch_array($r))
    {
        $value["id"]=$row["id"];
        $value["name"]=$row["name"];
        $value["surname"]=$row["gender"];
        $value["email"]=$row["email"];
        $value["password"]=$row["password"];
        $value["password"]=$row["m_number"];
        $value["password"]=$row["image"];
                
        array_push($response,$value);
        
    }
    
    echo json_encode($response);
    mysqli_close($con);
    
?>