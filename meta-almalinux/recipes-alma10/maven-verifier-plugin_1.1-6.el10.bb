
inherit dnf-bridge

PN = "maven-verifier-plugin"
PE = "0"
PV = "1.1"
PR = "6.el10"
PACKAGES = "maven-verifier-plugin maven-verifier-plugin-javadoc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/maven-verifier-plugin-1.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-verifier-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/maven-verifier-plugin-1.1-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-verifier-plugin}"
RDEPENDS:maven-verifier-plugin = " \
 plexus-utils \
 javapackages-filesystem \
 java-21-openjdk-headless \
"

URI_maven-verifier-plugin-javadoc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/maven-verifier-plugin-javadoc-1.1-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-verifier-plugin-javadoc}"
RDEPENDS:maven-verifier-plugin-javadoc = " \
 javapackages-filesystem \
"
