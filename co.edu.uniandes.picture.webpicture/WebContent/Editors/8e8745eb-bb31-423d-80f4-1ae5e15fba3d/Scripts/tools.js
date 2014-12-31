//Script de referencia para la creación dinamica de grupos de paleta
(function () {
   
    //---------------------------------------------------------------------------
    // Autorun 
    //---------------------------------------------------------------------------
    
    $(function () {
        initializeGroups();
    });
    
    
    //---------------------------------------------------------------------------
    // Inicializador del script  
    //---------------------------------------------------------------------------

    /**
    * Codigo generado desde el servidor 
    */
    function initializeGroups()
    {
        createPaletteGroup('Secction I', 'grupo1', '300');
        createPaletteGroup('Secction II', 'grupo2', '200');
        createPaletteGroup('Secction III', 'grupo3', '100');
        createPaletteGroup('Secction IV', 'grupo4', '100');
    }
    
    //---------------------------------------------------------------------------
    // Elementos estaticos del codigo -> generan codigo html 
    //---------------------------------------------------------------------------
    
    /**
    * Genera el codigo html para crear el encabezado de un grupo 
    */
    function createHeader(groupName)
    {
        var header =  "<h5 class=" + '"marketing-header-canvas"' + " style=" + '"text-align:left;color:white; background-color:#181818;border-top:1px solid #808080">' + "<i class=" + '"fa fa-bars"' + " style=" + '"margin-left:5px"' + "></i>" + " " + groupName + "</h5>";
        return header;
    }
    
    /**
    * Genera el codigo html para crear el div de un grupo 
    */
    function createGroupDiv(groupId, groupHeight)
    {
        var groupDiv = "<div id=" + '"' + groupId + '"' + " style=" + '"background-color:#F0F0F0; overflow-y: auto; height:' + groupHeight + 'px"></div>';
        return groupDiv;
    }
    
    /**
    * Inserta en el elemento padre un grupo de la paleta 
    */
    function createPaletteGroup(groupName, groupId, groupHeight)
    {
        var parentID = "#tools";
        var header = createHeader(groupName);
        var groupDiv = createGroupDiv(groupId, groupHeight);
        $(parentID).append(header);
        $(parentID).append(groupDiv);
    }
}());