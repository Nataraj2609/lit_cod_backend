package com.littleCoders.ChallengeEpic.serviceImpl;

import com.littleCoders.ChallengeEpic.model.UserEntity;
import com.littleCoders.ChallengeEpic.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUserName(userName);
        System.out.println(userEntity);
        if (userEntity != null)
            return new User(userEntity.getUserName(), userEntity.getPassword(), buildSimpleGrantedAuthorities(userEntity.getRole()));
        throw new UsernameNotFoundException("User not found with username: " + userName);
    }

    private static List<SimpleGrantedAuthority> buildSimpleGrantedAuthorities(final String role) {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(role));
        return authorities;
    }
}
