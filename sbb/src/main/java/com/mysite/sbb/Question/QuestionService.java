package com.mysite.sbb.Question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepeository;

    public List<Question> getList() {
        return this.questionRepeository.findAll();
    }

}
