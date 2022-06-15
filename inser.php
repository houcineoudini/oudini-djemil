<?php
$name = $_POST['name'];
$numero = $_POST['numero'];
$commande = $_POST['commande'];
// bdconnect
$conn = new mysqli("localhost", "root","", "bddomar");
if ($conn->connect_error){
    die('Connection Failed : '.$conn->connect_error);
}else {
    $stmt = $conn->prepare("insert into panier(name, numero, commande) values(?, ?, ?)");
    $stmt->bind_param("sii",$name, $numero, $commande);
    $stmt->execute();
    echo "registration SUccesfuly...";
    $stmt->close();
    $conn->close();
}
?>