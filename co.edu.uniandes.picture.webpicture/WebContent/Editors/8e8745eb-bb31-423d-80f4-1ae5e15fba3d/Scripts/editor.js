//Script de pruebas 
(function () {

    //------------------------------------------------------
    //Palette definition  
    //------------------------------------------------------

    $('#paletteName').text("Eras de batman");$('#tools').append('<h5 id="HEAD_7f31245a" class="marketing-header-canvas" style="text-align:left;color:white; background-color:#181818;border-top:1px solid #808080"><i class="fa fa-bars" style="margin-left:5px"></i> Disfraces</h5><div id="GROUP_7f31245a" style="background-color:#F0F0F0; overflow-y: auto; height:210px"></div>');Tipped.create('#HEAD_7f31245a', 'Disfraces de batman', {position: 'right'});var GRAPH_7f31245a = new joint.dia.Graph;var PAPER_7f31245a = new joint.dia.Paper({el: $('#GROUP_7f31245a'), gridSize: 10,height: $('#GROUP_7f31245a').height(), width: $('#tools').width(), gridSize: 1,model: GRAPH_7f31245a, interactive: false});var ICON_6d6f6e28 = new joint.shapes.basic.Image({ position: { x: 10, y: 10 }, size: { width: 50,height: 50 }, attrs: { text: { text: 'West', 'ref-y': 0.5, 'ref-x': 100 }, image: { type: 'A', 'xlink:href': 'http://www.blastr.com/sites/blastr/files/Adam%20West%20Batman.jpg', width: 100, height: 100,}, },});GRAPH_7f31245a.addCell(ICON_6d6f6e28);var ICON_135fbaa4 = new joint.shapes.basic.Image({ position: { x: 10, y: 70 }, size: { width: 50,height: 50 }, attrs: { text: { text: 'Nolan', 'ref-y': 0.5, 'ref-x': 100 }, image: { type: 'A', 'xlink:href': 'http://static.comicvine.com/uploads/original/11119/111199816/4274393-4228925-4165782-5825568197-rumor.jpg', width: 100, height: 100,}, },});GRAPH_7f31245a.addCell(ICON_135fbaa4);var ICON_45ee12a7 = new joint.shapes.basic.Image({ position: { x: 10, y: 130 }, size: { width: 50,height: 50 }, attrs: { text: { text: 'Affleck', 'ref-y': 0.5, 'ref-x': 100 }, image: { type: 'A', 'xlink:href': 'http://cdn.bleedingcool.net/wp-content/uploads/2013/09/batman-affleck-600x860.jpg', width: 100, height: 100,}, },});GRAPH_7f31245a.addCell(ICON_45ee12a7);









    /**
     *
     */
    $(function () {
        $("#tools").accordion({
            collapsible: true,
            heightStyle: "content"
        });
    });




    //------------------------------------------------------
    //Palette groups definition  
    //------------------------------------------------------



    //------------------------------------------------------
    //Scripts genericos
    //------------------------------------------------------



}());