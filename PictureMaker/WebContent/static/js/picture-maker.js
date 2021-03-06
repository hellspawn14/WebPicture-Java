
var entities = [];
var style_definition = [];
var selected_entity = null;
var selected_figure = null;
var figure_constants = {
		'rounded': 0,
		'polygon': 1,
		'ellipse': 2,
		'custom': 3,
		'image': 4,
		'complex': 5
};
var colors_container = {};
var figure_style_container = {};
var line_type_container = {};
var line_decoration_container = {};
var line_style_container = {};

$(document).ready(function (){
	setup_project();
	$('.id-icon-checkbox').click(function() {
    var $this = $(this);
    if ($this.is(':checked')) {
	    	unbind_icon_checkbox(true);
	    } else {
	    	unbind_icon_checkbox(false);
	    }
	});
	$('#id-modal-main-entity').modal('toggle');
});

function setup_project(){
	setup_entities();
	//setup_html_entities();
	setup_style_definition();	
	load_entity_properties();
};


//--------------------------File Writer and download-----------

function add_to_file(entity){
	add_to_palette(entity);
	add_to_graphical_definition(entity);
};

function add_to_palette(entity){
	var indent = '<br>&emsp;&emsp;&emsp;<span class="file-line">';
	var line_class_close = '</span>';
	var container = $('#id-file-palette').find('.file-section-container');
	var html = '';
	html += indent + 'Creation button for class '+entity['name']+' {' + line_class_close;
	html += indent + 'name "'+entity['name']+'"' + line_class_close;
	html += indent + 'description "Description of '+entity['name']+'"' + line_class_close;
	html += indent + 'icon "/imagenes/NodeIcon.gif"' + line_class_close;
	html += indent + '}' + line_class_close;
	container.append(html);			
};

function add_to_graphical_definition(entity){
	var indent = '<br>&emsp;&emsp;<span class="file-line">';
	var line_class_close = '</span>';
	var container = $('#id-file-graphical').find('.file-section-container');
	var html = '<div id="id-entity-'+entity['name']+'">';
	html += indent + 'Node_element '+entity['name']+'Definition' + line_class_close;
	html += indent + 'for class '+entity['name']+' {' + line_class_close;
	html += '<span class="file-label-container">';
	html += indent + 'label elementName' + line_class_close;
	html += indent + 'label icon '+entity['graphical_properties']['label_icon']+'' + line_class_close;
	html += indent + 'label placement '+entity['graphical_properties']['label_placement']+'' + line_class_close;
	html += '</span>';
	html += '<span class="file-size-container">';
	html += indent + 'size ( '+entity['graphical_properties']['size'][0]+' ,  '+entity['graphical_properties']['size'][1]+' )' + line_class_close;
	html += '</span>';
	var figure_id = entity['graphical_properties']['figure']['id'] + line_class_close;
	
	html += '<span class="file-figure-container">';								
	if(figure_id == figure_constants['image']){
		html += indent + 'Image figure{' + line_class_close;
		html += indent + 'image path "figure_path.svg"' + line_class_close;
		html += indent + '}' + line_class_close;
		//$('#').val() + line_class_close;
		//figure_properties['image_path'] = '' + line_class_close;
	}
	else if(figure_id == figure_constants['complex']){
		html += indent + 'Complex figure{' + line_class_close;
		html += indent + '---' + line_class_close;
		html += indent + '}' + line_class_close;
	}
	else{
		html += indent + 'Regular figure extends rounded{' + line_class_close;
		var color_index = Object.keys(colors_container).indexOf(entity['graphical_properties']['figure']['background_color']);
		html += indent + 'backgroud color color'+ color_index + line_class_close;
		var border_index = Object.keys(line_style_container).indexOf(entity['graphical_properties']['figure']['border']);
		html += indent + 'border LineStyle'+border_index+'' + line_class_close;
		if (entity['graphical_properties']['figure']['icon']!=null){
			html += indent + 'icon path "'+entity['graphical_properties']['figure']['icon']['path']+'"' + line_class_close;
			html += indent + 'icon size '+entity['graphical_properties']['figure']['icon']['size']+'' + line_class_close;
			html += indent + 'icon position Point( '+entity['graphical_properties']['figure']['icon']['position'][0]+" ,  "+entity['graphical_properties']['figure']['icon']['position'][1]+' )' + line_class_close;
		}
		if(figure_id == figure_constants['rounded']){
			//PALETTE 					
		}
		else if(figure_id == figure_constants['polygon']){
			//PALETTE 
		}
		else if(figure_id == figure_constants['ellipse']){
			//PALETTE 
		}
		else if(figure_id == figure_constants['custom']){
			//PALETTE 
		}
		html += indent + '}' + line_class_close;
	}
	html += '</span>';
	html += '<span class="file-phantom-container">';				
	html += indent + 'phantom '+entity['graphical_properties']['phantom']+'' + line_class_close;
	html += '</span>';
	html += indent + '}' + line_class_close;

	html += '</div>';
	if ($('#id-entity-'+entity['name']).length > 0){
		$('#id-entity-'+entity['name']).remove();
	}
	container.append(html);			
};

