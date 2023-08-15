package com.myapp.gst.controller;






import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.gst.entity.Gst;
import com.myapp.gst.service.GstService;

@RestController
@RequestMapping(value="/admin")
public class GstController {
	
	@Autowired
	GstService gstSer;
	@PostMapping(value="/addallgst")
	public String addAllGsts(@RequestBody List<Gst> gsts) {
		return gstSer.addAllGsts(gsts);
	}
	@GetMapping(value="/getPerbyHsn/{hsncode}")
	public Integer getPercentageByHsn(@PathVariable int hsncode) {
		return gstSer.getPercentageByHsn(hsncode);
	}
	

}
