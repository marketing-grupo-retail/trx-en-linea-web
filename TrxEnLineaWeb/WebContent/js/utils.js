/*
 * Proyecto: VisaWeb
 * 
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * All riths Reserved.
 * 
 * $Id: utils.js,v 1.1 2019/12/18 17:31:04 Alfonso Exp $
 * 
 */

function fechaActual(){
	var fechaActual = new Date();
	dia = fechaActual.getDate();
	mes = fechaActual.getMonth() + 1;
	anno = fechaActual.getFullYear();
	fecha = anno+"-"+mes+"-"+dia;
	return fecha;
}

function fechaActualFull(){
	var fechaActual = new Date();
	dia = fechaActual.getDate();
	mes = fechaActual.getMonth() + 1;
	anno = fechaActual.getFullYear();
	hh = fechaActual.getHours();
	mm = fechaActual.getMinutes();
	sg = fechaActual.getSeconds();
	fecha = anno+"-"+mes+"-"+dia+" "+hh+":"+mm+":"+sg;
	return fecha;
}


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
		alert("Los digitos del nombre deben estar entre 3 y 10")
		form1.tf.focus();
		return false;
	}
	for(var i=0; i<obj.length; i++){
		if((!esLetras(obj.charAt(i))) || (obj.charAt(i) == ' ') || (obj.charAt(i) == "\n") ||(obj.charAt(i) == "\t") || (obj.charAt(i) == "\r")){
			return false;		
		}
	}
	return true;
}

