package com.myapp.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myapp.gst.entity.Gst;



public interface GstRepository extends JpaRepository<Gst, Integer> {
	@Query(value="select percentage from gst_details where hsncode=?", nativeQuery = true)
public Integer getPercentageByHsn(int hsncode);
}
