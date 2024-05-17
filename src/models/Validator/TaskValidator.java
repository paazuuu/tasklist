package models.Validator;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    // バリデーションを実行する
    public static List<String> validate(Task task) {
        List<String> errors = new ArrayList<String>();

        String contentError = validateContent(task.getContent());
        if(!contentError.equals("")) {
            errors.add(contentError);
        }

        return errors;
    }

    // コンテンツの必須入力チェック
    private static String validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスク内容を入力してください。";
        }

        return "";
    }
}