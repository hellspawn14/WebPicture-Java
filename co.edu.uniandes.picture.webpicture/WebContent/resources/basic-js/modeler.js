$(function() {
	$("#tools").accordion({
		collapsible : true,
		heightStyle : "content"
	});
});

/**
 * Factor maximo de escalamiento
 * - No generado -
 */
var maxScale = 4;

/**
 * Marcador de escala del diagrama
 * - No generado -
 */
var currentScaleFactor = 1;

/**
 * Hace zoom sobre el paper principal
 * - No generado -
 */
function zoomIn() {
	if (currentScaleFactor < maxScale) {
		currentScaleFactor++;
		paper.scale(currentScaleFactor, currentScaleFactor);
	}
}

/**
 * Hace zoom out sobre el paper principal
 * - No generado -
 */
function zoomOut() {
	if (currentScaleFactor > 1) {
		currentScaleFactor--;
		paper.scale(currentScaleFactor, currentScaleFactor);
	}
}

/**
 * Retorna la instancia del elemento
 * - No generado -
 */
function getElementInstance(cell) {
	var cellType = cell.get('type');
	cellType = cellType.split('.')[1].toLowerCase();
	if (cellType == 'image') {
		return 'image/type';
	} else if (cellType == 'rect') {
		return 'rect/type';
	} else if (cellType == 'circle') {
		return 'circle/type';
	} else if (cellType == 'path') {
		return 'path/type';
	} else if (cellType == 'member') {
		return '.card/type';
	} else if (cellType == 'imageshape') {
		return '.contenedor/type';
	} else if (cellType == 'polygon') {
		return '.contenedor/type';
	} else if (cellType == 'icnshape') {
		return '.contenedor/type';
	}
}

/**
 * Retorna el texto al interior del elemento
 * - No generado -
 */
function getElementInnerText(cell) {
	var cellType = cell.get('type');
	cellType = cellType.split('.')[1].toLowerCase();
	if (cellType == 'member' || cellType == 'imageshape'
			|| cellType == 'polygon' || cellType == 'icnshape') {
		return cell.attr('.name/text');
	} else {
		return cell.attr('text/text');
	}
}

/**
 * Posición del estado actual
 */
var mainStateIndex = 0;

/**
 * Estado actual del modelo
 */
var mainState = null;

/**
 * Lista con los estados del diagrama
 */
var states = new Array();

/**
 * Estado del diagrama salvado
 */
var savedDiagram = null;

/**
 * Indicador de scrolling left
 * - No generado -
 */
var lastScrollLeft = 0;

/**
 * Indicador de scrolling down
 * - No generado -
 */
var lastScrollDown = 0;

/**
 * Responde a los eventos scrolldown y scrolltop para reajustar el
 * tamaño del paper principal
 * - No generado -
 */
$(window).scroll(function(event) {
	$(".tool-container").remove();
	var documentScrollLeft = $(document).scrollLeft();
	if (lastScrollLeft != documentScrollLeft) {
		adjustWidth();
		lastScrollLeft = documentScrollLeft;
	}
	var documentScrollTop = $(document).scrollTop();
	if (lastScrollDown != documentScrollTop) {
		adjustHeight();
		lastScrollDown = documentScrollTop;
	}
});

/**
 * Muestra el panel de propiedades del elemento
 * - No generado -
 */
