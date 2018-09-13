package spring.vlasenko.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.vlasenko.petclinic.examplebean.FakeData;

@SpringBootApplication
public class PetClinicApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PetClinicApplication.class, args);

		System.out.println(ctx.getBean(FakeData.class));
	}
}
