package lotteworldtower.map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
	
	@GetMapping("/")
	public String main() {
		return "index";
	}

	@GetMapping("/naver")
	public String naverMap() {
		return "naver";
	}

	@GetMapping("/kakao")
	public String kakaoMap() {
		return "kakao";
	}
}