function showToolBar(cell) {

	var cellId = "#" + cell.id;
	var el = $(cellId)
	el.toolbar({
		content : '#user-options-small',
		position : 'top',
		hideOnClick : true
	});
	el
			.on(
					'toolbarItemClick',

					function(event) {
						var command = $('#hdnClickedIcon').val();

						if (command == 'edit') {
							bootbox.prompt("Edit element name",
									function(result) {
										if (result === null) {
											console.log("No text");
										} else {
											result = result.trim();
											if (result != '') {
												updateCell(cell, result);
											} else {
												console.log("No text");
											}
										}
									});

						} else if (command == 'delete') {
							removeCell(cell);
							$(".tool-container").remove();
						} else if (command == 'toTop') {
							sentToTop(cell);
						} else if (command == 'toBack') {
							sendToBack(cell);
						} else if (command == 'change') {
							var oldWidth = cell.model.get("size").width;
							var oldHeight = cell.model.get("size").height;
							var cnt = '<form class="pure-form pure-form-stacked"><fieldset><div class="pure-control-group"><label for="nWidth">Width (px)</label><input id="nWidth" type="range" min="0" max="1000" step="10" value="'
									+ oldWidth
									+ '"> <output></output> </div><div class="pure-control-group"><label for="nHeight">Height (px)</label><input id="nHeight" type="range" min="0" max="1000" step="10" value="'
									+ oldHeight
									+ '"> <output></output> </div><div class="pure-control-group"><label for="nAngle">Angle (deg)</label><input id="nAngle" type="range" min="0" max="360" step="15" value="0"><output></output> </div></fieldset></form>';
							bootbox.dialog({
								title : "Change element properties",
								message : cnt,
								buttons : {
									success : {
										label : "Save",
										className : "btn-success",
										callback : function() {
											var nWidth = $('#nWidth').val();
											var nHeight = $('#nHeight').val();
											var nAngle = $('#nAngle').val();
											resizeCell(cell, nHeight, nWidth);
											rotateCell(cell, nAngle);
											//Revisa cambios para actualizar el estado actual  
											if (nAngle > 0
													|| oldWidth != nWidth
													|| oldHeight != nHeight) {
												updateDiagram();
											}
										}
									}
								}
							});
							$('#nWidth').rangeslider({
								polyfill : false
							});
							$('#nHeight').rangeslider({
								polyfill : false
							});
							$('#nAngle').rangeslider({
								polyfill : false
							});
						}
					});
}

/**
 * Cambia el tamaño de una celda
 * - No generado -
 */
function resizeCell(cell, nHeight, nWidth) {
	cell.model.resize(nWidth, nHeight);
}

/**
 * Rota una celda
 * - No generado -
 */
function rotateCell(cell, nDeg) {
	cell.model.rotate(-nDeg);
}

/**
 * Elimina la celda seleccionada del diagrama
 * - No generado -
 */
function removeCell(cell) {
	var shape = cell.model;
	shape.remove();
	updateDiagram();
}

/**
 * Actualiza el texto de la celda selecionada
 * - No generado -
 */
function updateCell(cell, label) {
	var cellType = cell.model.get('type');
	cellType = cellType.split('.')[1].toLowerCase();
	if (cellType == 'member' || cellType == 'imageshape'
			|| cellType == 'polygon' || cellType == 'icnshape') {
		return cell.model.attr('.name/text', label);
	} else {
		return cell.model.attr('text/text', label);
	}
	updateDiagram();
}

/**
 * Envia el elemento seleccionado a la parte superior del diagrama
 * - No generado -
 */
function sentToTop(cell) {
	cell.model.toFront();
	updateDiagram();
}

/**
 * Envia el elemento seleccionado a la parte de atras del diagrama
 * - No generado -
 */
function sendToBack(cell) {
	cell.model.toBack();
	updateDiagram();
}

/**
 * Ajusta el ancho del paper principal
 * - No generado -
 */
function adjustWidth() {
	var nW = $('#modelCanvas').width() + 50;
	var nH = $('#modelCanvas').height();
	$('#modelCanvas').animate({
		width : '+=50'
	}, 0);
	paper.setDimensions(nW, nH);
}

/**
 * Ajusta el alto del paper principal
 * - No generado -
 */
function adjustHeight() {
	var nW = $('#modelCanvas').width();
	var nH = $('#modelCanvas').height() + 50;
	$('#modelCanvas').animate({
		height : '+=50'
	}, 0);
	paper.setDimensions(nW, nH);
}

/**
 * Indicador base de los grids
 * 0 -> Grids off
 * 1 -> Grids on
 * - No generado -
 */
var gridsIndicator = 1;

/**
 * Lanza una ventana para confirmar el estado de los grids en el canvas principal
 * Los grids no afectan como se ve el diagrama exportado
 * - No generado -
 */
