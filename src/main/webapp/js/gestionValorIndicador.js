function publishOrganizacionAjax() {	
	dojo.event.topic.publish("changeOrganizacion");
}

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