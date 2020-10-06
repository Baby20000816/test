package com.soft1851.content.center.service;

import com.soft1851.content.center.util.MD5Util;

public class MD5Service {
    public String getMD5( String input ) {
        return MD5Util.getMD5( input.getBytes() );
    }
}