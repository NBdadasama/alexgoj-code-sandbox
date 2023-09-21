package com.alexg.alexgojcodesandbox;


import com.alexg.alexgojcodesandbox.model.ExecuteCodeRequest;
import com.alexg.alexgojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