function isEmpty(obj){
	if (obj==""){
		return true;
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
				//correo_.select();
				//correo_.focus();
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
	if (isBlank(val)){return false;}
	for(var i=0;i<val.length;i++){
		if(!isDigit(val.charAt(i))){
			return false;
		}
	}
	return true;
}


function goTo(newPage){
	window.location.href = newPage;
}

function alertaCamposIncompletos(mensajes, errObjectsArr){
	var textoValidacion = "Falta completar los siguientes campos:";
	for(i=0;i< mensajes.length;i++){
		if(mensajes[i] != undefined){			
			textoValidacion += "\n * " + mensajes[i];
		}else{
			break;
		}
	}	
	alert(textoValidacion);
	if(errObjectsArr != null){
		errObjectsArr[0].focus();
	}
}

function getFechaActual(){
	mesArr_ = new Array("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre")

	var fecha = new Date(); 
	var dia = fecha.getDate(); // desde 1
	var indexMes = fecha.getMonth(); // desde 0
	var mes = mesArr_[indexMes];
	var anno = fecha.getYear();	
	
	return dia +" de " + mes + " de " + anno;
}

function getHoraActual(){
	var fecha = new Date();
	var horas = fecha.getHours();
	var mins = fecha.getMinutes();
	var segs = fecha.getSeconds();
	return horas+":"+mins+":"+segs;	
}

function printFechaActual(){
	document.write(getFechaActual());
}

function printHoraActual(){
	document.write(getHoraActual());
}


function isFunction(a) {
    return typeof a == 'function';
}

function isObject(a) {
    return (a && typeof a == 'object') || isFunction(a);
}

/****************************** Adicion *******************************/
//Cambia a mayusculas un texto
function cambiar(valor) {
  valor.value = valor.value.toUpperCase();
}

//Imprime ventana
function printWindow(){
	window.print();
}
//Cambio de action y envio del formulario
function changeySumbmitForm(pForm, pAction){
	pForm.action = pAction;
	pForm.submit();
}
function changeySumbmitFormDelConf(pForm, pAction){
  if (confirm("¿Esta seguro de borrar los datos?")) {
	pForm.action = pAction;
	pForm.submit();
  }
}

//Funciones para efectos rollover
function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
 var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
   var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
   if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_showHideLayers() { //v6.0
  var i,p,v,obj,args=MM_showHideLayers.arguments;
  for (i=0; i<(args.length-2); i+=3) if ((obj=MM_findObj(args[i]))!=null) { v=args[i+2];
    if (obj.style) { obj=obj.style; v=(v=='show')?'visible':(v=='hide')?'hidden':v; }
    obj.visibility=v; }
}

//Abre una ventana emergente
function openWindow(pTitle,pUrl,pHeight,pWidth){
	var newWin;
	newWin=open("","", "height="+pHeight+",width="+ pWidth + ",scrollbars=yes,resizable" );
	newWin.moveTo(100,100);
	newWin.location.href= pUrl;
	//newWin.document.title = pTitle;
	newWin.focus();
	
}

function submitForm(theForm){
	theForm.submit();
}

function resetForm(theForm){
	theForm.reset();
}

function toDate(pFecha){
	var parts;
	var oDate = new Date();
	var re = new RegExp("^([0-9]{4})-([0-9]{2})-([0-9]{2})$");
		if (parts=re.exec(pFecha)){
			oDate.setFullYear(parts[1], parts[2]-1, parts[3]);
		}
	return oDate;
			
}

function lpad(res){
	if (res < 10 && res >= 0)
		res = '0'+res;
	return res;
}

<!--
/****************************** dateformat.js *********************************
 *
 * Object Extension for Date object
 *   description:
 *          -Stores day and month arrays in Date object 
 *          -Provides a format function to 'pretty' print
 *           the date in custom formats
 *   parameters:
 *          format - accpets any variation of the following list
 *                 yyyy  is a 4-digit year - i.e., 2002   
 *                 yy    is a 2-digit year - i.e., 02
 *                 month is the full month - i.e., September
 *                 mon   is the first three letters of the month - i.e., Sep
 *                 mmm   is the number of the month - i.e., 9
 *                 hh    is hours - i.e., 3
 *                 mm    is minutes (always 2-digit) - i.e., 05
 *                 ss    is seconds (always 2-digit) - i.e., 08
 *                 ddd   is the first three letters of the day - i.e., Wed
 *                 dd    is the numerical day of the month - i.e, 25
 *                 day   is the full day of the week - i.e., Wednesday
 *                 timezone is the the timezone in hours from GMT - i.e., GMT+5
 *                 time24   is the time based on a 24 hour clock - i.e., 18:24   
 *                 time     is the time based on am/pm - i.e., 6:24PM  
 *   example:
 *           myDate = newDate()
 *           myDate.format("day, month dd, yyyy hh:mm:ss timezone")
 *           would return "Wednesday, September 25, 2002 12:14:11 GMT-5"
 *   note: 
 *           If customizing the dateFormat function be aware that the ordering
 *           of the replace calls
 *   author:
 *           Scott Connelly scottsweep@yahoo.com 1/3/2002
 ******************************************************************************/ 
//Store the date info in the Date object
Date.prototype.Months = ["January", "February", "March", 
                         "April", "May", "June", "July", 
                         "August", "September", "October", 
                         "November", "December"];
Date.prototype.Days = ["Sunday", "Monday", "Tuesday", 
                       "Wednesday", "Thursday", 
                       "Friday", "Saturday"];
Date.prototype.format = dateFormat;

function dateFormat(format) {
   var dateString = format;
	var d = new Date();
   //yyyy  is a 4-digit year - i.e., 2002  
   dateString = dateString.replace( new RegExp("yyyy", "gi"), this.getYear() );
   //yy    is a 2-digit year - i.e., 02
   dateString = dateString.replace( new RegExp("yy", "gi"), new String( this.getYear() ).substring(2,4) );
   //month is the full month - i.e., September
   dateString = dateString.replace( new RegExp("month", "gi"), this.Months[this.getMonth()] );
   //mon   is the first three letters of the month - i.e., Sep
   dateString = dateString.replace( new RegExp("mon", "gi"), new String( this.Months[this.getMonth()] ).substring(0,3) );
   //mmm   is the number of the month - i.e., 9
   dateString = dateString.replace( new RegExp("mmm", "gi"), lpad(this.getMonth() + 1) );   
   //hh    is hours - i.e., 3
   dateString = dateString.replace( new RegExp("hh", "gi"), this.getHours() );
   //mm    is minutes (always 2-digit) - i.e., 05
   var mm = new String( this.getMinutes() );
   if (mm.length == 1) mm = "0" + mm; //pad if single digit
   dateString = dateString.replace( new RegExp("mm", "gi"), mm );
   //ss    is seconds (always 2-digit) - i.e., 08
   var ss = new String( this.getSeconds() );
   if (ss.length == 1) ss = "0" + mm; //pad if single digit
   dateString = dateString.replace( new RegExp("ss", "gi"), ss ); 
   //ddd   is the first three letters of the day - i.e., Wed
   dateString = dateString.replace( new RegExp("ddd", "gi"), new String( this.Days[this.getDay()] ).substring(0,3) );
   //dd    is the numerical day of the month - i.e, 25
   dateString = dateString.replace( new RegExp("dd", "gi"), lpad(this.getDate()) );
   //day   is the full day of the week - i.e., Wednesday
   dateString = dateString.replace( new RegExp("day", "gi"), this.Days[this.getDay()] );

   //timezone is the the timezone in hours from GMT - i.e., GMT+5
   tz = d.getTimezoneOffset();
   timezone = "";
   if (tz < 0)
      timezone = "GMT-" +  tz / 60;
   else if (tz == 0)
      timezone = "GMT";
   else
      timezone = "GMT+" + tz / 60;
   dateString = dateString.replace( new RegExp("timezone", "gi"), timezone );
   
   //time24   is the time based on a 24 hour clock - i.e., 18:24   
   var minutes = new String( this.getMinutes() );
   if (minutes.length == 1) minutes = "0" + minutes; //pad if single digit
   var time24 = new String( this.getHours() + ":" + minutes );
   dateString = dateString.replace( new RegExp("time24", "gi"), time24 );
   
   //time     is the time based on am/pm - i.e., 6:24PM
   var time;
   var ampm;
   var hour = this.getHours();
   if ( hour < 12) {
      if (hour == 0) hour = 12;
         ampm = "AM"
   } else {
      if (hour !=12)
         hour = hour - 12;
      ampm = "PM";   
   }
   time = new String(hour + ":" + minutes + ampm);     
   dateString = dateString.replace( new RegExp("time", "gi"), time );

   return dateString;   
}



var MILLI_DAY = 60 * 60 * 24 * 1000;

//validacion de solo numeros tanto para browser explorer como tipos de netscape
function IsNumeric(objEvent, txtBoxId, allowDecimals){
  var iKeyCode;  	
  var textBox = document.getElementById(txtBoxId);

	// si el tipo de navegador es Netscape compatible, entonces soporta la propiedad which en el objeto event
	if(navigator.appName.toLowerCase() == 'netscape'){
		iKeyCode = objEvent.which;
	}
	else{
		iKeyCode = objEvent.keyCode;	
	}
	if(objEvent.type != 'keypress')
    	return true;		
	
	// si esta en el rango de los numeros del 0  al 9 o si es la tecla de backspace o 
	// cualquier tecla de control ( para incluir la tecla suprimir )
	//if( (iKeyCode >= 48 && iKeyCode <= 57) || iKeyCode == 8 || iKeyCode == 0 || iKeyCode == 45 ) 
	if( (iKeyCode >= 48 && iKeyCode <= 57) ) 
		return true;			
	if(allowDecimals == true){ // si es el punto decimal '.' debemos validar que en la cadena actual no haya ya uno
	  if(iKeyCode == 46){
	  	if(textBox.value.indexOf('.') == -1)
			return true;
  		else
		  	return false;
	  }
	}
	else{
		return false;
	}
			
 return true;
}

function Trim( str ) {
	var resultStr = "";
	
	resultStr = TrimLeft(str);
	resultStr = TrimRight(resultStr);
	
	return resultStr;
}

function TrimLeft( str ) {
	var resultStr = "";
	var i = len = 0;

	// Return immediately if an invalid value was passed in
	if (str+"" == "undefined" || str == null)	
		return null;

	// Make sure the argument is a string
	str += "";

	if (str.length == 0) 
		resultStr = "";
	else {	
  		// Loop through string starting at the beginning as long as there
  		// are spaces.
//	  	len = str.length - 1;
		len = str.length;
		
  		while ((i <= len) && (str.charAt(i) == " "))
			i++;

   	// When the loop is done, we're sitting at the first non-space char,
 		// so return that char plus the remaining chars of the string.
  		resultStr = str.substring(i, len);
  	}

  	return resultStr;
}

function TrimRight( str ) {
	var resultStr = "";
	var i = 0;

	// Return immediately if an invalid value was passed in
	if (str+"" == "undefined" || str == null)	
		return null;

	// Make sure the argument is a string
	str += "";
	
	if (str.length == 0) 
		resultStr = "";
	else {
  		// Loop through string starting at the end as long as there
  		// are spaces.
  		i = str.length - 1;
  		while ((i >= 0) && (str.charAt(i) == " "))
 			i--;
 			
 		// When the loop is done, we're sitting at the last non-space char,
 		// so return that char plus all previous chars of the string.
  		resultStr = str.substring(0, i + 1);
  	}
  	
  	return resultStr;  	
}

