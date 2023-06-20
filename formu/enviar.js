$(document).ready(function() {
    $('#listar').on('click', function() {
        let tabla = document.querySelector('#tabla');
        tabla.innerHTML = '';
        $.ajax({
            url: "http://localhost:8080/listabase",
            type: "GET",
            dataType: "json",
            success: function(respuesta) {
                console.log(respuesta);
                for (i = 0; i < respuesta.length; i++) {
                    tabla.innerHTML += '<tr>' +
                        '<td>' + respuesta[i].codigo + '</td>' +
                        '<td>' + respuesta[i].nombre + '</td>' +
                        '<td>' + respuesta[i].apellido + '</td>' +
                        '<td>' + respuesta[i].curso + '</td>' +
                        '<td>' + respuesta[i].nota1 + '</td>' +
                        '<td>' + respuesta[i].nota2 + '</td>' +
                        '<td>' + respuesta[i].nota3 + '</td>' +
                        '<td>' + respuesta[i].promedio + '</td>' +
                        '<td>' + respuesta[i].aprobado + '</td>' +
                        '</tr>';
                }
            },
        });
    });

    $('#boton').on('click', function() {
        let datos = {
            codigo: parseInt($('#codigo').val()),
            nombre: $('#nombre').val(),
            apellido: $('#apellido').val(),
            cargo: $('#curso').val(),
            nota1: $('#nota1').val(),
            nota2: $('#nota2').val(),
            nota3: $('#nota3').val(),
        }
        let datosEnvio = JSON.stringify(datos);
        console.log(datosEnvio);
        $.ajax({
            url: "http://localhost:8080/agregarEstudiante",
            type: "POST",
            data: datosEnvio,
            contentType: "application/json",
            dataType: "json",
            success: function(respuesta) {
                console.log(respuesta);
                alert(respuesta);
            }
        });
    });
});

    

