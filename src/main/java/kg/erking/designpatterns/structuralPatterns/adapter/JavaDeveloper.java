package kg.erking.designpatterns.structuralPatterns.adapter;

public class JavaDeveloper implements Developer{
    public static final String JAVA_DEVELOPER_DEVELOPS_APPLICATION = "Java developer develops application";

    @Override
    public String develop() {
        return JAVA_DEVELOPER_DEVELOPS_APPLICATION;
    }
}
