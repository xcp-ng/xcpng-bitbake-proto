
inherit dnf-bridge

PN = "dejagnu"
PE = "1"
PV = "1.6.3"
PR = "11.el10"
PACKAGES = "dejagnu"


URI_src = "https://vault.almalinux.org/10.0/CRB/Source/Packages/dejagnu-1.6.3-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dejagnu = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/dejagnu-1.6.3-11.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_dejagnu}"
RDEPENDS:dejagnu = " \
 expect \
 bash \
"
