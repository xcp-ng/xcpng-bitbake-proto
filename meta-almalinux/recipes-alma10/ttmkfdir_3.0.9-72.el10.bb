
inherit dnf-bridge

PN = "ttmkfdir"
PE = "0"
PV = "3.0.9"
PR = "72.el10"
PACKAGES = "ttmkfdir"


URI_ttmkfdir = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ttmkfdir-3.0.9-72.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ttmkfdir = " \
 zlib-ng-compat \
 freetype \
 libgcc \
 libstdc++ \
 glibc \
"
