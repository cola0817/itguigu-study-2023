package itguigu.study.mapper;

import itguigu.study.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    /**
     * 插入用户
     * @param user user
     * @return  是否插入成功 (1 成功 | 0 失败)
     */
    int insertUser(User user);

    /**
     * 根据 userId 删除用户
     * @param userId userId
     * @return  是否删除成功 (1 成功 | 0 失败)
     */
    int deleteUser(Integer userId);

    /**
     * 根据 userId 修改用户
     * @param userId userId
     * @param password password
     * @return  是否更新成功 (1 成功 | 0 失败)
     */
    int updateUser(@Param("userId") Integer userId, @Param("passWord") String password);

    /**
     * 根据 userId 查找用户
     * @param userId userId
     * @return
     */
    User selectByUserId(Integer userId);

    /**
     * 查找全部用户
     * @return 用户列表
     */
    List<User> selectAll();

}
