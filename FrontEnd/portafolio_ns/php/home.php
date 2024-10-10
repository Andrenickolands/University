<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Home</title>
	<link rel="stylesheet" href="../css/home.css">
    <link rel="shortcut icon"href="../img/milogo.png">
	<link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https: //fonts.googleapis.com/css2? family= Abhaya+Libre:wght@500 & display=swap & family= Abhaya+Libre:wght@800 & family= Montserrat:wght@500;800 & display=swap" rel="stylesheet">


</head>
<body>
            
<?php
	session_start();
	if (!isset($_SESSION['user'])) {
		header("location:../index.php");
	}
?>

<form class="Boton" action="cerrar_sesion.php" method="post">
	<input class="boton" type="submit" name="" value="Cerrar sesión" >
</form>


<h2>Hola, mi nombre es</h2>
<h1>Nicolás Sepúlveda</h1>

<div class="relative w-screen h-screen">
  <div class="bouncy-balloon w-full h-full bg-black bg-white-grad-1 overflow-hidden"></div>
</div>


</body>
</html>