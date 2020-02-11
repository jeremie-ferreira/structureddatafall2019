package fr.epita.structureddata.initialization;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;

import fr.epita.structureddata.entity.Answer;
import fr.epita.structureddata.entity.Question;
import fr.epita.structureddata.entity.Quizz;
import fr.epita.structureddata.repository.QuizzRepository;

@Component
public class InitializationService {
	
	@Autowired
	private QuizzRepository quizzRepository;

	@PostConstruct
	private void init() {
		/*
		String json = "{\"title\": \"Structured Data Quizz\", \"questions\": [\r\n" + 
				"	{\"id\":1,\"text\":\"What is the DIKW chain?\", \"answers\": [\r\n" + 
				"		{\"id\":1,\"text\":\"It is not a pyramid\", \"valid\": false},\r\n" + 
				"		{\"id\":2,\"text\":\"It is a concept about data\", \"valid\":true}\r\n" + 
				"	]}\r\n" + 
				"]}";
		
		Quizz quizz = new Gson().fromJson(json, Quizz.class);

		quizzRepository.save(quizz);
		*/
		
		String xml = "<quizz title=\"Structured Data Quizz\">\r\n" + 
				"	<questions>\r\n" + 
				"		<question text=\"What is the DIKW chain?\">\r\n" + 
				"			<answers>\r\n" + 
				"				<answer id=\"1\" valid=\"false\" text=\"It is not a pyramid\"></answer>\r\n" + 
				"				<answer id=\"2\" valid=\"true\" text=\"It is a concept about data\"></answer>\r\n" + 
				"			</answers>\r\n" + 
				"		</question>\r\n" + 
				"	</questions>\r\n" + 
				"</quizz>";
		
		XmlMapper mapper = new XmlMapper();
		
		try {
			Quizz xmlQuizz = mapper.readValue(xml, Quizz.class);
			System.out.println(xmlQuizz.getTitle());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
