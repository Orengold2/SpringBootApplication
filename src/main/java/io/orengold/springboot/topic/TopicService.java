package io.orengold.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topicsList = new ArrayList<>(  Arrays.asList(
			new Topic("java","Core Java","Core Java Description"),
			new Topic("spring","Spring Framework","Spring Framework Description"),
			new Topic("javascript","Javascript","Javascript Description"),
			new Topic("go","go","go Description"),
			new Topic("scala","Scala","Scala Description"),
			new Topic("cs","cs","CSharp Description")
			));
	
	public List<Topic> getAllTopics(){
		return topicsList;	
	}
	
	public Topic getTopic(String id) {
		return topicsList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topicsList.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topicsList.size(); i++) {
			Topic t = topicsList.get(i);
			if (t.getId().equals(id)) {
				topicsList.set(i, topic);
				return;
			}
		}
		
	}

	public void deleteTopic(String id) {
		topicsList.removeIf(t->t.getId().equals(id));
	}
}
