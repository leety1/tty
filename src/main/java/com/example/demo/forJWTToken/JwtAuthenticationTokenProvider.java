/*
 * package com.example.demo.forJWTToken;
 * 
 * import javax.servlet.http.HttpServletRequest;
 * 
 * import org.slf4j.LoggerFactory; import
 * org.springframework.stereotype.Component;
 * 
 * import antlr.StringUtils; import io.jsonwebtoken.Claims; import
 * io.jsonwebtoken.ExpiredJwtException; import io.jsonwebtoken.Jwts; import
 * io.jsonwebtoken.MalformedJwtException; import
 * io.jsonwebtoken.SignatureAlgorithm; import
 * io.jsonwebtoken.SignatureException; import
 * io.jsonwebtoken.UnsupportedJwtException;
 * 
 * import java.time.LocalDateTime; import java.time.ZoneId; import
 * java.time.temporal.ChronoUnit; import java.util.Date; import
 * java.util.logging.FileHandler; import java.util.logging.Level; import
 * java.util.logging.Logger; import java.util.logging.SimpleFormatter;
 * 
 * @Component public class JwtAuthenticationTokenProvider implements
 * AuthenticationTokenProvider{ private final Logger logger =
 * Logger.getLogger(JwtAuthenticationTokenProvider.class.getName());
 * 
 * private static final String SECRET_KEY ="SOME_SECRET_KEY"; private static
 * final long EXPIRATION_MS = 1000 * 50 * 60 * 24;
 * 
 * @Override public String parseTokenString(HttpServletRequest request) { String
 * bearerToken = request.getHeader("Authorization"); if(bearerToken != null &&
 * bearerToken.startsWith("Bearer ")) { return bearerToken.substring(6); } //
 * TODO Auto-generated method stub return null; }
 * 
 * 
 * 
 * @Override public String buildToken(Long userNo) { LocalDateTime now =
 * LocalDateTime.now(); LocalDateTime expiredAt =
 * now.plus(EXPIRATION_MS,ChronoUnit.MILLIS); return Jwts.builder()
 * .setSubject(String.valueOf(userNo))
 * .setIssuedAt(Date.from(now.atZone(ZoneId.systemDefault()).toInstant()))
 * .setExpiration(Date.from(expiredAt.atZone(ZoneId.systemDefault()).toInstant()
 * )) .signWith(SignatureAlgorithm.HS512, SECRET_KEY) .compact(); }
 * 
 * @Override public Long getTokenOwnerNo(String token) { Claims claims =
 * Jwts.parser() .setSigningKey(SECRET_KEY) .parseClaimsJws(token) .getBody();
 * // TODO Auto-generated method stub return
 * Long.parseLong(claims.getSubject()); }
 * 
 * @Override public boolean validateToken(String token) { if(!isEmpty(true)) {
 * try { Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token); return
 * true; }catch(SignatureException e) { logger.config(e.toString());
 * }catch(MalformedJwtException e) { logger.config(e.toString());
 * }catch(ExpiredJwtException e) { logger.config(e.toString());
 * }catch(UnsupportedJwtException e){ logger.config(e.toString());
 * }catch(IllegalArgumentException e) { logger.config(e.toString()); } } return
 * false; }
 * 
 * private boolean isEmpty(boolean b) { // TODO Auto-generated method stub
 * return true; }
 * 
 * 
 * 
 * @Override public AuthenticationToken issue(Long userNo) { // TODO
 * Auto-generated method stub return null; }
 * 
 * 
 * }
 */