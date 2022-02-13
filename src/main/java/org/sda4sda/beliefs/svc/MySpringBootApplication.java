package org.sda4sda.beliefs.svc;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class MySpringBootApplication implements CommandLineRunner {

	// @Autowired
	// private DoctrineRepository doctrineRepository;
	
	// @Autowired
	// private LocalizedValueRepository localizedValueRepository;

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// // Nuke doctrines

		// doctrineRepository.deleteAll();
		// localizedValueRepository.deleteAll();

		// // Save doctrines

		// // - GOD
		// doctrineRepository.save(new Doctrine(1, "doctrine.name.1"));
		// localizedValueRepository.save(new LocalizedValue("en", "doctrine.name.1", "God"));
		// localizedValueRepository.save(new LocalizedValue("es", "doctrine.name.1", "Dios"));
		// // - HUMANITY
		// doctrineRepository.save(new Doctrine(2, "doctrine.name.2"));
		// localizedValueRepository.save(new LocalizedValue("en", "doctrine.name.2", "Humanity"));
		// localizedValueRepository.save(new LocalizedValue("es", "doctrine.name.2", "La Humanidad"));
		// // - SALVATION
		// doctrineRepository.save(new Doctrine(3, "doctrine.name.3"));
		// localizedValueRepository.save(new LocalizedValue("en", "doctrine.name.3", "Salvation"));
		// localizedValueRepository.save(new LocalizedValue("es", "doctrine.name.3", "La Salvación"));
		// // - CHURCH
		// doctrineRepository.save(new Doctrine(4, "doctrine.name.4"));
		// localizedValueRepository.save(new LocalizedValue("en", "doctrine.name.4", "Church"));
		// localizedValueRepository.save(new LocalizedValue("es", "doctrine.name.4", "La Iglesia"));
		// // - DAILY LIVING
		// doctrineRepository.save(new Doctrine(5, "doctrine.name.5"));
		// localizedValueRepository.save(new LocalizedValue("en", "doctrine.name.5", "Daily Living"));
		// localizedValueRepository.save(new LocalizedValue("es", "doctrine.name.5", "La Vida Cristiana"));
		// // - RESTORATION (END TIMES)
		// doctrineRepository.save(new Doctrine(6, "doctrine.name.6"));
		// localizedValueRepository.save(new LocalizedValue("en", "doctrine.name.6", "Restoration (End Times)"));
		// localizedValueRepository.save(new LocalizedValue("es", "doctrine.name.6", "Restauración (Eventos Finales)"));


		// // fetch all doctrines
		// System.out.println("-------------------------------");

		// System.out.println("Doctrines found with findAll():");
		// for (Doctrine doctrine : doctrineRepository.findAll()) {
		// 	System.out.println(doctrine);
		// }
		
		// System.out.println("-------------------------------");

		// // fetch all localized values
		// System.out.println("-------------------------------");

		// System.out.println("Localized values found with findAll():");
		// for (LocalizedValue localizedValue : localizedValueRepository.findAll()) {
		// 	System.out.println(localizedValue);
		// }
		
		// System.out.println("-------------------------------");
  
	}

}
