package com.treehouse.cources;

import static spark.Spark.*;
/**
 * Created by Fiu on 11/01/2017.
 */
public class Main {
        public static void main(String[] args) {

            get("/hello", (req, res) -> "Hello World");



        }
    }
