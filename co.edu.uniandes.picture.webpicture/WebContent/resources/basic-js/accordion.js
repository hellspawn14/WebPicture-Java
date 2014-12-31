//Script base para plugin de acordion de JQuery
(function () {
    //Script de inicialización de los grupos de la paleta de elementos
    $(function () {
        $("#tools").accordion({
            collapsible: true,
            heightStyle: "content"
        });
    });
}());