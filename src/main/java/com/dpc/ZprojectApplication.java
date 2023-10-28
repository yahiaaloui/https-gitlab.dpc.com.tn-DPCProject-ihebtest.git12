package com.dpc;

import com.dpc.dto.NameSpaceRequestDTO;
import com.dpc.dto.ZoneRequestDTO;
import com.dpc.service.NameSpaceService;
import com.dpc.service.ZoneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZprojectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ZprojectApplication.class, args);
	}

@Bean
	CommandLineRunner run(ZoneService zoneService,NameSpaceService nameSpaceService) {
		return args -> {
			zoneService.addZone(new ZoneRequestDTO(1L,"Prod"));
			zoneService.addZone(new ZoneRequestDTO(2L,"HorsProd"));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(100L,"siv-04696-iu-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(101L,"socrat-04893-microservices-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(102L,"socrat-04893-microservices-preproduction",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(103L,"socratrans-04894-microservices-preproduction",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(104L,"socratrans-04894-microservices-preproduction",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(105L,"stats-mca-3831-metier-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(106L,"sti-04788-iu-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(107L,"sti-04788-outil-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(108L,"surecom-04852-iu-preproduction",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(109L,"surecom-04852-iu-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(110L,"surecom-04852-metier-preproduction",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(111L,"surecom-04852-metier-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(112L,"sysout-05023-rapportexecution-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(113L,"telephonie-05042-metier-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(114L,"test-0001-test-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(115L,"test-0002-test-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(116L,"test-0003-test-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(117L,"test-082022-tools-development-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(118L,"test-1234-test-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(119L,"test-transfo-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(120L,"veloro",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(121L,"vie-01598-assurancevie-preproduction",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(122L,"vie-01598-assurancevie-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(123L,"vie-04918-metier-preproduction",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(124L,"vie-04918-metier-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(125L,"virinst-04689-vsepai-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(126L,"wkfsk-03940-wsfmsg-preproduction",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(127L,"wkfsk-03940-wsfmsg-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(128L,"wkfsk-04733-metier-preproduction",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(129L,"wkfsk-04733-metier-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(130L,"wsnotes-04786-metier-preproduction",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(131L,"wsnotes-04786-metier-production",1L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(200L,"telephonie-05042-metier-uat",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(201L,"test-0001-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(202L,"test-0001-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(203L,"test-0002-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(204L,"test-0002-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(205L,"test-0003-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(206L,"test-0003-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(207L,"test-082022-tools-development-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(208L,"test-082022-tools-development-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(209L,"test-1234-test-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(210L,"test-1234-test-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(211L,"test-transfo-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(212L,"test-transfo-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(213L,"velero",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(214L,"vie-01598-assurancevie-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(215L,"vie-01598-assurancevie-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(216L,"vie-01598-assurancevie-uat",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(217L,"vie-04918-metier-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(218L,"vie-04918-metier-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(219L,"vie-04918-metier-uat",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(220L,"virinst-04689-vsepai-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(221L,"virinst-04689-vsepai-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(222L,"virinst-04689-vsepai-uat",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(223L,"wkfsk-03940-wsfmsg-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(224L,"wkfsk-03940-wsfmsg-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(225L,"wkfsk-03940-wsfmsg-uat",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(226L,"wkfsk-04733-metier-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(227L,"wkfsk-04733-metier-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(228L,"wkfsk-04733-metier-uat",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(229L,"wsnotes-04786-metier-development",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(230L,"wsnotes-04786-metier-integration",2L));
			nameSpaceService.addNameSpace(new NameSpaceRequestDTO(231L,"wsnotes-04786-metier-uat",2L));

		};
	}
}
