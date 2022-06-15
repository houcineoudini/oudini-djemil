
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>lentilles</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.0/css/all.css">
    
</head>
<?php 
function getData($id){
        $query = "select * from lentilles where id = ".$id;
        
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
            <li><a href="lentilles.php">lentilles</a></li>
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
        <h1 class="section_title"> lentilles </h1>
        <div class="images">
        <ul>
        <li class="homme">
                   <div>

                       <img src=<?php echo $result['image']; ?> alt="Not found">
                   </div>
                   
                   <span class="marque_labo"><?php echo $result['marque_labo']; ?>  </span>
                   <span class="prix"><?php echo $result['prix']; ?> da</span>
                   <a href="panier.php">AJOUTER AU PANIER</a>
                </li>
             <li class="lentille">
                 <div>
                     <img src="022.jpg" alt="">
                 </div>
                 <span>Acuvue Oasys </span>
                 <span class="prix">3000 da</span>
                 <a href="panier.php">AJOUTER AU PANIER</a>
              </li>
              <li class="hommelentille">
                 <div>
                     <img src="033.jpg" alt="">
                 </div>
                 <span>Biofinity </span>
                 <span class="prix">3000 da</span>
                 <a href="panier.php">AJOUTER AU PANIER</a>
              </li>
              <li class="lentille">
                <div>
                    <img src="011.jpg" alt="">
                </div>
                <span>DAILIES AquaComfort Plus </span>
                <span class="prix">4000 da</span>
                <a href="panier.php">AJOUTER AU PANIER</a>
             </li>
             <li class="lentille">
                 <div>
                     <img src="022.jpg" alt="">
                 </div>
                 <span>Acuvue Oasys </span>
                 <span class="prix">3000 da</span>
                 <a href="panier.php">AJOUTER AU PANIER</a>
              </li>
              <li class="hommelentille">
                 <div>
                     <img src="033.jpg" alt="">
                 </div>
                 <span>Biofinity </span>
                 <span class="prix">3000 da</span>
                 <a href="panier.php">AJOUTER AU PANIER</a>
              </li>
        </ul>
    </div>
    </section>
    <footer>
        <p> jimmy Copyright 2022 </p>
    </footer>
</body>
</html>