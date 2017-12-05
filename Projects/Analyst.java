package Projects;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Analyst <br>
 * @version generated on Mon Dec 04 20:34:43 COT 2017 by alvarfr
 */

public interface Analyst extends Applications {

    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Generate
     */
     
    /**
     * Gets all property values for the Generate property.<p>
     * 
     * @returns a collection of values for the Generate property.
     */
    Collection<? extends Applications> getGenerate();

    /**
     * Checks if the class has a Generate property value.<p>
     * 
     * @return true if there is a Generate property value.
     */
    boolean hasGenerate();

    /**
     * Adds a Generate property value.<p>
     * 
     * @param newGenerate the Generate property value to be added
     */
    void addGenerate(Applications newGenerate);

    /**
     * Removes a Generate property value.<p>
     * 
     * @param oldGenerate the Generate property value to be removed.
     */
    void removeGenerate(Applications oldGenerate);


    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Input_for
     */
     
    /**
     * Gets all property values for the Input_for property.<p>
     * 
     * @returns a collection of values for the Input_for property.
     */
    Collection<? extends WorkOrders> getInput_for();

    /**
     * Checks if the class has a Input_for property value.<p>
     * 
     * @return true if there is a Input_for property value.
     */
    boolean hasInput_for();

    /**
     * Adds a Input_for property value.<p>
     * 
     * @param newInput_for the Input_for property value to be added
     */
    void addInput_for(WorkOrders newInput_for);

    /**
     * Removes a Input_for property value.<p>
     * 
     * @param oldInput_for the Input_for property value to be removed.
     */
    void removeInput_for(WorkOrders oldInput_for);


    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Modified_By
     */
     
    /**
     * Gets all property values for the Modified_By property.<p>
     * 
     * @returns a collection of values for the Modified_By property.
     */
    Collection<? extends Changes> getModified_By();

    /**
     * Checks if the class has a Modified_By property value.<p>
     * 
     * @return true if there is a Modified_By property value.
     */
    boolean hasModified_By();

    /**
     * Adds a Modified_By property value.<p>
     * 
     * @param newModified_By the Modified_By property value to be added
     */
    void addModified_By(Changes newModified_By);

    /**
     * Removes a Modified_By property value.<p>
     * 
     * @param oldModified_By the Modified_By property value to be removed.
     */
    void removeModified_By(Changes oldModified_By);


    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Support
     */
     
    /**
     * Gets all property values for the Support property.<p>
     * 
     * @returns a collection of values for the Support property.
     */
    Collection<? extends Applications> getSupport();

    /**
     * Checks if the class has a Support property value.<p>
     * 
     * @return true if there is a Support property value.
     */
    boolean hasSupport();

    /**
     * Adds a Support property value.<p>
     * 
     * @param newSupport the Support property value to be added
     */
    void addSupport(Applications newSupport);

    /**
     * Removes a Support property value.<p>
     * 
     * @param oldSupport the Support property value to be removed.
     */
    void removeSupport(Applications oldSupport);


    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Support_By
     */
     
    /**
     * Gets all property values for the Support_By property.<p>
     * 
     * @returns a collection of values for the Support_By property.
     */
    Collection<? extends Analyst> getSupport_By();

    /**
     * Checks if the class has a Support_By property value.<p>
     * 
     * @return true if there is a Support_By property value.
     */
    boolean hasSupport_By();

    /**
     * Adds a Support_By property value.<p>
     * 
     * @param newSupport_By the Support_By property value to be added
     */
    void addSupport_By(Analyst newSupport_By);

    /**
     * Removes a Support_By property value.<p>
     * 
     * @param oldSupport_By the Support_By property value to be removed.
     */
    void removeSupport_By(Analyst oldSupport_By);


    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#ApplicationName
     */
     
    /**
     * Gets all property values for the ApplicationName property.<p>
     * 
     * @returns a collection of values for the ApplicationName property.
     */
    Collection<? extends String> getApplicationName();

    /**
     * Checks if the class has a ApplicationName property value.<p>
     * 
     * @return true if there is a ApplicationName property value.
     */
    boolean hasApplicationName();

    /**
     * Adds a ApplicationName property value.<p>
     * 
     * @param newApplicationName the ApplicationName property value to be added
     */
    void addApplicationName(String newApplicationName);

    /**
     * Removes a ApplicationName property value.<p>
     * 
     * @param oldApplicationName the ApplicationName property value to be removed.
     */
    void removeApplicationName(String oldApplicationName);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Description
     */
     
    /**
     * Gets all property values for the Description property.<p>
     * 
     * @returns a collection of values for the Description property.
     */
    Collection<? extends String> getDescription();

    /**
     * Checks if the class has a Description property value.<p>
     * 
     * @return true if there is a Description property value.
     */
    boolean hasDescription();

    /**
     * Adds a Description property value.<p>
     * 
     * @param newDescription the Description property value to be added
     */
    void addDescription(String newDescription);

    /**
     * Removes a Description property value.<p>
     * 
     * @param oldDescription the Description property value to be removed.
     */
    void removeDescription(String oldDescription);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#DeveloperEMail
     */
     
    /**
     * Gets all property values for the DeveloperEMail property.<p>
     * 
     * @returns a collection of values for the DeveloperEMail property.
     */
    Collection<? extends String> getDeveloperEMail();

