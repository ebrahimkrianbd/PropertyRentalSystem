package bd.ac.seu.server.configuration;

import bd.ac.seu.server.service.UserSecurityService;
import bd.ac.seu.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

//    @Autowired
    private UserSecurityService userSecurityService;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userSecurityService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder builder) {
        try {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

            UserService userService = null;

            userService.getUsers();

            // CW: read the users, passwords and roles from the db
            // and then load them up in memory
            builder
                    .inMemoryAuthentication()
                    .passwordEncoder(encoder)
                    .withUser("test")
                    .password(encoder.encode("rest"))
                    .roles("admin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
