package itguigu.study.mapper;

import itguigu.study.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface EmployeeMapper {
    /**
     * 跟俊 empId 查找员工
     * @param empId empId
     * @return 符合条件的员工
     */
    Employee selectEmployee(Integer empId);

    /**
     * 插入员工
     * @param employee employee
     * @return 是否插入成功 (1 成功 | 0 失败)
     */

    int insertEmployee(Employee employee);

    /**
     * 更新员工信息
     * @param empId empId
     * @param empSalary empSalary
     * @return 是否更新成功 (1 成功 | 0 失败)
     */
    int updateEmployee(@Param("empId") Integer empId,@Param("empSalary") Double empSalary);

    /**
     * 更新员工信息 （Map 方式）
     * @param map map
     * @return  是否更新成功 (1 成功 | 0 失败)
     */
    int updateEmployeeByMap(Map<String, Object> map);

}
