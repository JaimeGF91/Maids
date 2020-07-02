

// toggle list vs card view
$(".option__button2").on("click", function() {
	$(".option__button2").removeClass("selected2");
	$(this).addClass("selected2");
	if ($(this).hasClass("option--grid")) {
		$(".results-section").attr("class", "results-section results--grid");
	} else if ($(this).hasClass("option--list")) {
		$(".results-section").attr("class", "results-section results--list");
	}
});