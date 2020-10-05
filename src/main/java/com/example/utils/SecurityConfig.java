package com.example.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //    使用加密方式 md5
    //    密码不进行加密设置
    @Bean
    PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//        BCryptPasswordEncoder加密算法
        return new BCryptPasswordEncoder();
    }


    //    用户认证
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        配置两个登录用户
//        auth.inMemoryAuthentication()
//                .withUser("jiale").password("jiale").roles("user")
//                .and()
//                .withUser("tom").password("tom").roles("admin");
//    }
//  请求配置
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
//                .antMatchers("/test1").hasAnyRole("user")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").defaultSuccessUrl("/index").permitAll();
//        关闭跨域请求
        http.csrf().disable();
//        (1) DENY - 表示该页面不允许在frame中展示，几遍是在相同域名的页面中嵌套也不允许
//        (2) SAMEORIGIN - 表示该页面可以在相同域名页面的frame中展示
//        (3) ALLOW-FROM https://example.com/ - 表示该页面可以在指定来源的frame中展示
        http.headers().frameOptions().sameOrigin();
    }

    //    静态资源拦截释放
    @Override
    public void configure(WebSecurity web) throws Exception {
//        ,"/axios-master/**","/lib-master/**"
        web.ignoring()
                .mvcMatchers("/css/**","/fonts/**","/images/**","/lib/**","/js/**","/axios-master/**","/lib-master/**");
    }

}