function add_style_definition_to_file (){
	var indent = '<br>&emsp;&emsp;<span class="file-line">';
	var line_class_close = '</span>';
	var container = $('#id-file-style').find('.file-section-container');
	var html = '';
	var iterable = Object.keys(colors_container);
	for ( var i = 0; i < iterable.length; i++){
		var color = colors_container[iterable[i]];
		html += indent + 'Color color' + i + ' (' + color.r + ',' + color.g + ',' + color.b + ')' + line_class_close;
	}
	var iterable = Object.keys(line_style_container);
	for ( var i = 0; i < iterable.length; i++){
		var line_style = line_style_container[iterable[i]];
		html += indent + 'Line style LineStyle' + i + ' {' + line_class_close;
		html += indent + 'width ' + line_style.width + line_class_close;
		html += indent + 'type  ' + line_style.type + line_class_close;
		var color_index = Object.keys(colors_container).indexOf(line_style.color);		
		html += indent + 'color color' + color_index + line_class_close;
		html += indent + '}' + line_class_close;
	}
	var iterable = Object.keys(figure_style_container);
	for ( var i = 0; i < iterable.length; i++){
		var figure = figure_style_container[iterable[i]];
		if (figure.id==figure_constants.rounded){
			html += '<span id="id-rounded'+i+'">'
			html += indent + 'Rounded rounded' + i + ' {' + line_class_close;
			html += indent + 'radiox ' + figure.radios[0] + line_class_close;
			html += indent + 'radioy ' + figure.radios[1] + line_class_close;
			html += indent + '}' + line_class_close;
			html += '</span>'
		}
		else if (figure.id==figure_constants.polygon){
			html += '<span id="id-polygon'+i+'">'
			html += indent + 'Regular polygon polygon' + i + ' {' + line_class_close;
			html += indent + 'vertex quantity ' + figure.vertex_qty + line_class_close;
			html += indent + 'start angle ' + figure.start_angle + line_class_close;
			html += indent + '}' + line_class_close;	
			html += '</span>'
		}
		else if (figure.id==figure_constants.ellipse){
			html += '<span id="id-ellipse'+i+'">'
			html += indent + 'Ellipse ellipse' + i + ' {' + line_class_close;
			html += indent + 'proportion (' + figure.radios[0] + ',' + figure.radios[1] + ')' + line_class_close;
			html += indent + '}' + line_class_close;
			html += '</span>'
		}
		else if (figure.id==figure_constants.custom){
			//TO DO
			html += '<span id="id-custom'+i+'">'
			html += '</span>'
		}
		
	}

	container.html(html);
};

function generate_styles_in_file(){
	add_style_definition_to_file();
	//render_entity(selected_entity['name']);
};

function get_file_content_plain_text(){
	var file_content = '';
	$('#id-picture-file').children().each(function(i, object){
	$(this).find('.file-line').each(function(i, object){
		file_content += $(this).text() + '\r\n';
		});
	});
	return file_content;
};

function download_picture_file(){
	var blob = new Blob([get_file_content_plain_text()], {type: "text/plain;charset=utf-8"});
	saveAs(blob, "graphical_" + $('#id-filename').text().split(".")[0] + ".picture");
};

function add_main_entity_to_file(entity_name, package_name){
	var indent = '<br><span class="file-line">';
	var line_class_close = '</span>';
	var container = $('#id-file-header');
	var html = indent + 'import "/your_path/'+$('#id-filename').text()+ '"' + line_class_close;
	html += indent + 'as MM' + line_class_close;
	html += indent + 'Graphical representation NewRepresentation{' + line_class_close;
	var indent_2 = '<br>&emsp;&nbsp;<span class="file-line">';
	html += indent_2 + 'reference package '+ package_name + line_class_close;
	html += indent_2 + 'root '+ entity_name + line_class_close;
	container.append(html);	
	var palette_header = indent_2 + '<span class="file-line">Palette for '+entity_name+'{</span>';
	palette_header += indent_2 + 'Tool group ElementsPalette{' + line_class_close;
	palette_header += indent_2 + '&emsp;description "Elements"' + line_class_close;
	$('#id-file-palette').prepend(palette_header);
};

//-------------------------------------------------------------

//----------------------------HTML Builders -------------------

function setup_html_entities (){
	var html_for_entities = '<div class="panel-group" id="accordion">';
	for (var i = 0; i < entities.length; i++){
		var attributes = entities[i]['attributes'];
		var references = entities[i]['references'];
		html_for_entities += '<div class="panel panel-default entity-elements-container">';
		html_for_entities += '<div id="id-entity-'+i+'" class="'+((i==0)?'active-entity':'entity')+'">';
		html_for_entities += '<a onclick="select_entity('+i+')" data-toggle="collapse" data-parent="#accordion" href="#collapse'+i+'" class="">'+((i==0)?'<span class="glyphicon glyphicon-ok">&nbsp</span>':'')+entities[i]['name']+'</a>';
		html_for_entities += ('</div>');
		html_for_entities += '<div id="collapse'+i+'" class="panel-collapse collapse" style="height: auto;">';
		html_for_entities += '<div class="panel-body">';
		html_for_entities += ('<p>Attributes--------</p>');
		for (var j = 0; j < attributes.length; j++){
			html_for_entities += ('<p>'+attributes[j]+'</p>');
		}
		html_for_entities += ('<p>References--------</p>');
		for (var j = 0; j < references.length; j++){
			html_for_entities += ('<p>'+references[j]+'</p>');
		}
		html_for_entities += ('</div>');
		html_for_entities += ('</div>');
		html_for_entities += ('</div>');
		add_to_file(entities[i]);
	}
	html_for_entities += ('</div>');
	$('#id-entities-container').html(html_for_entities);				
};

