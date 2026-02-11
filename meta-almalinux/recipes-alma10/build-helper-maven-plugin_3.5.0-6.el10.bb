
PN = "build-helper-maven-plugin"
PE = "0"
PV = "3.5.0"
PR = "6.el10"
PACKAGES = "build-helper-maven-plugin build-helper-maven-plugin-javadoc"


URI_build-helper-maven-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/build-helper-maven-plugin-3.5.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:build-helper-maven-plugin = "
 plexus-utils
 maven-file-management
 javapackages-filesystem
 slf4j
"

URI_build-helper-maven-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/build-helper-maven-plugin-javadoc-3.5.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:build-helper-maven-plugin-javadoc = "
 javapackages-filesystem
"
