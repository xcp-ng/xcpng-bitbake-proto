
inherit dnf-bridge

PN = "maven-compiler-plugin"
PE = "0"
PV = "3.12.1"
PR = "4.el10"
PACKAGES = "maven-compiler-plugin maven-compiler-plugin-javadoc"


URI_maven-compiler-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-compiler-plugin-3.12.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-compiler-plugin = " \
 plexus-utils \
 javapackages-filesystem \
 plexus-compiler \
 maven-shared-incremental \
 maven-shared-utils \
 plexus-languages \
"

URI_maven-compiler-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-compiler-plugin-javadoc-3.12.1-4.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-compiler-plugin-javadoc = " \
 javapackages-filesystem \
"