function get_regular_figure_properties(type){
	var response = '';
	response += '<tr>';
	response += '<td>Background color</td>';
	response += '<td><input type="color" name="" id="id-figure-color"></td>';
	response += '</tr>';
	response += '<tr>';
	response += '<td>Border</td>';
	response += '<td>';
	response += '<select class="custom-select" id="id-figure-border">';
	response += '<option value="solid">Solid</option>';
	response += '<option value="dash">Dash</option>';
	response += '<option value="dot">Dot</option>';
	response += '<option value="dashdot">Dash dot</option>';
	response += '<option value="dashdotdot">Dash dot dot</option>';
	response += '</select><input type="color" name="" id="id-figure-border-color"><input id="id-figure-border-width" type="number" min="1" max="10" placeholder="Width"></td>';
	response += '</td>';
	response += '</tr>';
	response += '<tr>';
	response += '<td>Icon</td>';
	response += '<td>';
	response += '<div class="checkbox">';
	response += '<label>';
	response += '<input class="id-icon-checkbox" id="id-icon-checkbox" type="checkbox" checked> <span id="id-icon-checkbox-label">Selected';
	response += '</label>';
	response += '</div>';
    response += '<table class="table table-bordered" id="id-icon-table-properties">';
	response += '<thead><tr><th>Property</th><th>Value</th></tr></thead>';
	response += '<tbody id="id-properties-container-icon-'+type+'">';
	response += '<tr><td>Path</td><td><input type="text" id="id-figure-icon-path"></td></tr>';
	response += '<tr><td>Size</td><td><input id="id-figure-icon-size-w" type="number" min="1" max="1000000" class="" placeholder="Width">';
	response += '<input id="id-figure-icon-size-h" type="number" min="1" max="1000000" class="" placeholder="Height"></td></tr>';
	response += '<tr><td>Position</td><td><input id="id-figure-icon-pos-x" type="number" min="1" max="1000000" class="" placeholder="X">';
	response += '<input id="id-figure-icon-pos-y" type="number" min="1" max="1000000" class="" placeholder="Y"></td></tr>';
	response += '</tbody>';
	response += '</table>';
	response += '</td>';
	response += '</tr>';
	
	return response;
};

