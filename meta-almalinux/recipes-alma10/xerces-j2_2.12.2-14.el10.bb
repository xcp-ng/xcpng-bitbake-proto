
inherit dnf-bridge

PN = "xerces-j2"
PE = "0"
PV = "2.12.2"
PR = "14.el10"
PACKAGES = "xerces-j2 xerces-j2-demo xerces-j2-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/xerces-j2-2.12.2-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_xerces-j2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xerces-j2-2.12.2-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xerces-j2}"
RDEPENDS:xerces-j2 = " \
 javapackages-filesystem \
 javapackages-tools \
 bash \
 xml-commons-apis \
 xml-commons-resolver \
"

URI_xerces-j2-demo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xerces-j2-demo-2.12.2-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xerces-j2-demo}"
RDEPENDS:xerces-j2-demo = " \
 xerces-j2 \
"

URI_xerces-j2-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/xerces-j2-javadoc-2.12.2-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_xerces-j2-javadoc}"
RDEPENDS:xerces-j2-javadoc = " \
 javapackages-filesystem \
"
