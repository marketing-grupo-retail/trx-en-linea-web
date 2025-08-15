// Title: Tigra Calendar
// URL: http://www.softcomplex.com/products/tigra_calendar/
// Version: 3.2 (European date format)
// Date: 10/14/2002 (mm/dd/yyyy)
// Note: Permission given to use this script in ANY kind of applications if
//    header lines are left unchanged.
// Note: Script consists of two files: calendar?.js and calendar.html

// if two digit year input dates after this year considered 20 century.
var NUM_CENTYEAR = 30;
// is time input control required by default
var BUL_TIMECOMPONENT = false;
// are year scrolling buttons required by default
var BUL_YEARSCROLL = true;

var calendars = [];
var RE_NUM = /^\-?\d+$/;



function seleccionarYValidarFechaYYYYMMDD ( elemento, elementoValidado, cadenaValidacion ){

	if ( elementoValidado.value == cadenaValidacion ){
		seleccionarFechaYYYYMMDD( elemento );
	}
	
}

function seleccionarYCompararFechaYYYYMMDD( elemento, fecha_comparar, num_dias ){
    var cal1 = new calendar1(elemento, fecha_comparar, num_dias );
    cal1.year_scroll = true;
    cal1.time_comp = false;    
	cal1.popup();
}

function seleccionarFechaYYYYMMDD( elemento ){
	alert ("seleccionarFechaYYYYMMDD");
    var cal1 = new calendar1(elemento);
    cal1.year_scroll = true;
    cal1.time_comp = false;    
	cal1.popup();
}

function seleccionarFechaYYYYMMDD( elemento, mostrarFuturo ){
    var cal1 = new calendar1(elemento);
    cal1.year_scroll = true;
    cal1.time_comp = false;    
	cal1.mostrarFuturo = mostrarFuturo;
	cal1.popup();
	
}


function calendar1(obj_target, comp_date, n_days ) {
	// assigning methods
	this.gen_date = cal_gen_date1;
	this.gen_time = cal_gen_time1;
	this.gen_tsmp = cal_gen_tsmp1;
	this.prs_date = cal_prs_date1;
	this.prs_time = cal_prs_time1;
	this.prs_tsmp = cal_prs_tsmp1;
	this.popup    = cal_popup1;
	this.comp_date = comp_date;
	this.n_days    = n_days;
	
	// validate input parameters
	if (!obj_target)
		return cal_error("Error al invocar el calendario: no tiene objetos asociados");
	if (obj_target.value == null)
		return cal_error("Error al invocar el calendario: El objeto asociado no es válido");
	this.target = obj_target;
	this.time_comp = BUL_TIMECOMPONENT;
	this.year_scroll = BUL_YEARSCROLL;
	
	// register in global collections
	this.id = calendars.length;
	calendars[this.id] = this;
}

function cal_popup1 (str_datetime) {


	this.dt_current = this.prs_tsmp(str_datetime ? str_datetime : this.target.value);
	if (!this.dt_current) return;

	var obj_calwindow = window.open(
		'../_common/calendar.html?datetime=' + this.dt_current.valueOf()+ '&id=' + this.id +'&comp_date=' + this.comp_date +'&n_days=' + this.n_days +'&mostrarFuturo=' + this.mostrarFuturo,
		'Calendar', 'width=200,height='+(this.time_comp ? 215 : 190)+
		',status=no,resizable=no,top=200,left=200,dependent=yes,alwaysRaised=yes'
	);
	obj_calwindow.opener = window;
	obj_calwindow.focus();
	obj_calwindow;
}

// timestamp generating function
function cal_gen_tsmp1 (dt_datetime) {
	return(this.gen_date(dt_datetime) + ' ' + this.gen_time(dt_datetime));
}

// date generating function
function cal_gen_date1 (dt_datetime) {
	return (
		dt_datetime.getFullYear()+"-"
		+ (dt_datetime.getMonth() < 9 ? '0' : '') + (dt_datetime.getMonth() + 1) + "-"
		+ (dt_datetime.getDate() < 10 ? '0' : '') + dt_datetime.getDate() 
	);
}

// time generating function
function cal_gen_time1 (dt_datetime) {
	return (
		(dt_datetime.getHours() < 10 ? '0' : '') + dt_datetime.getHours() + ":"
		+ (dt_datetime.getMinutes() < 10 ? '0' : '') + (dt_datetime.getMinutes()) + ":"
		+ (dt_datetime.getSeconds() < 10 ? '0' : '') + (dt_datetime.getSeconds())
	);
}

// timestamp parsing function
function cal_prs_tsmp1 (str_datetime) {
	// if no parameter specified return current timestamp
	if (!str_datetime)
		return (new Date());

	// if positive integer treat as milliseconds from epoch
	if (RE_NUM.exec(str_datetime))
		return new Date(str_datetime);
		
	// else treat as date in string format
	var arr_datetime = str_datetime.split(' ');
	return this.prs_time(arr_datetime[1], this.prs_date(arr_datetime[0]));
}

