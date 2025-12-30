package coreJava.com.csms.dao;


import coreJava.com.csms.pojo.Batch;

import java.util.List;


public interface BatchDao {
	boolean addBatch(Batch batch);
	boolean updateBatch(Batch batch);
	boolean deleteBatch(String BatchId);
	boolean getBatchById(String BatchId);
	List<Batch> getAllBatches();

}
