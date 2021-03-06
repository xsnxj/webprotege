package edu.stanford.bmir.protege.web.client.ui.generated;

import com.google.common.collect.ImmutableMap;
import com.google.gwt.core.client.GWT;
import edu.stanford.bmir.protege.web.client.metrics.MetricsPortlet;
import edu.stanford.bmir.protege.web.client.project.Project;
import edu.stanford.bmir.protege.web.client.renderer.OWLEntityDescriptionBrowserPortlet;
import edu.stanford.bmir.protege.web.client.ui.editor.EditorPortlet;
import edu.stanford.bmir.protege.web.client.ui.frame.OWLEntityDescriptionEditorPortlet;
import edu.stanford.bmir.protege.web.client.ui.notes.DiscussionThreadPortlet;
import edu.stanford.bmir.protege.web.client.ui.obo.*;
import edu.stanford.bmir.protege.web.client.ui.ontology.annotations.OntologyAnnotationsPortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.changes.ChangeSummaryPortlet;
import edu.stanford.bmir.protege.web.client.change.ChangesPortlet;
import edu.stanford.bmir.protege.web.client.watches.WatchedEntitiesPortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.classes.*;
import edu.stanford.bmir.protege.web.client.ui.ontology.id.OntologyIdPortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.individuals.IndividualsListPortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.individuals.IndividualsTab;
import edu.stanford.bmir.protege.web.client.ui.ontology.metadata.ImportsTreePortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.metadata.MetadataTab;
import edu.stanford.bmir.protege.web.client.ui.ontology.properties.PropertiesTab;
import edu.stanford.bmir.protege.web.client.ui.ontology.properties.PropertiesTreePortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.revisions.RevisionsPortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.search.BioPortalSearchPortlet;
import edu.stanford.bmir.protege.web.client.ui.ontology.search.OtherTerminologiesTab;
import edu.stanford.bmir.protege.web.client.ui.portlet.EntityPortlet;
import edu.stanford.bmir.protege.web.client.ui.portlet.html.HtmlMessagePortlet;
import edu.stanford.bmir.protege.web.client.ui.portlet.propertyForm.PropertyFieldPortlet;
import edu.stanford.bmir.protege.web.client.ui.projectfeed.ProjectFeedPortlet;
import edu.stanford.bmir.protege.web.client.ui.tab.AbstractTab;
import edu.stanford.bmir.protege.web.client.ui.tab.UserDefinedTab;
import edu.stanford.bmir.protege.web.client.usage.UsagePortlet;

import java.util.*;

/**
 * This class is supposed to be automatically generated by the GWT generator at
 * compile time. In the current version it is not.
 * <p/>
 * This is a factory class that will provide create methods for all tabs and
 * portlets. The UI configurator will use this class to layout the UI for a
 * particular project and user.
 * <p/>
 * This factory tries to compensate for the lack of reflection support in GWT
 * and JS.
 *
 * @author Tania Tudorache <tudorache@stanford.edu>
 */
public class UIFactory {

    public static final String PORTLET_SUFFIX = "Portlet";


    private static final ImmutableMap<String, String> backwardsCompatMap = ImmutableMap.<String, String>builder()
            .put("edu.stanford.bmir.protege.web.client.ui.ontology.changes.ChangesPortlet",
                    "edu.stanford.bmir.protege.web.client.change.ChangesPortlet")
            .put("edu.stanford.bmir.protege.web.client.ui.ontology.changes.WatchedEntitiesPortlet",
                    "edu.stanford.bmir.protege.web.client.watches.WatchedEntitiesPortlet")
            .build();

    /*
     * Tab factory
     */

    public static AbstractTab createTab(Project project, String tabJavaClassName) {
        if (tabJavaClassName.equals(ClassesTab.class.getName())) {
            return new ClassesTab(project);
        }
        else if (tabJavaClassName.equals(PropertiesTab.class.getName())) {
            return new PropertiesTab(project);
        }
        else if (tabJavaClassName.equals(IndividualsTab.class.getName())) {
            return new IndividualsTab(project);
        }
        else if (tabJavaClassName.equals(OtherTerminologiesTab.class.getName())) {
            return new OtherTerminologiesTab(project);
        }
        else if (tabJavaClassName.equals(UserDefinedTab.class.getName())) {
            return new UserDefinedTab(project);
        }
        return null;
    }

    /*
     * Portlet factory
     */

