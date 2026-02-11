
PN = "byteman"
PE = "0"
PV = "4.0.16"
PR = "19.el10"
PACKAGES = "byteman byteman-bmunit byteman-javadoc byteman-dtest byteman-rulecheck-maven-plugin"


URI_byteman = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/byteman-4.0.16-19.el10.noarch.rpm;unpack=0"
RDEPENDS:byteman = "/usr/bin/sh ( ) /usr/bin/bash ( ) javapackages-filesystem ( ) mvn(org.apache.commons:commons-lang3) ( ) mvn(org.jboss.byteman:byteman-bmunit) ( =  4.0.16) java-headless ( >=  1:1.8)"
RPROVIDES:byteman = "mvn(org.jboss.byteman:byteman) ( =  4.0.16) mvn(org.jboss.byteman:byteman-install) ( =  4.0.16) mvn(org.jboss.byteman:byteman-submit) ( =  4.0.16) bundled(java_cup) ( =  1:0.11b-17) bundled(objectweb-asm) ( =  9.1) byteman ( =  4.0.16-19.el10) mvn(org.jboss.byteman:byteman-agent) ( =  4.0.16) mvn(org.jboss.byteman:byteman-agent:pom:) ( =  4.0.16) mvn(org.jboss.byteman:byteman-bmunit5) ( =  4.0.16) mvn(org.jboss.byteman:byteman-bmunit5:pom:) ( =  4.0.16) mvn(org.jboss.byteman:byteman-install:pom:) ( =  4.0.16) mvn(org.jboss.byteman:byteman-jigsaw) ( =  4.0.16) mvn(org.jboss.byteman:byteman-jigsaw:pom:) ( =  4.0.16) mvn(org.jboss.byteman:byteman-layer) ( =  4.0.16) mvn(org.jboss.byteman:byteman-layer:pom:) ( =  4.0.16) mvn(org.jboss.byteman:byteman-root:pom:) ( =  4.0.16) mvn(org.jboss.byteman:byteman-sample) ( =  4.0.16) mvn(org.jboss.byteman:byteman-sample:pom:) ( =  4.0.16) mvn(org.jboss.byteman:byteman-submit:pom:) ( =  4.0.16) mvn(org.jboss.byteman:byteman:pom:) ( =  4.0.16) mvn(org.jboss.byteman:tests:pom:) ( =  4.0.16) osgi(org.jboss.byteman.agent.install) ( =  4.0.16) osgi(org.jboss.byteman.agent.submit) ( =  4.0.16)"

URI_byteman-bmunit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/byteman-bmunit-4.0.16-19.el10.noarch.rpm;unpack=0"
RDEPENDS:byteman-bmunit = "javapackages-filesystem ( ) mvn(org.jboss.byteman:byteman) ( =  4.0.16) mvn(org.jboss.byteman:byteman-install) ( =  4.0.16) mvn(org.jboss.byteman:byteman-submit) ( =  4.0.16)"
RPROVIDES:byteman-bmunit = "mvn(org.jboss.byteman:byteman-bmunit) ( =  4.0.16) byteman-bmunit ( =  4.0.16-19.el10) mvn(org.jboss.byteman:byteman-bmunit::sources:) ( =  4.0.16) mvn(org.jboss.byteman:byteman-bmunit:pom:) ( =  4.0.16)"

URI_byteman-javadoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/byteman-javadoc-4.0.16-19.el10.noarch.rpm;unpack=0"
RDEPENDS:byteman-javadoc = "javapackages-filesystem ( )"
RPROVIDES:byteman-javadoc = "byteman-javadoc ( =  4.0.16-19.el10)"

URI_byteman-dtest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/byteman-dtest-4.0.16-19.el10.noarch.rpm;unpack=0"
RDEPENDS:byteman-dtest = "javapackages-filesystem ( ) mvn(junit:junit) ( ) mvn(org.jboss.byteman:byteman) ( =  4.0.16) mvn(org.jboss.byteman:byteman-submit) ( =  4.0.16)"
RPROVIDES:byteman-dtest = "byteman-dtest ( =  4.0.16-19.el10) mvn(org.jboss.byteman:byteman-dtest) ( =  4.0.16) mvn(org.jboss.byteman:byteman-dtest::sources:) ( =  4.0.16) mvn(org.jboss.byteman:byteman-dtest:pom:) ( =  4.0.16)"

URI_byteman-rulecheck-maven-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/byteman-rulecheck-maven-plugin-4.0.16-19.el10.noarch.rpm;unpack=0"
RDEPENDS:byteman-rulecheck-maven-plugin = "javapackages-filesystem ( ) mvn(org.codehaus.plexus:plexus-utils) ( ) mvn(org.apache.maven:maven-core) ( ) mvn(org.apache.maven:maven-plugin-api) ( ) mvn(org.jboss.byteman:byteman) ( =  4.0.16)"
RPROVIDES:byteman-rulecheck-maven-plugin = "byteman-rulecheck-maven-plugin ( =  4.0.16-19.el10) mvn(org.jboss.byteman:byteman-rulecheck-maven-plugin) ( =  4.0.16) mvn(org.jboss.byteman:byteman-rulecheck-maven-plugin::sources:) ( =  4.0.16) mvn(org.jboss.byteman:byteman-rulecheck-maven-plugin:pom:) ( =  4.0.16)"
