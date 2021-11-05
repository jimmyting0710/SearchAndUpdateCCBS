package com.example.demo.thisrepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.thisentity.TestCase;
@Repository
public interface savetestcase extends CrudRepository<TestCase, String> {
	@Transactional
	@Modifying
	@Query(value="update testcase set status=?2 ,tester_id=?3 where tid=?1",nativeQuery = true)
	void updatetestcase(String tid, String status, String tester_id);
}
