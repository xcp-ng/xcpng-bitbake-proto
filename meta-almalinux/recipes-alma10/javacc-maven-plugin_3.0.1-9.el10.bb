
PN = "javacc-maven-plugin"
PE = "0"
PV = "3.0.1"
PR = "9.el10"
PACKAGES = "javacc-maven-plugin javacc-maven-plugin-javadoc"


URI_javacc-maven-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javacc-maven-plugin-3.0.1-9.el10.noarch.rpm;unpack=0"
RDEPENDS:javacc-maven-plugin = "
 plexus-utils
 javacc
 javapackages-filesystem
 maven-lib
"

URI_javacc-maven-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/javacc-maven-plugin-javadoc-3.0.1-9.el10.noarch.rpm;unpack=0"
RDEPENDS:javacc-maven-plugin-javadoc = "
 javapackages-filesystem
"
