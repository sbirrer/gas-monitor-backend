package ch.sbirrer.gasmonitor.backend;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import ch.sbirrer.gasmonitor.backend.rest.FillingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {

	@Autowired
	private FillingController fillingController;

	@Test
	void contextLoads() {
		assertNotNull(fillingController);
	}

}
