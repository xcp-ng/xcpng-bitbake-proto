
inherit dnf-bridge

PN = "disruptor"
PE = "0"
PV = "3.4.4"
PR = "12.el10"
PACKAGES = "disruptor disruptor-javadoc"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/disruptor-3.4.4-12.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_disruptor = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/disruptor-3.4.4-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_disruptor}"
RDEPENDS:disruptor = " \
 javapackages-filesystem \
"

URI_disruptor-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/disruptor-javadoc-3.4.4-12.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_disruptor-javadoc}"
RDEPENDS:disruptor-javadoc = " \
 javapackages-filesystem \
"
