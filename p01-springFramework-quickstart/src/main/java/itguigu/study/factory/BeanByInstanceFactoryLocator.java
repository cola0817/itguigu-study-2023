package itguigu.study.factory;

/**
 * 基于 实例工厂 创建 bean
 */
public class BeanByInstanceFactoryLocator {
    private static BeanByInstanceFactory beanByInstanceFactoryInstance = new BeanByInstanceFactoryImpl();

    /**
     * 实例工厂 （必须为非 static）
     * @return BeanByInstanceFactory
     */
    public  BeanByInstanceFactory createBeanByInstanceFactoryInstance(){
        return beanByInstanceFactoryInstance;
    }
}
