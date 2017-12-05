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
 * Source Class: Applications <br>
 * @version generated on Mon Dec 04 20:34:44 COT 2017 by alvarfr
 */

public interface Applications extends WrappedIndividual {

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