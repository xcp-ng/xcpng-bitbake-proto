
PN = "maven-verifier"
PE = "0"
PV = "2.0.0~M1"
PR = "8.el10"
PACKAGES = "maven-verifier maven-verifier-javadoc"


URI_maven-verifier = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-verifier-2.0.0~M1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-verifier = " \
 maven-shared-utils \
 javapackages-filesystem \
"

URI_maven-verifier-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-verifier-javadoc-2.0.0~M1-8.el10.noarch.rpm;unpack=0"
RDEPENDS:maven-verifier-javadoc = " \
 javapackages-filesystem \
"
