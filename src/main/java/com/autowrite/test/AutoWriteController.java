package com.autowrite.test;

import java.util.*;

import org.springframework.web.bind.annotation.*;

/**
 * @author Jack
 */
@RestController
public class AutoWriteController {

    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello 123 abc 123 123 !!!";
    }

    @RequestMapping("/hello1")
    public String hello1() {
        return "Hello World";
    }

    @RequestMapping("/hello2")
    public List<String> hello2() {
        return Arrays.asList(new String[] { "A", "B", "C" });
    }

    private static Map<String, String> map = new HashMap<>();
    private static StringBuffer sb = new StringBuffer(2048);

    static {
        map.put("As", "As we discussed, ");
        map.put("If", "If you need more information, please let me know. ");
        map.put("forward", "I'm looking forward to your repay! ");
    }

    @RequestMapping("/customerInputWord")
    public String customerInputWord(@RequestParam("word") String word) {
        return simulateMLReturn(word);
    }

    private String simulateMLReturn(String keyword) {
        if (!"".equals(keyword.trim())) {
            if (map.containsKey(keyword.trim())) {
                sb.append(map.get(keyword));
            }
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String keyword = scanner.nextLine();
            if (map.containsKey(keyword)) {
                sb.append(map.get(keyword));
            }
        }
        System.out.println(sb.toString());
        scanner.close();
    }

}
