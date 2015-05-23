# gwt-polymer
Allows to use polymer elements in GWT projects.

## Instructions:

1.  Go to the `gwt-polymer-elements` directory
2.  Run `npm install`
3.  Add/remove components in the "dependencies" section of the `bower.json` file
3.  The "dependencies" section of the `bower.json` file includes all paper
elements, if you Add/remove any component remember to run `bower install` after any modification.
5.  Run `gulp gwt-api` in order to create all Element and Widgets java files in the  `gwt-polymer-elements/src/main/java/` folder
6.  Run `mvn clean install` to install the components library in you local maven repo
