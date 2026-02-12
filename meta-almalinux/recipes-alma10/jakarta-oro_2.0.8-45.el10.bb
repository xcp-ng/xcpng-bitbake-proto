
inherit dnf-bridge

PN = "jakarta-oro"
PE = "0"
PV = "2.0.8"
PR = "45.el10"
PACKAGES = "jakarta-oro jakarta-oro-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/jakarta-oro-2.0.8-45.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jakarta-oro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jakarta-oro-2.0.8-45.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jakarta-oro}"
RDEPENDS:jakarta-oro = " \
 javapackages-filesystem \
"

URI_jakarta-oro-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-oro-javadoc-2.0.8-45.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jakarta-oro-javadoc}"
RDEPENDS:jakarta-oro-javadoc = " \
 javapackages-filesystem \
"
