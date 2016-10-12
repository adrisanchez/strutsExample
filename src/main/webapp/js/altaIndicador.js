function publishOrganizacionAjax() {
	dojo.event.topic.publish("changeOrganizacion");
}
function changeIndEstrategico() {
	if (document.getElementById('checkEstrategico').checked == true) {
		document.getElementById('labelCodEstrategico').style.display = 'inline';
		document.getElementById('valueCodEstrategico').style.display = 'inline';
	}else{
		document.getElementById('labelCodEstrategico').style.display = 'none';
		document.getElementById('valueCodEstrategico').style.display = 'none';
	}
	
}
dojo.event.topic.subscribe("/value", function(value, key, text, widget){
    dojo.event.topic.publish("changeObjEstrategico");
});

function changeNuevosObjetivos(){
	
	if (document.getElementById('checkObjetivos').checked == true) {
		document.getElementById('labelObjEstrategicoBD').style.display = 'none';
		document.getElementById('valueObjEstrategicoBD').style.display = 'none';
		document.getElementById('labelObjOperativoBD').style.display = 'none';
		document.getElementById('valueObjOperativoBD').style.display = 'none';
		document.getElementById('labelCodObjetivoEstrategico').style.display = 'inline';
		document.getElementById('valueCodObjetivoEstrategico').style.display = 'inline';
		document.getElementById('labelCodObjetivoOperativo').style.display = 'inline';
		document.getElementById('valueCodObjetivoOperativo').style.display = 'inline';
		document.getElementById('labelDesObjetivoEstrategico').style.display = 'inline';
		document.getElementById('valueDesObjetivoEstrategico').style.display = 'inline';
		document.getElementById('labelDesObjetivoOperativo').style.display = 'inline';
		document.getElementById('valueDesObjetivoOperativo').style.display = 'inline';
		
	}else{
		document.getElementById('labelObjEstrategicoBD').style.display = 'block';
		document.getElementById('valueObjEstrategicoBD').style.display = 'block';
		document.getElementById('labelObjOperativoBD').style.display = 'block';
		document.getElementById('valueObjOperativoBD').style.display = 'block';
		document.getElementById('labelCodObjetivoEstrategico').style.display = 'none';
		document.getElementById('valueCodObjetivoEstrategico').style.display = 'none';
		document.getElementById('labelCodObjetivoOperativo').style.display = 'none';
		document.getElementById('valueCodObjetivoOperativo').style.display = 'none';
		document.getElementById('labelDesObjetivoEstrategico').style.display = 'none';
		document.getElementById('valueDesObjetivoEstrategico').style.display = 'none';
		document.getElementById('labelDesObjetivoOperativo').style.display = 'none';
		document.getElementById('valueDesObjetivoOperativo').style.display = 'none';
	}
	
}