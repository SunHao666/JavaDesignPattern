package com.example.javadesignpattern.build;

/**
 * 创建型-build模式
 */
public class CustomDialog {
    private String title;
    private String content;

    public CustomDialog(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /**
     * 建造者，用于建造对象
     */
    public static class Build{
        private String title;
        private String content;

        public Build setTitle(String title) {
            this.title = title;
            return this;
        }

        public Build setContent(String content) {
            this.content = content;
            return this;
        }

        public CustomDialog creat(){
            return new CustomDialog(title,content);
        }
    }
}
