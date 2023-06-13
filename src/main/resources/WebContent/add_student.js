$(document).ready(function(){
	
	$("button#addstudent").click(function(e) {
		e.preventDefault();
	    var formData = {
	    	      name: $("#name").val(),
	    	      age: $("#age").val(),
	    	      mobile: $("#mobile").val(),
	    	      address: $("#address").val(),
	    	    };
	    $.ajax({
	        type: "POST",
	        url: 'http://localhost:7777/students',
	        data: JSON.stringify(formData),
	        dataType: "json",
	        contentType: "application/json; charset=utf-8",
	        success: function(data) {
	        	var successAlert = '<div id="successalert" class="alert alert-success alert-dismissable fade show"> Student successfully added </div>';
	        	$("#submitbutton").before(successAlert);
	        	successAlert = $("#successalert");
	        	setTimeout(function() {
	        		successAlert.alert('close');
	        	}, 2000);
	        }
	    });
	    
	});

})