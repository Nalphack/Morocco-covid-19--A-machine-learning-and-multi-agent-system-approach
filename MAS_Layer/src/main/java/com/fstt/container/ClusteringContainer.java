package com.fstt.container;


import org.springframework.stereotype.Service;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;


public class ClusteringContainer {
	
	public ClusteringContainer() {
		try {
			// TODO Auto-generated method stub
			Runtime runtime = Runtime.instance();
			Profile profile = new ProfileImpl(false);
			profile.setParameter(Profile.MAIN_HOST, "localhost");
			AgentContainer agentContainer = runtime.createAgentContainer(profile);
			AgentController agentController = agentContainer.createNewAgent("ClusteringAgent", "com.fstt.agent.ClusteringAgent", new Object[] {});
			agentController.start();	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
