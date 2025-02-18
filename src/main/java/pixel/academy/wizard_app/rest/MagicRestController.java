package pixel.academy.wizard_app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MagicRestController {

    // injecting props form application.properties

    @Value("${wizard.name}")
    private String wizardName;

    @Value("${wizard.house}")
    private String wizardHouse;

    @Value("${wizard.spell}")
    private String wizardSpell;

    @GetMapping("/team")
    public String getTeamInfo() {
        return "Wizard name: "      + wizardName  +
                ", Wizard house: "  + wizardHouse +
                ", Wizard spell: "  + wizardSpell;
    }
}
