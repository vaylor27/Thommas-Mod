package net.vakror.thommas.util;

public class DynamicJsonGen {
    public static String createItemModelJson(String id, String type) {
        if ("generated".equals(type) || "handheld".equals(type)) {
            //The two types of items. "handheld" is used mostly for tools and the like, while "generated" is used for everything else.
            return "{\n" +
                    "  \"parent\": \"item/" + type + "\",\n" +
                    "  \"textures\": {\n" +
                    "    \"layer0\": \"thommas:" + id + "\"\n" +
                    "  }\n" +
                    "}";
        }
        else {
            //If the type is invalid, return an empty json string.
            return "";
        }
    }
}
