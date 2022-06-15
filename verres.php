<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to lunettesoptiques</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.0/css/all.css">
</head>
<?php 
function getData($id){
        $query = "select * from verre where id = ".$id;
        
        $conn = mysqli_connect("localhost", "root", "", "lunette_optique");
          if (mysqli_connect_errno())
              echo " connection to DB was Failed";
          $result = mysqli_query($conn, $query);
          mysqli_close($conn);
          if ($result)
            return mysqli_fetch_assoc($result);
    }
    
    ?>
    <?php 
    $result = getData(2);
    ?>
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
            <li><a href="index.php">Acceuil</a></li>
            <li><a href="montures.php">montures</a></li>
            <li><a href="lentilles.php">lentilless</a></li>
            <li><a href="accesoires.php">accesoires</a></li>
            <li><a href="verres.php">verres</a></li>
            <li><a href="index.php">Contact</a></li>
        </ul>
        <button class="login_btn"> Bienvenue </button>
        <ul class="menu">
            <li><a href="panier.php"> <i class="fas fa-shopping-cart"></i></a></li> 
        </ul>
    </header>
    <section id="optique">
        <h1 class="section_title"> verres </h1>
        <div class="images">
            <ul>
            <li class="verre">
                   <div>

                       <img src=<?php echo $result['image']; ?> alt="Not found">
                   </div>
                   
                   <span class="type"><?php echo $result['type']; ?>  </span>
                   <span class="prix"><?php echo $result['prix']; ?> da</span>
                   <a href="panier.php">AJOUTER AU PANIER</a>
                </li>
                <li class="verre">
                    <div>
                        <img src="42.png" alt="">
                    </div>
                    <span>verre </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="verre">
                    <div>
                        <img src="43.jpg" alt="">
                    </div>
                    <span>verre </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="verre">
                    <div>
                        <img src="44.jpg" alt="">
                    </div>
                    <span>verre </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="verre">
                    <div>
                        <img src="45.jpeg" alt="">
                    </div>
                    <span>verre </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="verre">
                    <div>
                        <img src="46.jpg" alt="">
                    </div>
                    <span>verre </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
            </ul>
        </div>
    </section>
    <footer>   
        <p> &copy djemil; 2022 </p>  
 </footer>
</body>
</html>