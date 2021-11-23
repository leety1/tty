package com.example.demo.video;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.util.concurrent.TimeUnit; 
import javax.servlet.ServletOutputStream; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 
import org.springframework.core.io.FileSystemResource; 
import org.springframework.core.io.InputStreamResource; 
import org.springframework.core.io.Resource; 
import org.springframework.core.io.support.ResourceRegion;
import org.springframework.http.CacheControl; 
import org.springframework.http.HttpHeaders; 
import org.springframework.http.HttpRange; 
import org.springframework.http.HttpStatus; 
import org.springframework.http.MediaType; 
import org.springframework.http.MediaTypeFactory; 
import org.springframework.http.ResponseEntity; 
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestHeader; 
import org.springframework.web.bind.annotation.RequestMapping; 
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/video")
public class videoController {

}
