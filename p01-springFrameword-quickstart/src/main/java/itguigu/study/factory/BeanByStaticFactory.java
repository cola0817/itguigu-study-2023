package itguigu.study.factory;

/**
 * 基于 静态工厂 创建 bean
 */
public class BeanByStaticFactory {
    private static BeanByStaticFactory beanByStaticFactoryInstance = new BeanByStaticFactory();

    private BeanByStaticFactory() {
    }

    /**
     * 静态工厂 （必须为 static）
     * @return BeanByStaticFactory
     */
    public static BeanByStaticFactory createBeanByStaticFactoryInstance (){
        return beanByStaticFactoryInstance;
    }


}
