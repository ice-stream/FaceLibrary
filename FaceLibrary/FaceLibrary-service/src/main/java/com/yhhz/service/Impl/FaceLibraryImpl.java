package com.yhhz.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.yhhz.mapper.FaceLibraryMapper;
import com.yhhz.pojo.FaceLibrary;
import com.yhhz.service.FaceLibrarySv;



@Service
public class FaceLibraryImpl implements FaceLibrarySv {

	
	@Autowired
	FaceLibraryMapper   faceLibraryDao;
	
	@Override
	public List<FaceLibrary> getAll() {
		// TODO Auto-generated method stub
		return faceLibraryDao.getAll();
	}

	

	@Override
	public int deleteBatch(List<Long> del_ids) {
		// TODO Auto-generated method stub
		return faceLibraryDao.deleteBatch(del_ids);
	}


	

	@Override
	public int saveFaceLibrary(FaceLibrary faceLibrary) {
		 Date date = new Date();
		faceLibrary.setFlDate(date);
		return faceLibraryDao.insertSelective(faceLibrary);
	}



	@Override
	public int deleteFaceLibrary(Long id) {
		// TODO Auto-generated method stub
		return faceLibraryDao.deleteByPrimaryKey(id);
	}



	@Override
	public int updateFaceLibrary(FaceLibrary faceLibrary) {
		// TODO Auto-generated method stub
		return faceLibraryDao.updateByPrimaryKeySelective(faceLibrary);
	}

	
	
	
}
