package ppgs.admin.main;

import java.util.Map;


import egovframework.rte.psl.dataaccess.mapper.Mapper;


@Mapper("adminDAO")
public interface AdminDAO {

	String loginChk(Map<String, Object> map) throws Exception;

}