function setup_style_definition(){
	
	var html_for_entities = '<tr>';
	html_for_entities += '<td>Label</td>';
	html_for_entities += '<td>elementName</td>';
	html_for_entities += '</tr>';
	
	html_for_entities += '<tr>';
	html_for_entities += '<td>Label icon</td>';
	html_for_entities += '<td><select class="custom-select" id="id-label-icon-select">';
	html_for_entities += '<option value="false">False</option>';
	html_for_entities += '<option value="true">True</option>';
	html_for_entities += '</select></td>';
	html_for_entities += '</tr>';
	
	html_for_entities += '<tr>';
	html_for_entities += '<td>Label placement</td>';
	html_for_entities += '<td><select class="custom-select" id="id-label-icon-plac-select">';
	html_for_entities += '<option value="internal">Internal</option>';
	html_for_entities += '<option value="external">External</option>';
	html_for_entities += '</select></td>';
	html_for_entities += '</tr>';
	
	html_for_entities += '<tr>';
	html_for_entities += '<td>Size</td>';
	html_for_entities += '<td><input id="id-figure-size-width" type="number" min="1" max="1000000" class="" placeholder="Width">';
	html_for_entities += '<input id="id-figure-size-height" type="number" min="1" max="1000000" class="" placeholder="Height"></td>';
	html_for_entities += '</tr>';
	
	html_for_entities += '<tr>';
	html_for_entities += '<td>Figure</td>';
	html_for_entities += '<td>';
	html_for_entities += '<div class="panel-group" id="id-figure-type">';
	//Rounded
	html_for_entities += '<div class="panel panel-default figure-elements.container" id="id-figure-type-container-0">';
	html_for_entities += '<div id="id-figure-type-0" class="active-figure">';
	html_for_entities += '<a onclick="select_figure(0)" data-toggle="collapse" data-parent="#id-figure-type" href="#collapse-rounded"><span class="glyphicon glyphicon-ok">&nbsp</span>Rounded</a>';
	html_for_entities += '</div>';
	html_for_entities += '<div id="collapse-rounded" class="panel-collapse collapse" style="height: auto;">';
	html_for_entities += '<div class="panel-body">';
	html_for_entities += '<table class="table table-bordered">';
	html_for_entities += '<thead><tr><th>Property</th><th>Value</th></tr></thead>';
	html_for_entities += '<tbody id="id-properties-container-rounded">';
	html_for_entities += '<tr><td>Size</td><td><input id="id-rounded-xradio" type="number" min="1" max="1000000" class="" placeholder="X Radio">';
	html_for_entities += '<input id="id-rounded-yradio" type="number" min="1" max="1000000" class="" placeholder="Y Radio"></td></tr>';
	html_for_entities += get_regular_figure_properties('rounded');
	html_for_entities += '</tbody>';
	html_for_entities += '</table>';
	html_for_entities += '</div></div></div>';
	//Regular polygon
	html_for_entities += '<div class="panel panel-default figure-elements.container" id="id-figure-type-container-1">';
	html_for_entities += '<div id="id-figure-type-1" class="figure">';
	html_for_entities += '<a onclick="select_figure(1)" data-toggle="collapse" data-parent="#id-figure-type" href="#collapse-polygon">Regular polygon</a>';
	html_for_entities += '</div>';
	html_for_entities += '<div id="collapse-polygon" class="panel-collapse collapse" style="height: auto;">';
	html_for_entities += '<div class="panel-body">';
	html_for_entities += '<table class="table table-bordered">';
	html_for_entities += '<thead><tr><th>Property</th><th>Value</th></tr></thead>';
	html_for_entities += '<tbody id="id-properties-container-polygon">';
	html_for_entities += '<tr><td>Vertex quantity</td><td><input id="id-polygon-vertex-qty" type="number" min="1" max="1000000" class="" placeholder="#"></td></tr>';
	html_for_entities += '<tr><td>Start angle</td><td><input id="id-polygon-start-angle" type="number" min="1" max="1000000" class="" placeholder="°"></td></tr>';
	html_for_entities += get_regular_figure_properties('polygon');
	html_for_entities += '</tbody>';
	html_for_entities += '</table>';
	html_for_entities += '</div></div></div>';
	//Ellipse
	html_for_entities += '<div class="panel panel-default figure-elements.container" id="id-figure-type-container-2">';
	html_for_entities += '<div id="id-figure-type-2" class="figure">';
	html_for_entities += '<a onclick="select_figure(2)" data-toggle="collapse" data-parent="#id-figure-type" href="#collapse-ellipse">Ellipse</a>';
	html_for_entities += '</div>';
	html_for_entities += '<div id="collapse-ellipse" class="panel-collapse collapse" style="height: auto;">';
	html_for_entities += '<div class="panel-body">';
	html_for_entities += '<table class="table table-bordered">';
	html_for_entities += '<thead><tr><th>Property</th><th>Value</th></tr></thead>';
	html_for_entities += '<tbody id="id-properties-container-ellipse">';
	html_for_entities += '<tr><td>Size</td><td><input id="id-ellipse-xradio" type="number" min="1" max="1000000" class="" placeholder="X Radio">';
	html_for_entities += '<input id="id-ellipse-yradio" type="number" min="1" max="1000000" class="" placeholder="Y Radio"></td></tr>';
	html_for_entities += get_regular_figure_properties('ellipse');
	html_for_entities += '</tbody>';
	html_for_entities += '</table>';
	html_for_entities += '</div></div></div>';
	//Custom Figure
	html_for_entities += '<div class="panel panel-default figure-elements.container" id="id-figure-type-container-3">';
	html_for_entities += '<div id="id-figure-type-3" class="figure">';
	html_for_entities += '<a onclick="select_figure(3)" data-toggle="collapse" data-parent="#id-figure-type" href="#collapse-custom">Custom</a>';
	html_for_entities += '</div>';
	html_for_entities += '<div id="collapse-custom" class="panel-collapse collapse" style="height: auto;">';
	html_for_entities += '<div class="panel-body">';
	html_for_entities += '<table class="table table-bordered">';
	html_for_entities += '<thead><tr><th>Property</th><th>Value</th></tr></thead>';
	html_for_entities += '<tbody id="id-properties-container-custom">';
	html_for_entities += '<tr><td>Points <button class="btn btn-info btn-xs">+</button></td><td><div id="id-points-container"><input type="number" min="1" max="1000000" class="pointx" placeholder="X">';
	html_for_entities += '<input type="number" min="1" max="1000000" class="pointy" placeholder="Y"></div></td></tr>';
	html_for_entities += get_regular_figure_properties('custom');
	html_for_entities += '</tbody>';
	html_for_entities += '</table>';
	html_for_entities += '</div></div></div>';
	//Image
	html_for_entities += '<div class="panel panel-default figure-elements.container" id="id-figure-type-container-4">';
	html_for_entities += '<div id="id-figure-type-4" class="figure">';
	html_for_entities += '<a onclick="select_figure(4)" data-toggle="collapse" data-parent="#id-figure-type" href="#collapse-image">Image</a>';
	html_for_entities += '</div>';
	html_for_entities += '<div id="collapse-image" class="panel-collapse collapse" style="height: auto;">';
	html_for_entities += '<div class="panel-body">';
	html_for_entities += '<table class="table table-bordered">';
	html_for_entities += '<thead><tr><th>Property</th><th>Value</th></tr></thead>';
	html_for_entities += '<tbody id="id-properties-container-image">';
	html_for_entities += '<tr><td>File</td><td><input type="file"></td></tr>';
	html_for_entities += '</tbody>';
	html_for_entities += '</table>';
	html_for_entities += '</div></div></div>';
	//Complex
	html_for_entities += '<div class="panel panel-default figure-elements-container" id="id-figure-type-container-5">';
	html_for_entities += '<div id="id-figure-type-5" class="figure">';
	html_for_entities += '<a onclick="select_figure(5)" data-toggle="collapse" data-parent="#id-figure-type" href="#collapse-complex">Complex</a>';
	html_for_entities += '</div>';
	html_for_entities += '<div id="collapse-complex" class="panel-collapse collapse" style="height: auto;">';
	html_for_entities += '<div class="panel-body">';
	html_for_entities += '---';
	html_for_entities += '</div></div></div>';
	html_for_entities += '</div>';
	html_for_entities += '</td>';
	html_for_entities += '</tr>';
	
	html_for_entities += '<tr>';
	html_for_entities += '<td>Phantom</td>';
	html_for_entities += '<td><select class="custom-select" id="id-figure-phantom">';
	html_for_entities += '<option value="false">False</option>';
	html_for_entities += '<option value="true">True</option>';
	html_for_entities += '</select></td>';
	html_for_entities += '</tr>';
		
	$('#id-properties-container').html(html_for_entities);	
};

