package com.zipcodewilmington.assessment2.part2;


import java.util.LinkedHashMap;
import java.util.Map;




import java.util.TreeMap;

    public class Router {

        private Map<String, String> map = new LinkedHashMap<>();

        public void add(String path, String controller) {

            map.put(path, controller);

        }

        public Integer size() {

            return map.size();

        }

        public String getController(String path) {

            return map.get(path);

        }

        public void update(String path, String studentController) {

            map.put(path, studentController);

        }

        public void remove(String path) {

            map.remove(path);

        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (String key : map.keySet()) {
                sb.append(key + map.get(key) + "\n");
            }
            return sb.toString();
        }
    }