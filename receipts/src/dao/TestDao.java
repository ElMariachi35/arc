package dao;

import model.Test;
import cdi.Dao;

@Dao
public class TestDao extends EntityDao<Test>{

	@Override
	protected Class<Test> getResponseClass() {
		return Test.class;
	}

}
