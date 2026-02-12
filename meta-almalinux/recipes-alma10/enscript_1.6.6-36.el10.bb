
inherit dnf-bridge

PN = "enscript"
PE = "0"
PV = "1.6.6"
PR = "36.el10"
PACKAGES = "enscript"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/enscript-1.6.6-36.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_enscript = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/enscript-1.6.6-36.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_enscript}"
RDEPENDS:enscript = " \
 glibc \
 perl-interpreter \
 bash \
"
