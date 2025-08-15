

	function setSelectedCheckBox(pSelectedBox, globalSelectedBox ) {
		alert('setSelectedCheckBox');
		//var selectedBox = eval('cicloForm.'+pSelectedBox.name+'.value');
		globalSelectedBox.value=pSelectedBox.value;
	}
	
	function validateRequiredCheckbox(pSelectedBox) {
		//var selectedBox = eval('cicloForm.'+pSelectedBox.name+'.value');
		if (selectedBox.value =='') {
			return false;
		}
	}
	
	String.prototype.trim = function() { return this.replace(/^\s+|\s+$/, ''); };
	
	function validateOtros(pCheckBox,pText){
		if(pCheckBox.checked && pText.value.trim()==''){
			alert('Al seleccionar Otros, debe digitar cuál es la otra razón');
			return false;	
		}
		if(!pCheckBox.checked && pText.value.trim()!=''){
			alert('Si digita la razón, debe chequear la caja de Otros');
			return false;	
		}
		return true;
	}

	function validateCheck2(pCheckBox,pText1,pText2){
		if(pCheckBox.checked && pText1.value.trim()==''){
			return false;	
		}
		if(!pCheckBox.checked && pText1.value.trim()!=''){
			return false;	
		}
		if(pCheckBox.checked && pText2.value.trim()==''){
			return false;	
		}
		if(!pCheckBox.checked && pText2.value.trim()!=''){
			return false;	
		}
		
		return true;
	}	
	
	function validateCheck1(pCheckBox,pText){
		if(pCheckBox.checked && pText.value.trim()==''){
			return false;	
		}
		if(!pCheckBox.checked && pText.value.trim()!=''){
			return false;	
		}
		return true;
	}
	