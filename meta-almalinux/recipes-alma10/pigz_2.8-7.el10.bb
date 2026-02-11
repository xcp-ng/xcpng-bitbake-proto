
inherit dnf-bridge

PN = "pigz"
PE = "0"
PV = "2.8"
PR = "7.el10"
PACKAGES = "pigz"


URI_pigz = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pigz-2.8-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pigz = " \
 glibc \
 libgcc \
 zlib-ng-compat \
"
