
	function validarComboCapacitacion() {
		var sel = new Array(4);
		sel[0]= document.forms[0].productQualify[document.forms[0].productQualify.selectedIndex].value
		sel[1]= document.forms[0].comercialQualify[document.forms[0].comercialQualify.selectedIndex].value;
		sel[2]= document.forms[0].admProcessQualify[document.forms[0].admProcessQualify.selectedIndex].value;		
		sel[3]= document.forms[0].otherQualify[document.forms[0].otherQualify.selectedIndex].value;				
		var i,j;
		for (  i=0; i< sel.length-1; i++ ){
			for (  j=i+1; j< sel.length; j++ ){
				//if(sel[i] != '#'){
				if ( sel[i] == sel[j] && sel[i] != '-1') {
					alert('No se pueden repetir valores en la selección de capacitación');
					return false;
				}
			}
				/*else {					
					alert('Todos los combos deben estar seleccionados');
					return false;
				}*/			
		}
		return true
		
	}

