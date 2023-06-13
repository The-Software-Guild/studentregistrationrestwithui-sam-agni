$(document).ready(function(){

    $.ajax({
        type: 'GET',
        url: 'http://localhost:7777/students',
        success: function(studentArray) {
        	var studentsDiv = $('div#allstudents');

            $.each(studentArray, function(index, student) {
                var studentInfo = '<p>';
                studentInfo += 'ID: ' + student.id + '<br>';
                studentInfo += 'Name: ' + student.name + '<br>';
                studentInfo += 'Age: ' + student.age + '<br>';
                studentInfo += 'Mobile: ' + student.mobile + '<br>';
                studentInfo += 'Address: ' + student.address + '<br>';
                studentInfo += '</p><hr>';
            
                studentsDiv.append(studentInfo);
            })
        },
        error: function() {
            alert('FAILURE!');
        }
    });

})