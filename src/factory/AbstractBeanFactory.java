package factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import bean.BeanDefinition;


public abstract class AbstractBeanFactory implements ApplicationContext{
	private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

	public Object getBean(String beanName)
	{
		return this.beanDefinitionMap.get(beanName).getBean();
	}
	public Object getBeandef(String beanName)
	{
		return this.beanDefinitionMap.get(beanName);
	}
	
	public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition)
	{
		beanDefinition = GetCreatedBean(beanDefinition);
		this.beanDefinitionMap.put(beanName, beanDefinition);
	}
	
	protected abstract BeanDefinition GetCreatedBean(BeanDefinition beanDefinition);
}
