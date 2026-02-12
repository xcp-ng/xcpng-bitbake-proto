
inherit dnf-bridge

PN = "univocity-parsers"
PE = "0"
PV = "2.9.1"
PR = "14.el10"
PACKAGES = "univocity-parsers univocity-parsers-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/univocity-parsers-2.9.1-14.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_univocity-parsers = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/univocity-parsers-2.9.1-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_univocity-parsers}"
RDEPENDS:univocity-parsers = " \
 javapackages-filesystem \
"

URI_univocity-parsers-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/univocity-parsers-javadoc-2.9.1-14.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_univocity-parsers-javadoc}"
RDEPENDS:univocity-parsers-javadoc = " \
 javapackages-filesystem \
"
