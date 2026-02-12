
inherit dnf-bridge

PN = "beust-jcommander"
PE = "0"
PV = "1.82"
PR = "10.el10"
PACKAGES = "beust-jcommander beust-jcommander-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/beust-jcommander-1.82-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_beust-jcommander = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/beust-jcommander-1.82-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_beust-jcommander}"
RDEPENDS:beust-jcommander = " \
 javapackages-filesystem \
"

URI_beust-jcommander-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/beust-jcommander-javadoc-1.82-10.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_beust-jcommander-javadoc}"
RDEPENDS:beust-jcommander-javadoc = " \
 javapackages-filesystem \
"
