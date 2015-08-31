$(document).ready(function(){
    $("#signinId").click(function(){
        alert("The paragraph was clicked.");
    });
    
    
     $("#homePageTab1").click(function(){
     	$(this).addClass("active");
    	 $("#homePageTab2").removeClass("active");
    	  $("#homePageTab3").removeClass("active");
	});
	
	$("#homePageTab2").click(function(){
     	$(this).addClass("active");
    	 $("#homePageTab1").removeClass("active");
    	  $("#homePageTab3").removeClass("active");
	});
	
	$("#homePageTab3").click(function(){
     	$(this).addClass("active");
    	 $("#homePageTab2").removeClass("active");
    	  $("#homePageTab1").removeClass("active");
	});
         
});

        
        
    