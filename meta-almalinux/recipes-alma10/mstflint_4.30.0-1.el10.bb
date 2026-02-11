
inherit dnf-bridge

PN = "mstflint"
PE = "0"
PV = "4.30.0"
PR = "1.el10"
PACKAGES = "mstflint"


URI_mstflint = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mstflint-4.30.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mstflint = " \
 python3 \
 zlib-ng-compat \
 libgcc \
 libstdc++ \
 bash \
 expat \
 glibc \
"