// date parsing function
function cal_prs_date1 (str_date) {

	var arr_date = str_date.split('-');

	if (arr_date.length != 3) return cal_error ("Formato de fecha inválido: '" + str_date + "'.\nEl formato aceptado es yyyy-mm-dd.");
	if (!arr_date[2]) return cal_error ("Formato de fecha inválido: '" + str_date + "'.\nNo se encontró el día del mes.");
	if (!RE_NUM.exec(arr_date[2])) return cal_error ("Día de mes inválido: '" + arr_date[2] + "'.\nSolo se permiten enteros sin signo.");
	if (!arr_date[1]) return cal_error ("Formato de fecha inválido: '" + str_date + "'.\nNo se encontró el mes.");
	if (!RE_NUM.exec(arr_date[1])) return cal_error ("Mes inválido: '" + arr_date[1] + "'.\nSolo se permiten enteros sin signo.");
	if (!arr_date[0]) return cal_error ("Formato de fecha inválido: '" + str_date + "'.\nNo se encontró el año.");
	if (!RE_NUM.exec(arr_date[0])) return cal_error ("Año inválido: '" + arr_date[0] + "'.\nSolo se permiten enteros sin signo.");

	var dt_date = new Date();
	dt_date.setDate(1);

	if (arr_date[1] < 1 || arr_date[1] > 12) return cal_error ("Fecha de mes inválida: '" + arr_date[1] + "'.\nEl rango permitido es 01-12.");
	dt_date.setMonth(arr_date[1]-1);
	 
	if (arr_date[0] < 100) arr_date[0] = Number(arr_date[0]) + (arr_date[0] < NUM_CENTYEAR ? 2000 : 1900);
	dt_date.setFullYear(arr_date[0]);

	var dt_numdays = new Date(arr_date[0], arr_date[1], 0);
	dt_date.setDate(arr_date[2]);
	if (dt_date.getMonth() != (arr_date[1]-1)) return cal_error ("Día de mes inválido: '" + arr_date[2] + "'.\nEl rango permitido es 01-"+dt_numdays.getDate()+".");

	return (dt_date)
}

// time parsing function
function cal_prs_time1 (str_time, dt_date) {

	if (!dt_date) return null;
	var arr_time = String(str_time ? str_time : '').split(':');

	if (!arr_time[0]) dt_date.setHours(0);
	else if (RE_NUM.exec(arr_time[0]))
		if (arr_time[0] < 24) dt_date.setHours(arr_time[0]);
		else return cal_error ("Valor de hora inválido: '" + arr_time[0] + "'.\nEl rango permitido es 00-23.");
	else return cal_error ("Valor de hora inválido: '" + arr_time[0] + "'.\nLos valores permitidos son enteros sin signo.");
	
	if (!arr_time[1]) dt_date.setMinutes(0);
	else if (RE_NUM.exec(arr_time[1]))
		if (arr_time[1] < 60) dt_date.setMinutes(arr_time[1]);
		else return cal_error ("Valor de minutos inválido: '" + arr_time[1] + "'.\nEl rango permitido es 00-59.");
	else return cal_error ("Valor de minutos inválido: '" + arr_time[1] + "'.\nLos valores permitidos son enteros sin signo.");

	if (!arr_time[2]) dt_date.setSeconds(0);
	else if (RE_NUM.exec(arr_time[2]))
		if (arr_time[2] < 60) dt_date.setSeconds(arr_time[2]);
		else return cal_error ("Valor de segundos inválido: '" + arr_time[2] + "'.\nEl rango permitido es 00-59.");
	else return cal_error ("Valor de segundos inválido: '" + arr_time[2] + "'.\nLos valores permitidos son enteros sin signo.");

	dt_date.setMilliseconds(0);
	return dt_date;
}

function cal_error (str_message) {
	alert (str_message);
	return null;
}



function compSeleccionFechas(fecha_inicio, fecha_fin, num_dias){
//	alert('comparando fechas ...'+fecha_inicio+" "+fecha_fin+" "+num_dias);

/*	if(isObject(funValidarFecha)){
		alert("valid:"+funValidarFecha);
		funValidarFecha(seleccionRango_theForm.fecha.value);
	}
*/		
   
   var array_ = fecha_inicio.split("-");
   
   var fecha_inicio_ = new Date(array_[0], array_[1]-1, array_[2]);
   fecha_inicio_.setHours(0);
   fecha_inicio_.setMinutes(0);
   fecha_inicio_.setSeconds(0);      
   fecha_inicio_.setMilliseconds(0);         
   
   var array_ = fecha_fin.split("-");
   var fecha_fin_ = new Date(array_[0], array_[1]-1, array_[2]);

   fecha_fin_.setHours(23);
   fecha_fin_.setMinutes(59);
   fecha_fin_.setSeconds(59);  
   fecha_fin_.setMilliseconds(999);

   diferenciaFechas_ = Date.parse(fecha_fin_.toString()) -
					  Date.parse(fecha_inicio_.toString());
   var ret_ = false;
   if ( diferenciaFechas_ < ( num_dias * 86400000 )&& diferenciaFechas_ > 0){ 
     ret_ = true;
   }else{
  		alert("Las fechas no deben diferir en más de 15 días.");   		
    }  
   //alert(ret_);
   return ret_;
	
}

