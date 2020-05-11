package com.Aster.Security;

import com.Aster.Model.Customer;
import com.Aster.Model.Florist;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class AsterUserDetails implements UserDetails {

    private Customer customer;

    public AsterUserDetails(Customer customer){
        super();
        this.customer = customer;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //return null;
        return Collections.singleton(new SimpleGrantedAuthority("user"));
    }

    @Override
    public String getPassword() {
        return customer.getPassword();
    }

    @Override
    public String getUsername() {
        return customer.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}