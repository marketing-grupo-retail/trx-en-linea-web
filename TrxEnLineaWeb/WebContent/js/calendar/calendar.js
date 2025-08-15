	var cal1 = new CalendarPopup();
					
	function getFecha(pField,pAnchor,pDateFormat) {
		cal1.select(document.forms[0].elements[pField],pAnchor,pDateFormat);
	}
			
	function clearField(pField) {
		document.forms[0].elements[pField].value="";
	}			
