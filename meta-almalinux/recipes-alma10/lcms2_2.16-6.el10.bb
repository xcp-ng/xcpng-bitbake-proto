
PN = "lcms2"
PE = "0"
PV = "2.16"
PR = "6.el10"
PACKAGES = "lcms2 lcms2-devel lcms2-utils"


URI_lcms2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lcms2-2.16-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lcms2 = " \
 glibc \
"

URI_lcms2-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lcms2-devel-2.16-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lcms2-devel = " \
 lcms2 \
 pkgconf-pkg-config \
"

URI_lcms2-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/lcms2-utils-2.16-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lcms2-utils = " \
 glibc \
 lcms2 \
 libjpeg-turbo \
 libtiff \
"
