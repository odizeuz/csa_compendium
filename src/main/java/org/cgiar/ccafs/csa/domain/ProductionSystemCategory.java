package org.cgiar.ccafs.csa.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the categories database table.
 */
@Entity
@Table(name = "categories")
public class ProductionSystemCategory extends AbstractInformationEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "category")
    private List<ProductionSystem> productionSystems;

    public List<ProductionSystem> getProductionSystems() {
        if (this.productionSystems == null) {
            this.productionSystems = new ArrayList<>();
        }
        return this.productionSystems;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    public ProductionSystem addPractice(ProductionSystem productionSystem) {
        getProductionSystems().add(productionSystem);
        productionSystem.setCategory(this);

        return productionSystem;
    }

    public ProductionSystem removePractice(ProductionSystem productionSystem) {
        getProductionSystems().remove(productionSystem);
        productionSystem.setCategory(null);

        return productionSystem;
    }
}
