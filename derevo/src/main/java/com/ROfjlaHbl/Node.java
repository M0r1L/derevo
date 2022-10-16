package com.ROfjlaHbl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Node {
    String id;
    String name;
    List<Node> children;

    public Node(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void add(Node child) {
        this.children.add(child);
    }

    public void delll(String name) {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getName().equals(name)) {
                children.remove(i);
            }
        }
    }

    public void dellOC(String name) {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getName().equals(name)) {
                for (int j = i + 1; i < children.size(); j++) {
                    children.remove(j);
                }
            }
        }
    }

    public boolean search(String name) {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getName().equals(name)) {
                return true;
            } else
                return false;
        }
        return false;
    }

    public void rename(String name, String rename) {
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getName().equals(name)) {
                children.get(i).setName(rename);
            }
        }
    }

    public void content() {

    }

}
