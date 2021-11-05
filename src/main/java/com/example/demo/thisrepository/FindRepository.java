package com.example.demo.thisrepository;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.thisentity.TestCase;
import com.example.demo.thisentity.TestResults;
import com.example.demo.thisservice.ThisService;
@Repository
public interface FindRepository extends PagingAndSortingRepository<TestCase,String>{


	
	@Query(value="select ad,sprint,JCL,JCLDESC,tid from TESTCASE C where C.AD=?1 and C.SPRINT=?2 ",nativeQuery=true)
	List<Map<ThisService, Object>>  findbyadsprint(String ad, String sprint);

	@Query(value="select ad,sprint,JCL,JCLDESC,tid from TESTCASE C where C.AD=?1 ",nativeQuery=true)
	List<Map<ThisService,Object>> findbyad(String ad);

	@Query(value="select code_id from code_list where code_type_id=?1",nativeQuery=true)
	List<Map<ThisService, Object>> findbytester(String tester);

	@Query(value="select code_desc,code_id from code_list where code_type_id=?1 " ,nativeQuery=true)
	List<Map<ThisService, Object>> findresult(String result);

	//用ad jcl sprint找
	@Query(value="select ad,sprint,JCL,JCLDESC,tid from TESTCASE C where C.AD=?1 and C.SPRINT=?2 and C.JCL=?3",nativeQuery=true)
	List<Map<ThisService, Object>> findbyadsprintjcl(String ad, String sprint, String jcl);
	
	//用ad jcl 找 無sprint
	@Query(value="select ad,sprint,JCL,JCLDESC,tid from TESTCASE C where C.AD=?1 and C.JCL=?2 ",nativeQuery=true)
	List<Map<ThisService, Object>> findbyadjcl(String ad, String jcl);

	//批次
	@Query(value="select ad,tid  from testcase where ad=?1 and sprint=?2",nativeQuery=true)
	List<Map<ThisService, Object>> findbatch(String ad, String sprint);

	@Query(value="select tid from testcase where ad=?1 " ,nativeQuery=true)
	List<String> findbyadresult(String ad);

	@Query(value="select * from test_results where tid=?1",nativeQuery=true)
	List<Map<ThisService, Object>> findbytestresult(String tid);

	@Query(value="select testcase.ad,testcase.sprint,testcase.jcl,testcase.jcldesc,testcase.tid,test_results.status,test_results.rdatetime,test_results.tester_id ,ad_jcl.jid,defect_list.issue_key\r\n"
			+ "	from testcase\r\n"
			+ "left join test_results on testcase.tid = test_results.tid\r\n"
			+ "left join ad_jcl on  testcase.ad=ad_jcl.ad and testcase.jcl=ad_jcl.jcl\r\n"
			+ " left join defect_list on ad_jcl.jid=defect_list.jid",nativeQuery=true)
	List<Map<ThisService, Object>> findinner();

	@Query(value="select testcase.ad,testcase.sprint,testcase.jcl,testcase.jcldesc,testcase.tid,test_results.status,test_results.rdatetime,test_results.tester_id ,ad_jcl.jid,defect_list.issue_key\r\n"
			+ "	from testcase\r\n"
			+ "left join test_results on testcase.tid = test_results.tid\r\n"
			+ "left join ad_jcl on  testcase.ad=ad_jcl.ad and testcase.jcl=ad_jcl.jcl\r\n"
			+ " left join defect_list on ad_jcl.jid=defect_list.jid",nativeQuery=true)
	List<Map<ThisService, Object>> findleftjoin(String ad, String sprint, String jcl);

	@Query(value="select testcase.ad,testcase.sprint,testcase.jcl,testcase.jcldesc,testcase.tid,test_results.status,test_results.rdatetime,test_results.tester_id ,ad_jcl.jid,defect_list.issue_key\r\n"
			+ "		from testcase \r\n"
			+ "	left join test_results on testcase.tid = test_results.tid \r\n"
			+ "    left join ad_jcl on  testcase.ad=ad_jcl.ad and testcase.jcl=ad_jcl.jcl\r\n"
			+ "    left join defect_list on ad_jcl.jid=defect_list.jid\r\n"
			+ "    where  testcase.ad=?1",nativeQuery=true)
	List<Map<ThisService, Object>> findleftjoinbyad(String ad);

	@Query(value="select testcase.ad,testcase.sprint,testcase.jcl,testcase.jcldesc,testcase.tid,test_results.status,test_results.rdatetime,test_results.tester_id ,ad_jcl.jid,defect_list.issue_key\r\n"
			+ "		from testcase \r\n"
			+ "	left join test_results on testcase.tid = test_results.tid \r\n"
			+ "    left join ad_jcl on  testcase.ad=ad_jcl.ad and testcase.jcl=ad_jcl.jcl\r\n"
			+ "    left join defect_list on ad_jcl.jid=defect_list.jid\r\n"
			+ "    where  testcase.ad=?1 and testcase.jcl=?2",nativeQuery=true)
	List<Map<ThisService, Object>> findbyleftjoinadjcl(String ad, String jcl);

	@Query(value="select testcase.ad,testcase.sprint,testcase.jcl,testcase.jcldesc,testcase.tid,test_results.status,test_results.rdatetime,test_results.tester_id ,ad_jcl.jid,defect_list.issue_key\r\n"
			+ "		from testcase \r\n"
			+ "	left join test_results on testcase.tid = test_results.tid \r\n"
			+ "    left join ad_jcl on  testcase.ad=ad_jcl.ad and testcase.jcl=ad_jcl.jcl\r\n"
			+ "    left join defect_list on ad_jcl.jid=defect_list.jid where  testcase.ad=?1 and testcase.sprint=?2 ",nativeQuery=true)
	List<Map<ThisService, Object>> findbyleftjoinadsprint(String ad, String sprint);

	@Query(value="select testcase.ad,testcase.sprint,testcase.jcl,testcase.jcldesc,testcase.tid,test_results.status,test_results.rdatetime,test_results.tester_id ,ad_jcl.jid,defect_list.issue_key\r\n"
			+ "		from testcase \r\n"
			+ "	left join test_results on testcase.tid = test_results.tid \r\n"
			+ "    left join ad_jcl on  testcase.ad=ad_jcl.ad and testcase.jcl=ad_jcl.jcl\r\n"
			+ "    left join defect_list on ad_jcl.jid=defect_list.jid\r\n"
			+ "    where testcase.ad=?1 and  testcase.sprint=?2 and  testcase.jcl=?3",nativeQuery=true)
	List<Map<ThisService, Object>> findbyleftjoinadsprintjcl(String ad, String sprint, String jcl);

	@Query(value="select d.code_desc, b.jid,a.tid,b.ad,b.jcl,c.issue_key,c.issue_type,c.issue_status from TESTCASE  a, AD_JCL  b , DEFECT_LIST  c ,code_list d\r\n"
			+ "where\r\n"
			+ "a.test_type=d.code_id and \r\n"
			+ "a.ad = b.ad and \r\n"
			+ "a.jcl = b.jcl and\r\n"
			+ "b.jid = c.jid",nativeQuery=true)
	List<Map<String, String>> findissue();
//	ad='JCVGET' and jcl='CVCHKOFF'
	
	@Query(value=" select defect_list.issue_key,defect_list.jid,defect_list.issue_type,defect_list.issue_status,code_list.code_desc from defect_list\r\n"
			+ " left join code_list on defect_list.issue_status=code_list.code_id\r\n"
			+ " where defect_list.jid=?1 " ,nativeQuery=true)
	List<Map<String, String>> finddetail(String jid);
	 
}
