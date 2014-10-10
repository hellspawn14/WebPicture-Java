//HTML .picture grapher - Developed by: Oscar Martínez

var picture_graph = new function (){
	// param: html_element is the div element where the entity is going to be shown 
	// param: html_representation is the div where the graphical properties are contained 
	this.render_entity = function(html_element, html_representation){
		var entity_div = $('#id-entity-'+entity_name);
		entity_div.find('.file-label-container').find('.file-line').each(function (i, object){
			picture_graph.render_label_property($(this).text());
		});
		entity_div.find('.file-size-container').find('.file-line').each(function (i, object){
			picture_graph.render_size_property($(this).text());
		});
		var first_line = entity_div.find('.file-figure-container').find('.file-line').first().text();
		var figure_type = picture_graph.get_figure_type(first_line);

		if(figure_type==0){
			picture_graph.render_regular(first_line);
		}
		else if(figure_type==1){
			picture_graph.render_image();
		}
		else if(figure_type==2){
			// NOT IMPLENTED
		}
		
		entity_div.find('.file-figure-container').find('.file-line').each(function (i, object){
			picture_graph.render_size_property($(this).text());
		});
	};

	this.get_figure_type = function(text){
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

	this.render_image = function(){
		$('#id-figure').append('<img src="'+  +'">');
	};

	this.render_regular = function(text){
		var figure_name = text.split(' ')[3].replace('{','');
		var regular_type = $('#id-'+figure_name).find('.file-line').first().text().split(' ')[0].trim();
		if(regular_type.match('^Rounded')){
			var radiox = null;
			var radioy = null;
			$('#id-rounded0').find('.file-line').each(function(i,o){
				if (i>0){
					if (i==1 && !($(this).text().indexOf('}') > -1)){
						var radiox = parseInt($(this).text().split(' ')[1].trim());
					}
					else if (i==2 && !($(this).text().indexOf('}') > -1)){
						var radioy = parseInt($(this).text().split(' ')[1].trim());
					}
				}	
			});
			var radius = 'border-radius: ' + ((radiox + radioy)/2) + 'px;'
			$('#id-figure').fadeIn('slow').attr('style', radius);
		}
		else if(regular_type.match('^Regular')){		
			$('#id-figure').append('<img src="static/images/polygon.gif" height="200" width="200">').fadeIn('slow');
		}
		else if(regular_type.match('^Ellipse')){
			var radius = 'border-radius: 50%;'
			$('#id-figure').fadeIn('slow').attr('style', radius);
		}
		else if(regular_type.match('^Complex')){

		}
	};

	this.render_size_property = function(text){
		var x = text.split('(')[1].split(',')[0].trim();
		var y = text.split('(')[1].split(',')[1].replace(')','').trim();
		var style_text = 'width: ' + x + 'px; padding: ' + y + 'px 40px;'
		$('#id-figure').attr('style', style_text);
	};

	this.render_label_property = function(text){
		if (text.match('^label placement')){
			if(text.match('external')){
				$('#id-figure-label').removeClass('figure-label');
				$('#id-figure-container').append($('#id-figure-label'));
			}
			else{
				$('#id-figure-label').addClass('figure-label');
				$('#id-figure').append($('#id-figure-label'));
			}
		}
		else if (text.match('^label icon')){
			// TO DO
		}		
	};
}

