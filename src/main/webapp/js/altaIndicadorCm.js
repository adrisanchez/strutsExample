function changeNuevoObjEjeEstrategicoCm(){
	if (document.getElementById('checkObjEjeEstrCm').checked == true) {
		document.getElementById('labelObjEstrategicoCmBD').style.display = 'none';
		document.getElementById('valueObjEstrategicoCmBD').style.display = 'none';
		document.getElementById('labelEjeEstrategicoCmBD').style.display = 'none';
		document.getElementById('valueEjeEstrategicoCmBD').style.display = 'none';
		document.getElementById('labelCodObjetivoEstrategicoCm').style.display = 'inline';
		document.getElementById('valueCodObjetivoEstrategicoCm').style.display = 'inline';
		document.getElementById('labelDesObjetivoEstrategicoCm').style.display = 'inline';
		document.getElementById('valueDesObjetivoEstrategicoCm').style.display = 'inline';
		document.getElementById('labelCodEjeEstrategicoCm').style.display = 'inline';
		document.getElementById('valueCodEjeEstrategicoCm').style.display = 'inline';
		document.getElementById('labelDesEjeEstrategicoCm').style.display = 'inline';
		document.getElementById('valueDesEjeEstrategicoCm').style.display = 'inline';
		
	}else{
		document.getElementById('labelObjEstrategicoCmBD').style.display = 'block';
		document.getElementById('valueObjEstrategicoCmBD').style.display = 'block';
		document.getElementById('labelEjeEstrategicoCmBD').style.display = 'block';
		document.getElementById('valueEjeEstrategicoCmBD').style.display = 'block';
		document.getElementById('labelCodObjetivoEstrategicoCm').style.display = 'none';
		document.getElementById('valueCodObjetivoEstrategicoCm').style.display = 'none';
		document.getElementById('labelDesObjetivoEstrategicoCm').style.display = 'none';
		document.getElementById('valueDesObjetivoEstrategicoCm').style.display = 'none';
		document.getElementById('labelCodEjeEstrategicoCm').style.display = 'none';
		document.getElementById('valueCodEjeEstrategicoCm').style.display = 'none';
		document.getElementById('labelDesEjeEstrategicoCm').style.display = 'none';
		document.getElementById('valueDesEjeEstrategicoCm').style.display = 'none';
	}
}
dojo.event.topic.subscribe("/value", function(value, key, text, widget){
    dojo.event.topic.publish("changeObjEstrategicoCm");
});
function isNumber(e)
{
	var keyCode=0;
    var  num, regex;
    
  //Para Mozilla Firefox
    if (e.keyCode==0){ 
    	keyCode=e.which;  	
    	} 
	else {
		keyCode=e.keyCode;		
	}
    //para permitir borrar
    if (keyCode == 46 || keyCode== 8 || keyCode == 37 || keyCode == 39 || keyCode == 9){
    	return true;
    }
  
    num = String.fromCharCode(keyCode);  
    regex = /-|\d/; 
    
    return regex.test(num);
}