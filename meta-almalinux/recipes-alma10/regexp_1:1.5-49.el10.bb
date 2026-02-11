
inherit dnf-bridge

PN = "regexp"
PE = "1"
PV = "1.5"
PR = "49.el10"
PACKAGES = "regexp regexp-javadoc"


URI_regexp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/regexp-1.5-49.el10.noarch.rpm;unpack=0"
RDEPENDS:regexp = " \
 javapackages-filesystem \
"

URI_regexp-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/regexp-javadoc-1.5-49.el10.noarch.rpm;unpack=0"
RDEPENDS:regexp-javadoc = " \
 javapackages-filesystem \
"
