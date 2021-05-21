# PruebaCasaLimpia
formulario de registro, consultas mysql
//////////////////////////////

A continuacion se presentan los pasos a seguir para abrir el archivo

1.Descarga el archivo del repositorio en tu equipo.
2.Abre el IDE eclipse neon 3
3.sigue la ruta File->import->Marven->exiting marven proyect
4.luego dale click en browser y busca la ruta donde descargaste el archivo y dale click en finish
5.El proyecto puede que aparezzca con una "x" de error debido a que manejamos diferentes recursos marven que deben ser instalados en el proyecto
6.Damos click derecho e la carpeta del proyecto y seguimos la siguiente ruta marven->Update-project y esperamos que realice el proceso
7.vamos a la pestaña Run->Run Configurations y damos click en New Launch Configuration (dibujo de hoja con un +)
8.Colocamos un nombre a nuestra configuracion... ejemplo Name: prueba1
9.En el campo Project damos click en browse... y buscamos nuestro archivo de nombre Prueba
10.en el campo Main class: damos click en Search y buscamos el package com.prueba.casalimpia.PruebaApplication
11.click en Run
12.Asegurate que en consola aparezca el siguiente mensaje "INFO 11136 --- [nio-8080-exec-2] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms"
13.Abre tu navegador
14.copia y pega esta ruta http://localhost:8080/prueba/home y listo		

Debes entrar a la carpeta del proyecto JavaResources/src/main/resources, al archivo "application.properties" y cambiar 
los campos que corresponden a la ruta de tu base de datos
