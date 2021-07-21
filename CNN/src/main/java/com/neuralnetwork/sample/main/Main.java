package com.neuralnetwork.sample.main;
import com.neuralnetwork.sample.constant.Constant;
import com.neuralnetwork.sample.ui.MainFrame;
import java.io.File;


public class Main {
    //the main function of whole project
    public static void main(String[] args){
        String folderName = System.getProperty("java.io.tmpdir");   //获取操作系统缓存的临时目录
                                                                    //C:\Users\登录用户~1\AppData\Local\Temp\
                                                                    // Linux：/tmp
        String trainFolder = folderName + "/digital_recognizer_train";
        File folder = new File(trainFolder);
        if(!folder.isDirectory()){
            folder.mkdir();                     //创建目录
        }
        Constant.trainFolder = trainFolder;

        new MainFrame();
    }
}
