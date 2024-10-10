<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>ERROR</title>
	<link rel="stylesheet" href="../css/style.css">
    <link rel="shortcut icon"href="../img/milogo.png">
	<link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https: //fonts.googleapis.com/css2? family= Abhaya+Libre:wght@800 & family= Montserrat:wght@500;800 & display=swap" rel="stylesheet">


</head>
<body>
	<div class="relative w-screen h-screen">
            <div class="bouncy-balloon w-full h-full bg-black bg-white-grad-1 overflow-hidden">
            </div>
    </div>
            
	<div class="container">
		<form action="validar.php" method="post">
		<div class="login">		

			<div class="boton">
			<h1>WELCOME</h1>
			</div>
	           <div class="inputs_login">
	           	<p><input type="text" placeholder="Correo electrónico" name="usuario" required></p>
	            <p><input type="password" name="password" placeholder="Contraseña" required></p>
	           </div>
	           <input class="button" type="submit" name="" value="Iniciar sesión" >        	
	  	</form>
		</div>
    </div>
	
</body>
</html>

<?php  
	include('db.php');

$usuario= $_POST['usuario'];
$password= $_POST['password'];
$consulta="SELECT*FROM usuarios where usuario='$usuario' and password= '$password'";
$resultado=mysqli_query($conexion,$consulta); 
$filas=mysqli_num_rows($resultado);


	

if ($filas) {

	session_start();
	$_SESSION['user']= $_POST['usuario'];
	header("location:home.php?usuario=".urldecode($usuario)); 
}else{
 ?>
 <h2>Usuario o contraseña incorrecta</h2>
<?php


}
mysqli_free_result($resultado);
mysqli_close($conexion);

?>