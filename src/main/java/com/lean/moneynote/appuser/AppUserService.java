package com.lean.moneynote.appuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.lean.moneynote.model.UseriSaveMoney;

@Service
public class AppUserService implements UserDetailsService {
    
    private final String mst_user_not_found = "No user found";
    // private final s
    @Autowired
    private AppUserRepository appUserReponsitory;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return appUserReponsitory.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(String.format(mst_user_not_found,username)));       
    }
    public String signUpUser(UseriSaveMoney useriSaveMoney){
        //Check user exist
        boolean userExist = appUserReponsitory.findByUsername(useriSaveMoney.getUsername()).isPresent();
        if(userExist){
            throw new IllegalStateException("email already taken");
        }
        //endcodepassword
        String encodePassword = bCryptPasswordEncoder.encode(useriSaveMoney.getPassword());
        useriSaveMoney.setPassword(encodePassword);

        //save password to db

        //generate token

        //config token

        //save confirm token
        return "";
    }
    
}
