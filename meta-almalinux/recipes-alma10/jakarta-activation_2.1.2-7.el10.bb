
inherit dnf-bridge

PN = "jakarta-activation"
PE = "0"
PV = "2.1.2"
PR = "7.el10"
PACKAGES = "jakarta-activation jakarta-activation-javadoc"


URI_jakarta-activation = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jakarta-activation-2.1.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-activation = " \
 javapackages-filesystem \
"

URI_jakarta-activation-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-activation-javadoc-2.1.2-7.el10.noarch.rpm;unpack=0"
RDEPENDS:jakarta-activation-javadoc = " \
 javapackages-filesystem \
"