function load_entity_properties(){
	var graphical_properties = selected_entity['graphical_properties'];
	$('#id-label-icon-select').val(graphical_properties['label_icon']);
	$('#id-label-icon-plac-select').val(graphical_properties['label_placement']);
	$('#id-figure-size-width').val(graphical_properties['size'][0]);
	$('#id-figure-size-height').val(graphical_properties['size'][1]);
	var figure_id = graphical_properties['figure']['id'];
	select_figure(figure_id);
	var panel_container = $('#id-figure-type-container-'+figure_id);
	if(figure_id == figure_constants['rounded']){
		panel_container.find('#id-rounded-xradio').val(graphical_properties['figure']['radios'][0]);
		panel_container.find('#id-rounded-yradio').val(graphical_properties['figure']['radios'][1]);
	}
	else if(figure_id == figure_constants['polygon']){
		panel_container.find('#id-polygon-vertex-qty').val(graphical_properties['figure']['vertex_qty']);
		panel_container.find('#id-polygon-start-angle').val(graphical_properties['figure']['start_angle']);
	}
	else if(figure_id == figure_constants['ellipse']){
		panel_container.find('#id-ellipse-xradio').val(graphical_properties['figure']['radios'][0]);
		panel_container.find('#id-ellipse-yradio').val(graphical_properties['figure']['radios'][1]);
	}
	else if(figure_id == figure_constants['custom']){
		var points = graphical_properties['figure']['points'];
		var html_points = '';
		for (var i = 0; i < points.length; i++){
			 html_points += '<br><input type="number" min="1" max="1000000" class="pointx" placeholder="X" value="'+points[i][0]+'">';
			 html_points += '<input type="number" min="1" max="1000000" class="pointy" placeholder="Y" value="'+points[i][1]+'">';
		}
		panel_container.find('#id-points-container').html(html_points);
	}
	else if(figure_id == figure_constants['image']){
		//$('#').val();
	}
	else if(figure_id == figure_constants['complex']){
		
	}
	$('#id-figure-color').val(graphical_properties['figure']['background_color']);
	var border = line_style_container[graphical_properties['figure']['border']];
	$('#id-figure-border').val(border['type']);
	$('#id-figure-border-width').val(border['width']);
	$('#id-figure-border-color').val(border['color']);
	if (graphical_properties['figure']['icon'] != null){
		$('#id-icon-checkbox').prop('checked', true);
		unbind_icon_checkbox(true);
		$('#id-figure-icon-path').val(graphical_properties['figure']['icon']['path']);

		$('#id-figure-icon-size-w').val(graphical_properties['figure']['icon']['size'][0]);
		$('#id-figure-icon-size-h').val(graphical_properties['figure']['icon']['size'][1]);
		$('#id-figure-icon-pos-x').val(graphical_properties['figure']['icon']['position'][0]);
		$('#id-figure-icon-pos-y').val(graphical_properties['figure']['icon']['position'][1]);
	}
	else{
		$('#id-icon-checkbox').prop('checked',false);
		unbind_icon_checkbox(false);
	}
	$('#id-figure-phantom').val(graphical_properties['phantom']);
};

//-------------------------------------------------------------

//----------------------------Helpers--------------------------

function hexToRgb(hex) {
    var result = /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(hex);
    return result ? {
        r: parseInt(result[1], 16),
        g: parseInt(result[2], 16),
        b: parseInt(result[3], 16)
    } : null;
};

function get_figure_type (text){
	if (text.match('^Regular')){
		return 0;
	}
	else if (text.match('^Image')){
		return 1;
	}
	else if (text.match('^Complex')){
		return 2;
	}
};


//-------------------------------------------------------------

//----------------------------Objects Constructors-------------

function create_entity(name, attributes, references){
	var icon_properties = {
			path: '/change/default/path',
			size: ['10','10'],
			position: ['15','15']
	};
	var default_color = '#dddddd';
	var default_border_color = '#a1a1a1';
	var border = {
		width: '2',
		type: 'solid',
		color: default_border_color
	};

	line_style_container['0'] = border;
	
	var rounded = {
			id: 0,
			radios: ['5','5'],
			background_color: default_color,
			border: '0',
			icon: icon_properties
	};
	colors_container['#dddddd'] = hexToRgb(default_color);
	colors_container['#a1a1a1'] = hexToRgb(default_border_color);

	
	var graphical_properties_rounded = {
			label_icon: 'false',
			label_placement: 'internal',
			size: ['100','200'],
			figure: rounded,
			phantom: 'false'
	};
	figure_style_container['rounded'] = {
		id: figure_constants.rounded,
		radios: ['5','5']
	};
					
	var entityObject = {
			name: name, 
			attributes: attributes,
			references: references,
			graphical_properties: graphical_properties_rounded
			};
	entities.push(entityObject);	
	add_style_definition_to_file();
};

function setup_entities () {
	$('.entity-elements-container').each(function(i, object)
	{
		var name = $(this).find('.entity-name').html();
		var attributes = [];
		var references = [];
		$(this).find('.entity-attribute').each(function(i, object){
			attributes.push($(this).html());
		});
		$(this).find('.entity-reference').each(function(i, object){
			references.push($(this).html());
		});
		create_entity(name, attributes, references);							    
	});
		
	select_entity(0);
};

//-------------------------------------------------------------

//----------------------------User interaction-----------------

function select_entity(position){
	setup_style_definition();
	$('.active-entity').find('a').find('.glyphicon').remove();
	$('.active-entity').addClass('entity').removeClass('active-entity');
	$('#id-entity-'+position).removeClass('entity').addClass('active-entity');
	$('.active-entity').find('a').prepend('<span class="glyphicon glyphicon-ok">&nbsp</span>');
	position -= 1 ? position > 0 : - 1 ;
	selected_entity = entities[position];
	$('#id-selected-name').text(selected_entity['name']);
	load_entity_properties();
};

function change_figure(){
	var figure_id = selected_entity.graphical_properties.figure.id;
	if(figure_id == 0){
		$('#id-figure').find('img').remove();
		var average = ((selected_entity.graphical_properties.figure.radios[0]+selected_entity.graphical_properties.figure.radios[1])/2) + 'px'
		$('#id-figure').css('border-radius', average);
	}
	else if (figure_id == 1){
		$('#id-figure').append('<img src="static/images/polygon.gif" height="200" width="200">').fadeIn('slow');
	}
	else if (figure_id == 2){
		var radius = 'border-radius: 50%;';
		$('#id-figure').find('img').remove();
		$('#id-figure').fadeIn('slow').attr('style', radius);
	}
	else if (figure_id == 3){

	}
};

