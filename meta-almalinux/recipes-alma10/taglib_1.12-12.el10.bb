
PN = "taglib"
PE = "0"
PV = "1.12"
PR = "12.el10"
PACKAGES = "taglib taglib-devel"


URI_taglib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/taglib-1.12-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:taglib = " \
 glibc \
 libgcc \
 libstdc++ \
 zlib-ng-compat \
"

URI_taglib-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/taglib-devel-1.12-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:taglib-devel = " \
 taglib \
 taglib-devel \
 bash \
 pkgconf-pkg-config \
"