    public static EntityPortlet createPortlet(Project project, String portletJavaClassName) {
        try {
            String replacementName = backwardsCompatMap.get(portletJavaClassName);
            if(replacementName != null) {
                portletJavaClassName = replacementName;
            }
            if (portletJavaClassName.equals(AllPropertiesPortlet.class.getName())) {
                return new AllPropertiesPortlet(project);
            }
            else if (portletJavaClassName.equals(ClassTreePortlet.class.getName())) {
                return new ClassTreePortlet(project);
            }
            else if (portletJavaClassName.equals(ImportsTreePortlet.class.getName())) {
                return new ImportsTreePortlet(project);
            }
            else if (portletJavaClassName.equals(IndividualsListPortlet.class.getName())) {
                return new IndividualsListPortlet(project);
            }
            else if (portletJavaClassName.equals(MetricsPortlet.class.getName())) {
                return new MetricsPortlet(project);
            }
            else if (portletJavaClassName.equals(PropertiesTreePortlet.class.getName())) {
                return new PropertiesTreePortlet(project);
            }
            else if (portletJavaClassName.equals(PropertyFieldPortlet.class.getName())) {
                return new PropertyFieldPortlet(project);
            }
            else if (portletJavaClassName.equals(BioPortalSearchPortlet.class.getName())) {
                return new BioPortalSearchPortlet(project);
            }
            else if (portletJavaClassName.equals(ChangeSummaryPortlet.class.getName())) {
                return new ChangeSummaryPortlet(project);
            }
            else if (portletJavaClassName.equals(WatchedEntitiesPortlet.class.getName())) {
                return new WatchedEntitiesPortlet(project);
            }
            else if (portletJavaClassName.equals(HtmlMessagePortlet.class.getName())) {
                return new HtmlMessagePortlet(project);
            }
            else if (portletJavaClassName.equals(SuperclassesPortlet.class.getName())) {
                return new SuperclassesPortlet(project);
            }
            else if (portletJavaClassName.equals(ChangesPortlet.class.getName())) {
                return new ChangesPortlet(project);
            }
            else if (portletJavaClassName.equals(WatchedEntitiesPortlet.class.getName())) {
                return new WatchedEntitiesPortlet(project);
            }
            else if (portletJavaClassName.equals(PropertiesViewPortlet.class.getName())) {
                return new PropertiesViewPortlet(project);
            }
            else if (portletJavaClassName.equals(OBOTermRelationshipPortlet.class.getName())) {
                return new OBOTermRelationshipPortlet(project);
            }
            else if (portletJavaClassName.equals(OBOTermDefinitionPortlet.class.getName())) {
                return new OBOTermDefinitionPortlet(project);
            }
            else if (portletJavaClassName.equals(OBOTermIdEditorPortlet.class.getName())) {
                return new OBOTermIdEditorPortlet(project);
            }
            else if (portletJavaClassName.equals(OBOTermSynonymsPortlet.class.getName())) {
                return new OBOTermSynonymsPortlet(project);
            }
            else if (portletJavaClassName.equals(OBOTermCrossProductPortlet.class.getName())) {
                return new OBOTermCrossProductPortlet(project);
            }
            else if (portletJavaClassName.equals(OBOTermXRefsEditorPortlet.class.getName())) {
                return new OBOTermXRefsEditorPortlet(project);
            }
            else if (portletJavaClassName.equals(RevisionsPortlet.class.getName())) {
                return new RevisionsPortlet(project);
            }
            else if (portletJavaClassName.equals(OntologyIdPortlet.class.getName())) {
                return new OntologyIdPortlet(project);
            }
            else if (portletJavaClassName.equals(OntologyAnnotationsPortlet.class.getName())) {
                return new OntologyAnnotationsPortlet(project);
            }
            else if (portletJavaClassName.equals(ProjectFeedPortlet.class.getName())) {
                return new ProjectFeedPortlet(project);
            }
            else if (portletJavaClassName.equals(DiscussionThreadPortlet.class.getName())) {
                return new DiscussionThreadPortlet(project);
            }
            else if (portletJavaClassName.equals(EditorPortlet.class.getName())) {
                return new EditorPortlet(project);
            }
            else if (portletJavaClassName.equals(UsagePortlet.class.getName())) {
                return new UsagePortlet(project);
            } else if (portletJavaClassName.equals(OWLEntityDescriptionBrowserPortlet.class.getName())) {
                return new OWLEntityDescriptionBrowserPortlet(project);
            }
            else if (portletJavaClassName.endsWith(OWLEntityDescriptionEditorPortlet.class.getName())) {
                return new OWLEntityDescriptionEditorPortlet(project);
            }
            else {
                GWT.log("Portlet not found: " + portletJavaClassName);
            }
        } catch (Exception e) {
            GWT.log("Error when creating portlet", e);
        }
        return null;
    }

    //TODO: taking out ManageHierarchyTab.class.getName() - must be de-icd-ezed
    public static List<String> getAvailableTabNames() {
        /*
         * Removed tabs:
         * OtherTerminologiesTab.class.getName(),
         *
         */
        String[] tabs = {ClassesTab.class.getName(), PropertiesTab.class.getName(), IndividualsTab.class.getName(),
                MetadataTab.class.getName()};
        return Arrays.asList(tabs);
    }