function save_current_entity(){
	$('.alert').html('<h4>Saving...</h4>').fadeIn('slow');
	var icon_properties = null;
	
	if ($('#id-icon-checkbox').prop('checked')){
		icon_properties = {
				path: $('#id-figure-icon-path').val(),
				size: [$('#id-figure-icon-size-w').val(),$('#id-figure-icon-size-h').val()],
				position: [$('#id-figure-icon-pos-x').val(),$('#id-figure-icon-pos-y').val()]
		};
		$('#id-icon-checkbox').prop('checked');
		unbind_icon_checkbox(true);		
	}
	else{
		$('#id-icon-checkbox').prop('checked',false);
		unbind_icon_checkbox(false);
	}
	var figure_id = selected_figure;
	
	var panel_container = $('#id-figure-type-container-'+figure_id);
	
	var selected_figure_color = panel_container.find('#id-figure-color').val();
	var selected_border_color = panel_container.find('#id-figure-border-color').val();

	var border = {
		width: panel_container.find('#id-figure-border-width').val(),
		type: panel_container.find('#id-figure-border').val(),
		color: selected_border_color
	};

	var new_border_key = (Object.keys(line_style_container).length) + ''
	line_style_container[new_border_key] = border;

	var figure_properties = {
			id: figure_id,
			background_color: selected_figure_color,
			border: new_border_key,
			icon: icon_properties
	};

	colors_container[selected_figure_color] = hexToRgb(selected_figure_color);
	colors_container[selected_border_color] = hexToRgb(selected_border_color);

	if(figure_id == figure_constants['rounded']){
		figure_properties['radios'] = [panel_container.find('#id-rounded-xradio').val(),panel_container.find('#id-rounded-yradio').val()];
	}
	else if(figure_id == figure_constants['polygon']){
		figure_properties['vertex_qty'] = panel_container.find('#id-polygon-vertex-qty').val();
		figure_properties['start_angle'] = panel_container.find('#id-polygon-start-angle').val();
	}
	else if(figure_id == figure_constants['ellipse']){
		figure_properties['radios'] = [panel_container.find('#id-ellipse-xradio').val(),panel_container.find('#id-ellipse-yradio').val()];
	}
	else if(figure_id == figure_constants['custom']){
		var xpoints = $(".pointx");
		var ypoints = $(".pointy");
		var points_array = [];
		xpoints.each(function(i, object)
		{
			points_array.push([$(this).val(),'']);					    
		});
		ypoints.each(function(i, object)
		{
			points_array[i][1] = $(this).val();					    
		});
		figure_properties['points'] = points_array;
	}
	else if(figure_id == figure_constants['image']){
		//$('#').val();
		figure_properties['image_path'] = 'change/this/path';
	}
	else if(figure_id == figure_constants['complex']){
		
	}
	var new_key = (Object.keys(figure_style_container).length + 1) + ''
	figure_style_container[new_key] = figure_properties;			
	
	var graphical_properties_temp = {
			label_icon: $('#id-label-icon-select').val(),
			label_placement: $('#id-label-icon-plac-select').val(),
			size: [$('#id-figure-size-width').val(),$('#id-figure-size-height').val()],
			figure: figure_properties,
			phantom: $('#id-figure-phantom').val()
	};
	
	selected_entity['graphical_properties'] = graphical_properties_temp;
	
	$('.alert').fadeOut('slow');
	add_to_graphical_definition(selected_entity);
	add_style_definition_to_file();
	change_figure();
	entity_name = selected_entity['name'];
	picture_graph.render_entity($('#id-entity-'+entity_name));
};

function select_figure(position){
	$('.active-figure').find('a').find('span').remove();
	$('.active-figure').addClass('figure').removeClass('active-figure');
	$('#id-figure-type-'+position).removeClass('figure').addClass('active-figure');
	$('.active-figure').find('a').prepend('<span class="glyphicon glyphicon-ok">&nbsp</span>');
	selected_figure = position;
	$('#id-selected-name').text(selected_entity['name']);	
};

function unbind_icon_checkbox(state) {
	if (state){
		$('#id-icon-checkbox-label').html('Selected');
	$('#id-icon-table-properties').fadeIn('slow');
	}
	else{
		$('#id-icon-checkbox-label').html('Unselected');
		$('#id-icon-table-properties').fadeOut('slow');
	}
};



function select_main_entity(){
	var main_entity = $('#id-main-entity').val();
	var package_name = $('#id-package-name').val();
	$('#id-modal-main-entity').modal('toggle');
	var main = null;
	for (var i = 0, found = false; i<entities.length && !found; i++){
		var entity = entities[i];
		if (entity.name==main_entity){
			main = entity;
			found = true;
			entities.splice(i,1);
		}
	}
	add_main_entity_to_file(main_entity, package_name);
	for (var i = 0, found = false; i<entities.length && !found; i++){
		var entity = entities[i];
		add_to_file(entity);
	}
};


//------------------------------------Rules Definition

var classes_with_rules = 0;

function show_rules_tool(){
	$('#id-modal-rules').modal('toggle');
};

function add_class_to_rules_tool(id){
	var modal_content = '<div id="id-rule-'+id+'"><hr style="border-top: 3px solid #70DBDB;">';
	modal_content += '<button class="btn btn-danger btn-xs" onclick="remove_rule('+id+');">-Remove</button>';
	modal_content += '<button class="btn btn-info btn-xs pull-right" onclick="add_rule_case('+id+');">+Add Case</button></p>';
	modal_content += '<table class="table" id="id-rules-class-'+id+'"><tr>';
	modal_content += '<td> If </td>';
	modal_content += '<td><select class="pull-left" id="id-left-entity">';
	for (var i = 0, found = false; i<entities.length && !found; i++){
		var entity = entities[i];
		modal_content += '<option value="'+entity.name+'">'+entity.name+'</option>';
	}	
	modal_content += '</select></td><td colspan="2"></td></tr>';
	modal_content += '<tr class="case"><td>Type is</td>';
    modal_content += '<td><input class="" type="text" id="id-package-name"></td><td>Use</td>';
	modal_content += '<td><select class="pull-left" id="id-right-entity">';
	for (var i = 0, found = false; i<entities.length && !found; i++){
		var entity = entities[i];
		modal_content += '<option value="'+entity.name+'">'+entity.name+'</option>';
	}	
	modal_content += '</select></td></tr></table></div>';
	$('#id-rules-class-container').append(modal_content);
}

