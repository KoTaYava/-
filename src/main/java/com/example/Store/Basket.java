package com.example.Store;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Component
@SessionScope
public class Basket {

    private Map<Integer, Integer> contents = new HashMap<>();
        public Map<Integer, Integer> getContents() {
            return Collections.unmodifiableMap(contents);
        }

        public void add(int id) {
            if (contents.containsKey(id)) {
                contents.put(id, contents.get(id) + 1);
            } else {
                contents.put(id, 1);
            }
        }

        @Override
        public String toString() {
            return "Cart" + "contents" + contents;
        }
    }


