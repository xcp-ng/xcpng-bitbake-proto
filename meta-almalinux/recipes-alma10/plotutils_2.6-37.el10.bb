
PN = "plotutils"
PE = "0"
PV = "2.6"
PR = "37.el10"
PACKAGES = "plotutils plotutils-devel"


URI_plotutils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/plotutils-2.6-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:plotutils = " \
 zlib-ng-compat \
 libpng \
 libXmu \
 libgcc \
 libICE \
 libSM \
 libX11 \
 libstdc++ \
 libXt \
 libXaw \
 glibc \
 libXext \
"

URI_plotutils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/plotutils-devel-2.6-37.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:plotutils-devel = " \
 plotutils \
"