function gridsProperties() {
	if (gridsIndicator == 1) {
		var msg = "Grids are on, would you like to turn them off?"
		bootbox.dialog({
			message : msg,
			buttons : {
				success : {
					label : "Yes",
					className : "btn-primary",
					callback : function() {
						setGrids('off');
						gridsIndicator = 0;
					}
				},
				danger : {
					label : "No",
					className : "btn-primary",
					callback : function() {
						//Hacer nada
					}
				}
			}
		});
	} else {
		var msg = "Grids are off, would you like to turn them on?"
		bootbox.dialog({
			message : msg,
			buttons : {
				success : {
					label : "Yes",
					className : "btn-primary",
					callback : function() {
						setGrids('on');
						gridsIndicator = 1;
					}
				},
				danger : {
					label : "No",
					className : "btn-primary",
					callback : function() {
						//Hacer nada
					}
				}
			}
		});
	}
}

/**
 * Cambia los grids del paper principal de acuerdo con la accion del usuario
 * - No generado -
 */
function setGrids(action) {
	if (action == 'on') {
		$('#modelCanvas').css("background-image", "url(../res/tiny_grid.png)");
		$('#modelCanvas').css("background-repeat", "repeat");
	} else {
		$('#modelCanvas').css("background-image", "url(/myimage.jpg)");
	}
}

/**
 * Evento de reemplazo de la conexion
 * Los dos elementos deben estar conectados al momento de hacer el reemplazo
 * - No generado -
 */
graph.on('change:target', function(oldLink) {
	var source = oldLink.get('source');
	var target = oldLink.get('target');

	if (source.id && target.id) { // link is connected from an element to an element
		var sourceCell = graph.getCell(source.id);
		var targetCell = graph.getCell(target.id);
		var src = sourceCell.attr(getElementInstance(sourceCell));
		var trg = targetCell.attr(getElementInstance(targetCell));
		replaceLink(oldLink, src, trg);
		updateDiagram();
	}
});

/**
 * En el evento cell:pointerdown (triggered when a pointer is pressed on a cell) oculta los paneles de
 * propiedades existentes y llama a la funcion showToolBar(cell) para mostrar un nuevo panel de propiedades
 * en la celda seleccionada
 * - No generado -
 */
paper
		.on('cell:pointerdown',
				function(cell, evt, x, y) {
					$(".tool-container").remove();
					//console.log(getElementInnerText(cell));
					if (cell.model instanceof joint.dia.Link) {
					} else {

						if (!cell.model.get('embeds')
								|| cell.model.get('embeds').length === 0) {
							// Show the dragged element above all the other cells (except when the
							// element is a parent).
							//cell.model.toFront();
						}

						if (cell.model.get('parent')) {
							graph.getCell(cell.model.get('parent')).unembed(
									cell.model);
						}

						showToolBar(cell);
					}
				});

/**
 * Oculta los paneles de propiedades existentes
 * para mostrar un nuevo panel de propiedades en la celda seleccionada
 * - No generado -
 */
paper.on('blank:pointerdown', function(cell, evt) {
	$(".tool-container").remove();
});

/**
 * Ajusta el tamaño del paper de acuerdo al lugar en el que se deje una celda
 * - No generado -
 */
paper.on('cell:pointermove', function(cell, evt, x, y) {
	$(".tool-container").remove();
	if (x >= $('#modelCanvas').width()) {
		adjustWidth();
	}
	if (y >= $('#modelCanvas').height()) {
		adjustHeight();
	}
});

$(document).ready(function() {

	/*
	 * Tooltips de los botones de la herramienta
	 */
	Tipped.create('#homeBtn', 'Home', {
		position : 'bottom'
	});
	Tipped.create('#saveBtn', 'Save diagram', {
		position : 'bottom'
	});
	Tipped.create('#exportBtn', 'Export diagram as', {
		position : 'bottom'
	});
	Tipped.create('#clearBtn', 'Delete all contents', {
		position : 'bottom'
	});
	Tipped.create('#unDoBtn', 'Undo', {
		position : 'bottom'
	});
	Tipped.create('#reDoBtn', 'Redo', {
		position : 'bottom'
	});
	Tipped.create('#zoomInBtn', 'Zoom in', {
		position : 'bottom'
	});
	Tipped.create('#zoomOutBtn', 'Zoom out', {
		position : 'bottom'
	});
	Tipped.create('#validateBtn', 'Validate diagram', {
		position : 'bottom'
	});
	Tipped.create('#helpBtn', 'Help', {
		position : 'bottom'
	});
	Tipped.create('#gridsBtn', 'Grids', {
		position : 'bottom'
	});
	Tipped.create('#informationBtn', 'About this diagram', {
		position : 'bottom'
	});

	/**
	 * Tool tips paneles de herramientas
	 * - Generado segun los paneles de herramientas de la paleta -
	 */
	Tipped.create('#headGroup1', 'Group I description', {
		position : 'right'
	});
	Tipped.create('#headGroup2', 'Group II description', {
		position : 'right'
	});
	Tipped.create('#headGroup3', 'Group III description', {
		position : 'right'
	});
	Tipped.create('#headGroup4', 'Group IV description', {
		position : 'right'
	});

	//paletteName
	Tipped.create('#paletteName', 'Descripción de la paleta', {
		position : 'right'
	});
});

