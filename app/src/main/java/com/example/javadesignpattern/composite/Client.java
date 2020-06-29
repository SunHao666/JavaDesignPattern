package com.example.javadesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

class Client {
    public static void main(String[] args) {
        // 来一个根节点
        Component root = new Composite("root");
        // 来一个树枝节点
        Component branchA = new Composite("---branchA");
        Component branchB = new Composite("------branchB");
        // 来一个叶子节点
        Component leafA = new Leaf("------leafA");
        Component leafB = new Leaf("---------leafB");
        Component leafC = new Leaf("---leafC");

        root.addChild(branchA);
        root.addChild(leafC);
        branchA.addChild(leafA);
        branchA.addChild(branchB);
        branchB.addChild(leafB);

        String result = root.operation();
        System.out.println(result);

    }

    // 抽象根节点
    static abstract class Component {
        protected String name;

        public Component(String name) {
            this.name = name;
        }

        public abstract String operation();

        public boolean addChild(Component component) {
            throw new UnsupportedOperationException("addChild not supported!");
        }

        public boolean removeChild(Component component) {
            throw new UnsupportedOperationException("removeChild not supported!");
        }

        public Component getChild(int index) {
            throw new UnsupportedOperationException("getChild not supported!");
        }
    }

    // 树节点
    static class Composite extends Component {
        private List<Component> mComponents;

        public Composite(String name) {
            super(name);
            this.mComponents = new ArrayList<>();
        }

        @Override
        public String operation() {
            StringBuilder builder = new StringBuilder(this.name);
            for (Component component : this.mComponents) {
                builder.append("\n");
                builder.append(component.operation());
            }
            return builder.toString();
        }

        @Override
        public boolean addChild(Component component) {
            return this.mComponents.add(component);
        }

        @Override
        public boolean removeChild(Component component) {
            return this.mComponents.remove(component);
        }

        @Override
        public Component getChild(int index) {
            return this.mComponents.get(index);
        }
    }

    //叶子节点
    static class Leaf extends Component {

        public Leaf(String name) {
            super(name);
        }

        @Override
        public String operation() {
            return this.name;
        }
    }
}