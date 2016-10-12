<%@ taglib prefix="s" uri="/struts-tags" %>
<div id="estado" style="display: none;">
	<div id="errors" style="display: none;"><s:actionerror/></div>
	<div id="messages" style="display: none;"><s:actionmessage/></div>
	<br/>
</div>
<script type="text/javascript">
	if ($('#errors').html().length > 0) {
		$('#errors').css('display','');
		$('#estado').css('display','');
	}
	if ($('#messages').html().length > 0) {
		$('#messages').css('display','');
		$('#estado').css('display','');
	}
</script>