package inholland.classicCarsapi;

import inholland.classicCarsapi.model.Car;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ClassicCarsApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ClassicCarsApiApplication.class, args);
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

	@Bean
	@Scope(scopeName = BeanDefinition.SCOPE_PROTOTYPE)
	public List<Car> cars() {
		return new ArrayList<>(
				List.of(
						new Car(1, "Chevrolet", "Chevelle", "1970"),
						new Car(2, "Ford", "Model A", "1928"),
						new Car(3, "Chevrolet", "Corvette", "1967")
				)
		);
	}

}
