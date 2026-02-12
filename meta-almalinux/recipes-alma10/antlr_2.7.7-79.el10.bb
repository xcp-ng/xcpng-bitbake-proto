
inherit dnf-bridge

PN = "antlr"
PE = "0"
PV = "2.7.7"
PR = "79.el10"
PACKAGES = "antlr-tool antlr-C++ antlr-javadoc antlr-manual"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/antlr-2.7.7-79.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_antlr-tool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/antlr-tool-2.7.7-79.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_antlr-tool}"
RDEPENDS:antlr-tool = " \
 bash \
 javapackages-filesystem \
 javapackages-tools \
"

URI_antlr-C++ = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/antlr-C++-2.7.7-79.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_antlr-C++}"
RDEPENDS:antlr-C++ = " \
 bash \
"

URI_antlr-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/antlr-javadoc-2.7.7-79.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_antlr-javadoc}"
RDEPENDS:antlr-javadoc = " \
 javapackages-filesystem \
"

URI_antlr-manual = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/antlr-manual-2.7.7-79.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_antlr-manual}"
RDEPENDS:antlr-manual = ""
