
inherit dnf-bridge

PN = "jsch"
PE = "0"
PV = "0.1.55"
PR = "16.el10"
PACKAGES = "jsch jsch-javadoc"


URI_jsch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jsch-0.1.55-16.el10.noarch.rpm;unpack=0"
RDEPENDS:jsch = " \
 javapackages-filesystem \
 jzlib \
"

URI_jsch-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jsch-javadoc-0.1.55-16.el10.noarch.rpm;unpack=0"
RDEPENDS:jsch-javadoc = " \
 javapackages-filesystem \
"
