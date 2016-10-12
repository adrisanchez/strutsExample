/**
 * 
 */

function onInvokeAction(id) {
    $.jmesa.createHiddenInputFieldsForLimitAndSubmit(id);
}
var previousInvokeAction = onInvokeAction;

function onInvokeExportAction(id) {	
    var parameterString = $.jmesa.createParameterStringForLimit(id);
    
    var frm = document.forms[0];
    if (frm.id == 'search-block-form') frm = document.forms[1];
	var action = frm.action;
	var actionNueva = frm.action + '?' + parameterString;
	
	frm.action = actionNueva;
	frm.submit();
	frm.action = action;	
	activarForm();
}
var previousInvokeExportAction = onInvokeExportAction;