window.onload = function() {
	//console.log(estadoActual);
	//startDiagram(estadoActual);
};

$(document).ready(function() {
	startDiagram(estadoActual);
});

/**
 * Inicia el evento drag para transladar un elemento de un paper a otro
 * - No generado -
 */
function elementOnDrag(event) {
	event = joint.util.normalizeEvent(event);
	if (elementClone) {
		var scrollTop = document.body.scrollTop
				|| document.documentElement.scrollTop;
		flyPaper.$el.offset({
			left : event.clientX - cloneBBox.width / 2,
			top : event.clientY + scrollTop - cloneBBox.height / 2
		})
	}
}

/** 
 * Confirma el drag-end en el paper principal
 * - No generado -
 */
function elementOnDragEnd(event) {
	event = joint.util.normalizeEvent(event);
	if (elementClone && cloneBBox) {
		elementOnDrop(event, elementClone.clone(), cloneBBox);
		flyPaper.$el.removeClass("dragging");
		elementClone.remove();
		elementClone = undefined;
		$(".paper-drag").hide();
	}
}

/**
 * Clona el elemento selecionado en el paper principal
 * - No generado -
 */
function elementOnDrop(event, cell, cellViewBBox) {
	var paper = toPaper;
	var graph = toGraph;
	var paperPosition = paper.$el.offset();
	var scrollTop = document.body.scrollTop
			|| document.documentElement.scrollTop;
	var scrollLeft = document.body.scrollLeft
			|| document.documentElement.scrollLeft;
	var paperArea = g.rect(paperPosition.left
			+ parseInt(paper.$el.css("border-left-width"), 10) - scrollLeft,
			paperPosition.top + parseInt(paper.$el.css("border-top-width"), 10)
					- scrollTop, paper.$el.innerWidth(), paper.$el
					.innerHeight());
	var p = paper.svg.createSVGPoint();
	p.x = event.clientX;
	p.y = event.clientY;
	if (paperArea.containsPoint(p)) {
		var fakeRect = V("rect", {
			width : paper.options.width,
			height : paper.options.height,
			x : 0,
			y : 0,
			opacity : 0
		});
		V(paper.svg).prepend(fakeRect);
		var paperOffset = $(paper.svg).offset();
		fakeRect.remove();
		p.x += scrollLeft - paperOffset.left;
		p.y += scrollTop - paperOffset.top;
		var pointTransformed = p.matrixTransform(paper.viewport.getCTM()
				.inverse());
		var cellBBox = cell.getBBox();
		pointTransformed.x += cellBBox.x - cellViewBBox.width / 2;
		pointTransformed.y += cellBBox.y - cellViewBBox.height / 2;
		cell.set("position", {
			x : g.snapToGrid(pointTransformed.x, paper.options.gridSize),
			y : g.snapToGrid(pointTransformed.y, paper.options.gridSize)
		});
		cell.unset("z");
		cell.unset("x");
		cell.unset("y");
		cell.set.interactive = true;
		graph.addCell(cell);
	}
}

/**
 * Responde a los eventos para iniciar y terminar el arrastre de un elemento al paper principal
 * - No generado -
 */
$(document.body).on({
	"mousemove.palette touchmove.palette" : elementOnDrag,
	"mouseup.palette touchend.palette" : elementOnDragEnd
});

/**
 * Paper de destino
 * - No generado -
 */
var toPaper = paper;

/**
 * Graph de destino
 */
var toGraph = graph;

/**
 * Graph intermedio para transladar los elementos
 * - No generado -
 */
var flyGraph = new joint.dia.Graph;

/**
 * Paper intermedio para transladar los elementos
 * - No generado -
 */
