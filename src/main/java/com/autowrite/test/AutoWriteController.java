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
        map.put("As", "As we discussed on the phone, ");
        map.put("reference", "With reference to our telephone conversation, ");
        map.put("If", "If you need more information, please let me know. ");
        map.put("decision", "from our decision at the previous meeting, ");
        map.put("confirm", "I am writing to confirm/enquire/inform you ");
        map.put("follow", "I am writing to follow up on our earlier decision on the marketing campaign in Q2. ");
        map.put("follow-up", "As a follow-up to our phone conversation yesterday, I wanted to get back to you about the pending issues of our agreement. ");
        map.put("Attached", "Attached please find the draft product plan for your review and comment. ");
        map.put("talk", "I want to talk to you over the phone regarding issues about report development and the project. ");
        map.put("apologize", "We apologize for the delay and hope that it doesn't inconvenience you too much. ");
        map.put("Congratulation", "Congratulations to all of you and thanks for your efforts. ");
        map.put("convey", "Please convey my thanks to all the staff involved, they certainly did an excellent job. ");
        map.put("Due", "Due to circumstances beyond our control, ");
        map.put("appreciate", "I would really appreciate meeting up if you can spare the time. Please let me know what suits you best. ");
        map.put("appreciated", "Any comments will be much appreciated. ");
        map.put("forward", "Looking forward to receiving your comments in due course! ");
        map.put("status", "Could you please let me know the status of this project? ");
        map.put("support", "Please feel free to call me at any time, I will continually provide full support. ");
        map.put("question", " If you’re any questions please let me know.");
        map.put("respond","Once you respond to the above questions, we will decide which option we would like to pursue. ");
        map.put("ASAP", "as soon as possible. ");
        map.put("estimation", "Thank you and look forward to having your opinion on the estimation and schedule. ");
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
