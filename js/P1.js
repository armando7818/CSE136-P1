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
        	document.getElementById(formID).action = "/php/processdata.php";
	    }
	    else if( language == "javascript" ) {
	        document.getElementById(formID).action = "/javascript_Sarkis/processdata.cgi";
	    }
	    else if( language == "java" ) {
	        document.getElementById(formID).action = "/java/processdata.cgi";
	    }
	    else if( language === "ruby"){
		document.getElementById(formID).action='/ruby/processdata.rb';
	    }
	    else if( language === "python"){
		document.getElementById(formID).action='/python/processdata.py';
	    }
	}

}