var flyPaper = new joint.dia.Paper({
	el : $('.paper-drag'),
	gridSize : 10,
	width : 1,
	height : 1,
	model : flyGraph
});

/**
 * Elemento clonado
 * - No generado -
 */
var elementClone = undefined;

/**
 * Contenedor del elemento clonado
 * - No generado -
 */
var cloneBBox = undefined;

/**
 * Valida el modelo y lanza una ventana emergente con el reporte de error
 * - No generado -
 */
function validateModel() {
	var validate = validateDiagram();
	throwErrorReport(validate);
}

/**
 * Recorre los elementos del diagrama para hacer validaciones sobre estos
 * - No generado -
 */
function validateDiagram() {
	var errorIndex = 0;
	//Valida los links 
	var links = validateLinks();
	var errorReport = ''
	if (links == false) {
		errorIndex++;
		errorReport += errorIndex
				+ " - There are unconnected links in diagram " + '<br>';
	}
	//Valida la estructura del modelo 
	var modelElements = graph.getElements();

	if (errorIndex == 0) {
		errorReport = 'The diagram has been validated, no errors found';
		return errorReport;
	} else {
		return errorReport;
	}
}

/**
 * Valida que los links creados en el diagrama esten conectados
 * - No generado -
 */
function validateLinks() {
	var allLinks = graph.getLinks();
	//Varibles para recorrer el arreglo 
	var nLink = undefined;
	var target = undefined;
	var source = undefined;
	var errorFlag = 0;
	for (var i = 0; i < allLinks.length; i++) {
		nLink = allLinks[i];
		target = nLink.get('target').id;
		source = nLink.get('source').id;
		if (target == undefined || source == undefined) {
			errorFlag++;
		}
	}
	if (errorFlag > 0) {
		return false;
	} else {
		return true;
	}
}

/**
 * Muestra una dialogo con el resultado de la validación del modelo
 * - No generado -
 */
function throwErrorReport(msg) {
	bootbox.alert(msg, function() {
		//Hacer nada 
	});
}

/*
 * Indica si los cambios en el canvas estan guardados en el servidor
 */
var saved = 1;

//---------------------------------------------------------------
//Funciones botones barra herramientas
//---------------------------------------------------------------

/*
 * Verifica que el modelo esta guardado en el servidor (guarda de ser el caso) y redirecciona a la pagina inicial
 * - No generado -
 */
function goHomeSave() {
	//Hay cambios sin salvar 
	if (saved === 0) {
		bootbox
				.dialog({
					message : "There're unsaved changes would you like to save them?",
					buttons : {
						success : {
							label : "Yes",
							className : "btn-primary",
							callback : function() {
								var validDiagram = validateDiagram();
								if (validDiagram == 'The diagram has been validated, no errors found') {
									saveModelImpl();
									window.location.href = "webpicture";
								} else {
									throwErrorReport(validDiagram);
								}
							}
						},
						danger : {
							label : "No",
							className : "btn-danger",
							callback : function() {
								window.location.href = "webpicture";
							}
						}
					}
				});
	} else {
		window.location.href = "webpicture";
	}
}

/*
 * Guarda el estado del canvas en el servidor
 * Evalua que el diagrama sea valido (correcto)
 * - No generado -
 */
function saveModel() {
	var validDiagram = validateDiagram();
	if (validDiagram == 'The diagram has been validated, no errors found') {
		bootbox.alert("All changes saved on server", function() {
			saveModelImpl();
		});
	} else {
		throwErrorReport(validDiagram);
	}
}

/**
 * Implementación de la funcion para guardar el canvas
 */
function saveModelImpl() {
	saved = 1;
	saveDiagram();
}

/*
 * Exporta el diagrama actual a png
 */
function exportCanvas() {

	var validDiagram = validateDiagram();
	if (validDiagram == 'The diagram has been validated, no errors found') {
		//Guarda el modelo 
		saveModelImpl();
		//Exporta y crea el archivo segun el caso
		bootbox.dialog({
			message : "Please choose an exporting format",
			buttons : {
				toPNG : {
					label : ".png",
					className : "btn-primary",
					callback : function() {
						exportPNG();
					}
				},
				toSVG : {
					label : ".svg",
					className : "btn-primary",
					callback : function() {
						exportSVG();
					}
				},
				tojsonformat : {
					label : ".json",
					className : "btn-primary",
					callback : function() {
						exportToJSON();
					}
				}
			}
		});
	} else {
		throwErrorReport(validDiagram);
	}
}