    /**
     * Checks if the class has a DeveloperEMail property value.<p>
     * 
     * @return true if there is a DeveloperEMail property value.
     */
    boolean hasDeveloperEMail();

    /**
     * Adds a DeveloperEMail property value.<p>
     * 
     * @param newDeveloperEMail the DeveloperEMail property value to be added
     */
    void addDeveloperEMail(String newDeveloperEMail);

    /**
     * Removes a DeveloperEMail property value.<p>
     * 
     * @param oldDeveloperEMail the DeveloperEMail property value to be removed.
     */
    void removeDeveloperEMail(String oldDeveloperEMail);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#DeveloperId
     */
     
    /**
     * Gets all property values for the DeveloperId property.<p>
     * 
     * @returns a collection of values for the DeveloperId property.
     */
    Collection<? extends Integer> getDeveloperId();

    /**
     * Checks if the class has a DeveloperId property value.<p>
     * 
     * @return true if there is a DeveloperId property value.
     */
    boolean hasDeveloperId();

    /**
     * Adds a DeveloperId property value.<p>
     * 
     * @param newDeveloperId the DeveloperId property value to be added
     */
    void addDeveloperId(Integer newDeveloperId);

    /**
     * Removes a DeveloperId property value.<p>
     * 
     * @param oldDeveloperId the DeveloperId property value to be removed.
     */
    void removeDeveloperId(Integer oldDeveloperId);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#DeveloperName
     */
     
    /**
     * Gets all property values for the DeveloperName property.<p>
     * 
     * @returns a collection of values for the DeveloperName property.
     */
    Collection<? extends String> getDeveloperName();

    /**
     * Checks if the class has a DeveloperName property value.<p>
     * 
     * @return true if there is a DeveloperName property value.
     */
    boolean hasDeveloperName();

    /**
     * Adds a DeveloperName property value.<p>
     * 
     * @param newDeveloperName the DeveloperName property value to be added
     */
    void addDeveloperName(String newDeveloperName);

    /**
     * Removes a DeveloperName property value.<p>
     * 
     * @param oldDeveloperName the DeveloperName property value to be removed.
     */
    void removeDeveloperName(String oldDeveloperName);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#DeveloperPhoneNumber
     */
     
    /**
     * Gets all property values for the DeveloperPhoneNumber property.<p>
     * 
     * @returns a collection of values for the DeveloperPhoneNumber property.
     */
    Collection<? extends Integer> getDeveloperPhoneNumber();

    /**
     * Checks if the class has a DeveloperPhoneNumber property value.<p>
     * 
     * @return true if there is a DeveloperPhoneNumber property value.
     */
    boolean hasDeveloperPhoneNumber();

    /**
     * Adds a DeveloperPhoneNumber property value.<p>
     * 
     * @param newDeveloperPhoneNumber the DeveloperPhoneNumber property value to be added
     */
    void addDeveloperPhoneNumber(Integer newDeveloperPhoneNumber);

    /**
     * Removes a DeveloperPhoneNumber property value.<p>
     * 
     * @param oldDeveloperPhoneNumber the DeveloperPhoneNumber property value to be removed.
     */
    void removeDeveloperPhoneNumber(Integer oldDeveloperPhoneNumber);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#DeveloperSurName
     */
     
    /**
     * Gets all property values for the DeveloperSurName property.<p>
     * 
     * @returns a collection of values for the DeveloperSurName property.
     */
    Collection<? extends String> getDeveloperSurName();

    /**
     * Checks if the class has a DeveloperSurName property value.<p>
     * 
     * @return true if there is a DeveloperSurName property value.
     */
    boolean hasDeveloperSurName();

    /**
     * Adds a DeveloperSurName property value.<p>
     * 
     * @param newDeveloperSurName the DeveloperSurName property value to be added
     */
    void addDeveloperSurName(String newDeveloperSurName);

    /**
     * Removes a DeveloperSurName property value.<p>
     * 
     * @param oldDeveloperSurName the DeveloperSurName property value to be removed.
     */
    void removeDeveloperSurName(String oldDeveloperSurName);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Id
     */
     
    /**
     * Gets all property values for the Id property.<p>
     * 
     * @returns a collection of values for the Id property.
     */
    Collection<? extends Integer> getId();

    /**
     * Checks if the class has a Id property value.<p>
     * 
     * @return true if there is a Id property value.
     */
    boolean hasId();

    /**
     * Adds a Id property value.<p>
     * 
     * @param newId the Id property value to be added
     */
    void addId(Integer newId);

    /**
     * Removes a Id property value.<p>
     * 
     * @param oldId the Id property value to be removed.
     */
    void removeId(Integer oldId);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#State
     */
     
    /**
     * Gets all property values for the State property.<p>
     * 
     * @returns a collection of values for the State property.
     */
    Collection<? extends Boolean> getState();

    /**
     * Checks if the class has a State property value.<p>
     * 
     * @return true if there is a State property value.
     */
    boolean hasState();

    /**
     * Adds a State property value.<p>
     * 
     * @param newState the State property value to be added
     */
    void addState(Boolean newState);

    /**
     * Removes a State property value.<p>
     * 
     * @param oldState the State property value to be removed.
     */
    void removeState(Boolean oldState);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
