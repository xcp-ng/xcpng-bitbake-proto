
inherit dnf-bridge

PN = "jakarta-annotations"
PE = "0"
PV = "1.3.5"
PR = "23.el10"
PACKAGES = "jakarta-annotations jakarta-annotations-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/jakarta-annotations-1.3.5-23.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jakarta-annotations = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jakarta-annotations-1.3.5-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jakarta-annotations}"
RDEPENDS:jakarta-annotations = " \
 javapackages-filesystem \
"

URI_jakarta-annotations-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jakarta-annotations-javadoc-1.3.5-23.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jakarta-annotations-javadoc}"
RDEPENDS:jakarta-annotations-javadoc = " \
 javapackages-filesystem \
"
