package org.excavator.boot.task;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskApplicationTests {

	@Rule
	public OutputCapture outputCapture = new OutputCapture();

	@Test
	public void contextLoads() {
	}

	@Test
	public void itCountsToTen(){
		SpringApplication.run(PlanetJonesHelloTask.class);

		String output = this.outputCapture.toString();

		String lineSeparator = System.getProperty("line.separator");

		assertTrue(output.contains("1"
		+ lineSeparator + "2"
        + lineSeparator + "3"
        + lineSeparator + "4"
        + lineSeparator + "5"
        + lineSeparator + "6"
        + lineSeparator + "7"
        + lineSeparator + "8"
        + lineSeparator + "9"
        + lineSeparator + "10"
		));
	}

}
