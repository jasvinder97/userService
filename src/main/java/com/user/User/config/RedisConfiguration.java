package com.user.User.config;

//@Configuration
public class RedisConfiguration {


        /**
         * Lettuce
         */
/*
        @Bean
        public RedisConnectionFactory lettuceConnectionFactory() {
            return new LettuceConnectionFactory(new RedisStandaloneConfiguration("server", 6379));
        }
*/

        /**
         * Jedis
         */
/*
        @Bean
        public RedisConnectionFactory jedisConnectionFactory() {
            return new JedisConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));
        }
*/

}
