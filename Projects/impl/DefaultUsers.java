package Projects.impl;

import Projects.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultUsers <br>
 * @version generated on Mon Dec 04 20:34:44 COT 2017 by alvarfr
 */
public class DefaultUsers extends WrappedIndividualImpl implements Users {

    public DefaultUsers(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Generate
     */
     
    public Collection<? extends Applications> getGenerate() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_GENERATE,
                                               DefaultApplications.class);
    }

    public boolean hasGenerate() {
	   return !getGenerate().isEmpty();
    }

    public void addGenerate(Applications newGenerate) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_GENERATE,
                                       newGenerate);
    }

    public void removeGenerate(Applications oldGenerate) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_GENERATE,
                                          oldGenerate);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Input_for
     */
     
    public Collection<? extends WorkOrders> getInput_for() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_INPUT_FOR,
                                               DefaultWorkOrders.class);
    }

    public boolean hasInput_for() {
	   return !getInput_for().isEmpty();
    }

    public void addInput_for(WorkOrders newInput_for) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_INPUT_FOR,
                                       newInput_for);
    }

    public void removeInput_for(WorkOrders oldInput_for) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_INPUT_FOR,
                                          oldInput_for);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Modified_By
     */
     
    public Collection<? extends Changes> getModified_By() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_MODIFIED_BY,
                                               DefaultChanges.class);
    }

    public boolean hasModified_By() {
	   return !getModified_By().isEmpty();
    }

    public void addModified_By(Changes newModified_By) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_MODIFIED_BY,
                                       newModified_By);
    }

    public void removeModified_By(Changes oldModified_By) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_MODIFIED_BY,
                                          oldModified_By);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Support
     */
     
    public Collection<? extends Applications> getSupport() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_SUPPORT,
                                               DefaultApplications.class);
    }

    public boolean hasSupport() {
	   return !getSupport().isEmpty();
    }

    public void addSupport(Applications newSupport) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_SUPPORT,
                                       newSupport);
    }

    public void removeSupport(Applications oldSupport) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_SUPPORT,
                                          oldSupport);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Support_By
     */
     
    public Collection<? extends Analyst> getSupport_By() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_SUPPORT_BY,
                                               DefaultAnalyst.class);
    }

    public boolean hasSupport_By() {
	   return !getSupport_By().isEmpty();
    }

    public void addSupport_By(Analyst newSupport_By) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_SUPPORT_BY,
                                       newSupport_By);
    }

    public void removeSupport_By(Analyst oldSupport_By) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_SUPPORT_BY,
                                          oldSupport_By);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#ApplicationName
     */
     
    public Collection<? extends String> getApplicationName() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_APPLICATIONNAME, String.class);
    }

    public boolean hasApplicationName() {
		return !getApplicationName().isEmpty();
    }

    public void addApplicationName(String newApplicationName) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_APPLICATIONNAME, newApplicationName);
    }

    public void removeApplicationName(String oldApplicationName) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_APPLICATIONNAME, oldApplicationName);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Description
     */
     
    public Collection<? extends String> getDescription() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DESCRIPTION, String.class);
    }

    public boolean hasDescription() {
		return !getDescription().isEmpty();
    }

    public void addDescription(String newDescription) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DESCRIPTION, newDescription);
    }

    public void removeDescription(String oldDescription) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_DESCRIPTION, oldDescription);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#Id
     */
     
    public Collection<? extends Integer> getId() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ID, Integer.class);
    }

    public boolean hasId() {
		return !getId().isEmpty();
    }

    public void addId(Integer newId) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ID, newId);
    }

    public void removeId(Integer oldId) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ID, oldId);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#State
     */
     
    public Collection<? extends Boolean> getState() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STATE, Boolean.class);
    }

    public boolean hasState() {
		return !getState().isEmpty();
    }

    public void addState(Boolean newState) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STATE, newState);
    }

    public void removeState(Boolean oldState) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_STATE, oldState);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#UserArea
     */
     
    public Collection<? extends String> getUserArea() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERAREA, String.class);
    }

    public boolean hasUserArea() {
		return !getUserArea().isEmpty();
    }

    public void addUserArea(String newUserArea) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERAREA, newUserArea);
    }

    public void removeUserArea(String oldUserArea) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERAREA, oldUserArea);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#UserCharge
     */
     
    public Collection<? extends String> getUserCharge() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERCHARGE, String.class);
    }

    public boolean hasUserCharge() {
		return !getUserCharge().isEmpty();
    }

    public void addUserCharge(String newUserCharge) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERCHARGE, newUserCharge);
    }

    public void removeUserCharge(String oldUserCharge) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERCHARGE, oldUserCharge);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#UserEMail
     */
     
    public Collection<? extends String> getUserEMail() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USEREMAIL, String.class);
    }

    public boolean hasUserEMail() {
		return !getUserEMail().isEmpty();
    }

    public void addUserEMail(String newUserEMail) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USEREMAIL, newUserEMail);
    }

    public void removeUserEMail(String oldUserEMail) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USEREMAIL, oldUserEMail);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#UserId
     */
     
    public Collection<? extends Integer> getUserId() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERID, Integer.class);
    }

    public boolean hasUserId() {
		return !getUserId().isEmpty();
    }

    public void addUserId(Integer newUserId) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERID, newUserId);
    }

    public void removeUserId(Integer oldUserId) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERID, oldUserId);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#UserName
     */
     
    public Collection<? extends String> getUserName() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERNAME, String.class);
    }

    public boolean hasUserName() {
		return !getUserName().isEmpty();
    }

    public void addUserName(String newUserName) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERNAME, newUserName);
    }

    public void removeUserName(String oldUserName) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERNAME, oldUserName);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#UserPhoneNumber
     */
     
    public Collection<? extends Integer> getUserPhoneNumber() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERPHONENUMBER, Integer.class);
    }

    public boolean hasUserPhoneNumber() {
		return !getUserPhoneNumber().isEmpty();
    }

    public void addUserPhoneNumber(Integer newUserPhoneNumber) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERPHONENUMBER, newUserPhoneNumber);
    }

    public void removeUserPhoneNumber(Integer oldUserPhoneNumber) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERPHONENUMBER, oldUserPhoneNumber);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/alvarfr/ontologies/2017/11/untitled-ontology-6#UserSurName
     */
     
    public Collection<? extends String> getUserSurName() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERSURNAME, String.class);
    }

    public boolean hasUserSurName() {
		return !getUserSurName().isEmpty();
    }

    public void addUserSurName(String newUserSurName) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERSURNAME, newUserSurName);
    }

    public void removeUserSurName(String oldUserSurName) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_USERSURNAME, oldUserSurName);
    }


}
