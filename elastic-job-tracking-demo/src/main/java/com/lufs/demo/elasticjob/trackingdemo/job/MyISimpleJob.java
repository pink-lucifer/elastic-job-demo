package com.lufs.demo.elasticjob.trackingdemo.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyISimpleJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {

    }
}
