
inherit dnf-bridge

PN = "maven-plugin-testing"
PE = "0"
PV = "3.3.0"
PR = "35.el10"
PACKAGES = "maven-plugin-testing maven-plugin-testing-harness maven-plugin-testing-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/maven-plugin-testing-3.3.0-35.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_maven-plugin-testing = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-testing-3.3.0-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-plugin-testing}"
RDEPENDS:maven-plugin-testing = " \
 javapackages-filesystem \
 maven-parent \
"

URI_maven-plugin-testing-harness = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-testing-harness-3.3.0-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-plugin-testing-harness}"
RDEPENDS:maven-plugin-testing-harness = " \
 plexus-archiver \
 apache-commons-io \
 javapackages-filesystem \
"

URI_maven-plugin-testing-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/maven-plugin-testing-javadoc-3.3.0-35.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_maven-plugin-testing-javadoc}"
RDEPENDS:maven-plugin-testing-javadoc = " \
 javapackages-filesystem \
"