/*
 * Borra todo el diagrama
 */
function clearCanvas() {
	bootbox
			.dialog({
				message : "All elements in current diagram will be deleted, would you like to continue?",
				buttons : {
					success : {
						label : "Yes",
						className : "btn-primary",
						callback : function() {
							clearCanvasImpl();
						}
					},
					danger : {
						label : "No",
						className : "btn-danger",
						callback : function() {
							//Hacer nada
						}
					}
				}
			});
}

/**
 * Implementación de la funcion clear canvas
 * - No generado -
 */
function clearCanvasImpl() {
	saved = 0;
	deleteAllContents();
}

/**
 * Muestra una ventana de ayuda
 * - No generado -
 */
function help() {
	bootbox
			.alert(
					"Drag and drop elements from the Palette panels to the main canvas",
					function() {
						//Hacer nada 
					});
}

/**
 * Actualiza la ultima modificación del diagrama
 * - No generado -
 */
function updateLastModification() {
	var today = new Date();
	var yyyy = today.getFullYear();
	var MM = today.getMonth() + 1;
	var dd = today.getDate();
	var HH = today.getHours();
	var mm = today.getMinutes();
	var ss = today.getSeconds();
	lastModified = yyyy + "/" + MM + "/" + dd + " " + HH + ":" + mm + ":" + ss;
}

/**
 * Inicializa los estados del diagrama
 * - No generado -
 */
function startDiagram(estadoActual) {

	while (states.length > 0) {
		states.pop();
	}
	mainStateIndex = 0;
	restoreDiagram(estadoActual);

	mainState = JSON.stringify(graph);
	states.push(mainState);
}

/**
 * Actualiza los estados actuales del diagrama
 * Mantiene 10 estados
 * - No generado -
 */
function updateDiagram() {
	if (states.length >= 10) {
		states = states.slice(4);
		mainState = JSON.stringify(graph);
		states.push(mainState);
		mainStateIndex = states.length - 1;
		saved = 0;
	} else {
		mainState = JSON.stringify(graph);
		states.push(mainState);
		mainStateIndex++;
		saved = 0;
	}
}

/**
 * Retrocede un estado con respecto al actual y deshace el ultimo cambio hacia el estado anterior
 * - No generado -
 */
function unDoLastChange() {
	//Tiene que estar en un estado diferente del primero para retroceder
	if (mainStateIndex != 0) {
		mainStateIndex = mainStateIndex - 1;
		mainState = states[mainStateIndex];
		graph.fromJSON(JSON.parse(mainState));
	}
}

/**
 * Avanza un estado con respecto al actual y rehace el ultimo cambio hacia el estado siguiente
 * - No generado -
 */
function reDoLastChange() {
	if (mainStateIndex != states.length - 1) {
		mainStateIndex = mainStateIndex + 1;
		mainState = states[mainStateIndex];
		graph.fromJSON(JSON.parse(mainState));
	}
}

/**
 * Borra todo el contenido del Paper del canvas
 * - No generado -
 */
function deleteAllContents() {
	graph.clear();
	updateDiagram();
}

/**
 * Restaura el contenido de un diagrama
 * - No generado -
 */
function restoreDiagram(strJSON) {
	graph.fromJSON(JSON.parse(strJSON));
}

/** 
 * Guarda el contenido de un diagrama
 * - No generado -
 */
function saveDiagram() {
	savedDiagram = JSON.stringify(graph);
	//Guardar el diagrama
	$("#cnt").val(savedDiagram);
	$("#diagram").val(diagramId);
	var form = $('#save_diagram');
	form.attr('action', 'save_diagram');
	form.on("submit", function(e) {
		e.preventDefault();
		$.ajax({
			url : form.attr('action'),
			type : form.attr('method'),
			data : form.serialize(),
			success : function(data) {

			},
			error : function(jXHR, textStatus, errorThrown) {
				alert(errorThrown);
			}
		});
	});
	form.submit();

	startDiagram(savedDiagram);
	updateLastModification();
}

