<?php
$name = $_POST['name'];
$email = $_POST['email'];
$message = $_POST['message'];
// bdconnect
$conn = new mysqli("localhost", "root","", "lunette_optique");
if ($conn->connect_error){
    die('Connection Failed : '.$conn->connect_error);
}else {
    $stmt = $conn->prepare("insert into registrations(name, email, message) values(?, ?, ?)");
    $stmt->bind_param("sss",$name, $email, $message);
    $stmt->execute();
    echo "registration SUccesfuly...";
    $stmt->close();
    $conn->close();
}
?>