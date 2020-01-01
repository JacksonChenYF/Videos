package com.imooc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.imooc.controller.interceptor.MiniInterceptor;

/**cyf
 * 静态资源配置，显示图片 --  头像查看
 * 虚拟目录
 *
 * SpringBoot 2.0弃用WebMvcConfigurerAdapter，改为实现WebMvcConfigurer接口来实现自定义拦截器，消息转换器
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	/**
	 * 添加静态资源
	 * @param registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//
		registry.addResourceHandler("/**")
				//Swagger2
		.addResourceLocations("classpath:/META-INF/resources/")
				//图片
				.addResourceLocations("file:C:/imooc_videos_dev/");
	}
	
	@Bean(initMethod="init")
	public ZKCuratorClient zkCuratorClient() {
		return new ZKCuratorClient();
	}
	
	@Bean
	public MiniInterceptor miniInterceptor() {
		return new MiniInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(miniInterceptor()).addPathPatterns("/user/**")
				       .addPathPatterns("/video/upload", "/video/uploadCover",
				    		   			"/video/userLike", "/video/userUnLike",
				    		   			"/video/saveComment")
												  .addPathPatterns("/bgm/**")
												  .excludePathPatterns("/user/queryPublisher");
		
		super.addInterceptors(registry);
	}

}
