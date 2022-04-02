package org.sda4sda.beliefs.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BeliefsController {

	private final LocalizedValueRepository localizedValueRepository;
	private final DoctrineRepository doctrineRepository;
	private final DoctrineSeeds doctrineSeeds;

	@Autowired
	public BeliefsController(
		LocalizedValueRepository localizedValueRepository, 
		DoctrineRepository doctrineRepository,
		DoctrineSeeds doctrineSeeds
	) {
		this.localizedValueRepository = localizedValueRepository;
		this.doctrineRepository = doctrineRepository;
		this.doctrineSeeds = doctrineSeeds;
	}

	@GetMapping("/value")
	public Mono<LocalizedValue> getLocalizedValue(@RequestParam(defaultValue = "en") String locale,
			@RequestParam(defaultValue = "doctrine.name.1") String key) {

		return localizedValueRepository.findByLocaleAndKey(locale, key);
	}

	@GetMapping("/values")
	public Flux<LocalizedValue> getLocalizedValues() {

		return localizedValueRepository.findAll();
	}

	@GetMapping("/doctrines")
	public Flux<Doctrine> getDoctrines(@RequestParam(defaultValue = "en") String locale) {

		return doctrineRepository.findAll().flatMap(doctrine -> doctrine.toLocalized(locale, localizedValueRepository));
	}

	@GetMapping("/doctrines-reseed")
	public Flux<Doctrine> reseedDoctrines() {

		try {
			doctrineSeeds.reseed();
		}
		catch (Exception exception) {

			return Flux.error(exception);
		}

		return getDoctrines("en");
	}

}
