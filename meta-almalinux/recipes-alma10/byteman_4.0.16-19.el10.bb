
PN = "byteman"
PE = "0"
PV = "4.0.16"
PR = "19.el10"
PACKAGES = "byteman byteman-bmunit byteman-javadoc byteman-dtest byteman-rulecheck-maven-plugin"


URI_byteman = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/byteman-4.0.16-19.el10.noarch.rpm;unpack=0"
RDEPENDS:byteman = "
 javapackages-filesystem
 apache-commons-lang3
 byteman-bmunit
 bash
 java-21-openjdk-headless
"

URI_byteman-bmunit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/byteman-bmunit-4.0.16-19.el10.noarch.rpm;unpack=0"
RDEPENDS:byteman-bmunit = "
 javapackages-filesystem
 byteman
"

URI_byteman-javadoc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/byteman-javadoc-4.0.16-19.el10.noarch.rpm;unpack=0"
RDEPENDS:byteman-javadoc = "
 javapackages-filesystem
"

URI_byteman-dtest = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/byteman-dtest-4.0.16-19.el10.noarch.rpm;unpack=0"
RDEPENDS:byteman-dtest = "
 junit
 javapackages-filesystem
 byteman
"

URI_byteman-rulecheck-maven-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/byteman-rulecheck-maven-plugin-4.0.16-19.el10.noarch.rpm;unpack=0"
RDEPENDS:byteman-rulecheck-maven-plugin = "
 plexus-utils
 byteman
 javapackages-filesystem
 maven-lib
"
