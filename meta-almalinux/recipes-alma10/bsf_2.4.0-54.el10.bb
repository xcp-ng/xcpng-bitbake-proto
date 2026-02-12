
inherit dnf-bridge

PN = "bsf"
PE = "0"
PV = "2.4.0"
PR = "54.el10"
PACKAGES = "bsf bsf-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/bsf-2.4.0-54.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_bsf = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bsf-2.4.0-54.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_bsf}"
RDEPENDS:bsf = " \
 javapackages-filesystem \
 apache-commons-logging \
"

URI_bsf-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/bsf-javadoc-2.4.0-54.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_bsf-javadoc}"
RDEPENDS:bsf-javadoc = " \
 javapackages-filesystem \
"
