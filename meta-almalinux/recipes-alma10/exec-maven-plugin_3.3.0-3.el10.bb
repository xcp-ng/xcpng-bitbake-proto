
inherit dnf-bridge

PN = "exec-maven-plugin"
PE = "0"
PV = "3.3.0"
PR = "3.el10"
PACKAGES = "exec-maven-plugin exec-maven-plugin-javadoc"


URI_exec-maven-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/exec-maven-plugin-3.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:exec-maven-plugin = " \
 objectweb-asm \
 plexus-utils \
 javapackages-filesystem \
 apache-commons-exec \
 maven-resolver \
"

URI_exec-maven-plugin-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/exec-maven-plugin-javadoc-3.3.0-3.el10.noarch.rpm;unpack=0"
RDEPENDS:exec-maven-plugin-javadoc = " \
 javapackages-filesystem \
"
