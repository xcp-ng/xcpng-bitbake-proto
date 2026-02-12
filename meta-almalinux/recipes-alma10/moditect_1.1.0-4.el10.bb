
inherit dnf-bridge

PN = "moditect"
PE = "0"
PV = "1.1.0"
PR = "4.el10"
PACKAGES = "moditect moditect-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/moditect-1.1.0-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_moditect = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/moditect-1.1.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_moditect}"
RDEPENDS:moditect = " \
 objectweb-asm \
 javapackages-filesystem \
 javaparser \
 beust-jcommander \
 maven-resolver \
"

URI_moditect-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/moditect-javadoc-1.1.0-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_moditect-javadoc}"
RDEPENDS:moditect-javadoc = " \
 javapackages-filesystem \
"
