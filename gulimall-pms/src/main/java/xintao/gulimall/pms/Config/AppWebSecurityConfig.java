package xintao.gulimall.pms.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther Snine
 * @create 2021-02-01-20:03
 */
@EnableGlobalMethodSecurity(prePostEnabled=true)
@Configuration
//@EnableWebSecurity
public class AppWebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();
        //对资源授权
        http.authorizeRequests()
                .antMatchers("/**").permitAll(); //设置匹配的资源放行
//                .antMatchers("/level1/**").hasRole("角色")
//                .antMatchers("/level1/**").hasAnyRole("角色1","角色2")
//                    .antMatchers("/level1/**").hasAnyAuthority("权限1","权限2")
//                    .anyRequest().authenticated(); //剩余任何资源必须认证
//
//        //登录验证  (表单提交,post方式提交,加CSRF)
//        http.formLogin().loginPage("登陆页面的映射")
//                .defaultSuccessUrl("登陆成功后要去的页面")
//                .usernameParameter("表单中用户名的input的name值")
//                .passwordParameter("表单中密码的input的name值")
//                .loginProcessingUrl("表单中form的action值");
//        //记住我功能
//        http.rememberMe();
//
//        //注销功能  (表单提交,post方式提交,加CSRF)
//        http.logout()
//                .logoutUrl("表单中form的action值")
//                .logoutSuccessUrl("注销成功后去的页面");
//
//        //异常处理
//        http.exceptionHandling().accessDeniedHandler(new AccessDeniedHandler() {
//
//            @Override
//            public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
//
//                String type=request.getHeader("X-Requested-With");
//                if(type.equals("XMLHttpRequest")){
//                    //异步处理请求
//                    response.getWriter().print("haha");
//                }else{
//                    //同步处理请求
//                    request.getRequestDispatcher("跳转路径").forward(request,response);
//                }
//            }
//        });

    }
//
//    //基于数据库的登录认证
//    // ①重写configure(AuthenticationManagerBuilder auth)
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //根据用户名查询出用户的详细信息
//        //auth.userDetailsService(userDetailsService);
//
//        //根据用户名查询出用户的详细信息，BCrypt加密
//        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
//    }


}
