
inherit dnf-bridge

PN = "ncompress"
PE = "0"
PV = "5.0"
PR = "7.el10"
PACKAGES = "ncompress"


URI_ncompress = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ncompress-5.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ncompress = " \
 glibc \
"