function add_rule_to_html(){
	classes_with_rules++;
	add_class_to_rules_tool(classes_with_rules);
};

function add_rule_case(id){
	var modal_content = '<tr class="case"><td>Type is</td>';
    modal_content += '<td><input class="" type="text" id="id-package-name"></td><td>Use</td>';
	modal_content += '<td><select class="pull-left" id="id-right-entity">';
	for (var i = 0, found = false; i<entities.length && !found; i++){
		var entity = entities[i];
		modal_content += '<option value="'+entity.name+'">'+entity.name+'</option>';
	}	
	modal_content += '</select><button class="btn btn-danger btn-xs pull-right" onclick="delete_rule_case(this);">-Delete Case</button></td></tr>';
	$('#id-rules-class-'+id).append(modal_content);
};

function remove_rule(id){
	$('#id-rule-'+id).remove();
};

function delete_rule_case(elem){
	$(elem).parent().parent().remove();
};

function add_rules_to_file(){
	var indent = '<br>&emsp;&emsp;<span class="file-line">';
	var line_class_close = '</span>';
	var container = $('#id-file-rules').find('.file-section-container');
	var html = '';	
	$('#id-rules-class-container').children().each(function(i, object){
		var class_name = $(this).find('table').find('#id-left-entity').val();
		html += indent + 'Rules for class '+class_name+' {'+ line_class_close;
		$(this).find('.case').each(function(i, object){
			var type = $(this).find('#id-package-name').val();
			var use_class = $(this).find('#id-right-entity').val();
			html += indent + 'case "element.getEventType()!= null && element.getEventType().equals(\\"'+type+'\\")" use ' + use_class + line_class_close;			
		});
		html += indent + '}' + line_class_close;
	});
	container.html(html);
	$('#id-modal-rules').modal('toggle');
	$('#id-button-wizards').removeAttr('disabled');
};

//---------------------------------------Wizards Definition

function show_wizard_tool(){
	$('#id-modal-wizards').modal('toggle');
};

var wizards = 0;

function add_wizard_to_html(){
	wizards++;
	add_new_wizard(wizards);
};

function remove_wizard(id){
	$('#id-wizard-'+id).remove();
};

function add_new_wizard(id){
	var modal_content = '<div id="id-wizard-'+id+'"><hr style="border-top: 3px solid #70DBDB;">';
	modal_content += '<button class="btn btn-danger btn-xs" onclick="remove_wizard('+id+');">-Remove</button>';
	modal_content += '<table class="table" id="id-wizard-table-'+id+'">';
	modal_content += '<tr><td> Title </td>';
	modal_content += '<td><input type="text" id="id-wizard-name"></td></tr>';
	modal_content += '<tr><td> Description </td>';
	modal_content += '<td><input type="text" id="id-wizard-desc"></td></tr>';	
	modal_content += '<tr><td> Class </td>';
	modal_content += '<td><select id="id-left-entity" onchange="load_properties_in_wizard(this);">';
	for (var i = 0, found = false; i<entities.length && !found; i++){
		var entity = entities[i];
		modal_content += '<option value="'+entity.name+'">'+entity.name+'</option>';
	}
	modal_content += '</select></td></tr>';
	modal_content += '<tr><td> Pages </td>';
	modal_content += '<td><button class="btn btn-info btn-xs pull-right" onclick="add_wizard_page_to_html();">+Add Page</button> <div id="id-page-container"><div class="page-container">';
	modal_content += 'Title';
	modal_content += '<input type="text" id="id-wizard-page-name" class="custom-select"><br>';
	modal_content += 'Description';
	modal_content += '<input type="text" id="id-wizard-page-desc" class="custom-select"><br>';	
	modal_content += '<div class="wizard-attr">';	
	var attributes = entities[0].attributes;

	if (attributes.length > 0){
		modal_content += 'Select the attributes that you want to show in this page<br>';
		modal_content += '<div id="id-left-entity-attributes">';
		for (var i = 0; i<attributes.length; i++){		
			modal_content += '<div class="checkbox">';
			modal_content += '<label><input type="checkbox" value="'+attributes[i]+'">'+attributes[i]+'</label>';
			modal_content += '</div>';
		}
		modal_content += '</div>';
	}
	else{
		modal_content += 'This class has no attributes.<br>'
	}
	modal_content += '</div>';	
	modal_content += '<div class="wizard-ref">';	
	var references = entities[0].references;
	if (references.length > 0){
		modal_content += 'Select the references that you want to show in this page<br>';
		modal_content += '<div id="id-left-entity-references">';				
		for (var i = 0; i<references.length; i++){
			modal_content += '<div class="checkbox">';
			modal_content += '<label><input type="checkbox" value="'+references[i]+'">'+references[i]+'</label>';
			modal_content += '</div>';
		}
		modal_content += '</div>';
	}
	else{
		modal_content += 'This class has no references.<br>'
	}
	modal_content += '</div>';	
	modal_content += '<button class="btn btn-danger btn-xs" onclick="remove_page(this);">-Remove</button></div></div></td></tr>';	
	modal_content += '</table></div>';
	$('#id-wizards-container').append(modal_content);
}

