# 2016Semester2Agile
This organization is for the AgileDevelopment 761 Auckland University. 

To deploy the system, simply check out the latest code from GitHub. On the project root
directory, run the following command:
mvn tomcat7:run
The system will be running on localhost:9090/prime/

There are three ways to access the project:

a. For Administrator,

To access the admin home page, use this link
http://default-environment.qxgr2c9ehj.ap-southeast-2.elasticbeanstalk.com/

b. For prospect,

To access the page for the prospect, use this link
http://default-environment.qxgr2c9ehj.ap-southeast-2.elasticbeanstalk.com/StartToAnswerQuestion.xhtml

c. For developer,

In the beginning, our team has created Product Recommendation project which put onto
Github, and now we have this maven project on Github.

When finished install Eclipse for Java EE edition, we can click Open Perspective and choose
Git. In this step, what we want to do is Clone a Git repository.
After that, we can clone the project URL,
https://github.com/AgilePrimeFighting/2016Semester2Agile

Then copy and paste it into the location. In this section, select branch master. We are going
to specify the destination location. Choose the directory and finish. Now we have Git
repositories here; the Product Recommendation project is under the Working Tree.

Now you need to have Maven project in your local. In my Project Explorer, choose Import
Existing Maven Projects and find the directory which you save before. We can see the pom
file, so import pom.xml and finish.

When building the project, it required connecting to the tomcat server.

Click project properties, in Project Facets, found tomcat server In runtime section, select
Apache Tomcat, now in the project office, it would work as well. Finally, run the project as
Server. It would show the main website.
