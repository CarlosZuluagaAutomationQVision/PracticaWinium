#language: es
#czuluaga@qvision.us

Característica: enviar correo con un archivo desde gmail
  yo como usuario de gmail
  deseo poder enviar un correo electronico con un archivo
  para garantizar que el correo soporta carga de archivos


  Escenario: Realizar el envio de un correo electronico con un archivo específico
    Dado que Carlos inicia sesion en gmail
    Cuando envie un correo con un archivo
    Entonces podemos visualizar el correo enviado con el archivo cargado