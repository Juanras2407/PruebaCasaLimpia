<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulario Agencia</title>
<style>
:root { --color-white: #fff; 
	--color-orange: #d64412; 
	--color-green: #37af65; 
	--color-blue: #0101ee;
}

*, *::before, *::after {
	box-sizing: border-box;
}

body {
	font-family: verdana;
	font-size: 1rem;
	font-weight: 400;
	line-height: 1.4;
	color: white;
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

#titulo {
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

input, button {
	margin: 0;
	font-family: inherit;
	font-size: inherit;
	line-height: inherit;
	margin-left: 20%;
}

label {
	display: flex;
	align-items: center;
	font-size: 1.125rem;
	margin-bottom: 0.5rem;
	margin-left: 20%;
}

button {
	border: none;
	margin-left: 45%;
}

.cuadroClase {
	display: block;
	width: 60%;
	height: 2.375rem;
	padding: 0.375rem 0.75rem;
	color: #495057;
	background-color: #fff;
	background-clip: padding-box;
	border: 1px solid #ced4da;
	border-radius: 0.25rem;
	transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
}

.cuadroClase:focus {
	border-color: #80bdff;
	outline: 0;
	box-shadow: 0 0 0 0.2rem rgba(, 123, 255, 0.25);
}

.enviarBoton {
	display: block;
	width: 100px;
	padding: 0.75rem;
	background: var(- -color-white);
	color: #000;
	border-radius: 2px;
	cursor: pointer;
}
</style>
</head>
<body>
	<div>
		<div>
			<h2 id="titulo">Formulario de inscripcion para su Agencia</h2>
		</div>
		<hr>
		<div>
			<div>
				<h2 id="subtitulo">Diligencie a continuacion los datos
					solicitados</h2>
				<div>
					<form action="<%=request.getContextPath()%>/FormularioAgencia"
						method="post">
						<div>
							<label for="nombre">Nombre de la Agencia:</label> <input
								class="cuadroClase" type="text" id="nombre"
								placeholder="ingrese el nombre de la agencia" name="nombre"
								required>
						</div>
						<div>
							<label for="nit">Ingrese su NIT:</label> <input
								class="cuadroClase" type="text" id="nit"
								placeholder="ingrese nit sin '.' ni '-' " name="nit" required>
						</div>
						<div>
							<label for="telefono">Telefono:</label> <input
								class="cuadroClase" type="text" id="telefono"
								placeholder="ingrese su numero telefonico" name="telefono"
								required>
						</div>

						<div>
							<label for="direccion">Direccion:</label> <input
								class="cuadroClase" type="text" id="direccion"
								placeholder="ingrese su Direccion" name="direccion" required>
						</div>
						<br> <br>

						<button class="enviarBoton" type="submit">Enviar</button>
					</form>
				</div>
			</div>
		</div>
	</div>


</body>
</html>