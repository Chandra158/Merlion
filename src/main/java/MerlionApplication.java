import com.cp.merlion.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@RestController
@ComponentScan({"com.cp.merlion"})
@EnableAutoConfiguration
//@SpringBootApplication
public class MerlionApplication {

	@Autowired
	private SampleService service;
	@RequestMapping("/")
	String home() {

		return service.getName()+"Hello World!";
	}

	@RequestMapping("/playex")
	@ResponseBody
	public String page() {
		return "playex";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MerlionApplication.class, args);
	}

}