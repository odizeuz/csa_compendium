package org.cgiar.ccafs.csa.web.admin;

import org.cgiar.ccafs.csa.domain.Practice;
import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.*;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.unit.FiltersConfigurationUnit;
import org.lightadmin.api.config.unit.ScreenContextConfigurationUnit;

import static org.cgiar.ccafs.csa.web.admin.AdministrationTemplates.*;

public class PracticeAdministration extends AdministrationConfiguration<Practice> {

    @Override
    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("Agricultural Practices").build();
    }

    @Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("name")
                .pluralName("Practices")
                .singularName("Practice")
                .build();
    }

    @Override
    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        fragmentBuilder.field("practiceLevel").caption("Level");
        return infoListView(fragmentBuilder).build();
    }

    @Override
    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        fragmentBuilder.field("practiceLevel").caption("Level");
        return infoQuickView(fragmentBuilder).
                field("tags").caption("Tags").
                build();
    }

    @Override
    public FieldSetConfigurationUnit showView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        fragmentBuilder.field("practiceLevel").caption("Level");
        return infoShowView(fragmentBuilder).
                field("tags").caption("Tags").
                field("contextValues").caption("Context Values").
                //field("synergies").caption("Synergies with other Practices").
                build();
    }

    @Override
    public FieldSetConfigurationUnit formView(PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        fragmentBuilder.field("practiceLevel").caption("Level");
        return infoFormView(fragmentBuilder).
                field("tags").caption("Tags").
                field("contextValues").caption("Context Values").
                //field("synergies").caption("Synergies with other Practices").
                build();
    }

    @Override
    public FiltersConfigurationUnit filters(FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder.
                filter("Practice Level", "practiceLevel").
                build();

        //TODO Add Other filters
    }

}
