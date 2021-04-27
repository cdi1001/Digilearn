$(document).ready(function () {

    $('.nBtn, .table .eBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text(); //return New or Edit

        if (text === 'Edit') {
            $.get(href, function (quiz, status) {
                $('.myForm #id').val(quiz.id);
                $('.myForm #quiz_name').val(quiz.quiz_name);
                $('.myForm #category').val(quiz.category);
                 $('.myForm #duration').val(quiz.duration);
                $('.myForm #marks').val(quiz.marks);
                $('.myForm #level').val(quiz.level);
 $('.myForm #attempts_available').val(quiz.attempts_available);
            });
            $('.myForm #exampleModal').modal();
        } else {
            $('.myForm #id').val('');
            $('.myForm #quiz_name').val('');
            $('.myForm #category').val('');
            $('.myForm #duration').val('');
            $('.myForm #marks').val('');
            $('.myForm #level').val('');
            $('.myForm #attempts_available').val('');
            $('.myForm #exampleModal').modal();
        }
    });

    $('.table .delBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#myModal #delRef').attr('href', href);
        $('#myModal').modal();
    });
});

var x = document.getElementById("myTopNav");
window.onresize = displayWindowSize;
window.onload = displayWindowSize;
function myFunction(){
    if(x.className === "nav-header"){
        x.className += "responsive";
    }
        else{
            x.className = "nav-header";
        }
}
function displayWindowSize(){
 var myWidth = 0
 myWidth = window.innerWidth; 
 if(myWidth >599){
 	x.className ="nav-header";
 }
}

	function openTable(evt, tabname){
		var i, tabcontent, tablinks;
		tabcontent = document.getElementsByClassName("tabcontent");
		for(i=0; i<tabcontent.length; i++){
			tabcontent[i].style.display = "none";
		}
		tablinks = document.getElementsByClassName("tablinks");
		for(i=0; i<tablinks.length; i++){
			tablinks[i].className = tablinks[i].className.replace("active","");
		}
		document.getElementById(tabname).style.display = "block";
		evt.currentTarget.className += " active";
		
		
	}
