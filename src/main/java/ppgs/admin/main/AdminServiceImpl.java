
package ppgs.admin.main;

import java.util.List;
import java.util.Map;

import egovframework.example.sample.service.EgovSampleService;
import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.example.sample.service.SampleVO;
import egovframework.example.sample.service.impl.SampleDAO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service("adminService")
public class AdminServiceImpl extends EgovAbstractServiceImpl implements AdminService{

	@Resource(name = "adminDAO")
	private AdminDAO adminDAO;

	public String loginChk(Map<String, Object> map) throws Exception {
	
		return adminDAO.loginChk(map);
	}

}
