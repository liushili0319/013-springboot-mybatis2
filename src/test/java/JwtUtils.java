import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class JwtUtils {
    //私钥
    private static final String SING ="liushili";
    public static String getToken(Map<String,String> map){
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE,7);//默认七天
        JWTCreator.Builder builder = JWT.create();
        //payload
        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });
        String token = builder.withExpiresAt(instance.getTime())//过期时间
                              .sign(Algorithm.HMAC256(SING));
        return token;
    }

    //获取token信息
    public static DecodedJWT getTokenInfo(String token){
        DecodedJWT verify = JWT.require(Algorithm.HMAC256(SING)).build().verify(token);
        return verify;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("username","123");
        String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE2MjgxNTgxMzksInVzZXJuYW1lIjoiMTIzNDU2Nzg5MSJ9.FC53WFCwhOiYE4fZzxe-b-M8uLvlpNPil1pN7KdYWs8";
        System.out.println(getTokenInfo(token).getClaim("username"));
    }

}