package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepo topicRepo;
	
	
	private List<Topic> topics=Arrays.asList(
			new Topic("Book1","The Alchemist","Motivational Book"),
			new Topic("Book2","The Secret","Motivational Book"),
			new Topic("Book3","Attitude Is Everything","Self Development Book")
			);
	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics=new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepo.findById(id).orElse(null);
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}
	
	

	public void updateTopic(String id, Topic topic) {
		
		/*for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}*/
		
		topicRepo.save(topic);
	}

	public void deleteTopic(String id) {
		//topics.removeIf(t ->t.getId().equals(id));
		
		topicRepo.deleteById(id);
	}
}
