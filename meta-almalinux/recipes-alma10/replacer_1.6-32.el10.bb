
inherit dnf-bridge

PN = "replacer"
PE = "0"
PV = "1.6"
PR = "32.el10"
PACKAGES = "replacer replacer-javadoc"


URI_replacer = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/replacer-1.6-32.el10.noarch.rpm;unpack=0"
RDEPENDS:replacer = " \
 apache-commons-io \
 javapackages-filesystem \
 apache-commons-lang3 \
 xerces-j2 \
 maven-lib \
 ant-lib \
"

URI_replacer-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/replacer-javadoc-1.6-32.el10.noarch.rpm;unpack=0"
RDEPENDS:replacer-javadoc = " \
 javapackages-filesystem \
"
