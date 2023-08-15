package com.myapp.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.gst.dao.GstDao;
import com.myapp.gst.entity.Gst;

@Service
public class GstService {
	
	@Autowired
	GstDao gstDao;
	public String addAllGsts(List<Gst> gsts) {
		return gstDao.addAllGsts(gsts);
	}
	public Integer getPercentageByHsn(int hsncode) {
		return gstDao.getPercentageByHsn(hsncode);
	}

}
