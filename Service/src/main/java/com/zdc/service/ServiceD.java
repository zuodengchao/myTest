package com.zdc.service;

import java.util.concurrent.ExecutionException;

/**
 * Created by ZDC on 2018/5/8.
 */
public interface ServiceD {
    public  String getStr(String str) throws ExecutionException, InterruptedException;
}