    public static List<String> getAvailablePortletNames() {
        /*
         * Removed portlets:
         * PropertyFieldPortlet.class.getName()
         * ChangeTreePortlet.class.getName(), ChangeSummaryPortlet.class.getName(), ChangeTablePortlet.class.getName(),
         * NotesPortlet.class.getName(),
         */
        String[] portlets = {OWLEntityDescriptionEditorPortlet.class.getName(), OWLEntityDescriptionBrowserPortlet
                .class.getName(), UsagePortlet.class.getName(), OntologyIdPortlet.class.getName(),
                OntologyAnnotationsPortlet.class.getName(), EditorPortlet.class.getName(),
                DiscussionThreadPortlet.class.getName(), ChangeSummaryPortlet.class.getName(),
                ProjectFeedPortlet.class.getName(),
                AllPropertiesPortlet.class.getName(), PropertiesViewPortlet.class.getName(),
                ClassTreePortlet.class.getName(), ImportsTreePortlet.class.getName(),
                IndividualsListPortlet.class.getName(), MetricsPortlet.class.getName(),
                PropertiesTreePortlet.class.getName(),
                BioPortalSearchPortlet.class.getName(), SuperclassesPortlet.class.getName(),
                ChangesPortlet.class.getName(), WatchedEntitiesPortlet.class.getName(),
                OBOTermCrossProductPortlet.class.getName(),
                OBOTermRelationshipPortlet.class.getName(), OBOTermSynonymsPortlet.class.getName(),
                OBOTermIdEditorPortlet.class.getName(),
                OBOTermDefinitionPortlet.class.getName(), OBOTermXRefsEditorPortlet.class.getName(),
                RevisionsPortlet.class.getName()};

        List<String> portletsList = Arrays.asList(portlets);
        Collections.sort(portletsList, new Comparator<String>() {
            public int compare(String p1, String p2) {
                String n1 = p1.substring(p1.lastIndexOf(".") + 1);
                String n2 = p2.substring(p2.lastIndexOf(".") + 1);
                return n1.compareTo(n2);
            }
        });
        return portletsList;
    }

    /*
     * Generic utils
     */

    public static List<String> getAvailableTabShortNames() {
        List<String> tabs = getAvailableTabNames();
        List<String> shortNames = new ArrayList<String>();
        for (String tab : tabs) {
            shortNames.add(tab.substring(tab.lastIndexOf(".") + 1));
        }
        return shortNames;
    }

    /**
     * @return A map from the short names of the portlets to the full java class
     * name of the portlets.
     */
    public static Map<String, String> getAvailablePortletNameMap() {
        List<String> portlets = getAvailablePortletNames();
        Map<String, String> map = new LinkedHashMap<String, String>();
        for (String portlet : portlets) {
            map.put(getPortletShortName(portlet), portlet);
        }
        return map;
    }

    /**
     * Extracts a short human readable name from a portlet java class name.
     *
     * @param portletClassName The fully qualified class name for the portlet
     * @return The short name for the portlet (not null).
     */
    private static String getPortletShortName(String portletClassName) {
        int simpleNameSeparator = portletClassName.lastIndexOf(".");
        if (simpleNameSeparator == -1) {
            return portletClassName;
        }
        String simpleName = portletClassName.substring(simpleNameSeparator + 1);
        String strippedName;
        if (simpleName.endsWith(PORTLET_SUFFIX)) {
            strippedName = simpleName.substring(0, simpleName.length() - PORTLET_SUFFIX.length());
        }
        else {
            strippedName = simpleName;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strippedName.length(); i++) {
            char ch = strippedName.charAt(i);
            boolean upperCase = Character.isUpperCase(ch);
            if (upperCase) {
                if (isNextCharacterLowerCase(strippedName, i) || isPreviousCharacterLowerCase(strippedName, i)) {
                    sb.append(" ");
                }
            }
            sb.append(ch);
        }
        return sb.toString().trim();
    }

    private static boolean isPreviousCharacterLowerCase(String strippedName, int i) {
        return i > 0 && Character.isLowerCase(strippedName.charAt(i - 1));
    }

    private static boolean isNextCharacterLowerCase(String s, int currentIndex) {
        return currentIndex < s.length() - 1 && Character.isLowerCase(s.charAt(currentIndex + 1));
    }


    /**
     * @return A map from the short names of tabs (label) to the full java class
     * name of the tabs.
     */
    public static Map<String, String> getAvailableTabNameMap() {
        List<String> tabs = getAvailableTabNames();
        Collections.sort(tabs);
        Map<String, String> map = new LinkedHashMap<String, String>();
        for (String tab : tabs) {
            map.put(tab.substring(tab.lastIndexOf(".") + 1), tab);
        }
        return map;
    }

}
