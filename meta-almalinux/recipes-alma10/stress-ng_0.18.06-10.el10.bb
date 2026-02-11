
inherit dnf-bridge

PN = "stress-ng"
PE = "0"
PV = "0.18.06"
PR = "10.el10"
PACKAGES = "stress-ng"


URI_stress-ng = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/stress-ng-0.18.06-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:stress-ng = " \
 zlib-ng-compat \
 libxcrypt \
 Judy \
 glibc \
 lksctp-tools \
"
