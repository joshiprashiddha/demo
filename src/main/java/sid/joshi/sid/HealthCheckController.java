package sid.joshi.sid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HealthCheckController {
	@GetMapping("/health")
	public ResponseEntity<String> healthCheck() {
		//add comment
		return new ResponseEntity<>("OK", HttpStatus.OK);
	}
}