function toggleFechaSistemaYYYYMMDD( campo ){
  if (campo.value == ""){
	dt_datetime = new Date();
	campo.value = (
		dt_datetime.getFullYear()+"-"
		+ (dt_datetime.getMonth() < 9 ? '0' : '') + (dt_datetime.getMonth() + 1) + "-"
		+ (dt_datetime.getDate() < 10 ? '0' : '') + dt_datetime.getDate() 
	);
	return campo.value;
  }	
  else{
   	campo.value = "";
  }
}

function toggleFechaSistemaYYYYMMDDHHMMSS( campo ){
  if (campo.value == ""){
	dt_datetime = new Date();
	campo.value = (
		dt_datetime.getFullYear()+"-"
		+ (dt_datetime.getMonth() < 9 ? '0' : '') + (dt_datetime.getMonth() + 1) + "-"
		+ (dt_datetime.getDate() < 10 ? '0' : '') + dt_datetime.getDate()+" "
		+ (dt_datetime.getHours() < 10 ? '0' : '') + dt_datetime.getHours() + ":"
		+ (dt_datetime.getMinutes() < 10 ? '0' : '') + (dt_datetime.getMinutes()) + ":"
		+ (dt_datetime.getSeconds() < 10 ? '0' : '') + (dt_datetime.getSeconds()));
		
	return campo.value;
  }	
  else{
   	campo.value = "";
  }
}

function toggleFechaSistemaYYYYMMDDHHMMSS( campo ){
  if (campo.value == ""){
	dt_datetime = new Date();
	campo.value = (
		dt_datetime.getFullYear()+"-"
		+ (dt_datetime.getMonth() < 9 ? '0' : '') + (dt_datetime.getMonth() + 1) + "-"
		+ (dt_datetime.getDate() < 10 ? '0' : '') + dt_datetime.getDate()+" "
		+ (dt_datetime.getHours() < 10 ? '0' : '') + dt_datetime.getHours() + ":"
		+ (dt_datetime.getMinutes() < 10 ? '0' : '') + (dt_datetime.getMinutes()) + ":"
		+ (dt_datetime.getSeconds() < 10 ? '0' : '') + (dt_datetime.getSeconds()));
	
	return campo.value;
  }	
  else{
   	campo.value = "";
  }
}


function asignarFechaSistemaYYYYMMDDHHMMSS( campo ){

	dt_datetime = new Date();
	campo.value = (
		dt_datetime.getFullYear()+"-"
		+ (dt_datetime.getMonth() < 9 ? '0' : '') + (dt_datetime.getMonth() + 1) + "-"
		+ (dt_datetime.getDate() < 10 ? '0' : '') + dt_datetime.getDate()+" "
		+ (dt_datetime.getHours() < 10 ? '0' : '') + dt_datetime.getHours() + ":"
		+ (dt_datetime.getMinutes() < 10 ? '0' : '') + (dt_datetime.getMinutes()) + ":"
		+ (dt_datetime.getSeconds() < 10 ? '0' : '') + (dt_datetime.getSeconds()));
	return campo.value;
  

}


function asignarFechaSistemaYYYYMMDD( campo ){

	dt_datetime = new Date();
	campo.value = (
		dt_datetime.getFullYear()+"-"
		+ (dt_datetime.getMonth() < 9 ? '0' : '') + (dt_datetime.getMonth() + 1) + "-"
		+ (dt_datetime.getDate() < 10 ? '0' : '') + dt_datetime.getDate());
	
	return campo.value;
  

}


function FechaSistemaYYYYMMDDHHMMSS( ){
	dt_datetime = new Date();
	return (
		dt_datetime.getFullYear()+"-"
		+ (dt_datetime.getMonth() < 9 ? '0' : '') + (dt_datetime.getMonth() + 1) + "-"
		+ (dt_datetime.getDate() < 10 ? '0' : '') + dt_datetime.getDate()+" "
		+ (dt_datetime.getHours() < 10 ? '0' : '') + dt_datetime.getHours() + ":"
		+ (dt_datetime.getMinutes() < 10 ? '0' : '') + (dt_datetime.getMinutes()) + ":"
		+ (dt_datetime.getSeconds() < 10 ? '0' : '') + (dt_datetime.getSeconds())
	
	);
}


function FechaSistemaYYYYMMDD( ){
	dt_datetime = new Date();
	return (
		dt_datetime.getFullYear()+"-"
		+ (dt_datetime.getMonth() < 9 ? '0' : '') + (dt_datetime.getMonth() + 1) + "-"
		+ (dt_datetime.getDate() < 10 ? '0' : '') + dt_datetime.getDate()+" "
		+ (dt_datetime.getHours() < 10 ? '0' : '') + dt_datetime.getHours() 	
	);
}
