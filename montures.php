<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.13.0/css/all.css">
</head>
<?php 
function getData($id){
        $query = "select * from monture where id = ".$id;
        
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
    $result = getData(1);
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
        <button class="login_btn">PANIER</button>
        <ul class="menu">
            <li><a href="panier.php"> <i class="fas fa-shopping-cart"></i></a></li> 
        </ul>
    </header>
    <section id="optique">
        <br> <br> <br> <br> <h1 class="section_title">  montures hommes </h1>  </br> </br> </br> </br>
        <div class="images">
            <ul>
            <li class="homme">
                   <div>

                       <img src=<?php echo $result['image']; ?> alt="Not found">
                   </div>
                   
                   <span class="type"><?php echo $result['type']; ?>  </span>
                   <span class="prix"><?php echo $result['prix']; ?> da</span>
                   <a href="panier.php">AJOUTER AU PANIER</a>
                </li>
                <li class="homme">
                    <div>
                        <img src="02.jpg" alt="">
                    </div>
                    <span>POLICE </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="homme">
                    <div>
                        <img src="03.jpg" alt="">
                    </div>
                    <span>PRADA </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="homme">
                    <div>
                        <img src="10.jpg" alt="">
                    </div>
                    <span>POLAR </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="homme">
                    <div>
                        <img src="11.jpg" alt="">
                    </div>
                    <span>POLAR </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="homme">
                    <div>
                        <img src="15.jpg" alt="">
                    </div>
                    <span>VUARNET </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
            </ul>
        </div>
    </section>
    <section id="optique">
        <h1 class="section_title">montures femmes</h1>
        <div class="images">
            <ul>
                <li class="femme">
                   <div>
                       <img src="04.jpg" alt="">
                   </div>
                   <span>POLAR </span>
                   <span class="prix">4000 da</span>
                   <a href="panier.php">AJOUTER AU PANIER</a>
                </li>
                <li class="femme">
                    <div>
                        <img src="05.jpg" alt="">
                    </div>
                    <span>POLAR </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="femme">
                    <div>
                        <img src="06.jpg" alt="">
                    </div>
                    <span>BOSS </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="femme">
                    <div>
                        <img src="12.jpg" alt="">
                    </div>
                    <span>Channel </span>
                    <span class="prix">4000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="femme">
                    <div>
                        <img src="13.jpg" alt="">
                    </div>
                    <span>BOSS </span>
                    <span class="prix">4000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="femme">
                    <div>
                        <img src="14.jpg" alt="">
                    </div>
                    <span>POLAR </span>
                    <span class="prix">4000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
            </ul>
        </div>
    </section>
    <section id="optique">
        <h1 class="section_title">montures enfants</h1>
        <div class="images">
            <ul>
                <li class="enfant">
                   <div>
                       <img src="07.jpg" alt="">
                   </div>
                   <span>VOGUE </span>
                   <span class="prix">4000 da</span>
                   <a href="panier.php">AJOUTER AU PANIER</a>
                </li>
                <li class="enfant">
                    <div>
                        <img src="08.jpg" alt="">
                    </div>
                    <span>POLAR </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="enfant">
                    <div>
                        <img src="09.jpg" alt="">
                    </div>
                    <span>PRADA </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="enfant">
                    <div>
                        <img src="16.jpg" alt="">
                    </div>
                    <span>POLAR </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="enfant">
                    <div>
                        <img src="17.jpg" alt="">
                    </div>
                    <span>POLAR </span>
                    <span class="prix">3000 da</span>
                    <a href="panier.php">AJOUTER AU PANIER</a>
                 </li>
                 <li class="enfant">
                    <div>
                        <img src="18.jpg" alt="">
                    </div>
                    <span>BOSS </span>
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