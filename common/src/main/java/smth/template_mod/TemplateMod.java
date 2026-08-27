package smth.template_mod;

import v.akfz.db.generator.GenerateInitializer;
import v.akfz.db.generator.LoaderType;

//Main class
@GenerateInitializer(loader = LoaderType.Both, modId = "template")
public class TemplateMod {
    public void init() {
        System.out.println("HALLO :D");
    }
}
