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
 * Source Class: ClosedWorkOrders <br>
 * @version generated on Mon Dec 04 20:34:44 COT 2017 by alvarfr
 */

public interface ClosedWorkOrders extends WorkOrders {

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
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Requeriment_Over
     */
     
    /**
     * Gets all property values for the Requeriment_Over property.<p>
     * 
     * @returns a collection of values for the Requeriment_Over property.
     */
    Collection<? extends Applications> getRequeriment_Over();

    /**
     * Checks if the class has a Requeriment_Over property value.<p>
     * 
     * @return true if there is a Requeriment_Over property value.
     */
    boolean hasRequeriment_Over();

    /**
     * Adds a Requeriment_Over property value.<p>
     * 
     * @param newRequeriment_Over the Requeriment_Over property value to be added
     */
    void addRequeriment_Over(Applications newRequeriment_Over);

    /**
     * Removes a Requeriment_Over property value.<p>
     * 
     * @param oldRequeriment_Over the Requeriment_Over property value to be removed.
     */
    void removeRequeriment_Over(Applications oldRequeriment_Over);


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
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#WorkOrderCreationDate
     */
     
    /**
     * Gets all property values for the WorkOrderCreationDate property.<p>
     * 
     * @returns a collection of values for the WorkOrderCreationDate property.
     */
    Collection<? extends XMLGregorianCalendar> getWorkOrderCreationDate();

    /**
     * Checks if the class has a WorkOrderCreationDate property value.<p>
     * 
     * @return true if there is a WorkOrderCreationDate property value.
     */
    boolean hasWorkOrderCreationDate();

    /**
     * Adds a WorkOrderCreationDate property value.<p>
     * 
     * @param newWorkOrderCreationDate the WorkOrderCreationDate property value to be added
     */
    void addWorkOrderCreationDate(XMLGregorianCalendar newWorkOrderCreationDate);

    /**
     * Removes a WorkOrderCreationDate property value.<p>
     * 
     * @param oldWorkOrderCreationDate the WorkOrderCreationDate property value to be removed.
     */
    void removeWorkOrderCreationDate(XMLGregorianCalendar oldWorkOrderCreationDate);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#WorkOrderId
     */
     
    /**
     * Gets all property values for the WorkOrderId property.<p>
     * 
     * @returns a collection of values for the WorkOrderId property.
     */
    Collection<? extends Integer> getWorkOrderId();

    /**
     * Checks if the class has a WorkOrderId property value.<p>
     * 
     * @return true if there is a WorkOrderId property value.
     */
    boolean hasWorkOrderId();

    /**
     * Adds a WorkOrderId property value.<p>
     * 
     * @param newWorkOrderId the WorkOrderId property value to be added
     */
    void addWorkOrderId(Integer newWorkOrderId);

    /**
     * Removes a WorkOrderId property value.<p>
     * 
     * @param oldWorkOrderId the WorkOrderId property value to be removed.
     */
    void removeWorkOrderId(Integer oldWorkOrderId);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#WorkOrderPriority
     */
     
    /**
     * Gets all property values for the WorkOrderPriority property.<p>
     * 
     * @returns a collection of values for the WorkOrderPriority property.
     */
    Collection<? extends String> getWorkOrderPriority();

    /**
     * Checks if the class has a WorkOrderPriority property value.<p>
     * 
     * @return true if there is a WorkOrderPriority property value.
     */
    boolean hasWorkOrderPriority();

    /**
     * Adds a WorkOrderPriority property value.<p>
     * 
     * @param newWorkOrderPriority the WorkOrderPriority property value to be added
     */
    void addWorkOrderPriority(String newWorkOrderPriority);

    /**
     * Removes a WorkOrderPriority property value.<p>
     * 
     * @param oldWorkOrderPriority the WorkOrderPriority property value to be removed.
     */
    void removeWorkOrderPriority(String oldWorkOrderPriority);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#WorkOrderResolutionDate
     */
     
    /**
     * Gets all property values for the WorkOrderResolutionDate property.<p>
     * 
     * @returns a collection of values for the WorkOrderResolutionDate property.
     */
    Collection<? extends XMLGregorianCalendar> getWorkOrderResolutionDate();

    /**
     * Checks if the class has a WorkOrderResolutionDate property value.<p>
     * 
     * @return true if there is a WorkOrderResolutionDate property value.
     */
    boolean hasWorkOrderResolutionDate();

    /**
     * Adds a WorkOrderResolutionDate property value.<p>
     * 
     * @param newWorkOrderResolutionDate the WorkOrderResolutionDate property value to be added
     */
    void addWorkOrderResolutionDate(XMLGregorianCalendar newWorkOrderResolutionDate);

    /**
     * Removes a WorkOrderResolutionDate property value.<p>
     * 
     * @param oldWorkOrderResolutionDate the WorkOrderResolutionDate property value to be removed.
     */
    void removeWorkOrderResolutionDate(XMLGregorianCalendar oldWorkOrderResolutionDate);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#WorkOrderState
     */
     
    /**
     * Gets all property values for the WorkOrderState property.<p>
     * 
     * @returns a collection of values for the WorkOrderState property.
     */
    Collection<? extends String> getWorkOrderState();

    /**
     * Checks if the class has a WorkOrderState property value.<p>
     * 
     * @return true if there is a WorkOrderState property value.
     */
    boolean hasWorkOrderState();

    /**
     * Adds a WorkOrderState property value.<p>
     * 
     * @param newWorkOrderState the WorkOrderState property value to be added
     */
    void addWorkOrderState(String newWorkOrderState);

    /**
     * Removes a WorkOrderState property value.<p>
     * 
     * @param oldWorkOrderState the WorkOrderState property value to be removed.
     */
    void removeWorkOrderState(String oldWorkOrderState);



    /* ***************************************************
     * Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#WorkOrderSummary
     */
     
    /**
     * Gets all property values for the WorkOrderSummary property.<p>
     * 
     * @returns a collection of values for the WorkOrderSummary property.
     */
    Collection<? extends String> getWorkOrderSummary();

    /**
     * Checks if the class has a WorkOrderSummary property value.<p>
     * 
     * @return true if there is a WorkOrderSummary property value.
     */
    boolean hasWorkOrderSummary();

    /**
     * Adds a WorkOrderSummary property value.<p>
     * 
     * @param newWorkOrderSummary the WorkOrderSummary property value to be added
     */
    void addWorkOrderSummary(String newWorkOrderSummary);

    /**
     * Removes a WorkOrderSummary property value.<p>
     * 
     * @param oldWorkOrderSummary the WorkOrderSummary property value to be removed.
     */
    void removeWorkOrderSummary(String oldWorkOrderSummary);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
