package com.alexg.alexgojcodesandbox;

import com.alexg.alexgojcodesandbox.model.ExecuteCodeRequest;
import com.alexg.alexgojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * Java 原生代码沙箱实现（直接复用模板方法）
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
