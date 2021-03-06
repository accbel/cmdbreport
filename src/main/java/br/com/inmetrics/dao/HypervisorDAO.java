package br.com.inmetrics.dao;

import java.util.List;

import br.com.inmetrics.model.csv.Datacenter;
import br.com.inmetrics.model.csv.Hypervisor;

public interface HypervisorDAO {
	
	void deleteAll();

	void update(List<Hypervisor> hypervisors);

	void updateDatacenter(List<Datacenter> datacenters);
}