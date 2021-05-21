<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inicio</title>
<style>
:root { -
	-color-white: #fff; -
	-color-orange: #d64412; -
	-color-green: #37af65; -
	-color-blue: #0101ee;
}

*, *::before, *::after {
	box-sizing: border-box;
}

body {
	font-family: verdana;
	font-size: 1rem;
	font-weight: 400;
	line-height: 1.4;
	color: var(- -color-white);
	margin: 0;
}

body::before {
	content: '';
	position: fixed;
	top: 0;
	left: 0;
	height: 100%;
	width: 100%;
	z-index: -1;
	background: var(- -color-blue);
	background-image: linear-gradient(115deg, rgba(100, 58, 158, 0.5),
		rgba(136, 100, 106, 0.4)),
		url(https://blog.computrabajo.com.co/candidato/wp-content/uploads/2018/09/empleos-futuros.jpg);
	background-size: cover;
	background-repeat: no-repeat;
	background-position: right;
}

form {
	background: linear-gradient(115deg, rgba(100, 58, 158, 0.5),
		rgba(136, 100, 106, 0.4));
	padding: 2.5rem 0.625rem;
	border-radius: 1.25rem;
}

#bienvenida {
	font-weight: 3800;
	line-height: 1.2;
	text-align: center;
	color: white;
}

#subtitulo {
	font-weight: 800;
	line-height: 1.2;
	color: white;
	text-align: center;
}

button {
	margin-left: 45%;
	font-family: inherit;
	font-size: inherit;
	line-height: inherit;
	border: none;
}

label {
	display: flex;
	align-items: center;
	font-size: 1.125rem;
	margin-bottom: 0.5rem;
}

.enviarBoton {
	display: block;
	width: 10%;
	padding: 0.75rem;
	background: var(- -color-white);
	color: #000;
	border-radius: 2px;
	cursor: pointer;
}
hr{
margin-bottom:100px;
}
</style>
</head>
<body>

	<div>
		<div>
			<h1 id="bienvenida">Bienvenido, Buscamos el mejor empleo para
				ti!</h1>
		</div>
		<hr>
		<div>

			<div>

				<h2 id="subtitulo"><strong>Para Agencia presione el siguiente boton</strong></h2>
				<button class="enviarBoton" type="submit" onClick="/">
					<a style="text-decoration: none;"
						href='http://localhost:8080/prueba/formularioAgencia'>Ingresar</a>
				</button>
			</div>

			<div>
				<h2 id="subtitulo"><strong>Para Aspirante presione el siguiente boton</strong></h2>
				<button class="enviarBoton" type="button"
					onClick="/formularioAspirante.jsp">
					<a style="text-decoration: none;"
						href='http://localhost:8080/prueba/formularioAspirante'>Ingresar</a>
				</button>
			</div>
		</div>
</body>
</html>