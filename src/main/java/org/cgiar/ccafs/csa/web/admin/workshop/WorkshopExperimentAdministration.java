package org.cgiar.ccafs.csa.web.admin.workshop;

import org.cgiar.ccafs.csa.domain.ExperimentArticle;
import org.cgiar.ccafs.csa.domain.workshop.WorkshopExperiment;
import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.*;
import org.lightadmin.api.config.unit.*;

import static org.lightadmin.api.config.utils.Editors.textArea;

public class WorkshopExperimentAdministration extends AdministrationConfiguration<WorkshopExperiment> {

    @Override
    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("Experiments contributed by users during workshops ").build();
    }

    @Override
    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameField("id")
                .pluralName("Workshop Experiments")
                .singularName("Experiment")
                .build();
    }

    @Override
    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
                .field("id").caption("ID")
                .field("title").caption("Title")
                .field("publicationDate").caption("Publication Date")
                .field("theme").caption("CSA Theme")
                .build();
    }

    @Override
    public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
                .field("title").caption("Title")
                .field("code").caption("Code")
                .field("publicationDate").caption("Publication Date")
                .field("authors").caption("Authors")
                .field("language").caption("Language")
                .field("contexts").caption("Experiment Contexts")
                .build();
    }

    @Override
    public FieldSetConfigurationUnit showView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
                .field("title").caption("Title")
                .field("outline").caption("Outline")
                .field("code").caption("Code")
                .field("publicationDate").caption("Publication Date")
                .field("theme").caption("CSA Theme")
                .field("authors").caption("Authors")
                .field("contacts").caption("Contacts")
                .field("language").caption("Language")
                .field("contextValues").caption("Context Values")
                .field("contexts").caption("Experiment Contexts")
                .build();
    }

    @Override
    public FieldSetConfigurationUnit formView(PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
                .field("title").caption("Title")
                .field("outline").caption("Outline").editor(textArea())
                .field("code").caption("Code")
                .field("publicationDate").caption("Publication Date")
                .field("theme").caption("CSA Theme")
                .field("authors").caption("Authors")
                .field("contacts").caption("Contacts")
                .field("language").caption("Language")
                .field("contextValues").caption("Context Variables")
                .field("contexts").caption("Experiment Contexts")
                .build();
    }
}
