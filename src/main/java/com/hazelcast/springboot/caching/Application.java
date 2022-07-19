/*
 *
 *  Copyright (c) 2008-2018, Hazelcast, Inc. All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.hazelcast.springboot.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//    @Bean
//    public Config hazelCastConfig() {
//        Config config = new Config();
//        NetworkConfig network = config.getNetworkConfig();
//        network.setPort(5701).setPortCount(20);
//        network.setPortAutoIncrement(true);
//        JoinConfig join = network.getJoin();
//        join.getMulticastConfig().setEnabled(false);
//        join.getTcpIpConfig()
//                .addMember("machine1")
//                .addMember("localhost").setEnabled(true);
//        return new Config().setManagementCenterConfig(
//                new ManagementCenterConfig().setEnabled(true).setUrl("http://localhost:8080/hazelcast-mancenter"));
//
//    }
//
//    @Bean
//    public HazelcastInstance hazelcastInstance(Config hazelCastConfig) {
//        return Hazelcast.newHazelcastInstance(hazelCastConfig);
//    }


}
