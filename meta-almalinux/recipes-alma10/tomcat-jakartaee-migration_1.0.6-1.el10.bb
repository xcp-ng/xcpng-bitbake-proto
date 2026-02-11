
inherit dnf-bridge

PN = "tomcat-jakartaee-migration"
PE = "0"
PV = "1.0.6"
PR = "1.el10"
PACKAGES = "tomcat-jakartaee-migration tomcat-jakartaee-migration-javadoc"


URI_tomcat-jakartaee-migration = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tomcat-jakartaee-migration-1.0.6-1.el10.noarch.rpm;unpack=0"
RDEPENDS:tomcat-jakartaee-migration = " \
 apache-commons-compress \
 apache-commons-io \
 javapackages-filesystem \
 bash \
 bcel \
"

URI_tomcat-jakartaee-migration-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/tomcat-jakartaee-migration-javadoc-1.0.6-1.el10.noarch.rpm;unpack=0"
RDEPENDS:tomcat-jakartaee-migration-javadoc = " \
 javapackages-filesystem \
"
