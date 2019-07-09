package com.cheer.springbootdemo.controller;


import com.cheer.springbootdemo.model.Exam;
import com.cheer.springbootdemo.model.Student;
import com.cheer.springbootdemo.model.Users;
import com.cheer.springbootdemo.service.ExamService;
import com.cheer.springbootdemo.service.StudentService;
import com.cheer.springbootdemo.service.UsersService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Log4j2
@Controller
public class ExamController {
    @Autowired
    private ExamService examService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private UsersService usersService;

    @GetMapping("/index")
    public String index(){
        return "/index";
    }

    /**
     * 进入管理员登录页面
     * @return
     */
    @GetMapping("/admin")
    public String admin(){
        return "/admin";
    }

    /**
     * 进入考生登录页面
     * @return
     */
    @GetMapping("/student")
    public String student(){
        return "/student";
    }
    @PostMapping("/student")
    public String student(@RequestParam(value = "username") String user, @RequestParam(value = "password") String pass, HttpSession session){
        Student student = this.studentService.getUser(user);
        if(student != null){
            if (user.equals(student.getUsername())&&pass.equals(student.getPassword())){
                session.setAttribute("username",user);
                return "redirect:/student_test";
            }
        }
        return "redirect:/student";
    }
    @GetMapping("/student_test")
    public String student_test(){
        return "/student_test";
    }
    @RequestMapping(value = "student_test",method = RequestMethod.POST)
    @ResponseBody
    public List<Exam> student_test1(){
        return this.examService.getExam();

    }

    @RequestMapping(value = "student_result",method = RequestMethod.POST)
    @ResponseBody
    public int student_result(HttpServletRequest request, HttpSession session){
        String[] answerK = request.getParameterValues("answerK");
        for (String s : answerK) {
            System.out.println(s);
        }
        String username = (String) session.getAttribute("username");
        //answerB:标准答案，answerB：考生答案,correct:答对，error:答错，miss:漏答，scores:分数，pass:是否合格
        int correct=0,error=0,miss=0,scores=0;
        String pass;
        List<String> list = this.examService.getkey();
        String[] answerB = new String[list.size()];
        int j = 0;
        for (String s : list) {
            String s1 = s.substring(s.length()-1);
            answerB[j] = s1;
            j++;
        }
        for (int i = 0; i < answerK.length; i++) {
            if(answerK[i] == null||answerK[i].equals("")){
                miss += 1;
            } else if(answerK[i].equals(answerB[i])){
                correct += 1;
                scores += 20;
            } else if((!answerK[i].equals(answerB[i]))&&(answerK[i] != null)){
                error += 1;
            }

        }
        miss += answerB.length - answerK.length;
        if(scores >= 100){
            pass = "合格";
        }else{
            pass = "不合格";
        }
        Student student = new Student();
        student.setUsername(username);
        student.setCorrect(correct);
        student.setError(error);
        student.setMiss(miss);
        student.setScores(scores);
        student.setPass(pass);
        return this.studentService.update(student);
    }

    @GetMapping("student_result")
    public String student_result(Model model, HttpSession session){
        String username = (String) session.getAttribute("username");
        model.addAttribute("student",this.studentService.getUser(username));
        return "student_result";
    }


    @PostMapping("admin")
    public String page_admin(@RequestParam(value = "username") String user, @RequestParam(value = "password") String pass,HttpSession session){
        Users users = this.usersService.getList(user);
        if (users != null){
            if (user.equals(users.getUsername())&&pass.equals(users.getPassword())){
                return "redirect:/page_admin";
            }
        }
        return "redirect:/admin";
    }

    @GetMapping("page_admin")
    public String page_index(){
        return "/page_admin";
    }
}