function add_wizard_page_to_html(){
	var modal_content = '<div class="page-container">';
	modal_content += 'Title';
	modal_content += '<input type="text" id="id-wizard-page-name" class="custom-select"><br>';
	modal_content += 'Description';
	modal_content += '<input type="text" id="id-wizard-page-desc" class="custom-select"><br>';	
	modal_content += '<div class="wizard-attr">';	
	var attributes = entities[0].attributes;

	if (attributes.length > 0){
		modal_content += 'Select the attributes that you want to show in this page<br>';
		modal_content += '<div id="id-left-entity-attributes">';
		for (var i = 0; i<attributes.length; i++){		
			modal_content += '<div class="checkbox">';
			modal_content += '<label><input type="checkbox" value="'+attributes[i]+'">'+attributes[i]+'</label>';
			modal_content += '</div>';
		}
		modal_content += '</div>';
	}
	else{
		modal_content += 'This class has no attributes.<br>'
	}
	modal_content += '</div>';	
	modal_content += '<div class="wizard-ref">';	
	var references = entities[0].references;
	if (references.length > 0){
		modal_content += 'Select the references that you want to show in this page<br>';
		modal_content += '<div id="id-left-entity-references">';				
		for (var i = 0; i<references.length; i++){
			modal_content += '<div class="checkbox">';
			modal_content += '<label><input type="checkbox" value="'+references[i]+'">'+references[i]+'</label>';
			modal_content += '</div>';
		}
		modal_content += '</div>';
	}
	else{
		modal_content += 'This class has no references.<br>'
	}
	modal_content += '</div>';	
	modal_content += '<button class="btn btn-danger btn-xs" onclick="remove_page(this);">-Remove</button></div>';
	$('#id-page-container').append(modal_content);
};

function remove_page(elem){
	$(elem).parent().remove();
};

function load_properties_in_wizard(elem){
	var attr_container = $(elem).parent().parent().parent().find('.wizard-attr');
	var ref_container = $(elem).parent().parent().parent().find('.wizard-ref');
	var main_entity = $(elem).val();
	var main = null;
	var attr_content = '';
	for (var i = 0, found = false; i<entities.length && !found; i++){
		var entity = entities[i];
		if (entity.name==main_entity){
			main = entity;
			found = true;			
		}
	}
	var attributes = main.attributes;
	if (attributes.length > 0){
		attr_content += 'Select the attributes that you want to show in this page<br>';
		attr_content += '<div id="id-left-entity-attributes">';			
		for (var i = 0; i<attributes.length; i++){
			attr_content += '<div class="checkbox">';
			attr_content += '<label><input type="checkbox" value="'+attributes[i]+'">'+attributes[i]+'</label>';
			attr_content += '</div>';
		}		
		attr_content += '</div>';
	}
	else{
		attr_content += 'This class has no attributes.<br>'
	}
	attr_container.html(attr_content);
	var ref_content = '';
	var references = main.references;
	if (references.length > 0){
		ref_content += 'Select the references that you want to show in this page<br>';
		ref_content += '<div id="id-left-entity-references">';		
		
		for (var i = 0; i<references.length; i++){
			ref_content += '<div class="checkbox">';
			ref_content += '<label><input type="checkbox" value="'+references[i]+'">'+references[i]+'</label>';
			ref_content += '</div>';
		}		
		ref_content += '</div>';
	}
	else{
		ref_content += 'This class has no references.<br>'
	}
	ref_container.html(ref_content);
};

function add_wizards_to_file(){
	var indent = '<br>&emsp;&emsp;<span class="file-line">';
	var line_class_close = '</span>';
	var container = $('#id-file-interaction').find('.file-section-container');
	var html = indent + 'Interaction elements {'+ line_class_close;	
	$('#id-wizards-container').children().each(function(i, object){
		var class_name = $(this).find('table').find('#id-left-entity').val();
		html += indent + 'Wizard WizardForCreate'+class_name+' for context class '+class_name+' {'+ line_class_close;
		var title = $(this).find('#id-wizard-name').val();
		var description = $(this).find('#id-wizard-desc').val();
		html += indent + 'title "' + title + '"'+ line_class_close;
		html += indent + 'description "' + description + '"'+ line_class_close;
		html += indent + 'type create'+ line_class_close;
		html += indent + 'pages {'+ line_class_close;
		$(this).find('#id-page-container').find('.page-container').each(function(i, object){
			var tit = $(this).find('#id-wizard-page-name').val();
			var desc = $(this).find('#id-wizard-page-desc').val();
			html += indent + 'title "' + title + '"'+ line_class_close;
			html += indent + 'description "' + description + '"'+ line_class_close;
			html += indent + 'Attributes to show {' + line_class_close;
			$(this).find('.wizard-attr').find("input:checkbox:checked").each(function(){
				html += indent + '("'+$(this).val()+'", "'+$(this).val()+'", textField, "'+$(this).val()+'")' + line_class_close;
			});
			html += indent + '}'+ line_class_close;
			html += indent + 'References to show {' + line_class_close;
			$(this).find('.wizard-ref').find("input:checkbox:checked").each(function(){
				html += indent + '("'+$(this).val()+'", "'+$(this).val()+'", textField, "'+$(this).val()+'")' + line_class_close;
			});
			html += indent + '}'+ line_class_close;
			html += indent + 'Additional buttons{}' + line_class_close;			
		});
		html += indent + '}'+ line_class_close;
		html += indent + 'default buttons true' + line_class_close;
		html += indent + '}' + line_class_close;
	});
	html += indent + '}' + line_class_close;
	html += indent + 'Statements {'+ line_class_close;
	$('#id-wizards-container').children().each(function(i, object){
		var class_name = $(this).find('table').find('#id-left-entity').val();
		html += indent + 'Actions for type '+ class_name + '{' + line_class_close;
		html += indent + 'on create do {' + line_class_close;
		html += indent + 'show wizard WizardForCreate' + class_name+ line_class_close;
		html += indent + '}' + line_class_close;
	});		
	html += indent + '}' + line_class_close;
	container.html(html);
	$('#id-modal-wizards').modal('toggle');
	$('#id-button-download').removeAttr('disabled');
};
