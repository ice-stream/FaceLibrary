package com.yhhz.service;

import java.util.List;

import com.yhhz.pojo.FaceLibrary;

public interface FaceLibrarySv   {

	
	
	public List<FaceLibrary> getAll();

	public int saveFaceLibrary(FaceLibrary faceLibrary);

	public int deleteBatch(List<Long> del_ids);

	public int deleteFaceLibrary(Long id);

	public int updateFaceLibrary(FaceLibrary faceLibrary);
	
	
	
	
	
}
