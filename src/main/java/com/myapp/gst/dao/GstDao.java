package com.myapp.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myapp.gst.entity.Gst;
import com.myapp.gst.repository.GstRepository;

@Repository
public class GstDao {
	
	@Autowired
	GstRepository gstRepo;
	public String addAllGsts(List<Gst> gsts) {
		gstRepo.saveAll(gsts);
		return "added successfully";
		
	}
	public Integer getPercentageByHsn(int hsncode) {
		return gstRepo.getPercentageByHsn(hsncode);
	}
	

}
