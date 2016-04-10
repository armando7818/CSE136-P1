window.onload=function() {
  
	document.getElementById("postSelect").onchange=function() {
		var language = this.value; 
		changeFormAction("postForm", language);
	} 

	document.getElementById("getSelect").onchange=function() {
		var language = this.value; 
		changeFormAction("getForm", language); 
	} 


	//Changed the forms action 
	function changeFormAction(formID, language)
	{

		if( language == "php" ) {
        	document.getElementById(formID).action = "form.php";
	    }
	    else if( language == "javascript" ) {
	        document.getElementById(formID).action = "/BBB";
	    }
	    else if( language == "java" ) {
	        document.getElementById(formID).action = "/CCC";
	    }
	}

}