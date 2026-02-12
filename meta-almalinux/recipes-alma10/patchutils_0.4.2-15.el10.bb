
inherit dnf-bridge

PN = "patchutils"
PE = "0"
PV = "0.4.2"
PR = "15.el10"
PACKAGES = "patchutils"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/patchutils-0.4.2-15.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_patchutils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/patchutils-0.4.2-15.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_patchutils}"
RDEPENDS:patchutils = " \
 python3 \
 patch \
 perl-Getopt-Std \
 bash \
 glibc \
 perl-interpreter \
"
