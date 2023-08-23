package itguigu.study.factory;

import itguigu.study.service.AdminService;
import itguigu.study.service.impl.AdminServiceImpl;

public class AdminServiceFactory {

    private static AdminService adminServiceImpl = new AdminServiceImpl();

    public AdminService createAdminServiceImpl (){
        return adminServiceImpl;
    }

}