/**
 * Exporta el contenido del modelo a un archivo SVG
 * - No generado -
 */
function exportSVG() {
	var svgExp = this.paperToSVG();
	var blob = new Blob([ svgExp ], {
		type : "text/plain;charset=utf-8"
	});
	saveAs(blob, "model.svg");
}

/**
 * Exporta el contenido del modelo a un archivo PNG
 * - No generado -
 */
function exportPNG() {
	var svgExp = this.paperToSVG();
	var image = new Image();
	image.src = 'data:image/svg+xml;base64,' + window.btoa(svgExp);
	image.onload = function() {
		var canvas = document.createElement('canvas');
		canvas.width = image.width;
		canvas.height = image.height;
		var context = canvas.getContext('2d');
		context.rect(0, 0, $('#modelCanvas').width(), $('#modelCanvas')
				.height());
		context.fillStyle = "white";
		context.fill();
		context.drawImage(image, 0, 0);
		var a = document.createElement('a');
		a.download = "model.png";
		var sURL = canvas.toDataURL('image/png');
		a.href = sURL;
		document.body.appendChild(a);
		a.click();
	}
}

/**
 * Exporta el contenido del modelo a un archivo json
 * - No generado -
 */
function exportToJSON() {
	var JSONExp = JSON.stringify(graph);
	var blob = new Blob([ JSONExp ], {
		type : "text/plain;charset=utf-8"
	});
	saveAs(blob, "model.json");
}

/**
 * Exporta el contenido del paper a SVG incluye las hojas de estilo y las correcciones
 * - No generado -
 */
function paperToSVG() {
	var viewportTransform = V(paper.viewport).attr("transform");
	V(paper.viewport).attr("transform", "");
	var viewportBbox = paper.getContentBBox();
	var svgClone = paper.svg.cloneNode(true);
	V(paper.viewport).attr("transform", viewportTransform || "");
	svgClone.removeAttribute("style");
	V(svgClone).attr({
		width : "100%",
		height : "100%"
	});
	V(svgClone).attr(
			"viewBox",
			viewportBbox.x + " " + viewportBbox.y + " " + viewportBbox.width
					+ " " + viewportBbox.height);
	var styleSheetsCount = document.styleSheets.length;
	var styleSheetsCopy = [];
	for (var i = styleSheetsCount - 1; i >= 0; i--) {
		styleSheetsCopy[i] = document.styleSheets[i];
		document.styleSheets[i].disabled = true
	}
	var defaultComputedStyles = {};
	$(paper.svg).find("*").each(
			function(idx) {
				var computedStyle = window.getComputedStyle(this, null);
				var defaultComputedStyle = {};
				_.each(computedStyle, function(property) {
					defaultComputedStyle[property] = computedStyle
							.getPropertyValue(property)
				});
				defaultComputedStyles[idx] = defaultComputedStyle
			});
	if (styleSheetsCount != document.styleSheets.length) {
		_.each(styleSheetsCopy, function(copy, i) {
			document.styleSheets[i] = copy
		})
	}
	for (var i = 0; i < styleSheetsCount; i++) {
		document.styleSheets[i].disabled = false
	}
	var customStyles = {};
	$(paper.svg)
			.find("*")
			.each(
					function(idx) {
						var computedStyle = window
								.getComputedStyle(paper, null);
						var defaultComputedStyle = defaultComputedStyles[idx];
						var customStyle = {};
						_
								.each(
										computedStyle,
										function(property) {
											if (computedStyle
													.getPropertyValue(property) !== defaultComputedStyle[property]) {
												customStyle[property] = computedStyle
														.getPropertyValue(property)
											}
										});
						customStyles[idx] = customStyle
					});
	$(svgClone).find("*").each(function(idx) {
		$(paper).css(customStyles[idx])
	});
	$(svgClone)
			.find(
					".connection-wrap, .marker-vertices, .link-tools, .marker-arrowheads")
			.remove();
	var svgString;
	try {
		var serializer = new XMLSerializer;
		svgString = serializer.serializeToString(svgClone);
	} catch (err) {
		console.error("Error serializing paper to SVG:", err)
	}
	return svgString;
}

/**
 * Notifica al modelo sobre adicion de celdas al diagrama
 * - No generado -
 */
graph.on('add', function(cell) {
	updateDiagram();
});