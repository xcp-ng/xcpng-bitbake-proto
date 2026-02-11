
inherit dnf-bridge

PN = "jsoup"
PE = "0"
PV = "1.17.2"
PR = "4.el10"
PACKAGES = "jsoup jsoup-javadoc"


URI_jsoup = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jsoup-1.17.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:jsoup = " \
 javapackages-filesystem \
"

URI_jsoup-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jsoup-javadoc-1.17.2-4.el10.noarch.rpm;unpack=0"
RDEPENDS:jsoup-javadoc = " \
 javapackages-filesystem \
"
