package tdt4250.project.design;

import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    	
	/*public int getCousinsNumber(Person person) {
		List<Person> cousins=new ArrayList<Person>();
		List<Person> parents=person.getParents();
			
		for (Person parent: parents) {
			for (Person grandParent: parent.getParents()) {
				for (Person uncleOrAunt: grandParent.getChildren()) {
					if (!parents.contains(uncleOrAunt)) {
						for (Person cousin:uncleOrAunt.getChildren()) {
							if (!cousins.contains(cousin))
								cousins.add(cousin);
						}
					}
				}
			}
		}
		return cousins.size();	
	}*/
    	
}
