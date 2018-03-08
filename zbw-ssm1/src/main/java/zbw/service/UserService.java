package zbw.service;

import org.springframework.stereotype.Service;
import zbw.bean.User;
import zbw.dao.UserMapper;

import javax.annotation.Resource;

/**
 * Created by wh1te on 2018/3/8.
 */

@Service
public class UserService {
    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}
