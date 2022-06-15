<?php
session_start();
if (isset($_SESSION['username'])) {
    if ($_SESSION['status'] == "admin") {
        header('location: ../admin/index.php');
    } else {
        header('location: ../user/index.php');
    }
}
?>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">ù
    <title>Welcome to lunettesoptiques</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.0/css/all.css">
</head>
<body>
    <header>
        <!-- menu responsive -->
        
        <div class="menu_toggle">
            <span></span>
        </div>

        <div class="logo">
            <p><span>Lunettes</span>optique</p>
        </div>
        <ul class="menu">
            <li><a href="#home">Acceuil</a></li>
            <li><a href="montures.php">montures</a></li>
            <li><a href="lentilles.php">lentilless</a></li>
            <li><a href="accesoires.php">accesoires</a></li>
            <li><a href="verres.php">verres</a></li>
            <li><a href="#contact">Contact</a></li>
        </ul>
        <button class="login_btn"  > Bienvenue </button>
        <ul class="menu">
            <li><a href="panier.php"> <i class="fas fa-shopping-cart"></i></a></li> 
        </ul>
       
    </header>
    <section id="home">
        <div class="left">
            <h1>Faire <span>votre devis</span> Chez nous</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odit doloremque earum, totam laudantium dolor voluptatum fugiat. Odio doloribus nostrum harum corporis. Natus omnis deleniti reiciendis illum maxime necessitatibus accusantium esse.</p>
            <a href="#">BUY NOW</a>
        </div>
        <div class="right">
            <img src="00.jpg">
        </div>
    </section>
    
    
    <footer >
        <h2 id="contact">nous contacter</h2>
        <form action="connect.php" method="post" >
            <input placeholder="name" id="name" name="name">
            <input placeholder="email" id="email" name="email">
            <input placeholder="Entrer Message" id="message" name="message" >
            <button type="submit" >se connecter</button>
        </form>
        <div id="copyright">
            <span>&copy djemil; 2022</span>
 
        </div>
    </footer>