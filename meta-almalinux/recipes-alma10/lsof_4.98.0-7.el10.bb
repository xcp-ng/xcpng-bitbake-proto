
inherit dnf-bridge

PN = "lsof"
PE = "0"
PV = "4.98.0"
PR = "7.el10"
PACKAGES = "lsof"


URI_lsof = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/lsof-4.98.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lsof = " \
 glibc \
 libselinux \
 libtirpc \
"
