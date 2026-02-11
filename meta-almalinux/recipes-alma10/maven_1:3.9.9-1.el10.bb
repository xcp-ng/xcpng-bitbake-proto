
PN = "maven"
PE = "1"
PV = "3.9.9"
PR = "1.el10"
PACKAGES = "maven maven-lib maven-openjdk21 maven-javadoc maven-unbound"


URI_maven = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/maven-3.9.9-1.el10.noarch.rpm;unpack=0"
RDEPENDS:maven = " \
 alternatives \
 bash \
 maven-unbound \
 maven-lib \
"

URI_maven-lib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/maven-lib-3.9.9-1.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-lib = " \
 plexus-cipher \
 atinject \
 apache-commons-cli \
 plexus-classworlds \
 plexus-containers-component-annotations \
 plexus-utils \
 javapackages-filesystem \
 jakarta-annotations \
 plexus-interpolation \
 plexus-sec-dispatcher \
 jansi \
 sisu \
 slf4j \
 google-guice \
 maven-resolver \
 maven-shared-utils \
 maven-wagon \
 guava \
"

URI_maven-openjdk21 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/maven-openjdk21-3.9.9-1.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-openjdk21 = " \
 maven \
 java-21-openjdk-headless \
 javapackages-tools \
"

URI_maven-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-javadoc-3.9.9-1.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-javadoc = " \
 javapackages-filesystem \
"

URI_maven-unbound = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-unbound-3.9.9-1.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-unbound = " \
 maven \
 javapackages-tools \
"
