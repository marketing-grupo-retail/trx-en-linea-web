
var selectedActivity;

function validarCampos() {

	if ( ! validateRequiredCheckbox(selectedActivity) ) {
		alert('Debe seleccionar un tipo de actividad.');
	}

};

