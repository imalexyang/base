package cn.bishiti.base.service.Impl;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import cn.bishiti.base.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService{
	
	 private static String redisCode = "utf-8";

	 @Resource
     private RedisTemplate<Serializable, Serializable> redisTemplate;
	 
	    /**
	     * @param key
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public long del(final String... keys) {
	        return (Long) redisTemplate.execute(new RedisCallback() {
	            public Long doInRedis(RedisConnection connection) throws DataAccessException {
	                long result = 0;
	                for (int i = 0; i < keys.length; i++) {
	                    result = connection.del(keys[i].getBytes());
	                }
	                return result;
	            }
	        });
	    }

	    /**
	     * @param key
	     * @param value
	     * @param liveTime
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public void set(final byte[] key, final byte[] value, final long liveTime) {
	        redisTemplate.execute(new RedisCallback() {
	            public Long doInRedis(RedisConnection connection) throws DataAccessException {
	                connection.set(key, value);
	                if (liveTime > 0) {
	                    connection.expire(key, liveTime);
	                }
	                return 1L;
	            }
	        });
	    }

	    /**
	     * @param key
	     * @param value
	     * @param liveTime
	     */
	    public void set(String key, String value, long liveTime) {
	        this.set(key.getBytes(), value.getBytes(), liveTime);
	    }

	    /**
	     * @param key
	     * @param value
	     */
	    public void set(String key, String value) {
	        this.set(key, value, 0L);
	    }

	    /**
	     * @param key
	     * @param value
	     */
	    public void set(byte[] key, byte[] value) {
	        this.set(key, value, 0L);
	    }

	    /**
	     * @param key
	     * @return
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public String get(final String key) {
	        return (String) redisTemplate.execute(new RedisCallback() {
	            public String doInRedis(RedisConnection connection) throws DataAccessException {
	                try {
	                    return new String(connection.get(key.getBytes()), redisCode);
	                } catch (UnsupportedEncodingException e) {
	                    e.printStackTrace();
	                }
	                return "";
	            }
	        });
	    }

	    /**
	     * @param pattern
	     * @return
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public Set<byte[]> Setkeys(String pattern) {
	        return (Set) redisTemplate.keys(pattern);

	    }

	    /**
	     * @param key
	     * @return
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public boolean exists(final String key) {
	        return (Boolean) redisTemplate.execute(new RedisCallback() {
	            public Boolean doInRedis(RedisConnection connection) throws DataAccessException {
	                return connection.exists(key.getBytes());
	            }
	        });
	    }

	    /**
	     * @return
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public String flushDB() {
	        return (String) redisTemplate.execute(new RedisCallback() {
	            public String doInRedis(RedisConnection connection) throws DataAccessException {
	                connection.flushDb();
	                return "ok";
	            }
	        });
	    }

	    /**
	     * @return
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public long dbSize() {
	        return (Long) redisTemplate.execute(new RedisCallback() {
	            public Long doInRedis(RedisConnection connection) throws DataAccessException {
	                return connection.dbSize();
	            }
	        });
	    }

	    /**
	     * @return
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
		public String ping() {
	        return (String) redisTemplate.execute(new RedisCallback() {
	            public String doInRedis(RedisConnection connection) throws DataAccessException {

	                return connection.ping();
	            }
	        });
	    }

	    private RedisServiceImpl() {

	    }
}
