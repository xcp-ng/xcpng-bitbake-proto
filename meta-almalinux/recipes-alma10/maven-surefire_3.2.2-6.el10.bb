
PN = "maven-surefire"
PE = "0"
PV = "3.2.2"
PR = "6.el10"
PACKAGES = "maven-failsafe-plugin maven-surefire maven-surefire-javadoc maven-surefire-plugin maven-surefire-provider-junit maven-surefire-provider-junit5 maven-surefire-provider-testng"


URI_maven-failsafe-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-failsafe-plugin-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-failsafe-plugin = "
 javapackages-filesystem
 maven-surefire
"

URI_maven-surefire = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire = "
 apache-commons-compress
 apache-commons-io
 javapackages-filesystem
 apache-commons-lang3
 maven-common-artifact-filters
 procps-ng
 maven-resolver
 maven-shared-utils
 plexus-languages
"

URI_maven-surefire-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-javadoc-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire-javadoc = "
 javapackages-filesystem
"

URI_maven-surefire-plugin = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-plugin-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire-plugin = "
 maven-surefire-provider-junit
 maven-surefire-provider-junit5
 maven-surefire-provider-testng
 javapackages-filesystem
 maven-surefire
"

URI_maven-surefire-provider-junit = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-provider-junit-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire-provider-junit = "
 javapackages-filesystem
 maven-surefire
"

URI_maven-surefire-provider-junit5 = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-provider-junit5-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire-provider-junit5 = "
 junit5
 javapackages-filesystem
 maven-surefire
"

URI_maven-surefire-provider-testng = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-surefire-provider-testng-3.2.2-6.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-surefire-provider-testng = "
 javapackages-filesystem
 maven-surefire
"
