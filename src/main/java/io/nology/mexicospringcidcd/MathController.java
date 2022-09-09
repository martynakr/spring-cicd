package io.nology.mexicospringcidcd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MathController {
	
	@GetMapping("/hi")
	public String hi() {
		return "hi";
	}

	@GetMapping("/rectangle/area/{height}/{width}")
	public Integer rectangleArea(@PathVariable Integer height, @PathVariable Integer width) {
		return height * width;
	}
	
	@GetMapping("/circle/perimeter/{r}")
	public Double circPerim(@PathVariable Double r) {
		return 2 * r * Math.PI;
	}

}
