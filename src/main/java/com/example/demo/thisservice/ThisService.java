package com.example.demo.thisservice;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.thisentity.TestCase;
import com.example.demo.thisentity.TestResults;
import com.example.demo.thisrepository.FindRepository;
import com.example.demo.thisrepository.SaveRepository;
import com.example.demo.thisrepository.savetestcase;

@Service
public class ThisService {

	@Autowired
	FindRepository findRepository;
	@Autowired
	SaveRepository saveRepository;
	@Autowired
	savetestcase savetestcase;

	public List<Map<ThisService, Object>> findbyad(String ad) {
		return findRepository.findbyad(ad);
	}

	public List<Map<ThisService, Object>> findbyadsprint(String ad, String sprint, String jcl) {
		if (sprint.equals("ALL")) {
			if (jcl == "" || jcl.equals(null)) {
				return findRepository.findbyad(ad);
			} else {
				return findRepository.findbyadjcl(ad, jcl);
			}
		} else {
			if (jcl == "" || jcl.equals(null)) {
				return findRepository.findbyadsprint(ad, sprint);
			} else {
				return findRepository.findbyadsprintjcl(ad, sprint, jcl);
			}
		}

	}

	public List<Map<ThisService, Object>> findbycodetypeid(String tester) {

		return findRepository.findbytester(tester);
	}

	public List<Map<ThisService, Object>> findbyresult(String result) {

		return findRepository.findresult(result);

	}

//	public String updateresult(String tid, String selecttester, String selectresult,String timeStamp) {
//		SaveRepository.updateresult(tid,selecttester,selectresult,timeStamp);
//		return "ok";
//	}

//	public String save(TestResults entity) {
////		System.out.println(entity.getTID());
//		if (entity.getSTATUS().equals("N") || entity.getSTATUS().equals("T")) {
//			entity.setRDATETIME("");
//			entity.setSTATUS(entity.getSTATUS());
//			entity.setTID(entity.getTID());
//			entity.setTESTER_ID(entity.getTESTER_ID());
//			saveRepository.save(entity);
//		} else {
//			entity.setRDATETIME(entity.getRDATETIME());
//			entity.setSTATUS(entity.getSTATUS());
//			entity.setTID(entity.getTID());
//			entity.setTESTER_ID(entity.getTESTER_ID());
//			saveRepository.save(entity);
//		}
//		return "ok";
//	}

	public List<Map<ThisService, Object>> findbyadsprintjcl(String ad, String sprint, String jcl) {

		return findRepository.findbyadsprintjcl(ad, sprint, jcl);
	}

	public Long getseq() {
		return saveRepository.getseq();
	}

	public String saveresult(String status, String tid, String tester_id, String rdatetime, String rid) {

		System.out.println(status);
		System.out.println(tid);
		System.out.println(tester_id);
		System.out.println(rdatetime);
		System.out.println(rid);
		if (status.equals("N") || status.equals("T")) {
			TestResults data = new TestResults();
			data = saveRepository.findByTID(tid);
			if (data != null) {
				data.setRDATETIME("");
				data.setSTATUS(status);
				data.setTESTER_ID(tester_id);
				System.out.println("1");
				saveRepository.save(data);

			} else {
				data = new TestResults();
				data.setRID(getseq());
				data.setRDATETIME("");
				data.setSTATUS(status);
				data.setTESTER_ID(tester_id);
				data.setTID(tid);
				System.out.println("2");
				saveRepository.save(data);
			}
		} else {
			TestResults data = new TestResults();
			data = saveRepository.findByTID(tid);
//			String righttime;
			String time= saveRepository.findtime(tid);
			if (time == null) {
				time=rdatetime;
			}
					
			if (data != null) {
				data.setRDATETIME(time);
				data.setSTATUS(status);
				data.setTESTER_ID(tester_id);
				System.out.println("3");
				saveRepository.save(data);
			} else {
				data = new TestResults();
				data.setRID(getseq());
				data.setRDATETIME(rdatetime);
				data.setSTATUS(status);
				data.setTESTER_ID(tester_id);
				data.setTID(tid);
				System.out.println("4");
				saveRepository.save(data);
			}
		}

		return "ok";

	}

	public void updatetestcase(String tid, String status, String tester_id) {
		savetestcase.updatetestcase(tid, status, tester_id);

	}

//批次更新
	public List<Map<ThisService, Object>> findbatchad(String ad, String sprint) {
		if (sprint.equals("ALL")) {
			return findRepository.findbyad(ad);
		} else {
			return findRepository.findbyadsprint(ad, sprint);
		}
	}

	public void savebatchresult(String status, String tester_id, String tid, String rdatetime, String rid, String ad) {
		List<String> adresult = findRepository.findbyadresult(ad);
		for (String alltid : adresult) {
			if (status.equals("N") || status.equals("T")) {
				TestResults data = new TestResults();
				data = saveRepository.findByTID(alltid);
				if (data != null) {
					data.setRDATETIME("");
					data.setSTATUS(status);
					data.setTESTER_ID(tester_id);
					saveRepository.save(data);

				} else {
					data = new TestResults();
					data.setRID(getseq());
					data.setRDATETIME("");
					data.setSTATUS(status);
					data.setTESTER_ID(tester_id);
					data.setTID(alltid);
					saveRepository.save(data);
				}
			} else {
				TestResults data = new TestResults();
				data = saveRepository.findByTID(alltid);
				if (data != null) {
					data.setRDATETIME(rdatetime);
					data.setSTATUS(status);
					data.setTESTER_ID(tester_id);
					saveRepository.save(data);
				} else {
					data = new TestResults();
					data.setRID(getseq());
					data.setRDATETIME(rdatetime);
					data.setSTATUS(status);
					data.setTESTER_ID(tester_id);
					data.setTID(alltid);
					saveRepository.save(data);
				}
			}
		}
	}

	public void updatebatch(String tid, String tester_id, String status, String ad) {
		List<String> adresult = findRepository.findbyadresult(ad);
		for (String alltid : adresult) {
			savetestcase.updatetestcase(alltid, status, tester_id);

		}

	}

	public List<Map<ThisService, Object>> findhavetime(String tid) {

		return findRepository.findbytestresult(tid);
	}

	public List<Map<ThisService, Object>> findinner() {
		return findRepository.findinner();
	}

	public List<Map<ThisService, Object>> findleftinner(String ad, String sprint, String jcl) {
		// TODO Auto-generated method stub
		if (sprint.equals("ALL")) {
			if (jcl == "" || jcl.equals(null)) {
				return findRepository.findleftjoinbyad(ad);
			} else {
				return findRepository.findbyleftjoinadjcl(ad, jcl);
			}
		} else {
			if (jcl == "" || jcl.equals(null)) {
				return findRepository.findbyleftjoinadsprint(ad, sprint);
			} else {
				return findRepository.findbyleftjoinadsprintjcl(ad, sprint, jcl);
			}
		}

//		return findRepository.findleftjoin(ad,sprint,jcl);
	}

	public List<Map<String, String>> findissue() {

		return findRepository.findissue();
	}

	public List<Map<String, String>> finddefectdetail(String jid) {
		return findRepository.finddetail(jid);
	}


}