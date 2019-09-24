package com.security.jwt.controller;

import org.apache.commons.text.StringEscapeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicController {

    private String content = "Hello from public API controller";
    private String xss = "<script>alert('XSS')</script>";

    /**
     * API endpoint example in scope of 'JSON web token' topic
     * @return
     */
    @GetMapping
    public String getMessage() {
        return StringEscapeUtils.escapeHtml4(content);
    }

    /**
     * API endpoint example in scope of 'XSS injection' topic: content without escaping
     * @return
     */
    @GetMapping ("/noescape")
    public String getMessageEscape() {
        return content + " " + xss;
    }

    /**
     * API endpoint example in scope of 'XSS injection' topic: content with escaping
     * @return
     */
    @GetMapping("/escape")
    public String getMessageNoEscape() {
        return StringEscapeUtils.escapeHtml4(content + " " + xss);
    }

}
