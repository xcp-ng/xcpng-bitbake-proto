
inherit dnf-bridge

PN = "jansi"
PE = "0"
PV = "2.4.1"
PR = "5.el10"
PACKAGES = "jansi jansi-javadoc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/jansi-2.4.1-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jansi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jansi-2.4.1-5.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_jansi}"
RDEPENDS:jansi = " \
 glibc \
 javapackages-filesystem \
"

URI_jansi-javadoc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jansi-javadoc-2.4.1-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jansi-javadoc}"
RDEPENDS:jansi-javadoc = " \
 javapackages-filesystem \
"
