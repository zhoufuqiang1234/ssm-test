package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("ds")
public class TomcatProperties {
	private List<String> hosts = new ArrayList<>();
	
	private String[] ports;

	public String[] getPorts() {
		return ports;
	}

	public void setPorts(String[] ports) {
		this.ports = ports;
	}

	public List<String> getHosts() {
		return hosts;
	}

	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}

	@Override
	public String toString() {
		return "TomcatProperties [hosts=" + hosts + ", ports=" + Arrays.toString(ports) + "]";
	}
	

}
