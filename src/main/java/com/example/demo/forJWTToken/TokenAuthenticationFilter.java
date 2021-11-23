/*
 * package com.example.demo.forJWTToken;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.FilterChain; import javax.servlet.ServletException;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.filter.OncePerRequestFilter;
 * 
 * import com.example.demo.service.UserService;
 * 
 * public class TokenAuthenticationFilter extends OncePerRequestFilter {
 * 
 * @Autowired private AuthenticationTokenProvider authenticationTokenProvider;
 * 
 * @Autowired private UserService userService;
 * 
 * @Override protected void doFilterInternal(HttpServletRequest request,
 * HttpServletResponse response, FilterChain filterChain) throws
 * ServletException, IOException { String token =
 * authenticationTokenProvider.parseTokenString(request); if
 * (authenticationTokenProvider.validateToken(token)) { Long userNo =
 * authenticationTokenProvider.getTokenOwnerNo(token);
 * 
 * try { User member = (User) userService.loadUserByUsername(userNo.toString());
 * UsernamePasswordAuthenticationToken authentication = new
 * UsernamePasswordAuthenticationToken(member, member.getPassword(),
 * member.getAuthorities()); authentication.setDetails(new
 * WebAuthenticationDetailsSource().buildDetails(request));
 * SecurityContextHolder.getContext().setAuthentication(authentication); } catch
 * (UsernameNotFoundException e) { throw new
 * ForbiddenException("유효하지않은 인증토큰 입니다. 인증토큰 회원 정보 오류"); }
 * 
 * } filterChain.doFilter(request, response);
 * 
 * }
 * 
 * }
 */