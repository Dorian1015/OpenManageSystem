package priv.ljh.service;

import priv.ljh.pojo.Arrange;
import priv.ljh.pojo.Role;
import priv.ljh.utils.MyPage;

import java.util.List;
import java.util.Map;

/**
 * @Author lijinghai
 * @Date 2021/6/5 16:52
 * @Email lijinghailjh@163.com
 */
public interface RoleService {
    /**
     * 自定义分页查询方法
     *
     * @param pageNo
     * @param limit
     * @param idSorted
     * @param roles
     * @return
     */
    public MyPage searchRole(int pageNo, int limit, String idSorted, List<Role> roles);


    /**
     * 根据id查询
     * @param pageNo
     * @param limit
     * @param idSorted
     * @param info
     * @return
     */
    public MyPage searchRoleById(int pageNo, int limit, String idSorted, List<Map> info);
}

