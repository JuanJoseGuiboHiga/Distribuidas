// The root URL for the RESTful services
var rootURL = "http://localhost:8080/TramarsaSOAP/webresources/reclamos";

var currentWine;

// Retrieve wine list when application starts 
findAll();

// Nothing to delete in initial application state
$('#btnDelete').hide();

// Register listeners
$('#btnSearch').click(function() {

	search($('#searchKey').val());
        
	return false;
});

// Trigger search when pressing 'Return' on search key input field
$('#searchKey').keypress(function(e){
	if(e.which == 13) {
		search($('#searchKey').val());
		e.preventDefault();
		return false;
    }
});

$('#btnAdd').click(function() {
	newWine();
	return false;
});

$('#btnSave').click(function() {
	if ($('#wineId').val() == '')
		addWine();
	else
		updateWine();
	return false;
});

$('#btnDelete').click(function() {
	deleteWine();
	return false;
});

$('#clienteList a').live('click', function() {
	findById($(this).data('identity'));
});

// Replace broken images with generic wine bottle
$("img").error(function(){
  $(this).attr("src", "pics/generic.jpg");

});

function search(searchKey) {
	if (searchKey == '') 
		findAll();
	else
          
		findByName(searchKey);

}

function newWine() {
	$('#btnDelete').hide();
	currentWine = {};
	renderDetails(currentWine); // Display empty form
}

function findAll() {
	console.log('findAll');
	$.ajax({
		type: 'GET',
		url: rootURL,
		dataType: "json", // data type of response
		success: renderList
	});
}

function findByName(searchKey) {
	console.log('findByName: ' + searchKey);
	$.ajax({
		type: 'GET',
		url: rootURL + '/search/' + searchKey,
		dataType: "json",
		success: renderListSimple 
	});
       
}

function findById(id) {
	console.log('findById: ' + id);
	$.ajax({
		type: 'GET',
		url: rootURL + '/' + id,
		dataType: "json",
		success: function(data){
			$('#btnDelete').show();
			console.log('findById success: ' + data.name);
			currentWine = data;
			renderDetails(currentWine);
		}
	});
}

function addWine() {
	console.log('addWine');
	$.ajax({
		type: 'POST',
		contentType: 'application/json',
		url: rootURL,
		dataType: "json",
		data: formToJSON(),
		success: function(data, textStatus, jqXHR){
			alert('Wine created successfully');
			$('#btnDelete').show();
			$('#wineId').val(data.id);
		},
		error: function(jqXHR, textStatus, errorThrown){
			alert('addWine error: ' + textStatus);
		}
	});
}

function updateWine() {
	console.log('updateWine');
	$.ajax({
		type: 'PUT',
		contentType: 'application/json',
		url: rootURL + '/' + $('#wineId').val(),
		dataType: "json",
		data: formToJSON(),
		success: function(data, textStatus, jqXHR){
			alert('Wine updated successfully');
		},
		error: function(jqXHR, textStatus, errorThrown){
			alert('updateWine error: ' + textStatus);
		}
	});
}

function deleteWine() {
	console.log('deleteWine');
	$.ajax({
		type: 'DELETE',
		url: rootURL + '/' + $('#wineId').val(),
		success: function(data, textStatus, jqXHR){
			alert('Wine deleted successfully');
		},
		error: function(jqXHR, textStatus, errorThrown){
			alert('deleteWine error');
		}
	});
}

function renderList(data) {
	// JAX-RS serializes an empty list as null, and a 'collection of one' as an object (not an 'array of one')
	
        var list = data == null ? [] : (data instanceof Array ? data : [data]);
        var elem = document.getElementById('reclamosList li');
        elem.parentNode.removeChild(elem);
	$('#reclamosList li').remove();
	$.each(list, function(index, reclamo) {
		$('#reclamosList').append(reclamo.codigo +"\n Area: "+reclamo.arearec+" "+ "\n Cliente:"+reclamo.cliente);
	});
}

function renderListSimple(data) {
	// JAX-RS serializes an empty list as null, and a 'collection of one' as an object (not an 'array of one')
	var list = data == null ? [] : (data instanceof Array ? data : [data]);

	$('#reclamosList li').remove();
        $('#areatxt').val(data.arearec);
	$('#estadotxt').val(data.estado);
        $('#fechaRegistrotxt').val(data.fechaRegistro);
        $('#observaciontxt').val(data.observacion);
}

function renderDetails(reclamo) {
	$('#arearec').val(reclamo.arearec);
	$('#cliente').val(reclamo.cliente);
	$('#codigo').val(reclamo.codigo);
	$('#estado').val(reclamo.estado);
        $('#fechafin').val(reclamo.fechafin);
	$('#fechaRegistro').val(reclamo.fechaRegistro);
        $('#observacion').val(reclamo.observacion);
}

// Helper function to serialize all the form fields into a JSON string
function formToJSON() {
	var wineId = $('#wineId').val();
	return JSON.stringify({
		"id": wineId == "" ? null : wineId, 
		"name": $('#name').val(), 
		"grapes": $('#grapes').val(),
		"country": $('#country').val(),
		"region": $('#region').val(),
		"year": $('#year').val(),
		"picture": currentWine.picture,
		"description": $('#description').val()
		});
}
