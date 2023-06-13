$(document).ready(function(){

	var searchBy = $("button#searchby");
	var searchBox = $("input#searchbox");
    $("li#byid").click(function() {
    	searchBy.text("ID");
    	searchBox.attr("type", "number");
    });
    $("li#byname").click(function() {
    	searchBy.text("Name");
    	searchBox.attr("type", "text");
    });
    
    $("button#search").click(function() {
    	$.get("http://localhost:7777/students/"+searchBox.val(), function(students){
    		$("h5#resultsheading").text('Search results for "'+searchBox.val()+'":');
    		var studentsDiv = $('div#allstudents');
    		studentsDiv.empty();
    		if (searchBy.text() === "ID") {
    			var studentInfo = '<p>';
                studentInfo += 'ID: ' + students.id + '<br>';
                studentInfo += 'Name: ' + students.name + '<br>';
                studentInfo += 'Age: ' + students.age + '<br>';
                studentInfo += 'Mobile: ' + students.mobile + '<br>';
                studentInfo += 'Address: ' + students.address + '<br>';
                studentInfo += '</p><hr>';
            
                studentsDiv.append(studentInfo);
    		} else if (searchBy.text() === "Name") {
	            $.each(students, function(index, student) {
	                var studentInfo = '<p>';
	                studentInfo += 'ID: ' + students.id + '<br>';
	                studentInfo += 'Name: ' + students.name + '<br>';
	                studentInfo += 'Age: ' + students.age + '<br>';
	                studentInfo += 'Mobile: ' + students.mobile + '<br>';
	                studentInfo += 'Address: ' + students.address + '<br>';
	                studentInfo += '</p><hr>';
	            
	                studentsDiv.append(studentInfo);
	            });
    		}
    	});
    });

})