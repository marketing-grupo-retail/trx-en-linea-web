/**********************************************************************/ 
/*Function name :isDigit(theDigit) */ 
/*Usage of this function :test for an digit */ 
/*Input parameter required:thedata=string for test whether is digit */ 
/*Return value :if is digit,return true */ 
/* else return false */ 
/**********************************************************************/ 
function isDigit(num){ 	
	if (num.length > 1){return false;	}
	var string="1234567890";
	if (string.indexOf(num)!=-1){return true;}
	return false;	
} 

/*************************************************************************/ 
/*Function name :isPositiveInteger(theString) */ 
/*Usage of this function :test for an +ve integer */ 
/*Input parameter required:thedata=string for test whether is +ve integer*/ 
/*Return value :if is +ve integer,return true */ 
/* else return false */ 
/*function require :isDigit */ 
/*************************************************************************/ 
function isPositiveInteger(theString) { 
	var theData = new String(theString) 
	for (var i = 0; i < theData.length; i++){ 
		if (!isDigit(theData.charAt(i))) {
			return false;
		}
	}
	return true; 
}


function esBlanco(obj){
	if (obj==""){

		return false;
	}
	for(var i=0; i<obj.length; i++){
		if((!esLetras(obj.charAt(i))) || (obj.charAt(i) == ' ') || (obj.charAt(i) == "\n") ||(obj.charAt(i) == "\t") || (obj.charAt(i) == "\r")){
			return false;		
		}
	}
	return true;
}


function esCorreoValido( correo_ ){

	
	re = /(\s)*(\w)+[[\.|\-]?(\w)+]*\@(\w)+\.(\w)+[\.\w+]*(\s)*/gi;
	correo = new String(correo_.value);
	re_correo = correo.replace(re, "");
	if (re_correo.length > 0){

				alert("El campo de correo electrónico debe ser de la forma : direccion@servidor.dominio");
				correo_.select();
				correo_.focus();
				return false;						
	}	
	return true;
	
}


function esFraseAlfabetica( palabra, campo ){
	//alert(palabra);
	re = /([A-Za-zá-ú])\s([A-Za-zá-ú])/gi;
	nw_palabra = palabra.value.replace(re, "$1$2");

	
	re = /(\s)*[A-Za-zá-ú]/g;	
	nw_palabra = nw_palabra.replace(re, "");

		
	if (nw_palabra.length > 0){
		alert("El campo "+campo+" sólo debe tener palabras con letras separadas por espacio si es necesario");
		palabra.value=" ";
		palabra.focus();
		return false;
	}
	
	return true;
	
}


function esLetras(letra){
	if(esBlanco(letra)){
		return false;
	}
	var cad = "abcdefghijklmnñopqrstuvwxyz";
		if(cad.indexOf(letra) == -1){
			alert("La cadena solo debe tener letras")
			return false;		
		}
	return true;
}

function isInteger(val){
	// only allow numbers to be entered
var checkOK = "0123456789";
var checkStr = val;
var allValid = true;
var allNum = "";
for (i = 0;  i < checkStr.length;  i++)
{
ch = checkStr.charAt(i);
for (j = 0;  j < checkOK.length;  j++)
if (ch == checkOK.charAt(j))
break;
if (j == checkOK.length)
{
allValid = false;
break;
}
if (ch != ",")
allNum += ch;
}
if (!allValid)
{
alert("Please enter only digit characters in the \"numbers\" field.");

return (false);
}

}

